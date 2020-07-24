/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package analizador;

import analizador.LexicalAnalyser;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author UTM
 */
public class ModeloTablaErrores extends AbstractTableModel{
    public static String[] columnNames = {"NUMERO_LINEA","SIMBOLO"};
    public static String data[][]={{},{}};
    
    public ModeloTablaErrores()
    {
        data= new String[LexicalAnalyser.Simbolos.size()][2];
        
        for(int i=0; i<LexicalAnalyser.Simbolos.size(); i++)
        {
            data[i][1]=LexicalAnalyser.Simbolos.get(i);
            data[i][0]=LexicalAnalyser.LiErrores.get(i);
        }
    }

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
