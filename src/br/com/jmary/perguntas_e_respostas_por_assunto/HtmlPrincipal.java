/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jmary.perguntas_e_respostas_por_assunto;

import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.html.CSS;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

/**
 *
 * @author AnaMariana
 */
public class HtmlPrincipal extends javax.swing.JPanel {
    
    /**
     * Creates new form HtmlPrincipal
     */
    public HtmlPrincipal() {
        initComponents();
        
        ativarHyperlink();
        htmlPanePrincipal.setEditorKit(new HTMLEditorKit());
        
    }
    
    private void ativarHyperlink() {
        HyperlinkListener hyperlinkListener = new ActivatedHyperlinkListener(
        new Frame(),htmlPanePrincipal);
        htmlPanePrincipal.addHyperlinkListener( hyperlinkListener ); 
        
    }

    public void alterarFonte( boolean maiorOuMenor ) {  
            if ( maiorOuMenor ) {
                aumentarFonte();
            }  else {
                diminuirFonte();         
            }   
            
    }    
       
    private void aumentarFonte() {
        try{
            proximoTamanho = fonteAtual+1;           
            if ( proximoTamanho <= maximoPossível ) {
                alterarTamanhoFonte( proximoTamanho );
            }  
            if ( proximoTamanho > maximoPossível ) {
                alterarTamanhoFonte( fontePadrao );
            }
                        
        } catch ( Exception e ) {
            JOptionPane.showMessageDialog( this, "HtmlPrincipal: Método - aumentarFonte: \n" + e.getMessage() );
        }
        
    }
    
    private void diminuirFonte() {
        try{
            tamanhoAnterior = fonteAtual-1;           
            if ( tamanhoAnterior >= minimoPossível ) {
                alterarTamanhoFonte( tamanhoAnterior );               
            }
            if ( tamanhoAnterior < minimoPossível ) {
                alterarTamanhoFonte( fontePadrao );               
            }
            
        } catch ( Exception e ) {
            JOptionPane.showMessageDialog( this, "HtmlPrincipal: Método - diminuirFonte: \n" + e.getMessage() );
        }  
        
    }
    
    public void alterarTamanhoFonte( int tamanhoDaFonte ) {
        
        HTMLDocument doc = ( HTMLDocument ) htmlPanePrincipal.getDocument();
        MutableAttributeSet atributo = new SimpleAttributeSet();
        
        doc.getStyleSheet().addCSSAttribute( atributo, CSS.Attribute.FONT_SIZE, String.valueOf( tamanhoDaFonte )+"%" );
        
        doc.setCharacterAttributes( 0, htmlPanePrincipal.getDocument().getLength(), atributo, false);

        fonteAtual = tamanhoDaFonte;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        htmlPanePrincipal = new javax.swing.JEditorPane();

        jScrollPane2.setBorder(null);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(100, 100));

        htmlPanePrincipal.setEditable(false);
        htmlPanePrincipal.setBorder(null);
        htmlPanePrincipal.setContentType("text/html;charset=UTF-8"); // NOI18N
        htmlPanePrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        htmlPanePrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                htmlPanePrincipalKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(htmlPanePrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void htmlPanePrincipalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_htmlPanePrincipalKeyPressed
     
    }//GEN-LAST:event_htmlPanePrincipalKeyPressed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JEditorPane htmlPanePrincipal;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
    //private int fontePadrao = 22; 
    //private int maximoPossível = 45;
    //private int minimoPossível = 9;
    //private int fonteAtual = 22;      
    private int tamanhoAnterior = 0;
    private int proximoTamanho = 0;
    
    private int fontePadrao = 120; 
    private int maximoPossível = 800;
    private int minimoPossível = 10;
    private int fonteAtual = 120; 
    
}
