import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pontuacao extends JFrame implements ActionListener {
    JLabel titulo, acertos, erros, nome;
    JButton botaoVoltar, botaoRanking;
    Menu menu = new Menu();
    public Pontuacao(){

        setTitle("Pontuação");
        setSize(400,400);
        setResizable(false);
        getContentPane().setBackground(new Color(178, 178,255));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        titulo = new JLabel("Pontuação");
        titulo.setBounds(150, 50, 200, 50);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));

        nome = new JLabel("Nome do jogador: " + menu.nome);
        nome.setBounds(50, 110, 200, 50);
        nome.setFont(new Font("Arial", Font.BOLD, 13));

        acertos = new JLabel("Total de acertos: ");
        acertos.setBounds(50, 150, 200, 50);
        acertos.setFont(new Font("Arial", Font.BOLD, 13));

        erros = new JLabel("Total de erros: ");
        erros.setBounds(50, 190, 200, 50);
        erros.setFont(new Font("Arial", Font.BOLD, 13));

        botaoRanking = new JButton("Ranking");
        botaoRanking.setBounds(50,280,100,40);
        botaoRanking.setBackground(new Color(75, 235, 29));

        botaoVoltar = new JButton("Voltar");
        botaoVoltar.setBounds(250,280,100,40);
        botaoVoltar.setBackground(new Color(0xEFB62A));

        getContentPane().setLayout(null);
        getContentPane().add(titulo);
        getContentPane().add(nome);
        getContentPane().add(acertos);
        getContentPane().add(erros);
        getContentPane().add(botaoVoltar);
        getContentPane().add(botaoRanking);

        botaoVoltar.addActionListener(this);
        botaoRanking.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botaoVoltar){
            Menu menu = new Menu();
            this.dispose();
            menu.setVisible(true);
        }
    }
}
