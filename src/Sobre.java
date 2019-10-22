// Importando
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Abrindo a classe
public class Sobre extends JFrame implements ActionListener {

    //Criando os objetos
    public  JLabel titulo, integranteMarcos, integranteMiguel, integranteNicolas, integranteTabata, sala, ano;
    public  JButton voltar, devs;

    // Montando a classe
    public Sobre(){

        //Montando a tela
        setTitle("Sobre");
        setSize(400,400);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(new Color(178, 178,255));

        //Montando os componentes e posicionando
        titulo = new JLabel("Desenvolvedores");
        titulo.setBounds(140,20,400,50);

        integranteMarcos = new JLabel("Marcos Fleuri");
        integranteMarcos.setBounds(150,80,400,50);

        integranteMiguel = new JLabel("Miguel Riquelme");
        integranteMiguel.setBounds(150,100,400,50);

        integranteNicolas = new JLabel("Nicolas Santos");
        integranteNicolas.setBounds(150,120,400,50);

        integranteTabata = new JLabel("Tabata Fernanda");
        integranteTabata.setBounds(150,140,400,50);

        sala = new JLabel("2° Desenvolvimento de Sistemas");
        sala.setBounds(100,200,400,50);

        ano = new JLabel("2° Semestre - 2019");
        ano.setBounds(140,225,400,50);

        voltar = new JButton("Voltar");
        voltar.setBounds(40,300,150,50);
        voltar.setBackground(new Color(0xEFB62A));

        devs = new JButton("Desenvolvedores");
        devs.setBounds(210,300,150,50);
        devs.setBackground(new Color(0x3A91EF));

        // Colocando os componentes na tela
        getContentPane().setLayout(null);
        getContentPane().add(titulo);
        getContentPane().add(integranteMiguel);
        getContentPane().add(integranteMarcos);
        getContentPane().add(integranteNicolas);
        getContentPane().add(integranteTabata);
        getContentPane().add(sala);
        getContentPane().add(ano);
        getContentPane().add(voltar);
        getContentPane().add(devs);
        // Dando acao para o botao
        voltar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Determinando a acao para o botao
        if (e.getSource() == voltar){
            Menu janelaMenu = new Menu();
            this.dispose();
            janelaMenu.setVisible(true);
        }
        if (e.getSource() == devs){
            Dev dev = new Dev();
            this.dispose();
            dev.setVisible(true);
        }
    }
}
