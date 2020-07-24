/*
AFN.java
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*Se Hereda de Automata_Finito para AFN con el fin de obtener la misma estructura(NO deberia Cambiar a la de AF) */
public class AFN extends Automata_Finito{

    Arbol_Binario arbol; /*Se crea el arbol*/
    private static int num_estados=0;
    public static String Datos[][]={};
    String cadenas[] = Arbol_Binario.cad;

    public AFN(){}

    public AFN(Arbol_Binario arbol){	/*Se recibe el arbol del AF*/
        long tiempo_inicial = System.nanoTime();
        this.num_estados=0;
        this.arbol=arbol;
        /*copiar la tabla de símbolos que tenía el árbol...*/
        for(int i=0;i<arbol.lista_simbolos.size();i++){
            this.Sigma.add(this.arbol.lista_simbolos.get(i));
        }
        this.regex=this.arbol.padre.Mostrar_Nodo();

        Estado i_f[] = thompson(this.arbol.padre); /*Se genera el automata*/
        this.q0 = i_f[0];/*Se actualiza el estado inicial*/
        this.F.add(i_f[1]); /*Se agrega a la lista de estados de aceptación*/

        this.renumerar_estados();
        ordenar_transiciones();

        long tiempo_final = System.nanoTime();
        long tiempo = tiempo_final-tiempo_inicial;

        String linea = "\tAFN creado utilizando el algoritmo de Thompson";
        this.Imprimir_Todo_AF("AFN_Thompson_",linea,tiempo);
        
        String Auxx="";        
        String AuxA="";
        String AuxAA="";
        int numStr=0;
        int num=Arbol_Binario.auxiliar;
        Datos= new String[this.Q.size()][num];        
                
        for(int i=0;i<this.Q.size();i++)
        {            
            if(cadenas[0].equals("Estado"))
            {
                Datos[i][0]=""+(i+1);                
            }
        }
        
        
            for(int i=1;i<num;i++)
            {                 
                for(int n=0;n<this.Q.size();n++)
                {
                    String g = "q"+n;
                    Auxx="";
                    for(int j=0;j<this.delta.size();j++)
                    {
                        String s = Character.toString(this.delta.get(j).getTransicion());
                        String ss = this.delta.get(j).getDesde().getNombre();
                        if(cadenas[i].equals(s) && g.equals(ss))
                        {
                            //Auxx+=this.delta.get(j).getHacia().getNombre();
                            //Auxx+=",";                   
                            AuxA=this.delta.get(j).getHacia().getNombre();
                            for(int z=0;z<this.Q.size();z++)
                            {
                                AuxAA="q"+z;
                                if(AuxAA.equals(AuxA))
                                {
                                    Auxx+=""+(z+1);
                                    Auxx+=",";
                                }
                            }
                        }                       
                    }                    
                    Datos[n][i]=Auxx;
                }
            }
    }


     /*cerradura_epsilon que retorna todos los estados a los que puede llegar con epsilon*/
     public LinkedList<Integer> cerradura_epsilon(String estado){

        LinkedList<Integer> resultado = new LinkedList<Integer>();

        Stack pila = new Stack();
        LinkedList<Integer> T = this.Get_estados_se_puede_llegar_epsilon(estado); /*primera lista temporal*/

        for(int i=0;i<T.size();i++){  /*Busqueda y almacenamiento(en la pila y lista, el de la pila servira para los derivados)*/						
            pila.push(T.get(i));      /*de destinos con epsilon desde "estado", primera apertura de caminos */
            resultado.add(T.get(i));  /* (para despues usar la busqueda de caminos derivados)*/
        }
        while(!pila.isEmpty()){
            Integer t = (Integer) pila.pop();

            LinkedList<Integer> temp = this.Get_estados_se_puede_llegar_epsilon("q"+t); /*2da lista Temporal */
            for(int i=0;i<temp.size();i++){
                if(!resultado.contains(temp.get(i))){  /*Sino ha sido registrado se agrega */
                    resultado.add(temp.get(i));
                    pila.push(temp.get(i));				/*Tambien a la pila para posibles caminos derivados*/
                }
            }
        }
        this.Sort_Set(resultado); /*Ordenamiento*/
        return resultado;
    }

