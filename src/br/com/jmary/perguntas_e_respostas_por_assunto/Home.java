/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jmary.perguntas_e_respostas_por_assunto;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javazoom.Tocar;

/**
 *
 * @author AnaMariana
 */
public class Home extends javax.swing.JPanel {
    private static final long serialVersionUID = 1L;
    
    public JFrame frame;
    
    public Component Sub_Menu_Atual;
    
    public String resposta_correta_do_exercicio_atual = "";
    public String resposta_correta_do_desafio_atual = "";
    public String resposta_correta_do_expert_atual = "";
    
    /**
     * Creates new form PnHomeDesigner
     * @param frame2
     */
    public Home( JFrame frame2 ) {         
        initComponents();
        frame = frame2; 
        //frame.setTitle( "JMARYSYSTEMS - " + Bean_Usuario_Logado.LOGIN.toUpperCase() + " - Suporte: 85 9.9139.2441" );
        ((BasicInternalFrameUI)Home_Frame_Interno.getUI()).setNorthPane(null); //retirar o painel superior
        Home_Frame_Interno.setBorder( new EmptyBorder( 0, 0, 0, 0 ) );
         
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            
            //É PRECISO ESCREVER O NOME DE CADA PACOTE UTILIZADO
            unidade_01 = "unidade_01_perguntas_e_respostas_por_assunto"; 
            unidade_02 = "unidade_02_perguntas_e_respostas_por_assunto"; 
            unidade_03 = "unidade_03_perguntas_e_respostas_por_assunto"; 
            unidade_04 = "unidade_04_perguntas_e_respostas_por_assunto"; 
            unidade_05 = "unidade_05_perguntas_e_respostas_por_assunto"; 
            unidade_06 = "unidade_06_perguntas_e_respostas_por_assunto"; 
            unidade_07 = "unidade_07_perguntas_e_respostas_por_assunto"; 
            unidade_08 = "unidade_08_perguntas_e_respostas_por_assunto"; 
            ////////////////////////////////////////////////////////////////////
            
            //É PRECISO ASSOCIAR A CLASSE DOS ASSUNTOS COM CADA PACOTE UTILIZADO
            Classe_Assunto_Unidade_01 = 
                unidade_01_perguntas_e_respostas_por_assunto.Assunto.Assunto_Imagens.class;
            Classe_Assunto_Unidade_02 = 
                unidade_02_perguntas_e_respostas_por_assunto.Assunto.Assunto_Imagens.class;
            Classe_Assunto_Unidade_03 = 
                unidade_03_perguntas_e_respostas_por_assunto.Assunto.Assunto_Imagens.class;
            Classe_Assunto_Unidade_04 = 
                unidade_04_perguntas_e_respostas_por_assunto.Assunto.Assunto_Imagens.class;
            Classe_Assunto_Unidade_05 = 
                unidade_05_perguntas_e_respostas_por_assunto.Assunto.Assunto_Imagens.class;
            Classe_Assunto_Unidade_06 = 
                unidade_06_perguntas_e_respostas_por_assunto.Assunto.Assunto_Imagens.class;
            Classe_Assunto_Unidade_07 = 
                unidade_07_perguntas_e_respostas_por_assunto.Assunto.Assunto_Imagens.class;
            Classe_Assunto_Unidade_08 = 
                unidade_08_perguntas_e_respostas_por_assunto.Assunto.Assunto_Imagens.class;
            
            ////////////////////////////////////////////////////////////////////
            
            //É PRECISO ASSOCIAR A CLASSE DOS EXERCÍCIOS COM CADA PACOTE UTILIZADO
            Classe_Exercicio_Unidade_01 = 
                unidade_01_perguntas_e_respostas_por_assunto.Exercicios.Exercicios.class;
            Classe_Exercicio_Unidade_02 = 
                unidade_02_perguntas_e_respostas_por_assunto.Exercicios.Exercicios.class;
            Classe_Exercicio_Unidade_03 = 
                unidade_03_perguntas_e_respostas_por_assunto.Exercicios.Exercicios.class;
            Classe_Exercicio_Unidade_04 = 
                unidade_04_perguntas_e_respostas_por_assunto.Exercicios.Exercicios.class;
            Classe_Exercicio_Unidade_05 = 
                unidade_05_perguntas_e_respostas_por_assunto.Exercicios.Exercicios.class;
            Classe_Exercicio_Unidade_06 = 
                unidade_06_perguntas_e_respostas_por_assunto.Exercicios.Exercicios.class;
            Classe_Exercicio_Unidade_07 = 
                unidade_07_perguntas_e_respostas_por_assunto.Exercicios.Exercicios.class;
            Classe_Exercicio_Unidade_08 = 
                unidade_08_perguntas_e_respostas_por_assunto.Exercicios.Exercicios.class;
            
            ////////////////////////////////////////////////////////////////////
            
            //É PRECISO ASSOCIAR A CLASSE DOS DESAFIOS COM CADA PACOTE UTILIZADO
            Classe_Desafio_Unidade_01 = 
                unidade_01_perguntas_e_respostas_por_assunto.Desafios.Desafios.class;
            Classe_Desafio_Unidade_02 = 
                unidade_02_perguntas_e_respostas_por_assunto.Desafios.Desafios.class;
            Classe_Desafio_Unidade_03 = 
                unidade_03_perguntas_e_respostas_por_assunto.Desafios.Desafios.class;
            Classe_Desafio_Unidade_04 = 
                unidade_04_perguntas_e_respostas_por_assunto.Desafios.Desafios.class;
            Classe_Desafio_Unidade_05 = 
                unidade_05_perguntas_e_respostas_por_assunto.Desafios.Desafios.class;
            Classe_Desafio_Unidade_06 = 
                unidade_06_perguntas_e_respostas_por_assunto.Desafios.Desafios.class;
            Classe_Desafio_Unidade_07 = 
                unidade_07_perguntas_e_respostas_por_assunto.Desafios.Desafios.class;
            Classe_Desafio_Unidade_08 = 
                unidade_08_perguntas_e_respostas_por_assunto.Desafios.Desafios.class;
            
            
            ////////////////////////////////////////////////////////////////////
            
            //É PRECISO ASSOCIAR A CLASSE DOS EXPERTS COM CADA PACOTE UTILIZADO
            Classe_Expert_Unidade_01 = 
                unidade_01_perguntas_e_respostas_por_assunto.Expert.Expert.class;
            Classe_Expert_Unidade_02 = 
                unidade_02_perguntas_e_respostas_por_assunto.Expert.Expert.class;
            Classe_Expert_Unidade_03 = 
                unidade_03_perguntas_e_respostas_por_assunto.Expert.Expert.class;
            Classe_Expert_Unidade_04 = 
                unidade_04_perguntas_e_respostas_por_assunto.Expert.Expert.class;
            Classe_Expert_Unidade_05 = 
                unidade_05_perguntas_e_respostas_por_assunto.Expert.Expert.class;
            Classe_Expert_Unidade_06 = 
                unidade_06_perguntas_e_respostas_por_assunto.Expert.Expert.class;
            Classe_Expert_Unidade_07 = 
                unidade_07_perguntas_e_respostas_por_assunto.Expert.Expert.class;
            Classe_Expert_Unidade_08 = 
                unidade_08_perguntas_e_respostas_por_assunto.Expert.Expert.class;
            
            
            ////////////////////////////////////////////////////////////////////
            
            nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_01; 
                
            inicio_Assuntos( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_01 );
            inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_01 );
            inicio_Desafios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Desafio_Unidade_01 );
            inicio_Expert( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Expert_Unidade_01 );
            
        } catch( Exception e ){  } } }.start();        
    }
    
    //NOMES DOS PACOTES UTILIZADOS
    String unidade_01 = ""; 
    String unidade_02 = "";
    String unidade_03 = "";
    String unidade_04 = "";
    String unidade_05 = ""; 
    String unidade_06 = "";
    String unidade_07 = "";
    String unidade_08 = "";
    //NOME DO PACOTE INICIAL
    String nome_do_pacote_endereco_Iterno_Do_Assunto = "";
    //CLASSES DOS ASSUNTOS UTILIZADOS
    Class Classe_Assunto_Unidade_01 = null;
    Class Classe_Assunto_Unidade_02 = null;
    Class Classe_Assunto_Unidade_03 = null;
    Class Classe_Assunto_Unidade_04 = null;
    Class Classe_Assunto_Unidade_05 = null;
    Class Classe_Assunto_Unidade_06 = null;
    Class Classe_Assunto_Unidade_07 = null;
    Class Classe_Assunto_Unidade_08 = null;
    //CLASSES DOS EXERCÍCIOS UTILIZADOS
    Class Classe_Exercicio_Unidade_01 = null;
    Class Classe_Exercicio_Unidade_02 = null;
    Class Classe_Exercicio_Unidade_03 = null;
    Class Classe_Exercicio_Unidade_04 = null;
    Class Classe_Exercicio_Unidade_05 = null;
    Class Classe_Exercicio_Unidade_06 = null;
    Class Classe_Exercicio_Unidade_07 = null;
    Class Classe_Exercicio_Unidade_08 = null;
    //CLASSES DOS DESAFIOS UTILIZADOS
    Class Classe_Desafio_Unidade_01 = null;
    Class Classe_Desafio_Unidade_02 = null;
    Class Classe_Desafio_Unidade_03 = null;
    Class Classe_Desafio_Unidade_04 = null;
    Class Classe_Desafio_Unidade_05 = null;
    Class Classe_Desafio_Unidade_06 = null;
    Class Classe_Desafio_Unidade_07 = null;
    Class Classe_Desafio_Unidade_08 = null;
    //CLASSES DOS EXPERTS UTILIZADOS
    Class Classe_Expert_Unidade_01 = null;
    Class Classe_Expert_Unidade_02 = null;
    Class Classe_Expert_Unidade_03 = null;
    Class Classe_Expert_Unidade_04 = null;
    Class Classe_Expert_Unidade_05 = null;
    Class Classe_Expert_Unidade_06 = null;
    Class Classe_Expert_Unidade_07 = null;
    Class Classe_Expert_Unidade_08 = null;
    
    // ABRIR TELA INICIAL DO ASSUNTO
    Visualizador_Interno_Assunto AssuntoX;
    private void inicio_Assuntos( String nome_do_pacote_recebido, Class Classe_Das_Imagens_Assunto ) {   
        
        int img_Atual = 0;            
        Class Classe_Das_Imagens = Classe_Das_Imagens_Assunto; //Alterar antes a declaração do pacote da classe - Assunto_Imagens
                
        /*new Thread() {   @Override public void run() {*/ try { //Thread.sleep( 1 );
                                                          
            AssuntoX = new Visualizador_Interno_Assunto( this, tabAssunto, Classe_Das_Imagens, img_Atual, nome_do_pacote_recebido, 0, 0 );
                    
            //tabAssunto.removeTabAt( tabAssunto.getSelectedIndex() );
            tabAssunto.add( "0", AssuntoX );

        } catch( Exception e ){  } //} }.start();
        
        try {
            // EXERCÍCIOS
            ////////////////////////////////////////////////////////////////////
            lb_Reiniciar_Exercicios.setVisible(false);
            jp_Letras_das_Respostas_Exercicios.setVisible(true);
            lbOk_Exercicios.setText( String.valueOf(0) );
            lbNok_Exercicios.setText( String.valueOf(0) );
            ////////////////////////////////////////////////////////////////////
        } catch( Exception e ){  }
        
        try {
            // DESAFIOS
            ////////////////////////////////////////////////////////////////////
            lb_Reiniciar_Desafios.setVisible(false);
            jp_Letras_das_Respostas_Desafios.setVisible(true);
            lbOk_Desafios.setText( String.valueOf(0) );
            lbNok_Desafios.setText( String.valueOf(0) );
            ////////////////////////////////////////////////////////////////////
        } catch( Exception e ){  }
        
        try {
            // EXPERT
            ////////////////////////////////////////////////////////////////////
            lb_Reiniciar_Expert.setVisible(false);
            jp_Letras_das_Respostas_Expert.setVisible(true);
            lbOk_Expert.setText( String.valueOf(0) );
            lbNok_Expert.setText( String.valueOf(0) );
            ////////////////////////////////////////////////////////////////////
        } catch( Exception e ){  }
        
        try {
            
            Adicionar_Assunto_Html_Ao_JEditorPane SS = new Adicionar_Assunto_Html_Ao_JEditorPane( 1, tabAssunto, Classe_Das_Imagens, img_Atual, nome_do_pacote_recebido, 0, 0 );
        
        } catch( Exception e ){ }                
    } 
                 
    // ABRIR TELA INICIAL DOS EXERCÍCIOS
    Visualizador_Interno_Exercicios ExerciciosX;
    private void inicio_Exercicios( String nome_do_pacote_recebido, Class Classe_Das_Imagens_Exercicios ) {                                      
        
        /*new Thread() {   @Override public void run() {*/ try { //Thread.sleep( 1 );
            
            int img_Atual = 0;
            Class Classe_Das_Imagens = Classe_Das_Imagens_Exercicios; //Alterar antes a declaração do pacote da classe - Exercicios
            
            ExerciciosX = new Visualizador_Interno_Exercicios( this, tabExercicios, Classe_Das_Imagens, img_Atual, nome_do_pacote_recebido, 0, 0 );
            
            //tabExercicios.removeTabAt( tabAssunto.getSelectedIndex() );
            tabExercicios.add( "0", ExerciciosX );

        } catch( Exception e ){  } //} }.start();
    } 
    
    // ABRIR TELA INICIAL DOS DESAFIOS
    Visualizador_Interno_Desafios DesafiosX;
    private void inicio_Desafios( String nome_do_pacote_recebido, Class Classe_Das_Imagens_Desafios ) {                                      
        
        /*new Thread() {   @Override public void run() {*/ try { //Thread.sleep( 1 );
            
            int img_Atual = 0;
            Class Classe_Das_Imagens = Classe_Das_Imagens_Desafios; //Alterar antes a declaração do pacote da classe - Exercicios
            
            DesafiosX = new Visualizador_Interno_Desafios( this, tabDesafios, Classe_Das_Imagens, img_Atual, nome_do_pacote_recebido, 0, 0 );
            
            //tabDesafios.removeTabAt( tabDesafios.getSelectedIndex() );
            tabDesafios.add( "0", DesafiosX );

        } catch( Exception e ){  } //} }.start();
    } 
    
    // ABRIR TELA INICIAL DOS EXPERT
    Visualizador_Interno_Expert ExpertX;
    private void inicio_Expert( String nome_do_pacote_recebido, Class Classe_Das_Imagens_Expert ) {                                      
        
        /*new Thread() {   @Override public void run() {*/ try { //Thread.sleep( 1 );
            
            int img_Atual = 0;
            Class Classe_Das_Imagens = Classe_Das_Imagens_Expert; //Alterar antes a declaração do pacote da classe - Exercicios
            
            ExpertX = new Visualizador_Interno_Expert( this, tabExpert, Classe_Das_Imagens, img_Atual, nome_do_pacote_recebido, 0, 0 );
            
            //tabDesafios.removeTabAt( tabDesafios.getSelectedIndex() );
            tabExpert.add( "0", ExpertX );

        } catch( Exception e ){  } //} }.start();
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home_Frame_Interno = new javax.swing.JInternalFrame();
        lb_titulo_do_assunto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabAssunto = new javax.swing.JTabbedPane();
        jp_Exercicios = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbOk_Exercicios = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbNok_Exercicios = new javax.swing.JLabel();
        lb_Status_Resposta_Exercicios = new javax.swing.JLabel();
        jp_Letras_das_Respostas_Exercicios = new javax.swing.JPanel();
        btResponder_B_Exercicios = new javax.swing.JButton();
        btResponder_E_Exercicios = new javax.swing.JButton();
        btResponder_A_Exercicios = new javax.swing.JButton();
        btResponder_C_Exercicios = new javax.swing.JButton();
        btResponder_D_Exercicios = new javax.swing.JButton();
        lb_Reiniciar_Exercicios = new javax.swing.JLabel();
        tabExercicios = new javax.swing.JTabbedPane();
        jp_Desafios = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        lbOk_Desafios = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lbNok_Desafios = new javax.swing.JLabel();
        lb_Status_Resposta_Desafios = new javax.swing.JLabel();
        jp_Letras_das_Respostas_Desafios = new javax.swing.JPanel();
        btResponder_B_Desafio = new javax.swing.JButton();
        btResponder_E_Desafio = new javax.swing.JButton();
        btResponder_A_Desafio = new javax.swing.JButton();
        btResponder_C_Desafio = new javax.swing.JButton();
        btResponder_D_Desafio = new javax.swing.JButton();
        lb_Reiniciar_Desafios = new javax.swing.JLabel();
        tabDesafios = new javax.swing.JTabbedPane();
        jp_Expert = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        lbOk_Expert = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        lbNok_Expert = new javax.swing.JLabel();
        lb_Status_Resposta_Expert = new javax.swing.JLabel();
        jp_Letras_das_Respostas_Expert = new javax.swing.JPanel();
        btResponder_B_Expert = new javax.swing.JButton();
        btResponder_E_Expert = new javax.swing.JButton();
        btResponder_A_Expert = new javax.swing.JButton();
        btResponder_C_Expert = new javax.swing.JButton();
        btResponder_D_Expert = new javax.swing.JButton();
        lb_Reiniciar_Expert = new javax.swing.JLabel();
        tabExpert = new javax.swing.JTabbedPane();
        Home_Barra_Menu = new javax.swing.JMenuBar();
        menu_Ajuda = new javax.swing.JMenu();
        menu_Conteudo = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mi_Unidade_01 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mi_Unidade_02 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mi_Unidade_03 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mi_Unidade_04 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mi_Unidade_5 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mi_Unidade_6 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mi_Unidade_7 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mi_Unidade_8 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();

        Home_Frame_Interno.setBorder(null);
        Home_Frame_Interno.setVisible(true);

        lb_titulo_do_assunto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_titulo_do_assunto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo_do_assunto.setText("Arquitetura de Software e Computação em Nuvem");

        tabAssunto.setBackground(new java.awt.Color(255, 255, 255));
        tabAssunto.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.addTab("Assunto", tabAssunto);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        lbOk_Exercicios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbOk_Exercicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOk_Exercicios.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbOk_Exercicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbOk_Exercicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(0, 153, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACERTOS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 0, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ERROS");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        lbNok_Exercicios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbNok_Exercicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNok_Exercicios.setText("0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNok_Exercicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNok_Exercicios)
        );

        lb_Status_Resposta_Exercicios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_Status_Resposta_Exercicios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Status_Resposta_Exercicios.setText("Exercícios");

        btResponder_B_Exercicios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_B_Exercicios.setText("B");
        btResponder_B_Exercicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_B_ExerciciosMousePressed(evt);
            }
        });

        btResponder_E_Exercicios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_E_Exercicios.setText("E");
        btResponder_E_Exercicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_E_ExerciciosMousePressed(evt);
            }
        });

        btResponder_A_Exercicios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_A_Exercicios.setText("A");
        btResponder_A_Exercicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btResponder_A_ExerciciosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_A_ExerciciosMousePressed(evt);
            }
        });

        btResponder_C_Exercicios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_C_Exercicios.setText("C");
        btResponder_C_Exercicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_C_ExerciciosMousePressed(evt);
            }
        });

        btResponder_D_Exercicios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_D_Exercicios.setText("D");
        btResponder_D_Exercicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_D_ExerciciosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jp_Letras_das_Respostas_ExerciciosLayout = new javax.swing.GroupLayout(jp_Letras_das_Respostas_Exercicios);
        jp_Letras_das_Respostas_Exercicios.setLayout(jp_Letras_das_Respostas_ExerciciosLayout);
        jp_Letras_das_Respostas_ExerciciosLayout.setHorizontalGroup(
            jp_Letras_das_Respostas_ExerciciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Letras_das_Respostas_ExerciciosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btResponder_A_Exercicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder_B_Exercicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder_C_Exercicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder_D_Exercicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder_E_Exercicios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_Letras_das_Respostas_ExerciciosLayout.setVerticalGroup(
            jp_Letras_das_Respostas_ExerciciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Letras_das_Respostas_ExerciciosLayout.createSequentialGroup()
                .addGroup(jp_Letras_das_Respostas_ExerciciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btResponder_A_Exercicios)
                    .addComponent(btResponder_B_Exercicios)
                    .addComponent(btResponder_C_Exercicios)
                    .addComponent(btResponder_D_Exercicios)
                    .addComponent(btResponder_E_Exercicios))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_Reiniciar_Exercicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/mais.png"))); // NOI18N
        lb_Reiniciar_Exercicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Reiniciar_Exercicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_Reiniciar_ExerciciosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jp_Letras_das_Respostas_Exercicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Reiniciar_Exercicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Status_Resposta_Exercicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lb_Status_Resposta_Exercicios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jp_Letras_das_Respostas_Exercicios, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lb_Reiniciar_Exercicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        tabExercicios.setBackground(new java.awt.Color(255, 255, 255));
        tabExercicios.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout jp_ExerciciosLayout = new javax.swing.GroupLayout(jp_Exercicios);
        jp_Exercicios.setLayout(jp_ExerciciosLayout);
        jp_ExerciciosLayout.setHorizontalGroup(
            jp_ExerciciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ExerciciosLayout.createSequentialGroup()
                .addGroup(jp_ExerciciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabExercicios, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_ExerciciosLayout.setVerticalGroup(
            jp_ExerciciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ExerciciosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabExercicios)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Exercícios", jp_Exercicios);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        lbOk_Desafios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbOk_Desafios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOk_Desafios.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbOk_Desafios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbOk_Desafios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(0, 153, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ACERTOS");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ERROS");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

        lbNok_Desafios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbNok_Desafios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNok_Desafios.setText("0");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNok_Desafios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNok_Desafios)
        );

        lb_Status_Resposta_Desafios.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_Status_Resposta_Desafios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Status_Resposta_Desafios.setText("Desafios");

        btResponder_B_Desafio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_B_Desafio.setText("B");
        btResponder_B_Desafio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_B_DesafioMousePressed(evt);
            }
        });

        btResponder_E_Desafio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_E_Desafio.setText("E");
        btResponder_E_Desafio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_E_DesafioMousePressed(evt);
            }
        });

        btResponder_A_Desafio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_A_Desafio.setText("A");
        btResponder_A_Desafio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btResponder_A_DesafioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_A_DesafioMousePressed(evt);
            }
        });

        btResponder_C_Desafio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_C_Desafio.setText("C");
        btResponder_C_Desafio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_C_DesafioMousePressed(evt);
            }
        });

        btResponder_D_Desafio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_D_Desafio.setText("D");
        btResponder_D_Desafio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_D_DesafioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jp_Letras_das_Respostas_DesafiosLayout = new javax.swing.GroupLayout(jp_Letras_das_Respostas_Desafios);
        jp_Letras_das_Respostas_Desafios.setLayout(jp_Letras_das_Respostas_DesafiosLayout);
        jp_Letras_das_Respostas_DesafiosLayout.setHorizontalGroup(
            jp_Letras_das_Respostas_DesafiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Letras_das_Respostas_DesafiosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btResponder_A_Desafio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder_B_Desafio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder_C_Desafio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder_D_Desafio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder_E_Desafio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_Letras_das_Respostas_DesafiosLayout.setVerticalGroup(
            jp_Letras_das_Respostas_DesafiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Letras_das_Respostas_DesafiosLayout.createSequentialGroup()
                .addGroup(jp_Letras_das_Respostas_DesafiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btResponder_A_Desafio)
                    .addComponent(btResponder_B_Desafio)
                    .addComponent(btResponder_C_Desafio)
                    .addComponent(btResponder_D_Desafio)
                    .addComponent(btResponder_E_Desafio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_Reiniciar_Desafios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/mais.png"))); // NOI18N
        lb_Reiniciar_Desafios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Reiniciar_Desafios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_Reiniciar_DesafiosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jp_Letras_das_Respostas_Desafios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Reiniciar_Desafios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Status_Resposta_Desafios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lb_Status_Resposta_Desafios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jp_Letras_das_Respostas_Desafios, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lb_Reiniciar_Desafios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        tabDesafios.setBackground(new java.awt.Color(255, 255, 255));
        tabDesafios.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout jp_DesafiosLayout = new javax.swing.GroupLayout(jp_Desafios);
        jp_Desafios.setLayout(jp_DesafiosLayout);
        jp_DesafiosLayout.setHorizontalGroup(
            jp_DesafiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_DesafiosLayout.createSequentialGroup()
                .addGroup(jp_DesafiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabDesafios, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_DesafiosLayout.setVerticalGroup(
            jp_DesafiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_DesafiosLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabDesafios)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Desafios", jp_Desafios);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));

        lbOk_Expert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbOk_Expert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOk_Expert.setText("0");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbOk_Expert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbOk_Expert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(0, 153, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ACERTOS");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(255, 0, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ERROS");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));

        lbNok_Expert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbNok_Expert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNok_Expert.setText("0");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNok_Expert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbNok_Expert)
        );

        lb_Status_Resposta_Expert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_Status_Resposta_Expert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Status_Resposta_Expert.setText("Expert");

        btResponder_B_Expert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_B_Expert.setText("B");
        btResponder_B_Expert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_B_ExpertMousePressed(evt);
            }
        });

        btResponder_E_Expert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_E_Expert.setText("E");
        btResponder_E_Expert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_E_ExpertMousePressed(evt);
            }
        });

        btResponder_A_Expert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_A_Expert.setText("A");
        btResponder_A_Expert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btResponder_A_ExpertMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_A_ExpertMousePressed(evt);
            }
        });

        btResponder_C_Expert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_C_Expert.setText("C");
        btResponder_C_Expert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_C_ExpertMousePressed(evt);
            }
        });

        btResponder_D_Expert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btResponder_D_Expert.setText("D");
        btResponder_D_Expert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btResponder_D_ExpertMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jp_Letras_das_Respostas_ExpertLayout = new javax.swing.GroupLayout(jp_Letras_das_Respostas_Expert);
        jp_Letras_das_Respostas_Expert.setLayout(jp_Letras_das_Respostas_ExpertLayout);
        jp_Letras_das_Respostas_ExpertLayout.setHorizontalGroup(
            jp_Letras_das_Respostas_ExpertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Letras_das_Respostas_ExpertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btResponder_A_Expert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder_B_Expert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder_C_Expert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder_D_Expert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btResponder_E_Expert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_Letras_das_Respostas_ExpertLayout.setVerticalGroup(
            jp_Letras_das_Respostas_ExpertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_Letras_das_Respostas_ExpertLayout.createSequentialGroup()
                .addGroup(jp_Letras_das_Respostas_ExpertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btResponder_A_Expert)
                    .addComponent(btResponder_B_Expert)
                    .addComponent(btResponder_C_Expert)
                    .addComponent(btResponder_D_Expert)
                    .addComponent(btResponder_E_Expert))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lb_Reiniciar_Expert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/mais.png"))); // NOI18N
        lb_Reiniciar_Expert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Reiniciar_Expert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_Reiniciar_ExpertMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(jp_Letras_das_Respostas_Expert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Reiniciar_Expert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Status_Resposta_Expert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lb_Status_Resposta_Expert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jp_Letras_das_Respostas_Expert, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lb_Reiniciar_Expert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        tabExpert.setBackground(new java.awt.Color(255, 255, 255));
        tabExpert.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout jp_ExpertLayout = new javax.swing.GroupLayout(jp_Expert);
        jp_Expert.setLayout(jp_ExpertLayout);
        jp_ExpertLayout.setHorizontalGroup(
            jp_ExpertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ExpertLayout.createSequentialGroup()
                .addGroup(jp_ExpertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabExpert, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_ExpertLayout.setVerticalGroup(
            jp_ExpertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ExpertLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabExpert)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Expert", jp_Expert);

        jScrollPane2.setViewportView(jTabbedPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        menu_Ajuda.setText("Ajuda");
        Home_Barra_Menu.add(menu_Ajuda);

        menu_Conteudo.setText("Conteúdo");
        menu_Conteudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_ConteudoMousePressed(evt);
            }
        });
        menu_Conteudo.add(jSeparator1);

        mi_Unidade_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/mais.png"))); // NOI18N
        mi_Unidade_01.setText("Unidade 01");
        mi_Unidade_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mi_Unidade_01MousePressed(evt);
            }
        });
        menu_Conteudo.add(mi_Unidade_01);
        menu_Conteudo.add(jSeparator2);

        mi_Unidade_02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/mais.png"))); // NOI18N
        mi_Unidade_02.setText("Unidade 02");
        mi_Unidade_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mi_Unidade_02MousePressed(evt);
            }
        });
        menu_Conteudo.add(mi_Unidade_02);
        menu_Conteudo.add(jSeparator3);

        mi_Unidade_03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/mais.png"))); // NOI18N
        mi_Unidade_03.setText("Unidade 03");
        mi_Unidade_03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mi_Unidade_03MousePressed(evt);
            }
        });
        menu_Conteudo.add(mi_Unidade_03);
        menu_Conteudo.add(jSeparator4);

        mi_Unidade_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/mais.png"))); // NOI18N
        mi_Unidade_04.setText("Unidade 04");
        mi_Unidade_04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mi_Unidade_04MousePressed(evt);
            }
        });
        menu_Conteudo.add(mi_Unidade_04);
        menu_Conteudo.add(jSeparator5);

        mi_Unidade_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/mais.png"))); // NOI18N
        mi_Unidade_5.setText("Unidade 05");
        mi_Unidade_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mi_Unidade_5MousePressed(evt);
            }
        });
        menu_Conteudo.add(mi_Unidade_5);
        menu_Conteudo.add(jSeparator6);

        mi_Unidade_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/mais.png"))); // NOI18N
        mi_Unidade_6.setText("Unidade 06");
        mi_Unidade_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mi_Unidade_6MousePressed(evt);
            }
        });
        menu_Conteudo.add(mi_Unidade_6);
        menu_Conteudo.add(jSeparator7);

        mi_Unidade_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/mais.png"))); // NOI18N
        mi_Unidade_7.setText("Unidade 07");
        mi_Unidade_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mi_Unidade_7MousePressed(evt);
            }
        });
        menu_Conteudo.add(mi_Unidade_7);
        menu_Conteudo.add(jSeparator8);

        mi_Unidade_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jmary/perguntas_e_respostas_por_assunto/imagens_internas/mais.png"))); // NOI18N
        mi_Unidade_8.setText("Unidade 08");
        mi_Unidade_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mi_Unidade_8MousePressed(evt);
            }
        });
        menu_Conteudo.add(mi_Unidade_8);
        menu_Conteudo.add(jSeparator9);

        Home_Barra_Menu.add(menu_Conteudo);

        Home_Frame_Interno.setJMenuBar(Home_Barra_Menu);

        javax.swing.GroupLayout Home_Frame_InternoLayout = new javax.swing.GroupLayout(Home_Frame_Interno.getContentPane());
        Home_Frame_Interno.getContentPane().setLayout(Home_Frame_InternoLayout);
        Home_Frame_InternoLayout.setHorizontalGroup(
            Home_Frame_InternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo_do_assunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Home_Frame_InternoLayout.setVerticalGroup(
            Home_Frame_InternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_Frame_InternoLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(lb_titulo_do_assunto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home_Frame_Interno, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home_Frame_Interno)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btResponder_B_ExerciciosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_B_ExerciciosMousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta_exercicios("B");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder_B_ExerciciosMousePressed

    private void btResponder_E_ExerciciosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_E_ExerciciosMousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta_exercicios("E");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder_E_ExerciciosMousePressed

    private void btResponder_A_ExerciciosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_A_ExerciciosMousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta_exercicios("A");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder_A_ExerciciosMousePressed

    private void btResponder_C_ExerciciosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_C_ExerciciosMousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta_exercicios("C");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder_C_ExerciciosMousePressed

    private void btResponder_D_ExerciciosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_D_ExerciciosMousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta_exercicios("D");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder_D_ExerciciosMousePressed

    private void lb_Reiniciar_ExerciciosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_Reiniciar_ExerciciosMousePressed
        ExerciciosX.img_Atual = 0;
        jp_Letras_das_Respostas_Exercicios.setVisible(true);
        lb_Reiniciar_Exercicios.setVisible(false);
        ExerciciosX.setarImagemInterna(0);
        lbOk_Exercicios.setText( String.valueOf(0) );
        lbNok_Exercicios.setText( String.valueOf(0) );
    }//GEN-LAST:event_lb_Reiniciar_ExerciciosMousePressed

    private void btResponder_A_ExerciciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_A_ExerciciosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btResponder_A_ExerciciosMouseExited

    private void menu_ConteudoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ConteudoMousePressed
        
    }//GEN-LAST:event_menu_ConteudoMousePressed

    private void mi_Unidade_01MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_Unidade_01MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            
            if ( Classe_Assunto_Unidade_01 != null ){ 
                
                while ( tabAssunto.getTabCount() > 0 ){ tabAssunto.removeTabAt(0); }                
                while ( tabExercicios.getTabCount() > 0 ){ tabExercicios.removeTabAt(0); } 
                while ( tabDesafios.getTabCount() > 0 ){ tabDesafios.removeTabAt(0); }  
                while ( tabExpert.getTabCount() > 0 ){ tabExpert.removeTabAt(0); }  
            
                nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_01;
                                         
                inicio_Assuntos( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_01 );
                inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_01 );
                inicio_Desafios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Desafio_Unidade_01 );
                inicio_Expert( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Expert_Unidade_01 );           
            }            
        } catch( Exception e ){  } } }.start();
    }//GEN-LAST:event_mi_Unidade_01MousePressed

    private void mi_Unidade_02MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_Unidade_02MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            
            if ( Classe_Assunto_Unidade_02 != null ){ 
                
                while ( tabAssunto.getTabCount() > 0 ){ tabAssunto.removeTabAt(0); }                
                while ( tabExercicios.getTabCount() > 0 ){ tabExercicios.removeTabAt(0); } 
                while ( tabDesafios.getTabCount() > 0 ){ tabDesafios.removeTabAt(0); }  
                while ( tabExpert.getTabCount() > 0 ){ tabExpert.removeTabAt(0); }  
            
                nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_02;
                                         
                inicio_Assuntos( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_02 );
                inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_02 );
                inicio_Desafios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Desafio_Unidade_02 );
                inicio_Expert( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Expert_Unidade_02 );           
            }            
        } catch( Exception e ){  } } }.start();
    }//GEN-LAST:event_mi_Unidade_02MousePressed

    private void mi_Unidade_03MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_Unidade_03MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            
            if ( Classe_Assunto_Unidade_03 != null ){ 
                
                while ( tabAssunto.getTabCount() > 0 ){ tabAssunto.removeTabAt(0); }                
                while ( tabExercicios.getTabCount() > 0 ){ tabExercicios.removeTabAt(0); } 
                while ( tabDesafios.getTabCount() > 0 ){ tabDesafios.removeTabAt(0); }  
                while ( tabExpert.getTabCount() > 0 ){ tabExpert.removeTabAt(0); }  
            
                nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_03;
                                         
                inicio_Assuntos( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_03 );
                inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_03 );
                inicio_Desafios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Desafio_Unidade_03 );
                inicio_Expert( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Expert_Unidade_03 );           
            }            
        } catch( Exception e ){  } } }.start();
    }//GEN-LAST:event_mi_Unidade_03MousePressed

    private void mi_Unidade_04MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_Unidade_04MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            
            if ( Classe_Assunto_Unidade_04 != null ){ 
                
                while ( tabAssunto.getTabCount() > 0 ){ tabAssunto.removeTabAt(0); }                
                while ( tabExercicios.getTabCount() > 0 ){ tabExercicios.removeTabAt(0); } 
                while ( tabDesafios.getTabCount() > 0 ){ tabDesafios.removeTabAt(0); }  
                while ( tabExpert.getTabCount() > 0 ){ tabExpert.removeTabAt(0); }  
            
                nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_04;
                                         
                inicio_Assuntos( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_04 );
                inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_04 );
                inicio_Desafios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Desafio_Unidade_04 );
                inicio_Expert( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Expert_Unidade_04 );           
            }            
        } catch( Exception e ){  } } }.start();
    }//GEN-LAST:event_mi_Unidade_04MousePressed

    private void btResponder_B_DesafioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_B_DesafioMousePressed
        verificar_resposta_desafios("B");
    }//GEN-LAST:event_btResponder_B_DesafioMousePressed

    private void btResponder_E_DesafioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_E_DesafioMousePressed
        verificar_resposta_desafios("E");
    }//GEN-LAST:event_btResponder_E_DesafioMousePressed

    private void btResponder_A_DesafioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_A_DesafioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btResponder_A_DesafioMouseExited

    private void btResponder_A_DesafioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_A_DesafioMousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta_desafios("A");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder_A_DesafioMousePressed

    private void btResponder_C_DesafioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_C_DesafioMousePressed
        verificar_resposta_desafios("C");
    }//GEN-LAST:event_btResponder_C_DesafioMousePressed

    private void btResponder_D_DesafioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_D_DesafioMousePressed
        verificar_resposta_desafios("D");
    }//GEN-LAST:event_btResponder_D_DesafioMousePressed

    private void lb_Reiniciar_DesafiosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_Reiniciar_DesafiosMousePressed
        DesafiosX.img_Atual = 0;
        jp_Letras_das_Respostas_Desafios.setVisible(true);
        lb_Reiniciar_Desafios.setVisible(false);
        DesafiosX.setarImagemInterna(0);
        lbOk_Desafios.setText( String.valueOf(0) );
        lbNok_Desafios.setText( String.valueOf(0) );
    }//GEN-LAST:event_lb_Reiniciar_DesafiosMousePressed

    private void btResponder_B_ExpertMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_B_ExpertMousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta_expert("B");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder_B_ExpertMousePressed

    private void btResponder_E_ExpertMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_E_ExpertMousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta_expert("E");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder_E_ExpertMousePressed

    private void btResponder_A_ExpertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_A_ExpertMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btResponder_A_ExpertMouseExited

    private void btResponder_A_ExpertMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_A_ExpertMousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta_expert("A");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder_A_ExpertMousePressed

    private void btResponder_C_ExpertMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_C_ExpertMousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta_expert("C");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder_C_ExpertMousePressed

    private void btResponder_D_ExpertMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btResponder_D_ExpertMousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );

            verificar_resposta_expert("D");

        } catch( Exception e ){ } } }.start();
    }//GEN-LAST:event_btResponder_D_ExpertMousePressed

    private void lb_Reiniciar_ExpertMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_Reiniciar_ExpertMousePressed
        ExpertX.img_Atual = 0;
        jp_Letras_das_Respostas_Expert.setVisible(true);
        lb_Reiniciar_Expert.setVisible(false);
        ExpertX.setarImagemInterna(0);
        lbOk_Expert.setText( String.valueOf(0) );
        lbNok_Expert.setText( String.valueOf(0) );
    }//GEN-LAST:event_lb_Reiniciar_ExpertMousePressed

    private void mi_Unidade_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_Unidade_5MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            
            if ( Classe_Assunto_Unidade_05 != null ){ 
                
                while ( tabAssunto.getTabCount() > 0 ){ tabAssunto.removeTabAt(0); }                
                while ( tabExercicios.getTabCount() > 0 ){ tabExercicios.removeTabAt(0); } 
                while ( tabDesafios.getTabCount() > 0 ){ tabDesafios.removeTabAt(0); }  
                while ( tabExpert.getTabCount() > 0 ){ tabExpert.removeTabAt(0); }  
            
                nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_05;
                                         
                inicio_Assuntos( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_05 );
                inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_05 );
                inicio_Desafios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Desafio_Unidade_05 );
                inicio_Expert( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Expert_Unidade_05 );           
            }            
        } catch( Exception e ){  } } }.start();
    }//GEN-LAST:event_mi_Unidade_5MousePressed

    private void mi_Unidade_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_Unidade_6MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            
            if ( Classe_Assunto_Unidade_06 != null ){ 
                
                while ( tabAssunto.getTabCount() > 0 ){ tabAssunto.removeTabAt(0); }                
                while ( tabExercicios.getTabCount() > 0 ){ tabExercicios.removeTabAt(0); } 
                while ( tabDesafios.getTabCount() > 0 ){ tabDesafios.removeTabAt(0); }  
                while ( tabExpert.getTabCount() > 0 ){ tabExpert.removeTabAt(0); }  
            
                nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_06;
                                         
                inicio_Assuntos( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_06 );
                inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_06 );
                inicio_Desafios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Desafio_Unidade_06 );
                inicio_Expert( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Expert_Unidade_06 );           
            }            
        } catch( Exception e ){  } } }.start();
    }//GEN-LAST:event_mi_Unidade_6MousePressed

    private void mi_Unidade_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_Unidade_7MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            
            if ( Classe_Assunto_Unidade_07 != null ){ 
                
                while ( tabAssunto.getTabCount() > 0 ){ tabAssunto.removeTabAt(0); }                
                while ( tabExercicios.getTabCount() > 0 ){ tabExercicios.removeTabAt(0); } 
                while ( tabDesafios.getTabCount() > 0 ){ tabDesafios.removeTabAt(0); }  
                while ( tabExpert.getTabCount() > 0 ){ tabExpert.removeTabAt(0); }  
            
                nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_07;
                                         
                inicio_Assuntos( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_07 );
                inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_07 );
                inicio_Desafios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Desafio_Unidade_07 );
                inicio_Expert( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Expert_Unidade_07 );           
            }            
        } catch( Exception e ){  } } }.start();
    }//GEN-LAST:event_mi_Unidade_7MousePressed

    private void mi_Unidade_8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_Unidade_8MousePressed
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
            
            if ( Classe_Assunto_Unidade_08 != null ){ 
                
                while ( tabAssunto.getTabCount() > 0 ){ tabAssunto.removeTabAt(0); }                
                while ( tabExercicios.getTabCount() > 0 ){ tabExercicios.removeTabAt(0); } 
                while ( tabDesafios.getTabCount() > 0 ){ tabDesafios.removeTabAt(0); }  
                while ( tabExpert.getTabCount() > 0 ){ tabExpert.removeTabAt(0); }  
            
                nome_do_pacote_endereco_Iterno_Do_Assunto = unidade_08;
                                         
                inicio_Assuntos( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Assunto_Unidade_08 );
                inicio_Exercicios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Exercicio_Unidade_08 );
                inicio_Desafios( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Desafio_Unidade_08 );
                inicio_Expert( nome_do_pacote_endereco_Iterno_Do_Assunto, Classe_Expert_Unidade_08 );           
            }            
        } catch( Exception e ){  } } }.start();
    }//GEN-LAST:event_mi_Unidade_8MousePressed
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Home_Barra_Menu;
    public javax.swing.JInternalFrame Home_Frame_Interno;
    private javax.swing.JButton btResponder_A_Desafio;
    private javax.swing.JButton btResponder_A_Exercicios;
    private javax.swing.JButton btResponder_A_Expert;
    private javax.swing.JButton btResponder_B_Desafio;
    private javax.swing.JButton btResponder_B_Exercicios;
    private javax.swing.JButton btResponder_B_Expert;
    private javax.swing.JButton btResponder_C_Desafio;
    private javax.swing.JButton btResponder_C_Exercicios;
    private javax.swing.JButton btResponder_C_Expert;
    private javax.swing.JButton btResponder_D_Desafio;
    private javax.swing.JButton btResponder_D_Exercicios;
    private javax.swing.JButton btResponder_D_Expert;
    private javax.swing.JButton btResponder_E_Desafio;
    private javax.swing.JButton btResponder_E_Exercicios;
    private javax.swing.JButton btResponder_E_Expert;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jp_Desafios;
    private javax.swing.JPanel jp_Exercicios;
    private javax.swing.JPanel jp_Expert;
    public javax.swing.JPanel jp_Letras_das_Respostas_Desafios;
    public javax.swing.JPanel jp_Letras_das_Respostas_Exercicios;
    public javax.swing.JPanel jp_Letras_das_Respostas_Expert;
    private javax.swing.JLabel lbNok_Desafios;
    private javax.swing.JLabel lbNok_Exercicios;
    private javax.swing.JLabel lbNok_Expert;
    private javax.swing.JLabel lbOk_Desafios;
    private javax.swing.JLabel lbOk_Exercicios;
    private javax.swing.JLabel lbOk_Expert;
    public javax.swing.JLabel lb_Reiniciar_Desafios;
    public javax.swing.JLabel lb_Reiniciar_Exercicios;
    public javax.swing.JLabel lb_Reiniciar_Expert;
    public javax.swing.JLabel lb_Status_Resposta_Desafios;
    public javax.swing.JLabel lb_Status_Resposta_Exercicios;
    public javax.swing.JLabel lb_Status_Resposta_Expert;
    public javax.swing.JLabel lb_titulo_do_assunto;
    private javax.swing.JMenu menu_Ajuda;
    private javax.swing.JMenu menu_Conteudo;
    private javax.swing.JMenuItem mi_Unidade_01;
    private javax.swing.JMenuItem mi_Unidade_02;
    private javax.swing.JMenuItem mi_Unidade_03;
    private javax.swing.JMenuItem mi_Unidade_04;
    private javax.swing.JMenuItem mi_Unidade_5;
    private javax.swing.JMenuItem mi_Unidade_6;
    private javax.swing.JMenuItem mi_Unidade_7;
    private javax.swing.JMenuItem mi_Unidade_8;
    public javax.swing.JTabbedPane tabAssunto;
    public javax.swing.JTabbedPane tabDesafios;
    public javax.swing.JTabbedPane tabExercicios;
    public javax.swing.JTabbedPane tabExpert;
    // End of variables declaration//GEN-END:variables
    
