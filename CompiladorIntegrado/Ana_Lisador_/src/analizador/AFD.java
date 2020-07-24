/*************************************************************************************
 * Nombre del archivo: AFN.java
 * Universidad del Valle de Guatemala
 * Curso: Diseño de Lenguajes de Programación
 * @author martin
 *          Martín Guzmán 08041
 * Fecha: Marzo de 2010
 * Descripción:
*************************************************************************************/
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class AFD extends Automata_Finito{

    public Arbol_Binario arbol;
    private HashMap SiguientePos = new HashMap();
    private static int num_estados=0;
    private AFN afn;
    public static String Datoss[][]={};

    
    public AFD(){
        super();
        num_estados=0;
    }

    /***********************************************
     * Método: AFD
     * Uso: Constructor para la conversión a un AFD
     *      por subconjuntos
     * @return void
    ***********************************************/
    public AFD(AFN afn){
        //usar conversión por subconjuntos
        super();
        long tiempo_inicial = System.nanoTime();
        num_estados=0;
        this.afn = afn;
        this.regex=this.afn.arbol.padre.Mostrar_Nodo();
        this.Sigma = this.afn.Sigma;

        //para quitar el épsilon del conjunto de símbolos
        this.Sigma.removeFirst();
        
        Construccion_Subconjuntos();

        long tiempo_final = System.nanoTime();
        long tiempo = tiempo_final-tiempo_inicial;

        String linea = "\tAFD creado convirtiendo un AFN con subconjuntos";
        this.Imprimir_Todo_AF("AFD_subconjuntos_",linea,tiempo);
        String caden[]=Arbol_Binario.cads;
        
        int num=Arbol_Binario.auxiliar;
        num-=1;
        String Auxk="";
        String AuxQ="";
        String ACon="";
        Datoss= new String[this.Q.size()][num];        
                
        for(int i=0;i<this.Q.size();i++)
        {            
            if(caden[0].equals("Estado"))
            {
                ACon="q"+i;
                String A=CharTabla(ACon);
                Datoss[i][0]=A;                
                for(int j=0;j<this.F.size();j++)
                {                    
                    String B=this.F.get(j).toString();
                    if(ACon.equals(B))
                    {
                        Datoss[i][0]=A+"*";
                    } 
                }                                                           
            }
        }
        
        for(int i=1;i<num;i++)
            {                 
                for(int n=0;n<this.Q.size();n++)
                {
                    String g = "q"+n;
                    Auxk="";
                    for(int j=0;j<this.delta.size();j++)
                    {
                        String s = Character.toString(this.delta.get(j).getTransicion());
                        String ss = this.delta.get(j).getDesde().getNombre();
                        if(caden[i].equals(s) && g.equals(ss))
                        {
                            AuxQ=this.delta.get(j).getHacia().getNombre();
                            Auxk+=CharTabla(AuxQ);
                            Auxk+=",";                   
                        }                       
                    }                    
                    Datoss[n][i]=Auxk;
                }
            }
        //**********************************************************************
        // **************** minimización de estados ****************************
        //**********************************************************************

        tiempo_inicial = System.nanoTime();
        Minimizacion_estados();
        tiempo_final = System.nanoTime();
        tiempo = tiempo_final-tiempo_inicial;
        linea = "\tMinimización del AFD creado convirtiendo un AFN con subconjuntos";
        this.Imprimir_Todo_AF("AFD_subconjuntos_minimo_",linea,tiempo);
    }

    public String CharTabla(String QEs)
    {
        String Aux="";
        switch(QEs)
        {
            case "q0":
                Aux="A";                
                break;
            case "q1":
                Aux="B";
                break;
            case "q2":
                Aux="C";                
                break;
            case "q3":
                Aux="D";
                break;
            case "q4":
                Aux="E";                
                break;
            case "q5":
                Aux="F";
                break;
            case "q6":
                Aux="G";                
                break;
            case "q7":
                Aux="H";
                break;
        }
        
        return Aux;
    }
    
    /***********************************************
     * Método: AFD
     * Uso: Constructor para la construcción directa
     *      de un AFD. Recibe por ende un árbol
     * @return void
    ***********************************************/
    public AFD(Arbol_Binario arbol1){
        //usar construcción directa
        super();

        num_estados=0;
        
        this.arbol=new Arbol_Binario();
        Nodo.contador_nodos=1;
        this.arbol.Generar_arbol(("("+arbol1.cadena+")"+"#"));

        long tiempo_inicial = System.nanoTime();

        //*********************************************************************
        // asignar la lista de símbolos (sigma)
        this.Sigma = this.arbol.lista_simbolos;
        //*********************************************************************
        this.regex=this.arbol.padre.Mostrar_Nodo();

        /*
        this.Print("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        ///*
        LinkedList<Nodo<String>> nodos = this.arbol.nodos;
        //this.arbol.nodos.remove(0);
        for(int i=0;i<arbol.nodos.size();i++){
            this.Print("Nombre: "+nodos.get(i).getNombre()+" # "+nodos.get(i).getNumero());
        }
        this.Print(""+nodos.size());
        //this.Print(this.arbol.padre.Mostrar_Nodo());
        //*/

        //prosigue el cálculo de primerapos, ultimapos y siguientepos para cada nodo del arbol
        this.q0 = new Estado("q"+(num_estados++),this.Primera_Pos(arbol.padre));
        this.Q.add(this.q0);
        
        this.Calcular_Siguiente_Pos();
        this.Marcar_estados();
        this.Estados_acepatacion();

        long tiempo_final = System.nanoTime();
        long tiempo = tiempo_final-tiempo_inicial;

        //Imprimir_Siguiente_Pos();
        String linea = "\tAFD creado directamente del árbol";
        Imprimir_Todo_AF("AFD_directo_",linea,tiempo);

        this.Sigma.remove((Character)AnalizadorInt.epsilon);
        this.Sigma.remove((Character)'#');

        //**********************************************************************
        // **************** minimización de estados ****************************
        //**********************************************************************

        tiempo_inicial = System.nanoTime();
        Minimizacion_estados();
        tiempo_final = System.nanoTime();
        tiempo = tiempo_final-tiempo_inicial;
        linea = "\tMinimización del AFD creado directamente del árbol";
        this.Imprimir_Todo_AF("AFD_directo_minimo_",linea,tiempo);
        
    }

    /***********************************************
     * Método: Construccion_Subconjuntos
     * Uso: Genera el AFD a partir de un AFN
     * @return void
    ***********************************************/
    public void Construccion_Subconjuntos(){

        //definir estado inicial
        this.q0 = new Estado("q"+(num_estados++),cerradura_epsilon(this.afn.q0.getNombre()));
        //this.Print("Cerradura-e de q0: "+(this.q0.getLista().toString()));
        this.q0.setMarcado(false);
        this.Q.add(this.q0);

        while(existe_estado_no_marcado()>=0){

            Estado T = this.Q.get(existe_estado_no_marcado());
            //this.Print("******************* "+T+" "+T.getLista().toString());
            //marcar T
            T.setMarcado(true);
            //para cada a ε a los simbolos:
            for(int i=0;i<this.Sigma.size();i++){

                Character a = this.Sigma.get(i);                
                //U = cerradura-e(mueve(T,a))
                LinkedList<Integer> mueve = new LinkedList<Integer>();
                for(int w =0;w<T.getLista().size();w++){
                    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    this.agregar_a_lista(afn.mueve("q"+T.getLista().get(w),a), mueve);                    
                    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                    System.out.println("T.getLista:"+T.getLista().get(w));
                }
                this.Print("*******************\t mueve:"+mueve.toString()+" T.getNombre()"+T.getNombre());
                LinkedList<Integer> temp = new LinkedList<Integer>();
                for(int j=0;j<mueve.size();j++){
                    LinkedList<Integer> cerr_e = this.cerradura_epsilon("q"+mueve.get(j));
                    this.agregar_a_lista(cerr_e,temp);
                }
                //this.Print("\t\tCerradura: "+""+temp.toString());
                //ya está el cálculo de U
                if(esta_entre_estados(temp)==false){
                    //TODO: SI SE QUIEREN ESTADOS VACIOS, QUITAR ESTA CONDICION (solo la condición)
                    if(temp.isEmpty()==false){
                        this.Q.add(new Estado("q"+(this.num_estados++),temp));
                        this.Q.getLast().setMarcado(false);
                        Estado U = this.Q.getLast();
                        //definir transición: T(T,a)=U
                        this.delta.add(new Transicion(T,a,U));
                    }
                }
                else{
                    //definir transición: T(T,a)=U
                    Estado U = this.Q.get(indicie_entre_estados(temp));
                    this.delta.add(new Transicion(T,a,U));
                }
            }
        }


        //ESTADOS DE ACEPTACIÓN:
        LinkedList<Integer> acept = new LinkedList<Integer>();
        for(int i=0;i<afn.F.size();i++){
            acept.add(Integer.parseInt(afn.F.get(i).getNombre().substring(1)));
        }
        //this.Print("Aceptaciones del AFN: "+acept.toString());

        for(int i=0;i<this.Q.size();i++){
            for(int j=0;j<acept.size();j++){
                if(this.Q.get(i).getLista().contains(acept.get(j))){
                    this.F.add(this.Q.get(i));
                }
            }
        }
    }

    /***********************************************
     * Método: esta_entre_estados
     * Uso: Retorna el índice del estado en donde esté
     *      la lista dada en temp o -1 si es un estado
     *      no existente
     * @param temp contiene una lista de enteros para
     *      revisar en cada estado
     * @return int con el índice o -1
    ***********************************************/
    public boolean esta_entre_estados(LinkedList<Integer> temp){
        if(indicie_entre_estados(temp)==-1){
            return false;
        }
        return true;
        /*
        for(int i=0;i<this.Q.size();i++)
            if(this.comparar(this.Q.get(i).getLista().toString(),temp.toString())){
                return true;
            }
        return false;
         */
    }

    /***********************************************
     * Método: indicie_entre_estados
     * Uso: Retorna el índice del estado en donde esté
     *      la lista dada en temp o -1 si es un estado
     *      no existente
     * @param temp contiene una lista de enteros para
     *      revisar en cada estado
     * @return int con el índice o -1
    ***********************************************/
    public int indicie_entre_estados(LinkedList<Integer> temp){
        this.Sort_Set(temp);
        for(int i=0;i<this.Q.size();i++){
            this.Sort_Set(Q.get(i).getLista());
            if(this.comparar(this.Q.get(i).getLista().toString(),temp.toString())){
                return i;
            }
        }
        return -1;
    }

    /***********************************************
     * Método: existe_estado_no_marcado
     * Uso: Busca entre la lista de estados (Q) si existe
     *      algún estado que no se haya marcado y retorna
     *      su índice. Si todos están marcados retorna -1
     * @return int con el índice o -1
    ***********************************************/
    public int existe_estado_no_marcado(){
        for(int i=0;i<this.Q.size();i++){
            if(this.Q.get(i).isMarcado()==false){
                return i;
            }
        }
        return -1;
    }

    /***********************************************
     * Método: cerradura_epsilon
     * Uso: Retorna todos los estados a los que puede
     *      llegar con transiciones epsilon
     * @return LinkedList<Integer> con los números de los estados
    ***********************************************/
     public LinkedList<Integer> cerradura_epsilon(String estado){

        LinkedList<Integer> resultado = new LinkedList<Integer>();

        Stack pila = new Stack();
        LinkedList<Integer> T = this.afn.Get_estados_se_puede_llegar_epsilon(estado);

        for(int i=0;i<T.size();i++){
            pila.push(T.get(i));
            resultado.add(T.get(i));
        }
        while(!pila.isEmpty()){
            Integer t = (Integer) pila.pop();

            LinkedList<Integer> temp = this.afn.Get_estados_se_puede_llegar_epsilon("q"+t);
            for(int i=0;i<temp.size();i++){
                if(!resultado.contains(temp.get(i))){
                    resultado.add(temp.get(i));
                    pila.push(temp.get(i));
                }
            }
        }
        this.Sort_Set(resultado);
        return resultado;
    }

    /***********************************************
     * Método: Anulable
     * Uso: Recibe un nodo y revisa si este es anulable
     * @return booleano que dice si es anulable
    ***********************************************/
    public boolean Anulable(Nodo<String> nodo){

        if(comparar(nodo.getNombre().toString(),"*")){
            return true;
        }
        else if(comparar(nodo.getNombre().toString(),"|")){
            //es anulable si cualquiera de sus hijos es anulable
            return (Anulable(nodo.getHijo_izquierdo()) || Anulable(nodo.getHijo_derecho()));
        }
        else if(comparar(nodo.getNombre().toString(),""+AnalizadorInt.concat)){
            return (Anulable(nodo.getHijo_izquierdo()) && Anulable(nodo.getHijo_derecho()));
        }
        if(this.Sigma.contains(nodo.getNombre().charAt(0)) || comparar(AnalizadorInt.epsilon+"",nodo.getNombre())){
            //hay 2 opciones:
                //que sea épsilon -> true
                //que no sea épsilon -> false
            if(comparar(AnalizadorInt.epsilon+"",nodo.getNombre())){
                return true;
            }
            return false;
        }
        return false;
    }

    /***********************************************
     * Método: Primera_Pos
     * Uso: Retorna una lista con los elementos que
     *      contiene primera_pos del nodo especificado
     * @return LinkedList<Integer> con los elementos
    ***********************************************/
    public LinkedList<Integer> Primera_Pos(Nodo<String> nodo) {

        LinkedList<Integer> lista_retorno = new LinkedList<Integer>();

        String nombre_nodo = nodo.getNombre();
        char nombre_char = nombre_nodo.charAt(0);
        int numero_nodo = nodo.getNumero();
        
        //si es parte de los símbolos
        if(this.Sigma.contains(nombre_char)){
            //retorna el número que tiene el nodo
            lista_retorno.add(numero_nodo);
            return lista_retorno;
        }
        //si es un clean
        if(nombre_char == '*'){
            //primerapos de un * es primerapos del hijo
            LinkedList<Integer> list_temp = Primera_Pos(nodo.getHijo_izquierdo());
            agregar_a_lista(list_temp,lista_retorno);
        }
        //si es un or
        else if(nombre_char == '|'){
            //primerapos de un | es primerapos del hijo izquierdo + primerapos del hijo derecho
            LinkedList<Integer> list_temp = Primera_Pos(nodo.getHijo_izquierdo());
            agregar_a_lista(list_temp,lista_retorno);
            LinkedList<Integer> list_temp2 = Primera_Pos(nodo.getHijo_derecho());
            agregar_a_lista(list_temp2,lista_retorno);
        }
        //si es una concatenación
        else if(nombre_char == AnalizadorInt.concat){
            //revisar si es anulable el hijo izquierdo.
            if(this.Anulable(nodo.getHijo_izquierdo())){
                //si lo es, significa que puede empezar en cualquiera de los 2 hijos
                LinkedList<Integer> list_temp = Primera_Pos(nodo.getHijo_izquierdo());
                agregar_a_lista(list_temp,lista_retorno);
                LinkedList<Integer> list_temp2 = Primera_Pos(nodo.getHijo_derecho());
                agregar_a_lista(list_temp2,lista_retorno);
            }
            else{
                //sino solo puede ser primerapos del hijo izquierdo
                LinkedList<Integer> list_temp = Primera_Pos(nodo.getHijo_izquierdo());
                agregar_a_lista(list_temp,lista_retorno);
            }
        }
        Sort_Set(lista_retorno);
        return lista_retorno;
    }

    /***********************************************
     * Método: Ultima_Pos
     * Uso: Retorna una lista con los elementos que
     *      contiene ultima_pos del nodo especificado
     * @return LinkedList<Integer> con los elementos
    ***********************************************/
    public LinkedList<Integer> Ultima_Pos(Nodo<String> nodo) {

        LinkedList<Integer> lista_retorno = new LinkedList<Integer>();

        String nombre_nodo = nodo.getNombre();
        char nombre_char = nombre_nodo.charAt(0);
        int numero_nodo = nodo.getNumero();

        //si es parte de los símbolos
        if(this.Sigma.contains(nombre_char)){
            //retorna el número que tiene el nodo
            lista_retorno.add(numero_nodo);
            return lista_retorno;
        }
        //si es un clean
        if(nombre_char == '*'){
            //primerapos de un * es primerapos del hijo
            LinkedList<Integer> list_temp = Ultima_Pos(nodo.getHijo_izquierdo());
            agregar_a_lista(list_temp,lista_retorno);
        }
        //si es un or
        else if(nombre_char == '|'){
            //primerapos de un | es primerapos del hijo izquierdo + primerapos del hijo derecho
            LinkedList<Integer> list_temp = Ultima_Pos(nodo.getHijo_izquierdo());
            agregar_a_lista(list_temp,lista_retorno);
            LinkedList<Integer> list_temp2 = Ultima_Pos(nodo.getHijo_derecho());
            agregar_a_lista(list_temp2,lista_retorno);
        }
        //si es una concatenación
        else if(nombre_char == AnalizadorInt.concat){
            //revisar si es anulable el hijo izquierdo.
            if(this.Anulable(nodo.getHijo_derecho())){
                //si lo es, significa que puede empezar en cualquiera de los 2 hijos
                LinkedList<Integer> list_temp = Ultima_Pos(nodo.getHijo_izquierdo());
                agregar_a_lista(list_temp,lista_retorno);
                LinkedList<Integer> list_temp2 = Ultima_Pos(nodo.getHijo_derecho());
                agregar_a_lista(list_temp2,lista_retorno);
            }
            else{
                //sino solo puede ser primerapos del hijo izquierdo
                LinkedList<Integer> list_temp = Ultima_Pos(nodo.getHijo_derecho());
                agregar_a_lista(list_temp,lista_retorno);
            }
        }
        Sort_Set(lista_retorno);
        return lista_retorno;
    }
    
    /***********************************************
     * Método: Calcular_Siguiente_Pos
     * Uso: Para calcular el siguiente pos de cada uno
     * @return LinkedList<Integer> con los elementos
    ***********************************************/
    public void Calcular_Siguiente_Pos(){
        LinkedList<Nodo<String>> nodos = arbol.nodos;
        for(int i=0;i<nodos.size();i++){
            
            Nodo<String> nodo_actual = nodos.get(i);
            String nombre_nodo = nodo_actual.getNombre();
            
            if(this.comparar(nombre_nodo,"*")){
                //this.Print("entra en el cálculo de siguiente pos en *   "+nodo_actual.Mostrar_Nodo());
                //agregar a cada elemento de ultima pos, los elementos de primera pos.
                LinkedList<Integer> poner_en = this.Ultima_Pos(nodo_actual);
                LinkedList<Integer> a_agregar = this.Primera_Pos(nodo_actual);
                //this.Print("poner en: "+poner_en.toString()+"\na_agregar: "+a_agregar.toString());
                for(int j=0;j<poner_en.size();j++){
                    int numero = poner_en.get(j);
                    
                    if(SiguientePos.containsKey(numero)){
                        //si ya la tiene, es agregar
                        this.agregar_a_lista(a_agregar,(LinkedList<Integer>)SiguientePos.get(numero));
                        this.Sort_Set((LinkedList<Integer>)SiguientePos.get(numero));
                    }
                    else{
                        //si no la tiene, es poner
                        SiguientePos.put(numero,a_agregar);
                    }   
                }
            }
            else if(this.comparar(nombre_nodo,""+AnalizadorInt.concat)){
                //this.Print("entra en el cálculo de siguiente pos en .   "+nodo_actual.Mostrar_Nodo());
                //agregar a cada elemento de ultima pos del hijo izquierdo, los elementos de
                // primera pos del hijo derecho
                LinkedList<Integer> poner_en = this.Ultima_Pos(nodo_actual.getHijo_izquierdo());
                LinkedList<Integer> a_agregar = this.Primera_Pos(nodo_actual.getHijo_derecho());

                //this.Print("poner en: "+poner_en.toString()+"\na_agregar: "+a_agregar.toString());

                for(int j=0;j<poner_en.size();j++){
                    int numero = poner_en.get(j);
                    if(SiguientePos.containsKey(numero)){
                        //si ya la tiene, es agregar

                        LinkedList<Integer> lista_temp = (LinkedList<Integer>)SiguientePos.get(numero);
                        //this.Print("abcabc"+lista_temp.toString());
                        this.agregar_a_lista(a_agregar,lista_temp);
                        this.Sort_Set((LinkedList<Integer>)SiguientePos.get(numero));
                    }
                    else{
                        //si no la tiene, es poner

                        LinkedList<Integer> lista_temp = new LinkedList<Integer>();
                        this.agregar_a_lista(a_agregar, lista_temp);

                        SiguientePos.put(numero,lista_temp);
                    }   
                }
            }
        }
    }

    /***********************************************
    * Método: Marcar_estados
    * Uso: Genera las transiciones, mientras va marcando
     *      los estados (y los va generando)
    * @return void
    ***********************************************/
    private void Marcar_estados() {
        LinkedList<Character> lista_caracteres = new LinkedList<Character>();

        for(int i=0;i<this.Sigma.size();i++){
            lista_caracteres.add(this.Sigma.get(i));
        }

        lista_caracteres.remove((Character)AnalizadorInt.epsilon);
        lista_caracteres.remove((Character)'#');
        //this.Print("\n");
        //this.Print("Lista caracteres: "+lista_caracteres.toString()+Q.size());
        
        //hasta marcar todos los estados...
        for(int i=0;i<this.Q.size();i++){

            Estado estado_actual = Q.get(i);

            //this.Print("Nombre del estado: "+estado_actual.getNombre()+"  "+estado_actual.getLista().toString());//TODO quitar esto
            LinkedList<Integer> lista_del_estado_actual = estado_actual.getLista();

            //por cada estado hay que revisar para todos los caracteres de la lista de caracteres
            for(int j=0;j<lista_caracteres.size();j++){

                char caracter = lista_caracteres.get(j);

                LinkedList<Integer> posiciones_de_caracter = new LinkedList<Integer>();

                for(int w=0;w<this.arbol.nodos.size();w++){
                    if(this.arbol.nodos.get(w).getNombre().compareTo(""+caracter)==0){
                        if(estado_actual.getLista().contains(this.arbol.nodos.get(w).getNumero())){
                            posiciones_de_caracter.add(this.arbol.nodos.get(w).getNumero());
                        }
                    }
                }
                //this.Print("\tCaracter analizando: "+caracter+" "+posiciones_de_caracter.toString());//TODO quitar esto

                LinkedList<Integer> list_nuevo_estado = new LinkedList<Integer>();
                for(int w=0;w<posiciones_de_caracter.size();w++){
                    this.agregar_a_lista((LinkedList<Integer>)this.SiguientePos.get(posiciones_de_caracter.get(w)), list_nuevo_estado);
                }

                //this.Print("Lista del estado: "+list_nuevo_estado.toString());
                this.Sort_Set(list_nuevo_estado);

                boolean estado_existente = false;
                int a = 0;
                for(int w=0;w<this.Q.size();w++){
                    if(this.comparar(this.Q.get(w).getLista().toString(), list_nuevo_estado.toString())){
                        estado_existente = true;
                        a = w;
                        break;
                    }
                }
                if(estado_existente){
                    this.delta.add(new Transicion(estado_actual,caracter,this.Q.get(a)));
                }
                else{
                    if(!list_nuevo_estado.isEmpty()){
                        Estado estado_temp = new Estado("q"+(num_estados++),list_nuevo_estado);
                        this.Q.add(estado_temp);
                        this.delta.add(new Transicion(estado_actual,caracter,estado_temp));
                    }
                }
            }
        }
    }

    /***********************************************
    * Método: Imprimir_Siguiente_Pos
    * Uso: Imprime el mapa de Siguiente pos
    * @return void
    ***********************************************/
    private void Imprimir_Siguiente_Pos() {
        this.Print("Siguiente pos:");
        //se crea un iterador para recorrer el mapa
        Iterator it = SiguientePos.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("\t"+e.getKey() + " " + e.getValue());
        }
    }

    /***********************************************
    * Método: Estados_acepatacion
    * Uso: Agrega a la lista de estados de aceptación
    * @return void
    ***********************************************/
    private void Estados_acepatacion() {

        Integer num = this.arbol.nodos.getLast().getNumero();

        for(int i=0;i<this.Q.size();i++){
            if(Q.get(i).getLista().contains(num)){
                this.F.add(Q.get(i));
            }
        }
    }

    /***********************************************
    * Método: Calcular_Siguiente_Pos
    * Uso: Para calcular el siguiente pos de cada uno
    * @return LinkedList<Integer> con los elementos
    ***********************************************/
    public void Simulacion_AFD(String cadena){
        long tiempo_inicial = System.nanoTime();

        String cadena2 = cadena.replaceAll(""+AnalizadorInt.epsilon, "");
        System.out.println(cadena2);
        String revisando_estado = this.q0.getNombre();
        boolean aceptada=false;

        String ultimo_estado_aceptacion = "";

        if(this.F.contains(this.q0)){
            aceptada = true;
            ultimo_estado_aceptacion = this.q0.getNombre();
        }

        for(int i=0;i<cadena2.length();i++){
            //this.Print("Está en el estado: "+revisando_estado);
            Character caracter = cadena2.charAt(i);
            Integer a = Buscar_transicion(revisando_estado,caracter);
            
            if(a==-1){
                revisando_estado=" (-) estado de error";
                aceptada = false;
                break;
            }
            else{
                revisando_estado=this.delta.get(a).getHacia().getNombre();
                if(this.F.contains(this.delta.get(a).getHacia())){
                    aceptada = true;
                    //int indice = this.F.indexOf(this.delta.get(a).getHacia());
                    //System.out.println("indice en F: "+indice);
                    //ultimo_estado_aceptacion = this.delta.get(indice).getHacia().getNombre();
                    ultimo_estado_aceptacion = revisando_estado;
                }
                else{
                    aceptada = false;
                }
            }
        }

        long tiempo_final = System.nanoTime();
        long tiempo = tiempo_final-tiempo_inicial;

        this.Print("La cadena (w): "+cadena+"");
        this.Print("\t* "+((aceptada)?"Sí ":"No ")+"fue aceptada");
        this.Print("\t* Tiempo de simulación: "+(tiempo)+"ns = "+(((double)(tiempo)/(double)100000))+"ms");
        this.Print("\t* Estados aceptación del autómata: "+this.F);
        this.Print("\t* Estado alcanzado: "+revisando_estado);
        this.Print("\t* Último estado de aceptación alcanzado: "+((ultimo_estado_aceptacion.length()==0)?" - ":""+ultimo_estado_aceptacion));
    }


    public void Minimizacion_estados(){
        LinkedList<LinkedList<Estado>> II = new LinkedList<LinkedList<Estado>>();
        II.add(new LinkedList<Estado>());//estados F
        II.add(new LinkedList<Estado>());//estados S-F

        for(int i=0;i<this.Q.size();i++){
            if(this.F.contains(this.Q.get(i))){
                II.get(0).add(this.Q.get(i));
            }
            else{
                II.get(1).add(this.Q.get(i));
            }
        }

        int i=0;
        int e=0;
        do{
            if(AnalizadorInt.imprimir_debugueo_minimizacion){
                this.Print(II.toString());
            }
            II=this.crear_subgrupos(II);
            i=II.size();
            if(AnalizadorInt.imprimir_debugueo_minimizacion){
                this.Print(II.toString());
            }
            II=this.crear_subgrupos(II);
            e=II.size();
        }while(i!=e);

        //this.Print(II.toString());
        
        //ya se tiene II_final
        //II_final = II;

        LinkedList<Estado> Q = new LinkedList<Estado>();//lista de estados
        LinkedList<Estado> F = new LinkedList<Estado>();//lista de estados de aceptación
        Estado q0 = null;//estado inicial
        LinkedList<Transicion> delta = new LinkedList<Transicion>();//lista de transiciones

        //escoger un representante de cada grupo
        LinkedList<Estado> lista_representantes = new LinkedList<Estado>();
        for(int a=0;a<II.size();a++){
            lista_representantes.add(II.get(a).getFirst());
            Estado est = new Estado("q"+a);
            //copiar los estados de aceptación
            for(int b=0;b<this.F.size();b++){
                if(II.get(a).contains(this.F.get(b))){
                    if(F.contains(est)==false){
                        F.add(est);
                    }
                }
            }
            //verificar si es el estado inicial
            if(II.get(a).contains(this.q0)){
                q0=est;
            }
            Q.add(est);
        }
        //estado inicial ya definido
        //estados de aceptación ya definidos

        //toca replicar las transiciones
        for(Estado est : lista_representantes){
            LinkedList<Transicion> tran_temp = this.Obtener_Transiciones(est.getNombre());
            //replicar cada una de las transiciones...
            for(int c=0;c<tran_temp.size();c++){
                int desde = this.pertenece_II(II, tran_temp.get(c).getDesde());
                int hacia = this.pertenece_II(II, tran_temp.get(c).getHacia());
                Character carac = tran_temp.get(c).getTransicion();
                Estado desde_est = null;
                Estado hacia_est = null;
                for(int d=0;d<Q.size();d++){
                    if(Q.get(d).getNombre().compareTo("q"+desde)==0){
                        desde_est = Q.get(d);
                    }
                    if(Q.get(d).getNombre().compareTo("q"+hacia)==0){
                        hacia_est = Q.get(d);
                    }
                }
                Transicion tran_nueva = new Transicion(desde_est,carac,hacia_est);
                delta.add(tran_nueva);
            }

        }

        this.q0=q0;
        this.F=F;
        this.Q=Q;
        this.delta=delta;
    }
    
    public LinkedList<LinkedList<Estado>> crear_subgrupos(LinkedList<LinkedList<Estado>> II_vieja){
        
        LinkedList<LinkedList<Estado>> II_nueva = new LinkedList<LinkedList<Estado>>();
        //this.Print("Símbolos: "+this.Sigma);

        for(int i=0;i<II_vieja.size();i++){
            LinkedList<Estado> Ii = II_vieja.get(i);

            //this.Print("\tLista estados: "+Ii.toString());
            LinkedList<Estado> If = new LinkedList<Estado>();

            for(Estado est : Ii){
                //recorrer todos los símbolos
                est.clear_minim_caracter();
                est.clear_minim_grupo();
                
                for(Character a : this.Sigma){
                    Integer num = this.Buscar_transicion(est.getNombre(), a);
                    est.add_minim_caracter((Character)a);
                    int j=-1;
                    if(num!=-1)
                        j = pertenece_II(II_vieja,this.delta.get(num).getHacia());
                    est.add_minim_grupo(j);
                }
                est.pertence_grupo_II(i);
                if(AnalizadorInt.imprimir_debugueo_minimizacion)
                    this.Print("\t\t"+est.getNombre()+" "+est.get_min());
            }
        }

        HashMap hashMap = new LinkedHashMap();
        
        LinkedList<Estado> lista = new LinkedList<Estado>();

        for(int i=0;i<this.Q.size();i++){
            Estado est = this.Q.get(i);
            String texto = est.get_min();

            if(hashMap.containsKey(texto)){
                //hay que agregar a la lista que ya tiene...
                lista = new LinkedList<Estado>();
                lista = (LinkedList<Estado>)hashMap.get(texto);
                lista.add(est);
                //this.Print("Para verificar la lista: "+lista.toString());
                hashMap.put(texto , (LinkedList<Estado>)lista );
            }
            //hay que crear el elemento en el hashmap...
            else{
                lista = new LinkedList<Estado>();
                lista.add(est);
                hashMap.put(texto , (LinkedList<Estado>)lista );
            }
        }
        
        Iterator iterator = hashMap.keySet().iterator();
        while( iterator. hasNext() ){
            II_nueva.add((LinkedList<Estado>)hashMap.get(iterator.next()));
        }        
        
        return II_nueva;
    }

    public boolean hacia_mismo_II(Estado estado1, Estado estado2){

        LinkedList<Integer> grupo_estado_1 = estado1.get_minim_grupo();
        LinkedList<Integer> grupo_estado_2 = estado2.get_minim_grupo();

        for(int i=0;i<grupo_estado_1.size();i++){
            if( (grupo_estado_1.get(i)==grupo_estado_2.get(i)) || (grupo_estado_1.get(i)==-1) || (grupo_estado_2.get(i)==-1) ){

            }
            else{
                return false;
            }
        }
        return true;
    }

    public int pertenece_II(LinkedList<LinkedList<Estado>> II, Estado estado){

        for(int i=0;i<II.size();i++){
            if(II.get(i).contains(estado)){
                return i;
            }
        }

        return -1;

    }

}