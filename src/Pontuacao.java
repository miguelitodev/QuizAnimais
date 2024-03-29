// Importando
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Abrindo a Classe
public class Pontuacao extends JFrame implements ActionListener {
    //Instanciando os objetos
    JLabel titulo, acertos, erros, nome;
    JButton botaoVoltar, botaoSair;
    Menu menu = new Menu();
    Questoes quest = new Questoes();

    // Chamando a classe
    public Pontuacao(){

        // Criando a Tela
        setTitle("Pontua��o");
        setSize(400,400);
        setResizable(false);
        getContentPane().setBackground(new Color(178, 178,255));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //Criando os componentes
        titulo = new JLabel("Pontua��o");
        titulo.setBounds(150, 50, 200, 50);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));

        nome = new JLabel("Nome do jogador: " + menu.nome);
        nome.setBounds(50, 110, 200, 50);
        nome.setFont(new Font("Arial", Font.BOLD, 13));

        acertos = new JLabel("Total de acertos: " + quest.acertos);
        acertos.setBounds(50, 150, 200, 50);
        acertos.setFont(new Font("Arial", Font.BOLD, 13));

        erros = new JLabel("Total de erros: " + (10 - quest.acertos));
        erros.setBounds(50, 190, 200, 50);
        erros.setFont(new Font("Arial", Font.BOLD, 13));

        botaoVoltar = new JButton("Voltar");
        botaoVoltar.setBounds(50,280,100,40);
        botaoVoltar.setBackground(new Color(75, 235, 29));

        botaoSair = new JButton("Sair");
        botaoSair.setBounds(250,280,100,40);
        botaoSair.setBackground(new Color(0xEFB62A));

        // Adicionando os componentes a tela
        getContentPane().setLayout(null);
        getContentPane().add(titulo);
        getContentPane().add(nome);
        getContentPane().add(acertos);
        getContentPane().add(erros);
        getContentPane().add(botaoVoltar);
        getContentPane().add(botaoSair);

        // Dando acao para os botoes
        botaoVoltar.addActionListener(this);
        botaoSair.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Determinando as acoes dos botoes
        if(e.getSource() == botaoVoltar){
            Menu menu = new Menu();
            Pontuacao.this.dispose();
            menu.setVisible(true);

        }
        else if(e.getSource() == botaoSair){
            System.exit(0);
        }
    }
}
