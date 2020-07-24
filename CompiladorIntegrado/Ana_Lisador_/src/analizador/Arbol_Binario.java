
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.lang.AssertionError;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Arbol_Binario {

    Nodo<String> padre;
    LinkedList<Character> lista_simbolos;
    LinkedList<Character> Operadores_Unarios= new LinkedList<Character>();
    LinkedList<Character> Operadores_Binarios= new LinkedList<Character>();

    LinkedList<Nodo<String>> nodos = new LinkedList<Nodo<String>>();

    public String cadena="";
    public String aux="";
    public static String cad[]={};
    public static String cads[]={};
    public static int auxiliar;
    
    public Arbol_Binario(){
        padre= new Nodo("");
        this.lista_simbolos = new LinkedList<Character>();
        this.lista_simbolos.add(AnalizadorInt.epsilon);//agregar el épsilon
        
    }

    public void Generar_arbol(String cadena){
        this.cadena=cadena;
        this.nodos.clear();//borra la lista de nodos

        this.Definir_Operadores(cadena);
        
        //this.print("Símbolo utilizado como concatenación: "+AnalizadorInt.concat);
        //this.print("Símbolo utilizado como épsilon: "+AnalizadorInt.epsilon);
        
        this.Generar_lista_de_simbolos(cadena);
        //cadena = Sustituir_Operadores(cadena);
        cadena = Agregar_concatenaciones(cadena);
        
        //this.print("Lista de símbolos: "+this.lista_simbolos.toString());
        String cadena_en_prefix = this.Infix_to_Prefix_txt(cadena);
        //this.print("Infix: "+cadena);
        //this.print("Prefix: "+cadena_en_prefix);

        padre = new Nodo(cadena_en_prefix);
        //nodos.add(padre); //agrega el nodo //TODO revisar esto
        Generar_rama(this.padre);

        //System.out.println("Todo el árbol: "+this.padre.Mostrar_Nodo());
    }

    private void Generar_rama(Nodo<String> nodo) {
        String texto_prefix = nodo.getTexto();
        char letra_inicial = texto_prefix.charAt(0);

        //verificar si es un símbolo... si lo es poner de una vez en la rama
        if(this.lista_simbolos.contains(letra_inicial)){
            nodo.setNombre(""+letra_inicial);
            nodos.add(nodo); //agrega el nodo //TODO revisar esto
        }
        else{
            //es un operador
            //si es un operador unario (como *)
            if(this.Operadores_Unarios.contains(letra_inicial)){
                //obtener un operador
                //se le asigna el nombre al nodo principal
                nodo.setNombre(""+letra_inicial);
                nodos.add(nodo); //agrega el nodo //TODO revisar esto

                String sub_cadena = texto_prefix.substring(1);//falta validar...
                //print("subcadena: "+sub_cadena);
                nodo.setHijo_izquierdo(new Nodo(this.obtener_operando(sub_cadena)));
                //para generar recursivamente el nodo
                this.Generar_rama(nodo.getHijo_izquierdo());

                //el hijo izquierdo dejarlo vacío...
                nodo.setHijo_derecho(new Nodo(""));
                Nodo.contador_nodos--;
                nodo.getHijo_derecho().setNombre("");
            }

            //si es un operador unario (como |, concat)
            else if(this.Operadores_Binarios.contains(letra_inicial)){
                //obtener dos operadores

                //se le asigna el nombre al nodo principal
                nodo.setNombre(""+letra_inicial);
                nodos.add(nodo); //agrega el nodo //TODO revisar esto

                String sub_cadena = texto_prefix.substring(1);//falta validar...
                String primer_operando = this.obtener_operando(sub_cadena);
                String segundo_operando = this.obtener_operando(sub_cadena.substring(primer_operando.length()));//falta validar...

                //this.print("Primer operando: "+primer_operando);//prueba
                //this.print("Segundo operando: "+segundo_operando);//prueba

                nodo.setHijo_izquierdo(new Nodo(primer_operando));
                //para generar recursivamente el nodo hijo izquierdo
                this.Generar_rama(nodo.getHijo_izquierdo());

                //el hijo izquierdo dejarlo vacío...
                nodo.setHijo_derecho(new Nodo(segundo_operando));
                //para generar recursivamente el nodo hijo izquierdo
                this.Generar_rama(nodo.getHijo_derecho());
            }
        }


    }


    private String obtener_operando(String texto) {

        char primero = texto.charAt(0);

        if(this.lista_simbolos.contains(primero)){
            return ""+primero;
        }

        int contador=0;
        if(this.Operadores_Binarios.contains(primero)){
            contador = 2;
        }
        else if(this.Operadores_Unarios.contains(primero)){
            contador = 1;
        }
        //System.out.println("contadodr:"+contador);
        String cadena = ""+primero;

        //restar 1 si encuentra simbolo, sumar 2 si encuentra op binario, sumar 1 si encuentra op unario
        for(int i=1; contador>0 && i<texto.length() ;i++){
            //print("contador"+contador);
            char letra = texto.charAt(i);
            //print(""+letra);
            if(this.lista_simbolos.contains(letra)){
                contador--;
                cadena+=""+letra;
            }
            else if(this.Operadores_Unarios.contains(letra)){
                contador+=0;//todavía le falta 1 operando..
                cadena+=""+letra;
            }
            else if(this.Operadores_Binarios.contains(letra)){
                contador+=1;//agrega un operando más...
                cadena+=""+letra;
            }
        }

        return cadena;
    }

    public String Infix_to_Prefix_txt(String infijo){
        
        Stack<Character> p1 = Infix_to_Prefix(infijo);
        String text = "";
        while (!p1.isEmpty())
            text += p1.pop();
        return text;

    }

    public Stack<Character> Infix_to_Prefix(String infijo) {

        infijo = '(' + infijo ; // Agregamos al final del infijo un ')'

        int tamano = infijo.length();

        Stack<Character> PilaDefinitiva = new Stack<Character>();
        Stack<Character> PilaTemp = new Stack<Character>();

        PilaTemp.push(')'); // Agregamos a la pila temporal un '('

        for (int i = tamano-1; i > -1; i--) {

            char caracter = infijo.charAt(i);
            if(caracter ==')'){
                PilaTemp.push(caracter);
            }
            else if(this.Operadores_Binarios.contains(caracter) || this.Operadores_Unarios.contains(caracter)){
                while (Jerarquia(caracter) > Jerarquia(PilaTemp.peek()))
                    PilaDefinitiva.push(PilaTemp.pop());
                PilaTemp.push(caracter);
            }
            else if(caracter=='('){
                while (PilaTemp.peek() != ')')
                    PilaDefinitiva.push(PilaTemp.pop());
                PilaTemp.pop();
            }
            else{
                PilaDefinitiva.push(caracter);
            }
        }
        return PilaDefinitiva;
    }

    public int Jerarquia(char elemento) {

        int num = this.Operadores_Binarios.size()+this.Operadores_Unarios.size()+8;

        if(elemento==')'){
            return num;
        }
        else if(Operadores_Binarios.contains(elemento)){//|
            int indice = Operadores_Binarios.indexOf(elemento);
            return ((num-1)-indice);
        }
        else if(Operadores_Unarios.contains(elemento)){//*
            int indice = Operadores_Unarios.indexOf(elemento);
            return ((num-2-this.Operadores_Binarios.size())-indice);
        }
        else if(elemento =='('){
            return 1;
        }
        return 0;
    }

    public void Generar_lista_de_simbolos(String cadena) {

        this.lista_simbolos.clear();//borrar los símbolos
        //genera la lista de símbolos....
        this.lista_simbolos.add(AnalizadorInt.epsilon);//agregar el épsilon
        
        int con=2;
        
        for(int i=0;i<cadena.length();i++){
            char a =cadena.charAt(i);
            if(!this.Operadores_Binarios.contains(a) && !this.Operadores_Unarios.contains(a) && a!='(' && a!=')' && !this.lista_simbolos.contains(a)){  
                this.lista_simbolos.add(a);
                if(a!='?' && a!='+')
                {
                    con+=1;
                }
            }
        }
        
        this.lista_simbolos.clear();//borrar los símbolos
        //genera la lista de símbolos....
        this.lista_simbolos.add(AnalizadorInt.epsilon);
        
        auxiliar=con;
        cad = new String[con];
        cads = new String[con-1];
        cad[0]="Estado";
        cads[0]="Estado";
        aux = Character.toString(AnalizadorInt.epsilon);
        cad[1]=aux;
        int sss=1;
        int ii=2;                
        
        for(int i=0;i<cadena.length();i++){//
            char a =cadena.charAt(i);
            if(!this.Operadores_Binarios.contains(a) && !this.Operadores_Unarios.contains(a) && a!='(' && a!=')' && !this.lista_simbolos.contains(a)){
                this.lista_simbolos.add(a);
                
                if(a!='?' && a!='+')
                {
                    aux=Character.toString(a);
                    cad[ii]=aux; 
                    cads[sss]=aux;
                    ii+=1;
                    sss+=1;
                }
            }
        }
        this.lista_simbolos.remove((Character)'?');
        this.lista_simbolos.remove((Character)'+');
    }

    public String Agregar_concatenaciones(String texto) {

        LinkedList<Character> lista_caracteres =  new LinkedList<Character>();

        for(int i=0;i<texto.length();i++){
            lista_caracteres.add(texto.charAt(i));
        }

        for(int i=0;i<lista_caracteres.size()-1;i++){

            char char1 = lista_caracteres.get(i);
            char char2 = lista_caracteres.get(i+1);
            //para agregar una concatenación char1 y char2 tienen que ser:

            //los 2 de la tabla de símbolos: ab -> a.b
            if(this.lista_simbolos.contains(char1) && this.lista_simbolos.contains(char2)){
                lista_caracteres.add(i+1,AnalizadorInt.concat);
            }
            //hay un símbolo después de un operador unario: a*b -> a*.b
            else if(this.Operadores_Unarios.contains(char1) && this.lista_simbolos.contains(char2)){
                lista_caracteres.add(i+1,AnalizadorInt.concat);
            }
            //hay un símbolo antes de un "(": a(b) -> a.(b)
            else if(this.lista_simbolos.contains(char1) && char2=='('){
                lista_caracteres.add(i+1,AnalizadorInt.concat);
            }
            //hay un símbolo después de  un ")": (a)b -> (a).b
            else if(char1==')' && this.lista_simbolos.contains(char2)){
                lista_caracteres.add(i+1,AnalizadorInt.concat);
            }
            //hay un "(" después de un operador unario: a*(b) -> a*.(b)
            else if(this.Operadores_Unarios.contains(char1) && char2=='('){
                lista_caracteres.add(i+1,AnalizadorInt.concat);
            }
            //hay un "(" después de un ")": (a)(b) -> (a).(b)
            else if(char1==')' && char2=='('){
                lista_caracteres.add(i+1,AnalizadorInt.concat);
            }
        }

        String resultado = "";

        for(int i=0;i<lista_caracteres.size();i++){
            resultado+=""+lista_caracteres.get(i);
        }

        return resultado;
    }

    public void print(String cadena) {
        System.out.println(cadena);
    }

    public void Definir_concatenacion(String cadena) {

        while(true){
            if(cadena.lastIndexOf(""+AnalizadorInt.concat)==-1){
                break;
            }
            AnalizadorInt.concat++;
        }
    }

    public void Definir_Operadores(String cadena) {

        this.Operadores_Unarios.clear();//borrar los operadores unarios
        this.Operadores_Binarios.clear();//borrar los operadores binarios

        this.Definir_concatenacion(cadena);
        this.Operadores_Unarios.add('*');
        this.Operadores_Unarios.add('?');
        this.Operadores_Unarios.add('+');
        this.Operadores_Binarios.add('|');
        this.Operadores_Binarios.add(AnalizadorInt.concat);

    }

    public String Obtener_Ultimo_Operando(String cadena) {

        char ultimo = cadena.charAt(cadena.length()-1);

        if(this.lista_simbolos.contains(ultimo)){
            return ""+ultimo;
        }
        if(this.Operadores_Unarios.contains(ultimo)){
            return Obtener_Ultimo_Operando(cadena.substring(0, cadena.length()-1))+ultimo;
        }
        if(ultimo==')'){
            //iterar hasta encontrar el que abre ese paréntesis...
            int contador = 1;
            int i;
            for(i=cadena.length()-2;contador!=0;i--){
                char actual = cadena.charAt(i);
                if(actual=='('){
                    contador--;
                }
                if(actual==')'){
                    contador++;
                }
            }
            return (cadena.substring(i+1));
        }

        return "";
    }

}