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
import javax.swing.JTabbedPane;

/**
 *
 * @author Ariel Arcanjo
 */
public class Adicionar_Assunto_Html_Externo_Do_Jar {
    
    String s = System.getProperty("file.separator");
    String internalStorageDir = System.getProperty("user.dir");    
    
    List<String> listaDosArquivos = new ArrayList<String>();
    
    JTabbedPane tabAssunto_Recebido;
    String nome_do_pacote_endereco_Iterno_Do_Assunto = "";
    Class Classe_Das_Imagens;
    int img_Atual;
        
    String nome_do_arquivo_gerado = "zz_assunto_html_exportado";
    String nome_da_pasta_das_imagens = "zz_assunto_html_exportado_imagens";
    
    int contador = 1;
    
    int largura = 0;
    int altura = 0;
    
    String titulo_do_assunto = "";
   
    Exportando Exportando;
    public Adicionar_Assunto_Html_Externo_Do_Jar( int contador2, String titulo_do_assunto2, JTabbedPane tabAssunto_Recebido2, Class Classe_Das_Imagens2, int img_Atual2, String nome_do_pacote_endereco_Iterno_Do_Assunto2, int largura2, int altura2 ) {                            
        
        tabAssunto_Recebido = tabAssunto_Recebido2;
        nome_do_pacote_endereco_Iterno_Do_Assunto = nome_do_pacote_endereco_Iterno_Do_Assunto2;
        Classe_Das_Imagens = Classe_Das_Imagens2;
        img_Atual = img_Atual2;
        contador = contador2;
        largura = largura2;
        altura = altura2;
        titulo_do_assunto = titulo_do_assunto2;
        
        setarPastaInicio( img_Atual2 );
        
        new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
                        
            Exportando = new Exportando("Gerando HTML...");
            Exportando.setVisible(true);Exportando.pbg.setMinimum(0);
            Exportando.pbg.setMaximum( listaDosArquivos.size() );
            //Exportando.pbg.setValue( 50 );
                        
            // Endereço do Arquivo
            String endereco_arquivo_html = internalStorageDir + s + nome_do_arquivo_gerado + ".html";
            // Criar arquivo
            File file = new File( endereco_arquivo_html );
            // Se o arquivo nao existir, ele gera
            if (!file.exists()) {
                // Se o Arquivo não existir este método criar o arquivo
                //Arquivo_Ou_Pasta.criar_Arquivo_Iso_Boo_Tipo_UTFISO( endereco_arquivo, "", "UTF-8");  
                file.createNewFile();
            }
            else{
                
                // Se o Arquivo existir este método deleta o arquivo
                Arquivo_Ou_Pasta.deletar( new File( endereco_arquivo_html ) );
                
                // Após deletar o arquivo este método criar o arquivo novamente
                //Arquivo_Ou_Pasta.criar_Arquivo_Iso_Boo_Tipo_UTFISO( endereco_arquivo, "", "UTF-8");  
                file.createNewFile();
            }
            
            // Endereço do Arquivo
            String endereco_pasta_imagens = internalStorageDir + s + nome_da_pasta_das_imagens;
            // Criar pasta
            File pasta = new File( endereco_pasta_imagens );
            // Se a pasta nao existir, ele gera
            if (!pasta.exists()) {
                // Se a pasta não existir este método criar o arquivo
                Arquivo_Ou_Pasta.criarPasta( internalStorageDir, nome_da_pasta_das_imagens );   
            }
            else{
                
                // Se a pasta existir este método deleta a pasta
                Arquivo_Ou_Pasta.deletar( new File( endereco_pasta_imagens ) ); 
                
                // Se a pasta não existir este método criar o arquivo
                Arquivo_Ou_Pasta.criarPasta( internalStorageDir, nome_da_pasta_das_imagens );   
            }
            
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, "<html>" );
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, "<head>" );
            
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, "<title>" );
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, titulo_do_assunto );
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, "</title>" );
            
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, "<style>" );
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, "body { -webkit-print-color-adjust: exact; }" );
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, "</style>" );
            
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, "</head>" );
            
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, "<body>" );
            
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, "   <table border='0' cellpadding='0' cellspacing='0' style='width: 100%; padding: 0px; margin: 0px;' >  " );
             
            for(int i = 0; i < listaDosArquivos.size(); i++ ){
                Exportando.pbg.setValue( i );
                
                //String str = Classe_Das_Imagens.getResource( listaDosArquivos.get( i ) ).getPath();
                //String str = Classe_Das_Imagens.getResource( listaDosArquivos.get( i ) ).toURI().toString();
                //String str = Classe_Das_Imagens.getResource( listaDosArquivos.get( i ) ).getFile();
                //System.out.println( str );
                
                //Arquivo_Ou_Pasta.copiarArquivoDoJar( Classe_Das_Imagens, listaDosArquivos.get( i ), endereco_pasta );
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
                BufferedImage bufImg = null;
                    ImageIcon     icon   = null;
                    Image         image  = null;
                    try{
                        bufImg = ImageIO.read(Classe_Das_Imagens.getResource( listaDosArquivos.get( i ) ) );
                        icon   = new ImageIcon(bufImg);
                        image  = icon.getImage();//ImageIO.read(f);  
                    } catch (IOException ex) {}  

                    try {  
                        image = icon.getImage();//ImageIO.read(f);  
                        int widith = image.getWidth(icon.getImageObserver() ) + largura;
                        int height = image.getHeight(icon.getImageObserver() )+ altura;
                        /*                                                
                        lbConteudo_Online.setIcon(new ImageIcon(image.getScaledInstance(
                            widith, height, Image.SCALE_DEFAULT)));
                        */
                    }catch(Exception ex){}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
                File f = new File( listaDosArquivos.get( i ) );
                String nome = f.getName();
                String nomeList[] = nome.split(Pattern.quote("."));
                ImageIO.write( bufImg, nomeList[1], new File( endereco_pasta_imagens + s + nome ) );

                Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, 
                    "<tr>" +
                        " <td align='center'> " +
                            " <img src = '" + nome_da_pasta_das_imagens + "/" + listaDosArquivos.get( i ) + "' >" +
                        "</td>" +    
                    "</tr>"
                );
            }
            
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, "</table>" );
                        
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, "</body>" );
            Arquivo_Ou_Pasta.escrever_Em_Arquivo_Boo( endereco_arquivo_html, "</html>" );
                       
            ////////////////////////////////////////////////////////////////////
            java.awt.Desktop.getDesktop().open( new File( endereco_arquivo_html ) );
            ////////////////////////////////////////////////////////////////////
            
            /*
            HtmlPrincipal HtmlPrincipal = new HtmlPrincipal();
            try{
                
                if( new File( endereco_arquivo_html ).exists() == true ){
                    
                    HtmlPrincipal.htmlPanePrincipal.setPage( new File(endereco_arquivo_html).toURI().toURL() );
                    Class<Imagens_Internas> clazzHome = null;
                    ImageIcon icon = null;
                    try{ 
                        clazzHome = Imagens_Internas.class;
                        icon = new ImageIcon( clazzHome.getResource("16_chrome.png") );
                    }catch( Exception e ){} 
                    
                    int count = tabAssunto_Recebido2.getTabCount();
                    for (int i=0; i<count; i++) {
                        
                        String titulo = tabAssunto_Recebido2.getTitleAt(i).trim();
                        
                        if( titulo.equalsIgnoreCase("Html") == true ){
                            
                            tabAssunto_Recebido2.remove(i);
                        }
                    }
                    
                    tabAssunto_Recebido2.addTab( " " + contador + " Html ", icon, HtmlPrincipal );  
                }
                
            }catch( Exception e ){ }
            */
            
            //Exportando.fechar();
        } catch( Exception e ){ 

            new Thread() {   @Override public void run() { try { //Thread.sleep( 1 );
                
                if( contador < 5 ){
                    
                    contador+=1;
                    int novo_contador = contador;

                    Adicionar_Assunto_Html_Externo_Do_Jar ADD = new Adicionar_Assunto_Html_Externo_Do_Jar( novo_contador, titulo_do_assunto, tabAssunto_Recebido, Classe_Das_Imagens, img_Atual, nome_do_pacote_endereco_Iterno_Do_Assunto, 0, 0 );

                }
            } catch( Exception e ){ } } }.start();
            
            e.printStackTrace(); 
        } finally{
            Exportando.fechar(); 
        } } }.start();
    }
    
    
    
    
    
    
    
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
        } catch( Exception e ){ } 
    }
    
}
