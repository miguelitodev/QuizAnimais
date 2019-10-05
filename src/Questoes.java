// Importando
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Abrindo a classe
public class Questoes extends JFrame implements ItemListener, ActionListener {

    //Instanciando os objetos
    public JRadioButton alternativa01, alternativa02, alternativa03, alternativa04, alternativa05;
    public JLabel pergunta, imagem;
    public ButtonGroup radioGroup;
    public JButton botaoPronto;
    int i = 0;
    public static int acertos = 0;

    // Chamou a classe
    public Questoes(){

        //Criando a tela
        setTitle("Quest�es");
        setSize(400,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(178,178,255));

        //Configurando e posicionando os objetos/componentes
        imagem = new JLabel("");
        imagem.setBounds(125, 30, 128, 128);
        imagem.setIcon(new ImageIcon("img/Baleia.jpg"));

        pergunta = new JLabel("Qual o animal da imagem?");
        pergunta.setBounds(100, 185, 200, 20);

        alternativa01 = new JRadioButton("Lemure");
        alternativa01.setBounds(100, 220, 200, 20);
        alternativa01.setBackground(new Color(178,178,255));
        alternativa01.setMnemonic(KeyEvent.VK_1);

        alternativa02 = new JRadioButton("Tigre");
        alternativa02.setBounds(100, 240, 200, 20);
        alternativa02.setBackground(new Color(178,178,255));
        alternativa02.setMnemonic(KeyEvent.VK_2);

        alternativa03 = new JRadioButton("Baleia");
        alternativa03.setBounds(100, 260, 200, 20);
        alternativa03.setBackground(new Color(178,178,255));
        alternativa03.setMnemonic(KeyEvent.VK_3);

        alternativa04 = new JRadioButton("Tubar�o");
        alternativa04.setBounds(100, 280, 200, 20);
        alternativa04.setBackground(new Color(178,178,255));
        alternativa04.setMnemonic(KeyEvent.VK_4);

        alternativa05 = new JRadioButton("Golfinho");
        alternativa05.setBounds(100, 300, 200, 20);
        alternativa05.setBackground(new Color(178,178,255));
        alternativa05.setMnemonic(KeyEvent.VK_5);

        botaoPronto = new JButton("Pronto");
        botaoPronto.setBounds(120,330,150,30);
        botaoPronto.setBackground(new Color(75, 235, 29));

        // Adicionando os botoes ao radioGroup
        radioGroup = new ButtonGroup();
        radioGroup.add(alternativa01);
        radioGroup.add(alternativa02);
        radioGroup.add(alternativa03);
        radioGroup.add(alternativa04);
        radioGroup.add(alternativa05);

        // Dando acao para os botoes
        alternativa01.addItemListener(this);
        alternativa02.addItemListener(this);
        alternativa03.addItemListener(this);
        alternativa04.addItemListener(this);
        alternativa05.addItemListener(this);
        botaoPronto.addActionListener(this);

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
        // Determinando as acoes dos botoes
        if(i == 0 && alternativa03.isSelected()){
            acertos++;
        }
        else if(i == 1 && alternativa05.isSelected()){
            acertos++;
        }
        else if(i == 2 && alternativa01.isSelected()){
            acertos++;
        }
        else if(i == 3 && alternativa04.isSelected()){
            acertos++;
        }
        else if(i == 4 && alternativa03.isSelected()){
            acertos++;
        }
        else if(i == 5 && alternativa02.isSelected()){
            acertos++;
        }
        else if(i == 6 && alternativa04.isSelected()){
            acertos++;
        }
        else if(i == 7 && alternativa05.isSelected()){
            acertos++;
        }
        else if(i == 8 && alternativa03.isSelected()){
            acertos++;
        }
        else if(i == 9 && alternativa05.isSelected()){
            acertos++;
        }
        else{
            acertos = acertos;
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // Determinando as acoes dos botoes
        i++;
        radioGroup.clearSelection();

        if(i == 1) {
            imagem.setIcon(new ImageIcon("img/CavaloMarinho.jpg"));
            alternativa01.setText("Iguana");
            alternativa02.setText("Cavalo");
            alternativa03.setText("Cobra");
            alternativa04.setText("Iguana");
            alternativa05.setText("Cavalo Marinho");
        }
        else if (i == 2){
            imagem.setIcon(new ImageIcon("img/Coala.jpg"));
            alternativa01.setText("Coala");
            alternativa02.setText("Coelho");
            alternativa03.setText("Carneiro");
            alternativa04.setText("Jabuti");
            alternativa05.setText("Lontra");
        }
        else if (i == 3){
            imagem.setIcon(new ImageIcon("img/Lemure.jpg"));
            alternativa01.setText("Cachorro");
            alternativa02.setText("Tamandua");
            alternativa03.setText("Cobra");
            alternativa04.setText("Lemure");
            alternativa05.setText("Sapo");
        }
        else if (i == 4){
            imagem.setIcon(new ImageIcon("img/Leao.jpg"));
            alternativa01.setText("Gato");
            alternativa02.setText("Cavalo");
            alternativa03.setText("Le�o");
            alternativa04.setText("On�a");
            alternativa05.setText("Lemure");
        }
        else if (i == 5){
            imagem.setIcon(new ImageIcon("img/Elefante.jpg"));
            alternativa01.setText("Cabra");
            alternativa02.setText("Elefante");
            alternativa03.setText("Cobra");
            alternativa04.setText("Iguana");
            alternativa05.setText("Cavalo Marinho");
        }
        else if (i == 6){
            imagem.setIcon(new ImageIcon("img/Tigre.jpg"));
            alternativa01.setText("Iguana");
            alternativa02.setText("Cavalo Marinho");
            alternativa03.setText("Tartaruga");
            alternativa04.setText("Tigre");
            alternativa05.setText("Zebra");
        }
        else if (i == 7){
            imagem.setIcon(new ImageIcon("img/Tamandua.jpg"));
            alternativa01.setText("Cabra");
            alternativa02.setText("Leao");
            alternativa03.setText("Lontra");
            alternativa04.setText("Lemure");
            alternativa05.setText("Tamandua");
        }
        else if (i == 8){
            imagem.setIcon(new ImageIcon("img/Tartaruga.jpg"));
            alternativa01.setText("Sapo");
            alternativa02.setText("Cobra");
            alternativa03.setText("Tartaruga");
            alternativa04.setText("Cachorro");
            alternativa05.setText("Cavalo");
        }
        else if(i == 9){
            imagem.setIcon(new ImageIcon("img/Urso.jpg"));
            alternativa01.setText("Iguana");
            alternativa02.setText("Cavalo");
            alternativa03.setText("Cobra");
            alternativa04.setText("Iguana");
            alternativa05.setText("Urso");


        }else{
            System.out.println(acertos);
            botaoPronto.setText("Pronto");
            Questoes.this.dispose();
            Pontuacao pontuacao = new Pontuacao();
            pontuacao.setVisible(true);
        }
    }

}
