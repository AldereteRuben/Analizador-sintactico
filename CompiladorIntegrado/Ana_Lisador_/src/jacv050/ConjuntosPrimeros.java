
package jacv050;

import java.util.ArrayList;
import java.util.HashMap;


public class ConjuntosPrimeros {

    HashMap<String, ArrayList<String>> mPrimeros;

    public ConjuntosPrimeros(){
        mPrimeros = new HashMap<>();
    }
    
//Obtiene el conjunto de primeros de un no terminal
    public ArrayList<String> getPrimeros(String noTerminal) {
        
        ArrayList<String> salida = mPrimeros.get(noTerminal);
        
        if(salida == null)
            salida = new ArrayList<>();
        
        return salida;
    }
    
    
//Devuelve los primeros de un no terminal menos epsilon
    public ArrayList<String> getPrimerosSinEpsilon(String noTerminal){
        ArrayList<String> primeros = new ArrayList<>();
        ArrayList<String> primerosTotal = mPrimeros.get(noTerminal);
        
        if(primerosTotal == null)
            return null;
        
        for(String simbolo : primerosTotal){
            if(!simbolo.equals(Reglas.EPSILON))
                primeros.add(simbolo);
        }
        return primeros;
    }

//Agrega  primeros a un no terminal
    public void addPrimeros(String noTerminal, ArrayList<String> newprimeros) {
        if (mPrimeros.containsKey(noTerminal)) {
            ArrayList<String> primeros = mPrimeros.get(noTerminal);
            for(String primero : newprimeros){
                if(!primeros.contains(primero))
                    primeros.add(primero);
            }
            //newprimeros.stream().forEach(primeros::add);
        } else {
            mPrimeros.put(noTerminal, new ArrayList(newprimeros));
        }
    }

//Agrega  primeros a un no terminal
    public void addPrimeros(String noTerminal, String newprimeros) {
        ArrayList<String> primeros;
        if (mPrimeros.containsKey(noTerminal)) {
            primeros = mPrimeros.get(noTerminal);
            if(!primeros.contains(newprimeros))
                primeros.add(newprimeros);
        } else {
            primeros = new ArrayList();
            primeros.add(newprimeros);
            mPrimeros.put(noTerminal, primeros);

        }
    }

//Si un no terminal existe en la lista de primeros.    
    public boolean exists(String noTerminal){
        return mPrimeros.containsKey(noTerminal);
    }

//Remueve un no terminal de la lista de primeros    
    public void removeNoTerminal(String noTerminal){
        mPrimeros.remove(noTerminal);
    }
}
