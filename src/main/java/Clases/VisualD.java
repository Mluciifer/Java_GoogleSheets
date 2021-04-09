package Clases;


import Clases.Cadenas;
import Clases.Funciones;
import java.awt.Color;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.security.GeneralSecurityException;
import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultEditorKit;


/**
 *
 * @author Luciifer
 */

public class VisualD extends javax.swing.JFrame implements ClipboardOwner{

      DefaultTableModel model_table;
      DefaultTableModel model_table2;
        String linea=null;
       final Funciones fn= new Funciones();
       ArrayList<Object[]> io=new ArrayList<Object[]>() ;
        String io2 ;
        ArrayList<String> ij=new ArrayList<String>() ;
        ArrayList<String> ij1=new ArrayList<String>();
        ArrayList<String> ij2=new ArrayList<String>();
         ArrayList<String> ij3=new ArrayList<String>() ;
        ArrayList<String> ij4=new ArrayList<String>();
        ArrayList<String> ij5=new ArrayList<String>();
        ArrayList<String> ij6=new ArrayList<String>() ;
        ArrayList<String> ij7=new ArrayList<String>();
        ArrayList<String> ij8=new ArrayList<String>();
         ArrayList<String> ij9=new ArrayList<String>() ;
        ArrayList<String> ij10=new ArrayList<String>();
        ArrayList<String> ij11=new ArrayList<String>();
        
       // Object[] fila= new Object[5];
        String[] fila1=new String[8];
         String[] fila2=new String[8];
           Object hi;
           String hi1;
         
        public void Copiar(String texto){
        StringSelection txt = new StringSelection(texto);
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(txt, this);
    }           
        
    public VisualD() throws IOException, GeneralSecurityException {
       
        initComponents();
        
        model_table=new DefaultTableModel();
        model_table.addColumn("CODIGO");
        model_table.addColumn("COD STUD");
        model_table.addColumn("6:00-7:30");
        model_table.addColumn("EDICION DEL LIBRO");
         model_table.addColumn("CLASE");
         model_table.addColumn("CORREO");
        
        this.Tabla1.setModel(model_table);
        
          model_table2=new DefaultTableModel();
        model_table2.addColumn("DATOS1");
        model_table2.addColumn("DATOS2");
       
        this.Tabla2.setModel(model_table2);
     }
 
  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dato4 = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        Copiado = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        escribe = new javax.swing.JTextField();
        Buscador = new javax.swing.JTextField();
        Buscador1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        Dt2 = new javax.swing.JTextField();
        Dt1 = new javax.swing.JTextField();
        Dt4 = new javax.swing.JTextField();
        Dt3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Escribe2 = new javax.swing.JTextField();
        Escribe3 = new javax.swing.JTextField();
        Escribe4 = new javax.swing.JTextField();
        Escribe1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Nomb = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        Combo = new javax.swing.JComboBox<>();

