package analizador;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author UTM
 */
public class ModeloDeTabla extends AbstractTableModel {
    public static String[] columnNames = {"Num. Linea","TOKEN","LEXEMA"};
    public static String data[][]={};
    public static String tokens_XX="";
    
    public ModeloDeTabla(String[] tokens,String[] lexemas,String[] NumLineas)
    {
        tokens_XX="";
        data=new String[tokens.length][3];
        for(int i=0;i<tokens.length;i++)
        {
            data[i][0]=NumLineas[i];
            data[i][1]=tokens[i];
            if(tokens[i] != null)
            {
                tokens_XX+=tokens[i]+" ";
                System.out.println("Tokens_XX_XX:"+tokens_XX+"--");
            }
            data[i][2]=lexemas[i];
        }
        tokens_XX+="$";
    }
    
    public int getColumnCount() 
    {
        return columnNames.length;
    }
    
    public int getRowCount() 
    {
        return data.length;
    }
    @Override
    public String getColumnName(int col) 
    {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) 
    {
        return data[row][col];
    }
} // fin de la clase ModeloDeTabla
