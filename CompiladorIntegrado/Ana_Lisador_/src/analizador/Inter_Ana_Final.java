
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package analizador;

import analizador.LexicalAnalyser;
import analizador.ModeloDeTabla;
import analizador.Tokens_Lexemas;
import colecano.AnaCanonica;
import colecano.TablaAnaSintac;
import colecano.Tabla_Cano;
import colecano.Tabla_Derivacion_Aceptacion;
import jacv050.ObtenerPS;
import jacv050.PrimerosYSiguientes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author The Gamer
 */
public class Inter_Ana_Final extends javax.swing.JFrame {
    JFileChooser seleccionar = new JFileChooser("pruebas");
    JFileChooser selec = new JFileChooser("pruebas");
    
    public static File archivo;
    public static File archivo_X;
    public static File archivo_A_S;
    FileInputStream entrada;
    FileOutputStream salida;

    public static String regex = "";
    public static String regex_X = "";
    public static String regex_XX = "";
    public static String regex_X_X = "";
    int bandera = 0;
    public static int bandera_Accion = 0;
    //-----------------------------------------------------------------------------------
    private static Arbol_Binario arbol_sintactico = new Arbol_Binario();
    public static char epsilon = 'e';
    public static char concat = '.';
    
    private static AFN afn1;
    private static AFD afd2;
    
    public static int contador_automatas_creados=1;
    
    public static boolean imprimir_automatas_en_pantalla=true;
    public static boolean imprimir_debugueo_minimizacion=true;
    
    
    Lexico oAnaLex;
    ModeloDeTabla modelo=null;
    ModeloTablaErrores moderror=null;
    
    //Kevdey agrego esto
    ModeloTablaSimbolos modsim=null;
    
    public static StringBuffer Simbolos = new StringBuffer("");
    public static StringBuffer LiErrores = new StringBuffer("");
    
    public static String aux;
    /**
     * Creates new form Inter_Ana_Final
     */
    public Inter_Ana_Final() {
        initComponents();
    }
    
    public String AbriArchivo(File archivo) {
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascii;
            while ((ascii = entrada.read()) != -1) {
                char caracter = (char) ascii;
                documento += caracter;
            }
        } catch (Exception e) {

        }
        return documento;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TxTa1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxTa2 = new javax.swing.JTextArea();
        BoxS = new javax.swing.JComboBox<>();
        SelecOp = new javax.swing.JComboBox<>();
        btnA2 = new javax.swing.JButton();
        btnA1 = new javax.swing.JButton();
        btnAc = new javax.swing.JButton();
        btnAg = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_A_S = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxTa3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ANALIZADOR SINTACTICO");

        TxTa1.setColumns(20);
        TxTa1.setRows(5);
        jScrollPane1.setViewportView(TxTa1);

        TxTa2.setColumns(20);
        TxTa2.setRows(5);
        jScrollPane2.setViewportView(TxTa2);

        BoxS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thompson", "AFD", "Analizador Lexico" }));

        SelecOp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primeros Y Siguientes", "Coleccion Canonica", "Tabla de Analisis Sintactico", "Analizador Semantico" }));