        Dato4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dato4ActionPerformed(evt);
            }
        });

        Copiado.setText("Copiar");
        Copiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiadoActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Copiado);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla1);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Boton4.setText("jButton4");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        escribe.setText("jTextField1");
        escribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribeActionPerformed(evt);
            }
        });

        Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscadorActionPerformed(evt);
            }
        });

        Buscador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscador1ActionPerformed(evt);
            }
        });

        jScrollPane2.setComponentPopupMenu(jPopupMenu1);

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(textArea);

        Dt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dt2ActionPerformed(evt);
            }
        });

        Dt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dt1ActionPerformed(evt);
            }
        });

        Dt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dt4ActionPerformed(evt);
            }
        });

        Dt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dt3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Escribir");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        Escribe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Escribe1ActionPerformed(evt);
            }
        });

        jLabel5.setText("KarenZ");

        Nomb.setText("KarenZ");
        Nomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombActionPerformed(evt);
            }
        });

        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(Tabla2);

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ING A1", "ING A2" }));
        Combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Dt1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Dt2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Dt3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dt4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Escribe1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Escribe2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(Escribe3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Escribe4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addGap(47, 47, 47))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Nomb))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Boton4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(escribe, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(Buscador1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Escribe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Escribe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Escribe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Escribe4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Dt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nomb)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(Boton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(escribe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(Buscador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             try {
                int u=0;
                int k=1;
           // ArrayList in=new ArrayList();
           if(!(Buscador.getText().equals(null) && Buscador1.getText().equals(null))){
           
       // hi=fn.Buscador(Buscador.getText()+":"+Buscador1.getText());
       fn.Escribir(Buscador1.getText(),Dt1.getText(),Dt2.getText(),Dt3.getText(),Dt4.getText());
        hi1=fn.Rango(Buscador.getText()+":"+Buscador1.getText());
        String ju=String.valueOf(fn.Buscador(hi1));
        hi=ju;
        //hi=fn.Buscador(hi1);
        String kj=String.valueOf(hi);
         ij.add(kj);
         
        for(String yu: ij){
                  //   fila1[0]=yu;
                     model_table.addRow(fila1);
                     textArea.append(fila1[0]+"\r\n");
                      
                     System.out.println(fila1[0]);
                     
                     String lk=String.valueOf(fn.Buscador("E1"));                
                     String lk1=String.valueOf(fn.Buscador("B1"));
                     
                     String ans=lk.substring(lk.indexOf("[")+2,lk.indexOf("]"));
                     String ans2=lk1.substring(lk1.indexOf("[")+2,lk1.indexOf("]"));
                   
                     Escribe1.setText(ans);
                     Escribe2.setText(ans2);
                     
                
        }
             ij.clear();
           }
           
           } catch (IOException ex) {
               //Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"CASILLAS VACIAS");
           } catch (GeneralSecurityException ex) {
               Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
                     JOptionPane.showMessageDialog(null,"CASILLAS VACIAS");
           }
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Tabla1MouseClicked

    private void escribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribeActionPerformed
         try {
               fn.Valores(escribe.getText());
                  String ruta="./pruebass.txt"; 
        // String ruta="./cadena.txt";
 
        File arch=new File(ruta);
        FileReader fr= new FileReader(arch);
        BufferedReader bf=new BufferedReader(fr); 
        
        
    
            while((linea=bf.readLine())!= null){
                String [] ln={linea};
                model_table.addRow(ln);
                 
            }
         
            
        // Tabla1.setModel(model_table);
           } catch (IOException ex) {
               Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
           } catch (GeneralSecurityException ex) {
               Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_escribeActionPerformed

    private void BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscadorActionPerformed
      /*
         try {
             
                   
        io =fn.Buscador(Buscador.getText());
         for(int i=0;i<io.size();i++){
            
          //   fila[1]=io.get(i);
        
              model_table.addRow(fila);
         }
   
             
           } catch (IOException ex) {
               Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
           } catch (GeneralSecurityException ex) {
               Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
           }*/
    }//GEN-LAST:event_BuscadorActionPerformed

    private void Buscador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscador1ActionPerformed
      /*
        try {
       
          io =fn.Buscador(Buscador1.getText());
         for(int i=0;i<io.size();i++){
              
            // fila[0]=io.get(i);
      
              model_table.addRow(fila);
            //  model_table.removeRow(i-i);
             
         }
              
           } catch (IOException ex) {
               Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
           } catch (GeneralSecurityException ex) {
               Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
           }*/
    }//GEN-LAST:event_Buscador1ActionPerformed

    private void Dt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dt2ActionPerformed

    private void Dt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dt1ActionPerformed

    private void Dt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dt4ActionPerformed

    private void Dt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dt3ActionPerformed

    private void Dato4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dato4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dato4ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
 
     
     
    }//GEN-LAST:event_Boton4ActionPerformed

    private void CopiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiadoActionPerformed
     Copiar(textArea.getSelectedText());
    
    }//GEN-LAST:event_CopiadoActionPerformed

    private void Escribe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Escribe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Escribe1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try {
              fn.Escribir("F1",Escribe1.getText() ,Escribe2.getText(),Escribe3.getText(),Escribe4.getText());
              
          } catch (IOException ex) {
              Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
          } catch (GeneralSecurityException ex) {
              Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jButton3ActionPerformed
String kj;
    private void NombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombActionPerformed
          try {
              //  try {
              /*
              String kl=String.valueOf(fn.Buscador("ING A1!A15:F15"));
              
              String kl2=String.valueOf(fn.Buscador("ING A1!B10"));
              //String anst=kl2.substring(kl2.indexOf("[")+2,kl2.indexOf("]"));
               
              if(kl2.length()==4){
              JOptionPane.showMessageDialog(this, "NO HAY NADA");
              Escribe1.setBackground(Color.yellow);
              Nomb.setBackground(Color.yellow);
              Nomb.setText(fn.Buscador("ING A1!A15:B15"));
              }
             
             
              Escribe1.setText(kl);
              
              Cadenas cd=new Cadenas();
              Docentes dc=new Docentes();
              String hh=String.valueOf(dc.Profes());
              int po=kl2.length();
             String hi=String.valueOf(po);
              textArea.append(hh+"\n"+hi);*/
               Cadenas cd=new Cadenas();
                 String Q="A";
              String W="B";
              String E="C";
              for(int hg=8;hg<23;hg++){
              String cp=String.valueOf(hg);
              String rs=Q+cp;
              //cd.setCelda(rs);
              String re=String.valueOf(fn.Buscador(rs));
              ij.add(re);
              String res=W+cp;
             // cd.setCelda(res);
              String rep=String.valueOf(fn.Buscador(res));
              ij2.add(rep);
              String resp=E+cp;
              //cd.setCelda(resp);
              String rept=String.valueOf(fn.Buscador(resp));
              ij3.add(rept);
              for(int sa=0;sa<ij.size();sa++){
              fila1[0]=ij.get(sa);
              fila1[1]=ij2.get(sa);
              fila1[2]=ij3.get(sa);
              }
              String hp=String.valueOf(fn.Buscador("A10:F10"));
              String hpta=String.valueOf(fn.Buscador(rs+":"+resp));
              textArea.append(hpta+"\n");
              // model_table.addRow(fila1);
              }
              
              
              
              
              for (int x=0;x<ij1.size();x++){
              fila2[0]=ij1.get(x);
              model_table2.addRow(fila2);
              }
          
              } catch (IOException ex) {
              Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
              } catch (GeneralSecurityException ex) {
              Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
              }
              
              
              /*
          } catch (IOException ex) {
              Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
          } catch (GeneralSecurityException ex) {
              Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
          }*/
           
    }//GEN-LAST:event_NombActionPerformed

    private void ComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboItemStateChanged
       String ki=(String)Combo.getSelectedItem();
       if(ki.equals("ING A1")){
           JOptionPane.showMessageDialog(this,"nada");
       }
    }//GEN-LAST:event_ComboItemStateChanged

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
            java.util.logging.Logger.getLogger(VisualD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VisualD().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
                    
                } catch (GeneralSecurityException ex) {
                    Logger.getLogger(VisualD.class.getName()).log(Level.SEVERE, null, ex);
                     
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton4;
    private javax.swing.JTextField Buscador;
    private javax.swing.JTextField Buscador1;
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JMenuItem Copiado;
    private javax.swing.JTextField Dato4;
    private javax.swing.JTextField Dt1;
    private javax.swing.JTextField Dt2;
    private javax.swing.JTextField Dt3;
    private javax.swing.JTextField Dt4;
    private javax.swing.JTextField Escribe1;
    private javax.swing.JTextField Escribe2;
    private javax.swing.JTextField Escribe3;
    private javax.swing.JTextField Escribe4;
    private javax.swing.JRadioButton Nomb;
    private javax.swing.JTable Tabla1;
    private javax.swing.JTable Tabla2;
    private javax.swing.JTextField escribe;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    @Override
    public void lostOwnership(Clipboard clpbrd, Transferable t) {
      //To change body of generated methods, choose Tools | Templates.
    }
}
