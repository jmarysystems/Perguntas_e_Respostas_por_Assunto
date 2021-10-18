/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jmary.perguntas_e_respostas_por_assunto;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.CodeSource;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author admin
 */
public class Visualizador_Interno_Assunto extends javax.swing.JPanel {
    
    String s = System.getProperty("file.separator");
    String internalStorageDir = System.getProperty("user.dir");

    String nome_do_pacote_endereco_Iterno_Do_Assunto = System.getProperty("user.dir") + "\\00_Externo\\";      
    int img_Atual = 0;
    
    int largura = 0;
    int altura = 0;
    
    JTabbedPane tabAssunto_Recebido;
    
    Home Home;
    
    List<String> listaDosArquivos = new ArrayList<String>();
    Class Classe_Das_Imagens = null;
    /**
     * Creates new form Visualizador_Interno2
     * @param tabAssunto_Recebido2
     * @param Classe_Das_Imagens2
     * @param img_Atual2
     * @param endereco_Externo_da_Pasta2
     * @param largura2
     * @param altura2
     */
    
    public Visualizador_Interno_Assunto( JTabbedPane tabAssunto_Recebido2, Class Classe_Das_Imagens2, int img_Atual2, String endereco_Externo_da_Pasta2, int largura2, int altura2 ) {
        initComponents();
                
        tabAssunto_Recebido = tabAssunto_Recebido2;
        
        Classe_Das_Imagens = Classe_Das_Imagens2;
        
        img_Atual = img_Atual2;
        nome_do_pacote_endereco_Iterno_Do_Assunto = endereco_Externo_da_Pasta2;
        
        largura = largura2;
        altura = altura2;
        
        jSlider1.setValue(0);
        setarPastaInicio(img_Atual2);
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
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfPagina = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel15 = new javax.swing.JLabel();
        lbConteudo_Online = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/pdf_16_16.gif"))); // NOI18N
        jLabel12.setToolTipText("GERAR ARQUIVO PDF");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setEnabled(false);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel12MouseReleased(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/FonteAum.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setEnabled(false);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/laranja_anterior.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel9MouseReleased(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/laranja_proximo.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

        tfPagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPaginaActionPerformed(evt);
            }
        });

