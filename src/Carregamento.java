import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Carregamento extends JFrame{

    public JLabel apoioBarra, texto;
    public JProgressBar barra;
    //public int valor = 0;
    //public JButton botaoJogar;

    public Carregamento(){

        //Montando a tela
        setTitle("Inicializando..");
        setResizable(false);
        setSize(400,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(178, 178,255));

        apoioBarra = new JLabel("");
        apoioBarra.setBounds(80,0,256,256);
        apoioBarra.setIcon(new ImageIcon("img/loading.gif"));

        texto = new JLabel("");
        texto.setBounds(110,250,250,50);


        //botaoJogar = new JButton("Jogar");
        //botaoJogar.setBounds(150,350,200,50);

        barra = new JProgressBar(0,100);
        barra.setBounds(150,150,0,50);

        getContentPane().setLayout(null);
        getContentPane().add(apoioBarra);
        getContentPane().add(barra);
        getContentPane().add(texto);
        //getContentPane().add(botaoJogar);

        new Thread(new carregar()).start();
    }


    public class carregar implements Runnable{
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
                        //valor = 1;
                        //JOptionPane.showMessageDialog(null, "valor = "+valor);
                    }
                }
                catch (Exception erro){
                    JOptionPane.showMessageDialog(null, erro);
                }
            }
            Questoes quest = new Questoes();
            //Menu menu = new Menu();
            Carregamento.this.dispose();
            //menu.setVisible(true);
            quest.setVisible(true);
        }
    }



}