// EXERCÍCIOS - VERIFICAR RESPOSTA DO USUÁRIO 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    private void verificar_resposta_exercicios(String resposta_do_usuario){
        
        /*new Thread() {   @Override public void run() {*/ try { //Thread.sleep( 1 ); 
            
            jp_Letras_das_Respostas_Exercicios.setVisible(false);
            
            if( resposta_correta_do_exercicio_atual.trim().equalsIgnoreCase( resposta_do_usuario.trim() ) ){
                
                adicionar_Acerto_do_Exercicio();
                
                //jLabel1.setVisible(true);
                lb_Status_Resposta_Exercicios.setText( "Resposta Correta: " + resposta_do_usuario + " - Parabéns"  );
                
                new Thread() {   @Override public void run() { try { //Thread.sleep( 1 ); 
                    Tocar.javazoom( "/Sons/acerto.mp3" );
                } catch( Exception e ){ } } }.start();
            }
            else {
                
                adicionar_Erro_do_Exercicio();
                
                //jLabel1.setVisible(true);
                lb_Status_Resposta_Exercicios.setText("Resposta Incorreta: " + resposta_do_usuario + " - A correta é a: " + resposta_correta_do_exercicio_atual );
                                 
                new Thread() {   @Override public void run() { try { //Thread.sleep( 1 ); 
                    Tocar.javazoom( "/Sons/erro.mp3" );
                } catch( Exception e ){ } } }.start();
            }            
            
        } catch( Exception e ){ } //} }.start();
    }
    
    public void adicionar_Acerto_do_Exercicio(){
        
        new Thread() {   @Override public void run() { try {
            
            int a = Integer.parseInt(lbOk_Exercicios.getText().trim() ) + 1;
            
            lbOk_Exercicios.setText( String.valueOf(a) );
                        
        } catch( Exception e ){ } } }.start();
    }
    
    public void adicionar_Erro_do_Exercicio(){
        
        new Thread() {   @Override public void run() { try {
            
            int e = Integer.parseInt(lbNok_Exercicios.getText().trim() ) + 1;
            
            lbNok_Exercicios.setText( String.valueOf(e) );
                        
        } catch( Exception e ){ } } }.start();
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    
// DESAFIOS - VERIFICAR RESPOSTA DO USUÁRIO 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    private void verificar_resposta_desafios(String resposta_do_usuario){
        
        /*new Thread() {   @Override public void run() {*/ try { //Thread.sleep( 1 ); 
            
            jp_Letras_das_Respostas_Desafios.setVisible(false);
            
            if( resposta_correta_do_desafio_atual.trim().equalsIgnoreCase( resposta_do_usuario.trim() ) ){
                
                adicionar_Acerto_do_desafio();
                
                //jLabel1.setVisible(true);
                lb_Status_Resposta_Desafios.setText( "Resposta Correta: " + resposta_do_usuario + " - Parabéns"  );
                
                new Thread() {   @Override public void run() { try { //Thread.sleep( 1 ); 
                    Tocar.javazoom( "/Sons/acerto.mp3" );
                } catch( Exception e ){ } } }.start();
            }
            else {
                
                adicionar_Erro_do_desafio();
                
                //jLabel1.setVisible(true);
                lb_Status_Resposta_Desafios.setText("Resposta Incorreta: " + resposta_do_usuario + " - A correta é a: " + resposta_correta_do_desafio_atual );
                                 
                new Thread() {   @Override public void run() { try { //Thread.sleep( 1 ); 
                    Tocar.javazoom( "/Sons/erro.mp3" );
                } catch( Exception e ){ } } }.start();
            }            
            
        } catch( Exception e ){ } //} }.start();
    }
    
    public void adicionar_Acerto_do_desafio(){
        
        new Thread() {   @Override public void run() { try {
            
            int a = Integer.parseInt(lbOk_Desafios.getText().trim() ) + 1;
            
            lbOk_Desafios.setText( String.valueOf(a) );
                        
        } catch( Exception e ){ } } }.start();
    }
    
    public void adicionar_Erro_do_desafio(){
        
        new Thread() {   @Override public void run() { try {
            
            int e = Integer.parseInt(lbNok_Desafios.getText().trim() ) + 1;
            
            lbNok_Desafios.setText( String.valueOf(e) );
                        
        } catch( Exception e ){ } } }.start();
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
   
// EXPERT - VERIFICAR RESPOSTA DO USUÁRIO 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    private void verificar_resposta_expert(String resposta_do_usuario){
        
        /*new Thread() {   @Override public void run() {*/ try { //Thread.sleep( 1 ); 
            
            jp_Letras_das_Respostas_Expert.setVisible(false);
            
            if( resposta_correta_do_expert_atual.trim().equalsIgnoreCase( resposta_do_usuario.trim() ) ){
                
                adicionar_Acerto_do_expert();
                
                //jLabel1.setVisible(true);
                lb_Status_Resposta_Expert.setText( "Resposta Correta: " + resposta_do_usuario + " - Parabéns"  );
                
                new Thread() {   @Override public void run() { try { //Thread.sleep( 1 ); 
                    Tocar.javazoom( "/Sons/acerto.mp3" );
                } catch( Exception e ){ } } }.start();
            }
            else {
                
                adicionar_Erro_do_expert();
                
                //jLabel1.setVisible(true);
                lb_Status_Resposta_Expert.setText("Resposta Incorreta: " + resposta_do_usuario + " - A correta é a: " + resposta_correta_do_expert_atual );
                                 
                new Thread() {   @Override public void run() { try { //Thread.sleep( 1 ); 
                    Tocar.javazoom( "/Sons/erro.mp3" );
                } catch( Exception e ){ } } }.start();
            }            
            
        } catch( Exception e ){ } //} }.start();
    }
    
    public void adicionar_Acerto_do_expert(){
        
        new Thread() {   @Override public void run() { try {
            
            int a = Integer.parseInt(lbOk_Expert.getText().trim() ) + 1;
            
            lbOk_Expert.setText( String.valueOf(a) );
                        
        } catch( Exception e ){ } } }.start();
    }
    
    public void adicionar_Erro_do_expert(){
        
        new Thread() {   @Override public void run() { try {
            
            int e = Integer.parseInt(lbNok_Expert.getText().trim() ) + 1;
            
            lbNok_Expert.setText( String.valueOf(e) );
                        
        } catch( Exception e ){ } } }.start();
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
      
    
}