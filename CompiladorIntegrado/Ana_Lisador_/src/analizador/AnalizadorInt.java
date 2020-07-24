//package analizador;
import analizador.ModeloDeTabla;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;


public class AnalizadorInt extends javax.swing.JFrame {
    
    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    
    private static Arbol_Binario arbol_sintactico = new Arbol_Binario();
    public static char epsilon = 'e';
    public static char concat = '.';
    
    private static AFN afn1;
    private static AFD afd2;
    
    public static int contador_automatas_creados=1;
    
    public static boolean imprimir_automatas_en_pantalla=true;
    public static boolean imprimir_debugueo_minimizacion=true;
    
    public static String regex="";
    
    Lexico oAnaLex;
    ModeloDeTabla modelo=null;
    ModeloTablaErrores moderror=null;
    
    //Kevdey agrego esto
    ModeloTablaSimbolos modsim=null;
    
    public static StringBuffer Simbolos = new StringBuffer("");
    public static StringBuffer LiErrores = new StringBuffer("");
    
    public static String aux;
    
    /**
     * Creates new form AnalizadorInt
     */
    public AnalizadorInt() {
        initComponents();
    }

    public String AbriArchivo(File archivo)
    {
        String documento="";
        try
        {
            entrada = new FileInputStream(archivo);
            int ascii;
            while((ascii=entrada.read()) != -1)
            {
                char caracter = (char)ascii;
                documento+=caracter;
            }
        }catch(Exception e)
        {
            
        }
        return documento;
    }
    
    public String GuardarArchivo(File archivo,String documento)
    {
        String mensaje = null;
        try
        {
            salida = new FileOutputStream(archivo);
            byte[] bytxt=documento.getBytes();
            salida.write(bytxt);
            mensaje="archivo guardado";
        }catch(Exception e)
        {
            
        }
        return mensaje;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        BoxS = new javax.swing.JComboBox<>();
        btnaceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Rod", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("niER:AFN");

        btnAbrir.setBackground(new java.awt.Color(102, 0, 102));
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setText("Abrir Archivo");
        btnAbrir.setBorder(null);
        btnAbrir.setContentAreaFilled(false);
        btnAbrir.setOpaque(true);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(102, 0, 102));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar Archivo");
        btnGuardar.setBorder(null);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setOpaque(true);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtarea.setColumns(20);
        txtarea.setRows(5);
        txtarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 2));
        jScrollPane1.setViewportView(txtarea);

        BoxS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thompson", "AFD", "Analizador Lexico" }));

        btnaceptar.setText("ACEPTAR");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1)
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnaceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BoxS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(BoxS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnaceptar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
        if(seleccionar.showDialog(null, "Abrir")==JFileChooser.APPROVE_OPTION)
        {
            archivo=seleccionar.getSelectedFile();
            if(archivo.canRead())
            {
                if(archivo.getName().endsWith("txt"))
                {
                    String documento=AbriArchivo(archivo);
                    txtarea.setText(documento);
                    AnalizadorInt.regex = documento;
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Archivo No Compatible");
                }
            }
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(seleccionar.showDialog(null, "Guardar")==JFileChooser.APPROVE_OPTION)
        {
            archivo=seleccionar.getSelectedFile();
            if(archivo.getName().endsWith("txt"))
            {
                String Documento=txtarea.getText();
                String mensaje=GuardarArchivo(archivo, Documento);
                if(mensaje!=null)
                {
                    JOptionPane.showMessageDialog(null, mensaje);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Archivo No Compatible");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Guardar Documento de Texto");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        // TODO add your handling code here:
        int index = BoxS.getSelectedIndex();
        String Documento = AnalizadorInt.regex;
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
            System.out.println("Doc: "+Documento);
            oAnaLex=new Lexico();
            oAnaLex.Inicia();
            
            aux="";
            aux=Errores(Documento);
            System.out.println("SinE: "+aux);
            
            oAnaLex.Analiza(aux);
            modelo=new ModeloDeTabla(oAnaLex.TokensDEP(),oAnaLex.LexemasDEP(),oAnaLex.NumLineaDEP());
            
            //Kevdey agrego esto
            modsim=new ModeloTablaSimbolos(oAnaLex.NumerosLinea(),oAnaLex.IdentificadoresDEP());
            //
            
            AnaLex an = new AnaLex();
            an.setVisible(true);
            
            //Kevdey agrego esto
            TablaSimbolos ts= new TablaSimbolos();
            ts.setVisible(true);
            //     
            
            //Tabla de Errores            
            moderror = new ModeloTablaErrores();
            ErroresList ss= new ErroresList();
            ss.setVisible(true);
        }                
        
    }//GEN-LAST:event_btnaceptarActionPerformed

    public String Errores(String AA)
    {
        String A = AA;
        int TAM = A.length();
        TAM = TAM - 1;
        //StringBuffer Simbolos = new StringBuffer("");
        //StringBuffer LiErrores = new StringBuffer("");
        int i=0;
        int Clin = i+1;
        String Lista= "@#¿°¬´~ı€ıƒ„…†‡ˆ‰ŠıŽıı‘’“”•—˜™š›žŸ¡¢£¤¥¦§¨©ª«¬®¯°±²³´μ¶·¸¹º»¼½¾¿`";
        
        StringBuffer Acopy = new StringBuffer("") ;//Para cambiar al tipo de archivo 
        int i2 = 0;

        while(i2 < A.length()){
            Acopy.append(A.charAt(i2));
            i2 = i2 + 1;
        }

        while(i <= TAM ){
            if( Lista.contains( A.charAt(i) + "" ) ){
                Acopy.deleteCharAt(i);
                Acopy.insert(i," ");
                Simbolos.append(A.charAt(i));
                LiErrores.append(Clin);
                i = i+1;
            }
            else
            {
                if (  (i < TAM ) &&  (A.charAt(i) != '\n' )  ){
                    i = i + 1;
                }
                else{
                    if (i < TAM ){
                        i = i + 1;
                        Clin = Clin + 1;
                    }
                    else{
                        break;
                    }
                }
            }                    
        } 
        
        String copia = Acopy.toString();
        return copia;
    }
    
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
            java.util.logging.Logger.getLogger(AnalizadorInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalizadorInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalizadorInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalizadorInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalizadorInt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxS;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnaceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
