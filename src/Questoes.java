import javax.swing.*;
import java.awt.*;

public class Questoes extends JFrame{

    ImageIcon img = new ImageIcon("../img/Zebra.jgp");

    //Instanciando os objetos
    public JRadioButton alternativa01, alternativa02, alternativa03, alternativa04;
    public JLabel pergunta, imagem;

    public Questoes(){

        //Criando a tela
        setTitle("Questões");
        setSize(400,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(178,178,255));

        //Configurando e posicionando os objetos/componentes
        imagem = new JLabel("imagem");
        //imagem = new JLabel(imagem.setIcon(img));
        imagem.setBounds(0, 0, 256, 256);

        pergunta = new JLabel("Qual o animal da imagem?");
        pergunta.setBounds(100, 200, 200, 20);

        alternativa01 = new JRadioButton("alternativa 01");
        alternativa01.setBounds(100, 225, 200, 20);
        alternativa01.setBackground(new Color(178,178,255));

        alternativa02 = new JRadioButton("alternativa 02");
        alternativa02.setBounds(100, 250, 200, 20);
        alternativa02.setBackground(new Color(178,178,255));

        alternativa03 = new JRadioButton("alternativa 03");
        alternativa03.setBounds(100, 275, 200, 20);
        alternativa03.setBackground(new Color(178,178,255));

        alternativa04 = new JRadioButton("alternativa 04");
        alternativa04.setBounds(100, 300, 200, 20);
        alternativa04.setBackground(new Color(178,178,255));

        // COlocando na tela os objetos/componentes
        getContentPane().setLayout(null);
        getContentPane().add(imagem);
        getContentPane().add(pergunta);
        getContentPane().add(alternativa01);
        getContentPane().add(alternativa02);
        getContentPane().add(alternativa03);
        getContentPane().add(alternativa04);
    }
}
