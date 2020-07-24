
public class Transicion {
    private Estado desde;			//estado donde empezara la transicion
    private Character transicion;	//letra con la cual se logra la transicion
    private Estado hacia;			//Estado donde llega la transicion

    Transicion(){}

//Se le mandan de parametros las 3 variables declaradas anteriormente
    //y se actualizan los valores de estas mismas
    public Transicion(Estado desde, Character transicion, Estado hacia){
        this.desde = desde;
        this.transicion=transicion;
        this.hacia=hacia;
    }

  //regresa el valor del estado inicial
    public Estado getDesde() {
        return desde;
    }

   //actualiza el valor del estado inicial
    public void setDesde(Estado desde) {
        this.desde = desde;
    }

   //regresa el valor de la variable con la cual se
    //realiza la transicion
    public Character getTransicion() {
        return transicion;
    }

    //Se actualiza la variable con los nuevos valores
    public void setTransicion(Character transicion) {
        this.transicion = transicion;
    }

  //se obtiene el valor del estado donde llegara
    public Estado getHacia() {
        return hacia;
    }

    //Actualiza el valor de la variable que tomara como nuevo destino
    public void setHacia(Estado hacia) {
        this.hacia = hacia;
    }
//sirve para mostrar todos los elementos al momento de imprimir en pantalla
    public String toString(){
        return "T("+this.desde.getNombre()+","+this.transicion+") = "+this.hacia.getNombre();
    }

    public String Sage_String(){
        return "(\'"+this.desde.getNombre()+"\',\'"+this.hacia.getNombre()+"\',\'"+this.transicion+"\')";
    }

    public String DOT_String(){
        //q0 -> q1 [label="a"];
        return (this.desde.getNombre()+" -> "+this.hacia+" [label=\""+this.transicion+"\"];");
    }
}