import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

public class Questoes extends JFrame  implements ItemListener{
    public JRadioButton alternativa01, alternativa02, alternativa03, alternativa04;
    public JLabel pergunta, imagem;
    public ButtonGroup radioGroup;
    public JPanel painel1, painel2;

    public Questoes(){

        setTitle("Questões");
        setSize(400,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(178,178,255));

        pergunta = new JLabel("Qual o animal:");
        imagem = new JLabel("imagem");

        painel1 = new JPanel();         painel2 = new JPanel();

        alternativa01 = new JRadioButton("alternativa 01");
        alternativa02 = new JRadioButton("alternativa 02");
        alternativa03 = new JRadioButton("alternativa 03");
        alternativa04 = new JRadioButton("alternativa 04");

        alternativa01.setMnemonic(KeyEvent.VK_1);
        alternativa02.setMnemonic(KeyEvent.VK_2);
        alternativa03.setMnemonic(KeyEvent.VK_3);
        alternativa04.setMnemonic(KeyEvent.VK_4);

        radioGroup = new ButtonGroup();

        radioGroup.add(alternativa01); alternativa01.addItemListener(this);
        radioGroup.add(alternativa02); alternativa02.addItemListener(this);
        radioGroup.add(alternativa03); alternativa03.addItemListener(this);
        radioGroup.add(alternativa04); alternativa04.addItemListener(this);

        painel1.setLayout(new FlowLayout(FlowLayout.RIGHT));
        painel1.setBackground(new Color(200,200,200));

        painel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        painel2.setBackground(new Color(200,200,200));


        painel1.add(alternativa01);
        painel1.add(alternativa02);
        painel1.add(alternativa03);
        painel1.add(alternativa04);

        painel2.add(pergunta);
        painel2.add(imagem);


        getContentPane().add(painel1);
        getContentPane().add(painel2);


    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
