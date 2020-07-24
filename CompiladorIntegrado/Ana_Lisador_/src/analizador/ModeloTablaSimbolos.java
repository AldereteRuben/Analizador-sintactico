/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package analizador;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alumnos
 */

//Esta clase es analoga a ModeloDeTabla
public class ModeloTablaSimbolos extends AbstractTableModel {
    
    //Mod1
    //public static String[] columnNames = {"NUMERO_LINEA","IDENTIFICADOR"};
    public static String[] columnNames = {"IDENTIFICADOR"};
    public static String data[][]={};
    
    public ModeloTablaSimbolos(String[] nlinea, String[] id)
    {
        data= new String[nlinea.length][2]; //tenia un 1
        for(int i=0; i<nlinea.length; i++)
        {
            //data[i][0]=nlinea[i];
            data[i][0]=id[i];
        }
    }
    
    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int col){
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    
}