    /* Genera el automata apartir del algoritmo de thompson */ /*Recursivo*/
    /*retorno[0] estado inicial y en retorno[1] al estado final.*/
    public Estado[] thompson(Nodo<String> nodo){        
        Estado[] retorno = new Estado[2];

        if(this.Sigma.contains(nodo.getNombre().charAt(0))){
            retorno[0] = new Estado("q"+(num_estados++));
            this.Q.add(retorno[0]);
            retorno[1] = new Estado("q"+(num_estados++));
            this.Q.add(retorno[1]);
            //crear la transición entre el estado final y el inicial
            this.delta.add(new Transicion(retorno[0],nodo.getNombre().charAt(0),retorno[1]));

            return retorno;
        }
        else if(comparar(nodo.getNombre(),"*")){
            retorno[0] = new Estado("q"+(num_estados++));
            this.Q.add(retorno[0]); /*Se actualiza la lista de estados*/

            Estado[] i_f = thompson(nodo.getHijo_izquierdo());

            retorno[1] = new Estado("q"+(num_estados++));
            this.Q.add(retorno[1]);
            
            /*crear las 4 transiciones (CERRADDURA DE CLEAN)*/
                /*entre el inicio y el final*/
            this.delta.add(new Transicion(retorno[0],AnalizadorInt.epsilon,retorno[1]));
                /*entre el inicio y el primero del hijo*/
            this.delta.add(new Transicion(retorno[0],AnalizadorInt.epsilon,i_f[0]));
                /*entre el ultimo del hijo y el final*/
            this.delta.add(new Transicion(i_f[1],AnalizadorInt.epsilon,retorno[1]));
                /*entre el ultimo y el primero del hijo (DEL MEDIO)*/
            this.delta.add(new Transicion(i_f[1],AnalizadorInt.epsilon,i_f[0]));
        }
        else if(comparar(nodo.getNombre(),"|")){ /*UNION*/
            retorno[0] = new Estado("q"+(num_estados++));
            this.Q.add(retorno[0]);

            Estado[] i_f_arriba = thompson(nodo.getHijo_izquierdo());
            Estado[] i_f_abajo = thompson(nodo.getHijo_derecho());

            retorno[1] = new Estado("q"+(num_estados++));
            this.Q.add(retorno[1]);
			
		/*crear 4 transiciones (UNION)*/
			/*entre primero con (primero-MINI SUPERIOR) */
            this.delta.add(new Transicion(retorno[0],AnalizadorInt.epsilon,i_f_arriba[0]));
			/*entre (Ultimo-MINI SUPERIOR) y ultimo */
            this.delta.add(new Transicion(i_f_arriba[1],AnalizadorInt.epsilon,retorno[1]));
			/*entre primero con (primero-MINI INFERIOR) */
            this.delta.add(new Transicion(retorno[0],AnalizadorInt.epsilon,i_f_abajo[0]));
			/*entre (Ultimo-MINI INFERIOR) y ultimo */
            this.delta.add(new Transicion(i_f_abajo[1],AnalizadorInt.epsilon,retorno[1]));

        }
        else if(comparar(nodo.getNombre(),"+"))
        {
            retorno[0] = new Estado("q"+(num_estados++));
            this.Q.add(retorno[0]);

            Estado[] i_f = thompson(nodo.getHijo_izquierdo());

            retorno[1] = new Estado("q"+(num_estados++));
            this.Q.add(retorno[1]);
            
            //crear las 4 transiciones
                //entre el inicio y el final
            //this.delta.add(new Transicion(retorno[0],AnalizadorInt.epsilon,retorno[1]));
                //entre el inicio y el primero del hijo
            this.delta.add(new Transicion(retorno[0],AnalizadorInt.epsilon,i_f[0]));
                //entre el ultimo del hijo y el final
            this.delta.add(new Transicion(i_f[1],AnalizadorInt.epsilon,retorno[1]));
                //entre el ultimo y el primero del hijo
            this.delta.add(new Transicion(i_f[1],AnalizadorInt.epsilon,i_f[0]));
        }
        else if(comparar(nodo.getNombre(),"?"))
        {
            retorno[0] = new Estado("q"+(num_estados++));
            this.Q.add(retorno[0]);

            Estado[] i_f = thompson(nodo.getHijo_izquierdo());

            retorno[1] = new Estado("q"+(num_estados++));
            this.Q.add(retorno[1]);
            
            //crear las 4 transiciones
                //entre el inicio y el final
            this.delta.add(new Transicion(retorno[0],AnalizadorInt.epsilon,retorno[1]));
                //entre el inicio y el primero del hijo
            this.delta.add(new Transicion(retorno[0],AnalizadorInt.epsilon,i_f[0]));
                //entre el ultimo del hijo y el final
            this.delta.add(new Transicion(i_f[1],AnalizadorInt.epsilon,retorno[1]));
                //entre el ultimo y el primero del hijo
            //this.delta.add(new Transicion(i_f[1],AnalizadorInt.epsilon,i_f[0]));
        }           
        
        
        else if(comparar(nodo.getNombre(),AnalizadorInt.concat+"")){
            //this.Print("entra a .");
            Estado[] i_f_izq = thompson(nodo.getHijo_izquierdo());
            Estado[] i_f_der = thompson(nodo.getHijo_derecho());

            retorno[0] = i_f_izq[0];
            retorno[1] = i_f_der[1];

            //copiar las transiciones
            copiar_transiciones(i_f_izq[1],i_f_der[0]);
        }
        
        return retorno;

    }

