import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {

    public JLabel texto;
    public JButton botaoJogar, botaoSobre;
    public static String nome;

    public Menu(){

        // Montando Interface
        setTitle("Menu");
        setSize(400,400);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(new Color(178, 178,255));

        //Montando os Componentes e posicionando na tela
        texto = new JLabel("Quiz");
        texto.setBounds(150,50,400,50);
        texto.setFont( new Font("Arial",Font.BOLD,40));

        botaoJogar = new JButton("Jogar");
        botaoJogar.setBounds(100,150,200,50);
        botaoJogar.setBackground(new Color(75, 235, 29));

        botaoSobre = new JButton("Sobre");
        botaoSobre.setBounds(100,250,200,50);
        botaoSobre.setBackground(new Color(0xEFB62A));

        //Adicionando os componentes na tela
        getContentPane().setLayout(null);
        getContentPane().add(texto);
        getContentPane().add(botaoJogar);
        getContentPane().add(botaoSobre);

        //Dando ações para os botões
        botaoJogar.addActionListener(this);
        botaoSobre.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoJogar){
            nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
            if(nome == null || nome.length() <= 0){
                nome = "Player";
            }
            Carregamento loading = new Carregamento();
            this.dispose();
            loading.setVisible(true);
        }
        else if (e.getSource() == botaoSobre){
            Sobre about = new Sobre();
            this.dispose();
            about.setVisible(true);
        }
    }
}
