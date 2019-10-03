import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

public class Questoes extends JFrame implements ItemListener {

    ImageIcon img = new ImageIcon("../img/Zebra.jgp");

    //Instanciando os objetos
    public JRadioButton alternativa01, alternativa02, alternativa03, alternativa04, alternativa05;
    public JLabel pergunta, imagem;
    public ButtonGroup radioGroup;
    public JButton botaoPronto;

    public Questoes(){

        //Criando a tela
        setTitle("Questões");
        setSize(400,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(178,178,255));

        //Configurando e posicionando os objetos/componentes
        imagem = new JLabel("");
        imagem.setBounds(125, 30, 128, 128);
        imagem.setIcon(new ImageIcon("img/CavaloMarinho.jpg"));

        pergunta = new JLabel("Qual o animal da imagem?");
        pergunta.setBounds(100, 185, 200, 20);

        alternativa01 = new JRadioButton("alternativa 01");
        alternativa01.setBounds(100, 220, 200, 20);
        alternativa01.setBackground(new Color(178,178,255));
        alternativa01.setMnemonic(KeyEvent.VK_1);

        alternativa02 = new JRadioButton("alternativa 02");
        alternativa02.setBounds(100, 240, 200, 20);
        alternativa02.setBackground(new Color(178,178,255));
        alternativa02.setMnemonic(KeyEvent.VK_2);

        alternativa03 = new JRadioButton("alternativa 03");
        alternativa03.setBounds(100, 260, 200, 20);
        alternativa03.setBackground(new Color(178,178,255));
        alternativa03.setMnemonic(KeyEvent.VK_3);

        alternativa04 = new JRadioButton("alternativa 04");
        alternativa04.setBounds(100, 280, 200, 20);
        alternativa04.setBackground(new Color(178,178,255));
        alternativa04.setMnemonic(KeyEvent.VK_4);

        alternativa05 = new JRadioButton("alternativa 05");
        alternativa05.setBounds(100, 300, 200, 20);
        alternativa05.setBackground(new Color(178,178,255));
        alternativa05.setMnemonic(KeyEvent.VK_5);

        botaoPronto = new JButton("Pronto");
        botaoPronto.setBounds(120,330,150,30);
        botaoPronto.setBackground(new Color(75, 235, 29));

        radioGroup = new ButtonGroup();
        radioGroup.add(alternativa01);
        radioGroup.add(alternativa02);
        radioGroup.add(alternativa03);
        radioGroup.add(alternativa04);
        radioGroup.add(alternativa05);

        alternativa01.addItemListener(this);
        alternativa02.addItemListener(this);
        alternativa03.addItemListener(this);
        alternativa04.addItemListener(this);
        alternativa05.addItemListener(this);
        botaoPronto.addItemListener(this);

        // COlocando na tela os objetos/componentes
        getContentPane().setLayout(null);
        getContentPane().add(imagem);
        getContentPane().add(pergunta);
        getContentPane().add(alternativa01);
        getContentPane().add(alternativa02);
        getContentPane().add(alternativa03);
        getContentPane().add(alternativa04);
        getContentPane().add(alternativa05);
        getContentPane().add(botaoPronto);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