    /*copia las transiciones existentes entre un estado fuente y el estado destino*/
    private void copiar_transiciones(Estado destino, Estado fuente) {
        this.ordenar_transiciones();

        String cadena = fuente.getNombre();

        LinkedList<Transicion> tran = new LinkedList<Transicion>();
        for(int i=0;i<this.Sigma.size();i++){
            LinkedList<Integer> temp_list = this.Buscar_transiciones(cadena, this.Sigma.get(i));

            if(temp_list.size()!=0){
                for(int j=0;j<temp_list.size();j++){
                    int num = temp_list.get(j);
                    tran.add(this.delta.get(num));
                }
            }
        }

/*     ya se tienen las transiciones a copiar entonces se remueben las transiciones */
        for(int i=0;i<tran.size();i++){
            this.delta.add(new Transicion(destino,tran.get(i).getTransicion(),tran.get(i).getHacia()));
            this.delta.remove(tran.get(i));
        }

	/* remover el estado */
        this.Q.remove(fuente);
        this.ordenar_estados();
    }

	    /* para buscar entre la lista de transiciones una especifica y regresa el índice [Lista]*/
    public LinkedList<Integer> Buscar_transiciones(String Estado_fuente, Character caracter) {

        LinkedList<Integer> retorno_list = new LinkedList<Integer>();

        for(int i=0;i<this.delta.size();i++){
            if(this.comparar(this.delta.get(i).getDesde().getNombre(), Estado_fuente) && this.delta.get(i).getTransicion()==caracter){
                retorno_list.add(i);
            }
        }
        return retorno_list;
    }

	public void renumerar_estados(){ /*de forma consecutiva para cuando se modifica el automata */
        int i=0;
        for(i=0;i<this.Q.size();i++){ 
            this.Q.get(i).setNombre("q"+i);/*Renombrado de estado q + numero*/
        }
        this.num_estados = ++i;
    }

}