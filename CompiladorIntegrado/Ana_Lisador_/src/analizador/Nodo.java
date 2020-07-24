/*Esta clase define las propiedas de los nodos de los distintos caminos que 
*contenga el árbol, se define un padre,  un hijo izquierdo y uno derecho, así
*como sus respectivos identificadores.
*/
public class Nodo<G> {
    private G nombre;
    public static int contador_nodos=1;
    private int numero=-1; //numero de nodo que es...
    private String texto; //texto de lo que contiene por debajo de él
    private Nodo<G> padre; //referencia al nodo padre
    private Nodo<G> hijo_derecho; //referencia al nodo hijo derecho
    private Nodo<G> hijo_izquierdo; //referencia al nodo hijo izquierdo

/*
*Método que inicializa un nodo nuevo y obtiene el texto de lo siguiente.
*/
    public Nodo(String texto) {
        this.texto=texto;

        this.numero=this.contador_nodos++;

        this.hijo_derecho= new Nodo<G>();
        this.hijo_izquierdo= new Nodo<G>();
        this.padre= new Nodo<G>();

    }

/*Método constructor conseguir que el objeto sea creado valores iniciales*/
    private Nodo() {}


    public String getTexto() {
        String temp=this.texto;
        return temp;
    }


/*Método que muestra el recorrido del árbol, realiza
*el recorrido del tipo inorden, donde primero atraviesa el sub-árbol izquierdo, posteriormente
*visita la raíz y finalmente el sub-árbol derecho.
*/
    public String Mostrar_Nodo() {

        String temp="";

        if(this.hijo_izquierdo.getNombre()!=null){
            temp+="("+this.hijo_izquierdo.Mostrar_Nodo();
        }
        
        if(this.getNombre()!=null){
            temp+=this.getNombre()+"";
        }

        if(this.hijo_derecho.getNombre()!=null){
            temp+=this.hijo_derecho.Mostrar_Nodo()+")";
        }
        return temp;
    }

/*Este método nos permite mostrar la información del objeto,en este caso nos 
*proporciona el nombre del nodo. 
*/
    public String toString(){
        return nombre.toString();
    }

/*Método para obtener el nombre del nodo.
*/
    public G getNombre() {
        return nombre;
    }

/*Método para asignar un nombre al nodo.
*/
    public void setNombre(G nombre) {
        this.nombre = nombre;
    }

/*Método para obtener la referencia del padre.
*/
    public Nodo<G> getPadre() {
        return padre;
    }

/*Método para asignar un padre al nodo.
*/
    public void setPadre(Nodo<G> padre) {
        this.padre = padre;
    }

/*Método para obtener al hijo derecho.
*/
    public Nodo<G> getHijo_derecho() {
        return hijo_derecho;
    }

/*Método para asignar un hijo derecho al nodo.
*/
    public void setHijo_derecho(Nodo<G> hijo_derecho) {
        this.hijo_derecho = hijo_derecho;
    }

/*Método para obtener al hijo izquierdo.
*/
    public Nodo<G> getHijo_izquierdo() {
        return hijo_izquierdo;
    }

/*Método para asignar un hijo izquierdo al nodo.
*/
    public void setHijo_izquierdo(Nodo<G> hijo_izquierdo) {
        this.hijo_izquierdo = hijo_izquierdo;
    }

/*Método para obtener el numero representativo del nodo.
*/
    public int getNumero() {
        return numero;
    }

}