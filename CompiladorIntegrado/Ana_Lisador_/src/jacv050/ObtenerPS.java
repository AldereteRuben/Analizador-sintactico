
package jacv050;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObtenerPS {
    private Reglas mReglas;
    private ConjuntosPrimeros mPrimeros;
    private ConjuntosSiguientes mSiguientes;
    private String nombreFichero;
    
    public static int size=0;
    public static String Datos[][]={};
    public static String DatosS[][]={};
    public static String Lista_Bus[]={};
    public static String Lista_Bus_X[]={};

    public ObtenerPS(File noombreFichero) {
        
        String nombreFichero = noombreFichero.toString();
        this.nombreFichero = nombreFichero;
        mReglas = new Reglas();
        mPrimeros = new ConjuntosPrimeros();
        mSiguientes = new ConjuntosSiguientes();
        String Lista_Aux="";
        String Lista_Aux_X="";
        int j = 0;
        int ii = 0;
        try {
            FileReader fr = new FileReader(nombreFichero);
            BufferedReader br = new BufferedReader(fr);
            String cadena = "";

            while ((cadena = br.readLine()) != null) {
                Lista_Aux="";
                StringTokenizer st = new StringTokenizer(cadena);
                String[] stringTmp = new String[st.countTokens()+1];
                int i = 0;
                
                while (st.hasMoreTokens()) {
                    stringTmp[i] = new String(st.nextToken());
                    Lista_Aux+=stringTmp[i]+" ";
                    i++;
                    if(i == 1)
                    {
                        stringTmp[i] = "->";
                        Lista_Aux+="->"+" ";
                        i++;
                    }
                }
                if(j >= 3)
                { 
                    Lista_Aux_X=Lista_Aux.substring(0, Lista_Aux.length()-1);
                    System.out.println("Salida:"+Lista_Aux_X+"----");
                    mReglas.addRegla(Lista_Aux_X);
                    ii++;
                }
                
                j++;
            }
            if(obtainPrimeros() && obtainSiguientes()){
                generarSalida();
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException ex) {
            System.err.println("No se ha encontrado el archivo.");
        } catch (IOException ex) {
            Logger.getLogger(ObtenerPS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public final void generarSalida()
    {        
        try {
            FileWriter fw = new FileWriter(nombreFichero+"Exp"+ ".txt");
            PrintWriter pw = new PrintWriter(fw);
            
            int i=0;
            int j=0;
            ArrayList<String> noTerminales = mReglas.getListaSimbolosNoTerminales();
            Datos = new String[noTerminales.size()][3];
            String auxiliar="";
            
            for(String noTerminal : noTerminales){
                pw.print(noTerminal + " -> { ");
                Datos[i][0]=noTerminal;
                Datos[i][1]="=";
                ArrayList<String> primeros = mPrimeros.getPrimeros(noTerminal);
                auxiliar="";
                auxiliar+="{ ";
                for(String primero : primeros){
                    pw.print(primero + " ");
                    auxiliar+=primero+"  ";
                }
                auxiliar+="}";
                Datos[i][2]=auxiliar;
                pw.print("}");
                //System.out.println("Primeros: "+Datos[0][2]);
                i++;
                pw.println();
            }
            
            pw.println();
            
            //Salida de los siguientes
            DatosS = new String[noTerminales.size()][3];
            Lista_Bus = new String[noTerminales.size()];
            size = noTerminales.size();
            String Aux="";
            String Aux_Aux="";
            
            for(String noTerminal : noTerminales){
                Aux_Aux="";
                pw.print(noTerminal + " -> { ");
                DatosS[j][0]=noTerminal;
                DatosS[j][1]="=";
                Aux_Aux+="S("+noTerminal+")={";
                ArrayList<String> siguientes = mSiguientes.getSiguientes(noTerminal);
                Aux="";
                Aux+="{ ";
                for(String siguiente : siguientes){
                    pw.print(siguiente + " ");
                    Aux+=siguiente+"  ";
                    Aux_Aux+=siguiente+" ";
                }
                Aux_Aux = Aux_Aux.substring(0, Aux_Aux.length()-1);
                Aux_Aux += " }";
                Lista_Bus[j]=Aux_Aux;
                Aux+="}";
                DatosS[j][2]=Aux;
                pw.print("}");   
                j++;
                pw.println();
            }
            for(int ix = 0;ix<size;ix++)
            {
                System.out.println("Siguientes::::----____----::::::"+Lista_Bus[ix]);
            }
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ObtenerPS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public ConjuntosPrimeros getConjuntosPrimeros(){
        return mPrimeros;
    }
    
    public ConjuntosSiguientes getConjuntosSiguientes(){
        return mSiguientes;
    }
    
    public boolean obtainSiguientesAux(String noTerminal){
        
        ArrayList<Reglas.Regla> reglas = mReglas.getReglasSimboloDerecha(noTerminal);
        
        for(Reglas.Regla regla : reglas){
            ArrayList<String> parteDerecha = regla.getParteDerecha();
            int posicionSimbolo = parteDerecha.indexOf(noTerminal);
            
            //Si hay simbolos a la derecha del simbolo no terminal
            if(posicionSimbolo < parteDerecha.size()-1){
                if(!mReglas.esTerminal(parteDerecha.get(posicionSimbolo+1))){
                    ArrayList<String> primerosSinEpsilon = mPrimeros.getPrimerosSinEpsilon(parteDerecha.get(posicionSimbolo+1));
                    ArrayList<String> primerosConEpsilon = mPrimeros.getPrimeros(parteDerecha.get(posicionSimbolo+1));
                    mSiguientes.addSiguientes(noTerminal, primerosSinEpsilon);
                    
                    //Si epsilon pertence a siguientes(posicion+1)
                    if(primerosSinEpsilon.size() != primerosConEpsilon.size()){
                        //TODO ArrayList<String> siguientes = mSiguientes.getSiguientes(regla.getParteIzquierda());
                        ArrayList<String> siguientes = mSiguientes.getSiguientes(parteDerecha.get(posicionSimbolo+1));
                        
                        //Si aun no se han calculado siguientes devolver false
                        if(siguientes == null){
                            mSiguientes.removeNoTerminal(noTerminal);
                            return false;
                        }
                        
                        //Anyadimos los siguientes del simbolo no terminal de la parte izquierda de la regla
                        mSiguientes.addSiguientes(noTerminal, siguientes);
                    }
                }else if(mReglas.esEpsilon(parteDerecha.get(posicionSimbolo+1))){
                    ArrayList<String> siguientes = mSiguientes.getSiguientes(regla.getParteIzquierda());
                        
                    //Si aun no se han calculado siguientes devolver false
                    if(siguientes == null){
                        mSiguientes.removeNoTerminal(noTerminal);
                        return false;
                    }
                        
                    //Anyadimos los siguientes del simbolo no terminal de la parte izquierda de la regla
                    mSiguientes.addSiguientes(noTerminal, siguientes);
                }else//Si es terminal anyadimos el simbolo como siguiente de noterminal
                    mSiguientes.addSiguientes(noTerminal, parteDerecha.get(posicionSimbolo+1));
            }else{
                //Comprobar si realmente debo anyadir los siguientes de la parteizquierda cuando el
                //sombolo no terminal de la parte derecha no tiene simbolos a su derecha
                ArrayList<String> siguientes = mSiguientes.getSiguientes(regla.getParteIzquierda());
                
                //Si aun no se han calculado siguientes devolver false
                if(siguientes == null){
                    mSiguientes.removeNoTerminal(noTerminal);
                    return false;
                }
                
                //Anyadimos los siguientes del simbolo no terminal de la parte izquierda de la regla
                mSiguientes.addSiguientes(noTerminal, siguientes);
            }
        }
        
        return true;
    }
    
    public boolean obtainSiguientes(){
                //ArrayList<String> salida = new ArrayList<>();
        boolean[] simboloProcesados = new boolean[mReglas.getListaSimbolosNoTerminales().size()];
        boolean procesados = true;
        
        ArrayList<String> noTerminales = mReglas.getListaSimbolosNoTerminales();
        
        //Anyadimos el simbolo inicial
        mSiguientes.addSiguientes(noTerminales.get(0), Reglas.INICIAL);
        int iteraciones = 0;
        
        do{
            if(iteraciones > noTerminales.size()){
                System.err.println("Error: Puede haber entrado en un bucle infinito por un error en la gramatica Siguientes");
                return false;
            }
            
            procesados = true;
            for (int i=0; i<noTerminales.size(); ++i) {
                if(!simboloProcesados[i])
                    simboloProcesados[i] = obtainSiguientesAux(noTerminales.get(i));
            }
            
            //Comprobamos si hemos encontrado todos los primerosSinEpsilon
            for(boolean sp : simboloProcesados){
                procesados &= sp;
            }
            
            iteraciones++;
        }while(!procesados);
        
        return true;
    }
    
    private boolean obtainPrimerosAux(String noTerminal) {
        //Obtenemos las reglas en las que aparece el simbolo terminal en la
        //parte izquierda.
        ArrayList<Reglas.Regla> reglas = mReglas.getReglas(noTerminal);
        //ArrayList<String> primerosAux = new ArrayList<>();
        
        //boolean salida = true;
        boolean esSegundoRecorrido = false;

        //Obtenemos las reglas que empiezans con el simbolo "noTerminal"
        //for (Reglas.Regla regla : reglas) {
        for(int i=0; i < reglas.size(); ++i){
            Reglas.Regla regla = reglas.get(i);
            ArrayList<String> parteDerecha = regla.getParteDerecha();

            //Analizamos la parte derecha y obtenemos los primerosSinEpsilon
            
            //Si es epsilon
            String simbolo = parteDerecha.get(0);
            if (mReglas.esEpsilon(simbolo)) {
                mPrimeros.addPrimeros(regla.getParteIzquierda(), simbolo);
            } //Si es terminal
            else if (mReglas.esTerminal(simbolo)) {
                mPrimeros.addPrimeros(regla.getParteIzquierda(), simbolo);
            } //Si es no terminal
            else {
                //Si epsilon pertenece a primerosSinEpsilon(simbolo) 
                ArrayList<String> primerosConEpsilon = mPrimeros.getPrimeros(simbolo); //Con epsilon si tuviese
                
                if(simbolo.equals(regla.getParteIzquierda()) && !esSegundoRecorrido){
                    //esSegundoRecorrido = true;
                    //reglas.add(regla);
                    //salida = false;
                    continue;
                }
                
                //Si aun no se han calculado los primerosSinEpsilon
                if(primerosConEpsilon.isEmpty()){
                    mPrimeros.removeNoTerminal(noTerminal);
                    return false;
                }
                
                //Obtenemos los primerosSinEpsilon de simbolo -> primerosSinEpsilon(simbolo)
                ArrayList<String> primerosSinEpsilon = mPrimeros.getPrimerosSinEpsilon(simbolo);
                //Anyadimos el conjunto de primerosSinEpsilon(simbolo) a los primerosSinEpsilon(noTerminal)
                for (String primero : primerosSinEpsilon) {
                    mPrimeros.addPrimeros(noTerminal, primero);
                    //primerosAux.add(primero);
                }
                
                if (primerosSinEpsilon.size() != primerosConEpsilon.size()) {
                    //Si solo tiene epsilon entonces anyadimos epsilon a primerosSinEpsilon(noTerminal)
                    //if (primerosConEpsilon.size() == 1 && !simbolo.equals(regla.getParteIzquierda())) {
                    if (regla.getParteDerecha().size() == 1 && !simbolo.equals(regla.getParteIzquierda())) {
                    //if (i == regla.getParteDerecha().size()-1 && !simbolo.equals(regla.getParteIzquierda())) {
                        mPrimeros.addPrimeros(noTerminal, Reglas.EPSILON);
                        //primerosAux.add(Reglas.EPSILON);
                    } else {
                        //Hay que añadir los primerosSinEpsilon del resto de simbolos
                        //de la parte derecha "noTerminal"
                        
                        boolean salir = false;
                        for (int j = 1; j < parteDerecha.size() && !salir; ++j) {
                        //for (int j = 1; j < parteDerecha.size() && j < 2; ++j) {
                            boolean esTerminal = mReglas.esTerminal(parteDerecha.get(j));
                            if(!mPrimeros.exists(parteDerecha.get(j)) && !esTerminal){
                                mPrimeros.removeNoTerminal(noTerminal);
                                return false;
                            }
                            
                            if(esTerminal){
                                mPrimeros.addPrimeros(noTerminal, parteDerecha.get(j));
                                salir = true;
                                //primerosAux.add(parteDerecha.get(j));
                            }else{
                                ArrayList<String> pd = mPrimeros.getPrimeros(parteDerecha.get(j));
                                ArrayList<String> pdsinep = mPrimeros.getPrimerosSinEpsilon(parteDerecha.get(j));
                                mPrimeros.addPrimeros(noTerminal, pdsinep);
                                //Si no tiene epsilon, salimos del bucle
                                if(pd.size() == pdsinep.size())
                                    salir = true;
                                else if(j == parteDerecha.size()-1)
                                    mPrimeros.addPrimeros(noTerminal, Reglas.EPSILON);
                                    
                            }
                                //primerosAux.addAll(mPrimeros.getPrimeros(parteDerecha.get(j)));
                        }
                    }
                }
            }

        }      
        return true;

    }

    private boolean obtainPrimeros() {
        //ArrayList<String> salida = new ArrayList<>();
        boolean[] simboloProcesados = new boolean[mReglas.getListaSimbolosNoTerminales().size()];
        boolean procesados = true;
        
        ArrayList<String> noTerminales = mReglas.getListaSimbolosNoTerminales();
        int iteraciones = 0;
        
        do{
            if(iteraciones > noTerminales.size()){
                System.out.println("Iteraciones: "+iteraciones+" noTerminales: "+noTerminales.size());
                System.err.println("Error: Puede haber entrado en un bucle infinito por un error en la gramatica primeros");
                return false;
            }
            System.out.println("NoItera: "+iteraciones);
            procesados = true;
            for (int i=0; i<noTerminales.size(); ++i) {
                if(!simboloProcesados[i])
                    simboloProcesados[i] = obtainPrimerosAux(noTerminales.get(i));
            }
            
            //Comprobamos si hemos encontrado todos los primerosSinEpsilon
            for(boolean sp : simboloProcesados){
                procesados &= sp;
            }
            
            iteraciones++;
        }while(!procesados);
        
        return true;
    }
    
}