        btnA2.setText("ACEPTAR");
        btnA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA2ActionPerformed(evt);
            }
        });

        btnA1.setText("ACEPTAR");
        btnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA1ActionPerformed(evt);
            }
        });

        btnAc.setText("ABRIR CODIGO");
        btnAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcActionPerformed(evt);
            }
        });

        btnAg.setText("ABRIR GRAMATICA");
        btnAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgActionPerformed(evt);
            }
        });

        btn_A_S.setText("ABRIR ACCIONES SEMANTICAS");
        btn_A_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_A_SActionPerformed(evt);
            }
        });

        TxTa3.setColumns(20);
        TxTa3.setRows(5);
        jScrollPane3.setViewportView(TxTa3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(BoxS, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 221, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnAc)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SelecOp, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btn_A_S)
                        .addGap(239, 239, 239)
                        .addComponent(btnAg)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnAc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BoxS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_A_S)
                            .addComponent(btnAg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SelecOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgActionPerformed
        // TODO add your handling code here:
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String documento = AbriArchivo(archivo);
                    TxTa2.setText(documento);
                    Inter_Ana_Final.regex = Inter_Ana_Final.archivo.toString();
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo No Compatible");
                }
            }
        }
    }//GEN-LAST:event_btnAgActionPerformed

    private void btnA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA2ActionPerformed
        // TODO add your handling code here:
        int Opcion = SelecOp.getSelectedIndex();
        //bandera_Accion = Box02.getSelectedIndex();
        if(Opcion != 0 && bandera == 0)
        {
            ObtenerPS pred = new ObtenerPS(Inter_Ana_Final.archivo);
            AnaCanonica aux = new AnaCanonica(regex,regex_X_X,bandera_Accion);                        
            bandera = 1;
        }
        
        if(Opcion == 0)
        {
            ObtenerPS predi = new ObtenerPS(Inter_Ana_Final.archivo);
            PrimerosYSiguientes sol = new PrimerosYSiguientes();
            sol.setVisible(true);
        }
        
        if(Opcion == 1)
        {
            Tabla_Cano sol = new Tabla_Cano();
            sol.setVisible(true);            
        }

        if(Opcion == 2)
        {
            TablaAnaSintac tac = new TablaAnaSintac();
            tac.setVisible(true);
        }
        
        if(Opcion == 3)
        {
            Tabla_Derivacion_Aceptacion sac = new Tabla_Derivacion_Aceptacion();
            sac.setVisible(true);
        }
    }//GEN-LAST:event_btnA2ActionPerformed

    private void btnAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcActionPerformed
        // TODO add your handling code here:
        if (selec.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo_X = selec.getSelectedFile();
            if (archivo_X.canRead()) {
                if (archivo_X.getName().endsWith("txt")) {
                    String documento = AbriArchivo(archivo_X);
                    TxTa1.setText(documento);
                    Inter_Ana_Final.regex_X = documento;
                    Inter_Ana_Final.regex_XX = archivo_X.toString();
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo No Compatible");
                }
            }
        }
    }//GEN-LAST:event_btnAcActionPerformed

    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed
        // TODO add your handling code here:
        int index = BoxS.getSelectedIndex();
        String Documento = Inter_Ana_Final.regex_X;
        Nodo.contador_nodos=1;
        
        if(index != 2)
        {
            boolean error=false;
            try
            {
                if(!error)
                    arbol_sintactico.Generar_arbol(Documento);
            }
            catch(Exception exp)
            {
                System.out.println("Error al generar el arbol");
                error=true;
            }
          
            if(index == 0 || index == 1)
            {   
                if(!error)
                {
                    try
                    {
                        afn1 = new AFN(arbol_sintactico);
                    }
                    catch(Exception exp)
                    {
                        System.out.println("Error al generar en AFN con Thompson");
                        afn1=null;
                        error=true;
                    }
                }
                if(index == 0)
                {
                    TablaSol sol = new TablaSol();
                    sol.setVisible(true);
                }
                if(index == 1)
                {
                    if(!error){
                        try
                        {
                            //CONVERTIR EL AFN A UN AFD CON SUBCONJUNTOS
                            afd2 = new AFD(afn1);

                            contador_automatas_creados++;
                        }catch(Exception exp){
                            System.out.println("Error al generar el AFD con subconjuntos");
                            afd2=null;
                            error=true;
                        }
                    }
                    
                    AFDSub sub = new AFDSub();
                    sub.setVisible(true);
                }
            }
        }
        
        if(index == 2)
        {
            try {
                LexicalAnalyser user = new LexicalAnalyser(regex_XX);
                Tokens_Lexemas ss = new Tokens_Lexemas();
                ss.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Inter_Ana_Final.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            moderror = new ModeloTablaErrores();
            ErroresList ss= new ErroresList();
            ss.setVisible(true);
            
            //Kevdey agrego esto
            TablaSimbolos ts= new TablaSimbolos();
            ts.setVisible(true);        
            
            //Tabla de Errores                        
        }
    }//GEN-LAST:event_btnA1ActionPerformed

    private void btn_A_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_A_SActionPerformed
        // TODO add your handling code here:
        if (selec.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo_A_S = selec.getSelectedFile();
            if (archivo_A_S.canRead()) {
                if (archivo_A_S.getName().endsWith("txt")) {
                    String documento = AbriArchivo(archivo_A_S);
                    TxTa3.setText(documento);
                    Inter_Ana_Final.regex_X_X = Inter_Ana_Final.archivo_A_S.toString();
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo No Compatible");
                }
            }
        }
    }//GEN-LAST:event_btn_A_SActionPerformed
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inter_Ana_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inter_Ana_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inter_Ana_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inter_Ana_Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inter_Ana_Final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxS;
    private javax.swing.JComboBox<String> SelecOp;
    private javax.swing.JTextArea TxTa1;
    private javax.swing.JTextArea TxTa2;
    private javax.swing.JTextArea TxTa3;
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnA2;
    private javax.swing.JButton btnAc;
    private javax.swing.JButton btnAg;
    private javax.swing.JButton btn_A_S;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
