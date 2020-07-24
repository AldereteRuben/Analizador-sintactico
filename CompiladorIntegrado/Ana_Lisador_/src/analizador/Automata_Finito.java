
import java.io.File;
import java.io.FileWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public abstract class Automata_Finito {

   //Representación de un autómata finito, según teoria de la computación. Se representa cada elemento de la quintupla
    protected LinkedList<Estado> Q = new LinkedList<Estado>();                          //lista de estados
    protected LinkedList<Character> Sigma = new LinkedList<Character>();                //lista de símbolos
    protected Estado q0;                                                                //estado inicial
    protected LinkedList<Transicion> delta = new LinkedList<Transicion>();              //lista de transiciones
    protected LinkedList<Estado> F = new LinkedList<Estado>();                          //lista de estados de aceptación
    protected String regex="";
    public static String regexmax="";
    
    
    public Automata_Finito(){}

    public LinkedList<Estado> getQ() {              /*Muestra los valores de un lista de estados.*/
        return Q;
    }

    public void setQ(LinkedList<Estado> Q) {        /*Como parametro recibe una lista de estados y el método se encarga de modificar algun o todos los valores de los estados.*/
        this.Q = Q;
    }

    public LinkedList<Estado> getF() {              /*Muestra los valores de la lista de estados de aceptacion.*/
        return F;
    }

    public void setF(LinkedList<Estado> F) {        /*Como parametro recibe una lista de aceptacion y modifica los valores de la lista de estados de aceptacion.*/
        this.F = F;
    }

    public LinkedList<Character> getSigma() {       /*Es una lista de caracteres y regresa un caracter.*/
        return Sigma;
    }

    public void setSigma(LinkedList<Character> Sigma) {     /*Recibe como parametro una lista de caracteres y modifica los valores de la lista de caracteres.*/
        this.Sigma = Sigma;
    }

    public Estado getQ0() {                                 /*Regresa el valor del estado inicial y muestra el valor del estado inicial.*/
        return q0;
    }

    public void setQ0(Estado q0) {                         /*El método se encarga de modificar el valor del estados inicial y como parametro recibe un estado.*/
        this.q0 = q0;
    }

    public LinkedList<Transicion> getDelta() {             /*El método es de tipo lista enlazada de transiciones y retorna el valor de lista de transicion.*/
        return delta;
    }

    /**
     * @param delta the delta to set
     */
    public void setDelta(LinkedList<Transicion> delta) {
        this.delta = delta;
    }

    /*Este método es de tipo boolean(True o False), que contiene como paramentro dos cadenas.*/
    public boolean comparar(String cadena1, String cadena2){       
        if(cadena1.compareTo(cadena2)==0)   /*Compara las cadenas si regresa un positivo entonces cadena1 es mayor, si regresa un negativo entonces cadena2 es mayor y si regresa un 0 entonces son iguales.*/
            return true;                    /*Si las cadenas son iguales.*/
        return false;                       /*No son iguales las cadenas*/
    }


    /*Este método se encarga de ordenar las transiciones*/
    public void ordenar_transiciones(){

        Collections.sort(delta, new Comparator<Transicion>() {      /*Ordena una coleccion de transiciones de forma ascendete pero la coleccion tiene que ser de tipo transicion.*/
            public int compare(Transicion o1, Transicion o2) {      /*Para poder ordenarlo de forma ascendente, se compara dos transiciones.*/
                /*Como no exite una forma de comparar dos transiciones lo que haremos será obtener el valor de cada transicion pero convirtiendolo en entero*/
                Integer a1 = Integer.parseInt(o1.getDesde().getNombre().substring(1));      /*Obtenemos el valor de la primera transicion pero en entero*/
                Integer a2 = Integer.parseInt(o2.getDesde().getNombre().substring(1));      /*Obtenemos el valor de la segunda transicion de la misma manera su valor en entero*/
                return a1-a2;       /*Comparamos las transiciones de tal manera que si obtenemos un cero significa que las dos transiciones son iguales, si es positivo entonces la transicion a1 es mayor,
                si obtenemos un negativo entonces a2 es mayor.*/
            }
        });

    }

    /*Este metodo se encarga de order los estados*/
    public void ordenar_estados(){

        Collections.sort(this.Q, new Comparator<Estado>() {     /*Estando en el estado Q, se crea un nuevo comparador de tipo estados*/
            public int compare(Estado o1, Estado o2) {          /*Se comparan dos estados*/
                Integer a1 = Integer.parseInt(o1.getNombre().substring(1));        /*Extraemos el valor del primer estado pero en Entero*/
                Integer a2 = Integer.parseInt(o2.getNombre().substring(1));        /*Extraemos el valor del segundo estado de la misma manera en entero*/
                return a1-a2;           /*Para poder ordenarlo restamos los estados de tal manera que si obtenemos un cero significa que las dos estados son iguales, si es positivo entonces el estado a1 es mayor,
                si obtenemos un negativo entonces el estado a2 es mayor.*/
            }
        });

    }


    /*Este método se encarga de buscar estados*/
    public Estado Buscar_estado(String estado_txt){     /*El método es de tipo Estado y tiene como parametro un String*/

        for(int i=0;i<this.Q.size();i++){               /*Obntenemos el tamaño de Q para recorrer los estados*/
            if(this.comparar(Q.get(i).getNombre(), estado_txt)){        /*Estando en ese estado, obtenemos el indice del estado, después el nombre del estado y lo comparamos.*/
                return Q.get(i);        /*Si se cumple la condición entonces regresa el indice de ese estado.*/
            }
        }
        return null;        /*En caso de que exita ese estado regresa null.*/
    }

    /*En método consiste en buscar las transiciones*/
    public Integer Buscar_transicion(String Estado_fuente, Character caracter) {        /*Este método es de tipo Integer, tiene como parametro un String y un Character*/
        String retorno="";
        for(int i=0;i<this.delta.size();i++){       /*Obtenemos el tamaño de la lista de transicion delta.*/

            if(this.comparar(this.delta.get(i).getDesde().getNombre(), Estado_fuente) && this.delta.get(i).getTransicion()==caracter){      /*Estando en  la lista de tranciones doblemente ligados,
                obtenemos en indice y el nombre de la transicion lo comparamos con el estado_funte si es se vuelve verdadero entonces comparamos si el simbolo es igual al caracter recibido, si los dos son verdaderos
                entonces, la condición se cumple.*/
                return i;       /*Como la condición se cumple se regresa el indice de la transicion.*/
            }
        }
        return -1;      /*En caso de que no se cumple la condicion entonces, regresa un -1, eso quiere decir, que ese transicion no existe.*/
    }


    /*Obtenemos una lista de transiciones.*/
    public LinkedList<Transicion> Obtener_Transiciones(String Estado_fuente) {      /*Este método es de tipo lista enlazada de transiciones, tiene como parametro un String*/
        LinkedList<Transicion> retorno= new LinkedList<Transicion>();               /*Se crea un variable de tipo lista enlazada de transiciones y se crea una nueva lista enlazada de transiciones */

        for(int i=0;i<this.delta.size();i++){           //Obtenemos el tamaño de delta para poder recorrer la lista
            if(this.comparar(this.delta.get(i).getDesde().getNombre(), Estado_fuente)){     //Obteniendo el nombre de la transicion a travez del indice lo comparamos con el Estado_fuente que recibimos.
                retorno.add(this.delta.get(i));         //Si se cumple la condición se le agrega a la lista enlazada de retorno.
            }
        }
        return retorno;         //Por último retorna la lista enlazada que se llama "retorno"
    }

    //Obtenemos una lista de transiciones de epsion.
    public LinkedList<Transicion> Obtener_Transiciones_epsilon(String Estado_fuente) {      //Este método es de tipo lista enlazada de transiciones con un String de parametro.
        LinkedList<Transicion> retorno= new LinkedList<Transicion>();           //Se crea un nueva lista enlazada de transiciones 

        for(int i=0;i<this.delta.size();i++){       //Obtenemos el tamaño de delta para recorrer la lista
            if(this.comparar(this.delta.get(i).getDesde().getNombre(), Estado_fuente) && this.delta.get(i).getTransicion()==AnalizadorInt.epsilon){              /*Comparamos el nombre de la lista con el Estado_funete que recibimos y también comparamos
                el simbolo de la transicion con AnalizadorInt.epsilon*/
                retorno.add(this.delta.get(i));     //Si se cumple la condición entonces lo agregamos a la lista enlazada de transiones retorno.
            }
        }
        return retorno; //Después retornamos la lista "retorno".
    }

    /*Estados que se pueden llegar a epsilon*/
    public LinkedList<Integer> Get_estados_se_puede_llegar_epsilon(String Estado_fuente) {		//El método es de tipo lista enlazada de tipo entero, y tiene como parametro un String.
        
        LinkedList<Integer> retorno= new LinkedList<Integer>();				//Se crea una lista enlazada de enteros.

        retorno.add(Integer.parseInt(Estado_fuente.substring(1)));		//Se agrega el dato recibido a la nueva lista pero primero convertimos el dato recibido en entero.

        for(int i=0;i<this.delta.size();i++){		//Obtenemos el tamaño de delta para poder recorrer los estados de transicion.
            if(this.comparar(this.delta.get(i).getDesde().getNombre(), Estado_fuente) && this.delta.get(i).getTransicion()==AnalizadorInt.epsilon){	//Comparamos el nombre de la transicion con el dato recibido y también comparamos si el símbolo es epsilon
                retorno.add(Integer.parseInt(this.delta.get(i).getHacia().getNombre().substring(1)));		/*Si la condicion de cumple entonces agregamos el siguiente estado a la lista pero convirtiendolo a entero, agregamos el siguiente
		estado por que con epsilon se puede llegar a ese transicion*/
            }
        }
        this.Sort_Set(retorno);		//Ordena la transicion
        
        return retorno;		//Regresa la lista enlazada de enteros.
    }

    //Estados que se puede llegar a epsilon
    public LinkedList<Integer> mueve(String Estado_fuente, Character caracter) {		//El método es de tipo lista enlazada de enteros y tiene como parametro un String y un Character 
        LinkedList<Integer> retorno= new LinkedList<Integer>(); //Se crea una nueva lista enlazada de enteros.

        if(caracter == AnalizadorInt.epsilon){		//Comprobamos si el caracter recibido es epsilon
            retorno.add(Integer.parseInt(Estado_fuente.substring(1)));		//Si la condicion se cumple entonces se agraga a la nueva lista creada pero convirtiendolo a entero.         
        }

        for(int i=0;i<this.delta.size();i++){		//Obtenemos el tamaño del delta.
            if(this.comparar(this.delta.get(i).getDesde().getNombre(), Estado_fuente) && this.delta.get(i).getTransicion()==caracter){		/*Comparamnos el nombre del estado con el String recibido, también comparamos el símbolo con el
		caracter recibido*/
                retorno.add(Integer.parseInt(this.delta.get(i).getHacia().getNombre().substring(1)));		//Si la condicion se cumple entonces se agrega el estado hacia a la lista convirtiendo en entero.
            }
        }
        this.Sort_Set(retorno);		//Lo ordenamos

        return retorno; //retornamos la lista enlazada de enteros.
    }

    //Dadas 2 listas enlazadas, de Integers; una siendo una fuente y la otra destino, 
    //el método copia contenido de la lista fuente en la lista destino.
    public void agregar_a_lista(LinkedList<Integer> lista_fuente, LinkedList<Integer> lista_destino){
        for(int i=0;i<lista_fuente.size();i++){
            lista_destino.add(lista_fuente.get(i));
        }
    }
    
    //Mismo comentario que el anterior.
    //Este método realiza la misma tarea que el método anterior, solo que orientado a programaciín genérica
    //para que se emplee con una variedad más grande de objetos que solo los Integer.
    public void agregar_a_lista_2(LinkedList lista_fuente, LinkedList lista_destino){
        for(int i=0;i<lista_fuente.size();i++){
            lista_destino.add(lista_fuente.get(i));
        }
    }
    
    //Este método se encarga de depurar la lista de números repetidos que se encuentren en una lista enlazada, llamada "lista"
    public void Sort_Set(LinkedList<Integer> lista){
        Collections.sort(lista);                        //Primero se ordena la lista para facilitar la eliminación de elementos repetidos
        for(int i=1;i<lista.size();i++){                //El subíndice comienza en 1 para poder regresar siempre al anterior
            int numero1 = lista.get(i);
            int numero2 = lista.get(i-1);
            if(numero1==numero2){                       //Se verifican y eliminan los elementos repetidos
                lista.remove(i--);                      //Se reubica el subindice para volver a realizar la comprobación en caso de encotrar algún repetido
            }
        }
    }

    //Método simple para imprimir una cadena 
    public void Print(String cadena){
        System.out.println(cadena);
    }

    public void Generar_Sage() {
        String cadena = "g = DiGraph({}, loops=True, multiedges=True,sparse=True)"+"\n";
        cadena+="g.add_edges([";

        cadena+=this.delta.get(0).Sage_String();
        for(int i=1;i<this.delta.size();i++){
            cadena+=","+this.delta.get(i).Sage_String();
        }

        cadena+="])"+"\n";
        cadena+="g.plot(edge_labels=True, color_by_label=True, edge_style='dashed')";

        System.out.println(cadena);

    }


    //Método que ayuda a mostrar el registro de las operaciones de los autómatas creados. 
    //Se muestran todos los autómatas en su formato de quintupla.
    //
    public void Imprimir_Todo_AF(String nombre_archivo, String linea, long tiempo) {

        this.ordenar_transiciones();
        this.ordenar_estados();
        String texto="";

        texto+=("____________________________________________________________________________________________\n");
        texto+=(linea+"\n---------------------------------------------------------------------------\n");
        texto+=("Genera un lenguaje a partir de la regex: "+AnalizadorInt.regex+" -> "+this.regex);
        texto+=("\n__________________________________________________________________________________________\n");
        texto+=("Lista de símbolos: "+this.Sigma.toString()+"\n");
        texto+=("Estado inicial (q0): "+this.q0.toString()+"\n");
        texto+=("Lista de estados (Q): "+this.Q.toString()+"\n");
        texto+=("Lista de aceptación (F): "+this.F.toString()+"\n");
        texto+=("Transiciones:"+"\n");
        for(int i=0;i<this.delta.size();i++){
            texto+=("\t* "+this.delta.get(i).toString()+"\n");
        }
        texto+=("\n*************************************************************");

        if(AnalizadorInt.imprimir_automatas_en_pantalla){
            this.Print(texto);
        }

    }

}