        jLabel6.setText("Ir Para");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/laranja_home.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/laranja_proximo.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/FonteDim.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setEnabled(false);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/FontePadrao.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setEnabled(false);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/16_chrome.png"))); // NOI18N
        jLabel13.setToolTipText("GERAR ARQUIVO HTML");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
        });

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel15.setText("1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(37, 37, 37)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(tfPagina))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, tfPagina});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbConteudo_Online.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbConteudo_Online.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbConteudo_Online.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/anao.gif"))); // NOI18N
        lbConteudo_Online.setToolTipText("");
        lbConteudo_Online.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(">>");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<<");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbConteudo_Online, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbConteudo_Online, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
       if( jLabel5.isEnabled() == true ){
            jLabel5.setEnabled(false); 
                
            img_Atual = 0; try{ img_Atual = Integer.parseInt( tfPagina.getText().trim() ); }catch(Exception e){}
            setarImagemInterna(img_Atual);
                
            new Thread() {   @Override public void run() { try { Thread.sleep( 1000 );
                          
                              
            } catch( Exception e ){ 
                Exportando.fechar(); e.printStackTrace(); 
            } 
            finally{
                jLabel5.setEnabled(true);
            }
            } }.start();        
        }
                        
        /*
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            Exportando = new Exportando("ABRINDO...");
            Exportando.setVisible(true);Exportando.pbg.setMinimum(0);
            Exportando.pbg.setMaximum( 100 );
            Exportando.pbg.setValue( 50 );
            
            tabAssunto_Recebido.removeTabAt( tabAssunto_Recebido.getSelectedIndex() );
            tabAssunto_Recebido.add(String.valueOf( img_Atual ), 
                    new Visualizador_Interno_Assunto( tabAssunto_Recebido, listaDosArquivos, img_Atual, nome_do_pacote_endereco_Iterno_Do_Assunto, largura, altura) );

            Exportando.fechar();
        } catch( Exception e ){ Exportando.fechar(); e.printStackTrace(); } } }.start();
        */
    }//GEN-LAST:event_jLabel5MousePressed

    Exportando Exportando;
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        if( jLabel1.isEnabled() == true ){
            
            jLabel1.setEnabled(false); 
   
            new Thread() {   @Override public void run() { try { //Thread.sleep( 1000 );
                
                img_Atual++;
                setarImagemInterna(img_Atual);
                              
            } catch( Exception e ){ 
                e.printStackTrace();
            } 
            finally{
                
                try{ Thread.sleep( 1000 ); } catch( InterruptedException e ){ }
                jLabel1.setEnabled(true); 
            } } }.start();         
        }
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        if( jLabel2.isEnabled() == true ){
            
            jLabel2.setEnabled(false); 
   
            new Thread() {   @Override public void run() { try { //Thread.sleep( 1000 );
                
                img_Atual--;
                setarImagemInterna(img_Atual);
                              
            } catch( Exception e ){ 
                e.printStackTrace();
            } 
            finally{
                
                try{ Thread.sleep( 1000 ); } catch( InterruptedException e ){ }
                jLabel2.setEnabled(true); 
            } } }.start();         
        }
    }//GEN-LAST:event_jLabel2MousePressed

    private void tfPaginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPaginaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPaginaActionPerformed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        largura -= 5;
        altura -= 5;
        setarPastaInicio(img_Atual);
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        largura += 5;
        altura += 5;
        setarPastaInicio(img_Atual);
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        if( jLabel9.isEnabled() == true ){
            
            jLabel9.setEnabled(false); 
   
            new Thread() {   @Override public void run() { try { //Thread.sleep( 1000 );
                
                img_Atual--;
                setarImagemInterna(img_Atual);
                              
            } catch( Exception e ){ 
                e.printStackTrace();
            } 
            finally{
                
                try{ Thread.sleep( 1000 ); } catch( InterruptedException e ){ }
                jLabel9.setEnabled(true);
            } } }.start();         
        }
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        if( jLabel10.isEnabled() == true ){
            
            jLabel10.setEnabled(false); 
   
            new Thread() {   @Override public void run() { try { //Thread.sleep( 1000 );
                
                img_Atual++;
                setarImagemInterna(img_Atual);
                              
            } catch( Exception e ){ 
                e.printStackTrace();
            } 
            finally{
                
                try{ Thread.sleep( 1000 ); } catch( InterruptedException e ){ }
                jLabel10.setEnabled(true); 
            } } }.start();         
        }
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        if( jLabel11.isEnabled() == true ){
            
            jLabel11.setEnabled(false); 
   
            new Thread() {   @Override public void run() { try { //Thread.sleep( 1000 );
                
                img_Atual = 0;
                setarImagemInterna(img_Atual);
                              
            } catch( Exception e ){ 
                e.printStackTrace();
            } 
            finally{
                
                try{ Thread.sleep( 1000 ); } catch( InterruptedException e ){ }
                jLabel11.setEnabled(true); 
            } } }.start();         
        }
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        /*
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );

            if( jLabel12.isEnabled() ){
                try{
                    jLabel12.setEnabled(false);
                    
                    JpgToPdf JpgToPdf = new JpgToPdf( nome_do_pacote_endereco_Iterno_Do_Assunto, "zz" );
                    JpgToPdf.JpgParaPdf();
                    
                    jLabel12.setEnabled(true);
                } catch( Exception e ){
                    jLabel12.setEnabled(true);
                }
            }
        } catch( Exception e ){ } } }.start();   
        */
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseReleased

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
    
        Object[] options = { "Confirmar", "Cancelar" };
        int n = JOptionPane.showOptionDialog( null, "Confirme a Opção para Gerar o Html. \n",
            "Gerar Arquivo em Html",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0] );
        if(n==0){ 
            String titulo_do_assunto = "-"; try{ titulo_do_assunto = Home.lb_titulo_do_assunto.getText().trim(); } catch( Exception e ){}
            Adicionar_Assunto_Html_Externo_Do_Jar ADD = new Adicionar_Assunto_Html_Externo_Do_Jar( 1, titulo_do_assunto, tabAssunto_Recebido, Classe_Das_Imagens, img_Atual, nome_do_pacote_endereco_Iterno_Do_Assunto, 0, 0 );
        }
       
        
    }//GEN-LAST:event_jLabel13MousePressed
    
    private void jLabel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseReleased

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        largura = 0;
        altura = 0;
        setarPastaInicio(img_Atual);
    }//GEN-LAST:event_jLabel14MousePressed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        largura = jSlider1.getValue();
        altura = jSlider1.getValue();
        setarPastaInicio(img_Atual);
    }//GEN-LAST:event_jSlider1StateChanged

    private void jLabel9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lbConteudo_Online;
    private javax.swing.JTextField tfPagina;
    // End of variables declaration//GEN-END:variables
      
    int      qtdArquivos;
    private void setarPastaInicio(int img_Atual_x){ 

        try { 
            
            CodeSource src = getClass().getProtectionDomain().getCodeSource();
            URL jar = src.getLocation();
            List<String> list = new ArrayList<String>();
            ZipInputStream zip = new ZipInputStream( jar.openStream() );
            ZipEntry ze = null;
            
            while( ( ze = zip.getNextEntry() ) != null ) {
                String entryName = ze.getName(); 
                
                String nomeList[] = entryName.split("/");  
                if( nomeList[0].trim().equalsIgnoreCase( nome_do_pacote_endereco_Iterno_Do_Assunto ) ){
                    
                    try{
                        if( nomeList[1].trim().equalsIgnoreCase("Assunto") ){
                        
                            if( entryName.endsWith(".JPG") || entryName.endsWith(".jpg") || entryName.endsWith(".PNG") || entryName.endsWith(".png") ) {
                        
                                try{ list.add( nomeList[2].trim() ); } catch( Exception e ){  }
                                //System.out.println( "entryName - " + entryName + " - nomeList[1]" + nomeList[1].trim());
                                //try{ System.out.println( "entryName - " + entryName + " - nomeList[2] - " + nomeList[2].trim()); } catch( Exception e ){  }
                            }
                        }
                    } catch( Exception e ){  }
                }
            }
            
            listaDosArquivos = list;
            qtdArquivos = listaDosArquivos.size();
                        
            setarImagemInterna(img_Atual_x);
        } catch( Exception e ){ } 
    }
    
    private void setarImagemInterna( int img_Atual2 ){ 
        img_Atual = img_Atual2;
        
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

                if( (img_Atual < qtdArquivos) && (img_Atual >= 0) ){
                
                    /*
                    System.out.println( "img_Atual - " + img_Atual );
                    System.out.println( "listaDosArquivos.size - " + listaDosArquivos.size() );
                    System.out.println( "listaDosArquivos[ 1 ] ) - " + listaDosArquivos.get( 1 ) );
                    System.out.println( "listaDosArquivos[ img_Atual ] ) - " + listaDosArquivos.get( img_Atual ) );
                    System.out.println( "listaDosArquivos[ 0 ] ) - " + listaDosArquivos.get( 0 ) ); 
                    */
                    //File img = new File( Assunto_Imagens.class.getResource( listaDosArquivos.get( img_Atual ) ).toURI().toURL().toString() );

                    BufferedImage bufImg = null;
                    ImageIcon     icon   = null;
                    Image         image  = null;
                    try{
                        bufImg = ImageIO.read(Classe_Das_Imagens.getResource( listaDosArquivos.get( img_Atual ) ) );
                        icon   = new ImageIcon(bufImg);
                        image  = icon.getImage();//ImageIO.read(f);  
                    } catch (IOException ex) {}  

                    try {  
                        image = icon.getImage();//ImageIO.read(f);  
                        int widith = image.getWidth(icon.getImageObserver() ) + largura;
                        int height = image.getHeight(icon.getImageObserver() )+ altura;
                                                                        
                        lbConteudo_Online.setIcon(new ImageIcon(image.getScaledInstance(
                            widith, height, Image.SCALE_DEFAULT)));
                        
                        try{
                                                        
                            jSlider1.setMaximum (widith);  
                            //jSlider1.setMinimum  (widith/10);  
                            jSlider1.setMinimum  (0);  
                            //System.out.println( "jSlider1.getValue() - " + jSlider1.getValue() + " - jSlider1.setMaximum (widith); - " + widith + " -  jSlider1.setMinimum  (0); - " + 0 );
                            
                            /*
                            jSlider1.setMajorTickSpacing(widith/10); 
                            jSlider1.setMinorTickSpacing(2);                              
                            
                            jSlider1.setPaintTrack(true);
                            jSlider1.setPaintTicks(true);  
                            jSlider1.setPaintLabels(true);
                            */
                            
                        } catch (Exception ex) {}  
                       
                    }catch(Exception ex){}
                    
                    int vAtual = img_Atual + 1;
                    jLabel15.setText( "Página: " + vAtual + " de: " + qtdArquivos );
                
                    //String nome = img.getName();
                    //String nomeList[] = nome.split(Pattern.quote("."));
                }
                else{   
                    if( img_Atual <= 0){
                        int qtd_Arquivos_da_Pasta = qtdArquivos-1;
                        img_Atual = qtd_Arquivos_da_Pasta;
                    }
                    else{
                        img_Atual = 0;
                    }
                    
                    /*
                    System.out.println( "img_Atual - " + img_Atual );
                    System.out.println( "listaDosArquivos.size - " + listaDosArquivos.size() );
                    System.out.println( "listaDosArquivos[ 1 ] ) - " + listaDosArquivos.get( 1 ) );
                    System.out.println( "listaDosArquivos[ img_Atual ] ) - " + listaDosArquivos.get( img_Atual ) );
                    System.out.println( "listaDosArquivos[ 0 ] ) - " + listaDosArquivos.get( 0 ) );  
                    */
                    //File img = null; try { img = new File( getClass().getClassLoader().getResource( listaDosArquivos[ img_Atual ] ).toURI().getPath() ); }catch(Exception ex){}
                    
                    BufferedImage bufImg = null;
                    ImageIcon     icon   = null;
                    Image         image  = null;
                    try{
                        bufImg = ImageIO.read(Classe_Das_Imagens.getResource( listaDosArquivos.get( img_Atual ) ) );
                        icon   = new ImageIcon(bufImg);
                        image  = icon.getImage();//ImageIO.read(f);  
                    } catch (IOException ex) { ex.printStackTrace(); /*System.out.println( img.getPath() );*/ }  

                    try {  
                        image = icon.getImage();//ImageIO.read(f);  
                        int widith = image.getWidth(icon.getImageObserver() ) + largura;
                        int height = image.getHeight(icon.getImageObserver() )+ altura;
                                                                        
                        lbConteudo_Online.setIcon(new ImageIcon(image.getScaledInstance(
                            widith, height, Image.SCALE_DEFAULT)));
                        
                        try{
                                                        
                            jSlider1.setMaximum (widith);  
                            //jSlider1.setMinimum  (widith/10);  
                            jSlider1.setMinimum  (0);  
                            //System.out.println( "jSlider1.getValue() - " + jSlider1.getValue() + " - jSlider1.setMaximum (widith); - " + widith + " -  jSlider1.setMinimum  (0); - " + 0 );
                            
                            /*
                            jSlider1.setMajorTickSpacing(widith/10); 
                            jSlider1.setMinorTickSpacing(2);                              
                            
                            jSlider1.setPaintTrack(true);
                            jSlider1.setPaintTicks(true);  
                            jSlider1.setPaintLabels(true);
                            */
                            
                        } catch (Exception ex) {} 
                        
                    }catch(Exception ex){}
                    
                    int vAtual = img_Atual + 1;
                    jLabel15.setText( "Página: " + vAtual + " de: " + qtdArquivos );
                
                    //String nome = img.getName();
                    //String nomeList[] = nome.split(Pattern.quote("."));
                }
            
        } catch( Exception e ){ } } }.start();
    }
    
}