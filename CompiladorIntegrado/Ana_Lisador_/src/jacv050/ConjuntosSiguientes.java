
package jacv050;

import java.util.ArrayList;
import java.util.HashMap;


public class ConjuntosSiguientes {
    HashMap<String, ArrayList<String>> mSiguientes;
    
    public ConjuntosSiguientes(){
        mSiguientes = new HashMap<>();
    }
    
    //Devuleve los siguientes de un no terminal
    public ArrayList<String> getSiguientes(String noTerminal){
        return mSiguientes.get(noTerminal);
    }
    
    //Ingresa siguientes a un simbolo no terminal
    public void addSiguientes(String noTerminal, ArrayList<String> newsiguientes) {
        if (mSiguientes.containsKey(noTerminal)) {
            ArrayList<String> primeros = mSiguientes.get(noTerminal);
            for(String primero : newsiguientes){
                if(!primeros.contains(primero))
                    primeros.add(primero);
            }
            //newprimeros.stream().forEach(primeros::add);
        } else {
            mSiguientes.put(noTerminal, new ArrayList(newsiguientes));
        }
    }
    
    //Ingresa siguientes a un simbolo no terminal
    public void addSiguientes(String noTerminal, String newsiguientes) {
        ArrayList<String> primeros;
        if (mSiguientes.containsKey(noTerminal)) {
            primeros = mSiguientes.get(noTerminal);
            if(!primeros.contains(newsiguientes))
                primeros.add(newsiguientes);
        } else {
            primeros = new ArrayList();
            primeros.add(newsiguientes);
            mSiguientes.put(noTerminal, primeros);

        }
    }
    
    //Remueve un no terminal de la lista de siguientes
    public void removeNoTerminal(String noTerminal){
        mSiguientes.remove(noTerminal);
    }
}
