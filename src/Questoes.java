import javax.swing.*;
import java.awt.*;

public class Questoes extends JFrame {
    public JRadioButton alternativa01, alternativa02, alternativa03, alternativa04;
    public JLabel pergunta, imagem;
    public JButton botaoPronto;
    public int valor = 0;
    public Questoes(){

        setTitle("Questões");
        setSize(400,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(178,178,255));

        pergunta = new JLabel("Qual é esse animal:");
        pergunta.setBounds(140,200,200,50);

        imagem = new JLabel("Zebra");

        getContentPane().add(imagem);
        getContentPane().setLayout(null);
        getContentPane().add(pergunta);
    }
}
