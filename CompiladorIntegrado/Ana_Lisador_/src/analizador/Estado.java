
import java.util.LinkedList;

public class Estado {
    private LinkedList<Integer> lista=new LinkedList<Integer>();//lista enlazada para guardar los valores de los estados
    private String nombre = "";//nombre del estado donde se encuentra
    private boolean marcado=false;//sirve para decir que estado ya fue visitado

    private LinkedList<Character> minim_caracter= new LinkedList<Character>();// caracter de vinculacion 
    private LinkedList<Integer> minim_grupo= new LinkedList<Integer>();//es el conjunto de estados ya visitados
    private int grupo_II_al_que_pertenece=-1;
    
    public Estado(){}

//se inicializa la lista de estados
    public Estado(LinkedList<Integer> lista){
        agregar_a_lista(lista,this.lista);
    }
//se le asigna el nombre al estado
    public Estado(String nombre){
        this.nombre = nombre;
    }
//sirve para agregar a la lista el nombre ya asignado al estado que se visita
    public Estado(String nombre,LinkedList<Integer> lista){
        this.nombre = nombre;//aqui actualiza el nombre del estado 
        agregar_a_lista(lista,this.lista);
    }

    //metodo para agregar elementos de la lista fuenta a la de destino 

    public void agregar_a_lista(LinkedList<Integer> lista_fuente, LinkedList<Integer> lista_destino){
        for(int i=0;i<lista_fuente.size();i++){
            lista_destino.add(lista_fuente.get(i));
        }
    }

   
    //metodo para obtener la lista del estado acutal
    public LinkedList<Integer> getLista() {
        return lista;
    }


    //metodo para establecer la lista de enteros 
    public void setLista(LinkedList<Integer> lista) {
        this.lista = lista;
    }

//metodo para regresar el nombre del estado actual
    public String getNombre() {
        return nombre;
    }


    //metodo para establecer el nombre al estado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//el tostring sirve para mostar cuando se imprime todo los elementos de un objeto 
    public String toString(){
        return this.nombre;
    }


    public boolean isMarcado() {
        return marcado;
    }

//actualiza el estado de la marca del estado 
    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    public void pertence_grupo_II(Integer a){
        this.grupo_II_al_que_pertenece=a;
    }

    public void add_minim_caracter(Character a){
        minim_caracter.add((Character)a);
    }

    public void add_minim_grupo(Integer a){
        minim_grupo.add((Integer)a);
    }

    public void clear_minim_caracter(){
        minim_caracter.clear();
    }

    public void clear_minim_grupo(){
        minim_grupo.clear();
    }

    public LinkedList<Character> get_minim_caracter(){
        return minim_caracter;
    }

    public LinkedList<Integer> get_minim_grupo(){
        return minim_grupo;
    }

    public String get_min(){
        String retorno = "";
        for(int i=0;i<this.minim_caracter.size();i++){
            retorno += "("+this.minim_caracter.get(i)+","+this.minim_grupo.get(i)+")";
        }
        retorno +="-"+this.grupo_II_al_que_pertenece;
        return retorno;
    }
}    