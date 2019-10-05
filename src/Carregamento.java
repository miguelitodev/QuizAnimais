// Importando
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Abrindo a Classe
public class Carregamento extends JFrame{
    // Instanciando os objetos
    public JLabel apoioBarra, texto,gif;
    public JProgressBar barra;

    public Carregamento(){

        //Montando a tela
        setTitle("Inicializando..");
        setResizable(false);
        setSize(400,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(178, 178,255));

        // Montando os componentes
        apoioBarra = new JLabel("apoioBarra");
        apoioBarra.setBounds(70,20,250,250);
        ImageIcon icon = new ImageIcon(getClass().getResource("img/carregando.gif"));
        apoioBarra.setIcon(icon);

        texto = new JLabel("");
        texto.setBounds(120,250,200,50);

        barra = new JProgressBar(0,100);
        barra.setBounds(170,150,0,50);

        // Adicionando os componentes a tela
        getContentPane().setLayout(null);
        getContentPane().add(apoioBarra);
        getContentPane().add(barra);
        getContentPane().add(texto);

        // Iniciando o Thread
        new Thread(new carregar()).start();
    }

    public class carregar implements Runnable{
        // Configurando o thread
        public void run(){
            for (int i = 0; i < 101; i++){
                try{
                    Thread.sleep(100);
                    barra.setValue(i);
                    if (barra.getValue() <= 50){
                        texto.setText("Carregando Perguntas..");
                    }
                    else if (barra.getValue() <= 70){
                        texto.setText("Carregando Banco de dados..");
                    }
                    else if (barra.getValue() <= 90){
                        texto.setText("Preparando Ambiente..");
                    }
                    else{
                        texto.setText("Pronto!!");
                    }
                }
                catch (Exception erro){
                    JOptionPane.showMessageDialog(null, erro);
                }
            }
            Questoes quest = new Questoes();
            Carregamento.this.dispose();
            quest.setVisible(true);
        }
    }



}
