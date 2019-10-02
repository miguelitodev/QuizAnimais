import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sobre extends JFrame implements ActionListener {

    //Criando os objetos
    public  JLabel titulo, integranteMarcos, integranteMiguel, integranteSidney, integranteTabata, sala, ano;
    public  JButton voltar;

    public Sobre(){

        //Montando a tela
        setTitle("Sobre");
        setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(400,400);
        getContentPane().setBackground(new Color(178, 178,255));

        //Montando os componentes e posicionando
        titulo = new JLabel("Desenvolvedores");
        titulo.setBounds(140,20,400,50);

        integranteMarcos = new JLabel("Marcos Fleuri");
        integranteMarcos.setBounds(150,80,400,50);

        integranteMiguel = new JLabel("Miguel Riquelme");
        integranteMiguel.setBounds(150,100,400,50);

        integranteSidney = new JLabel("Sidney Oliveira");
        integranteSidney.setBounds(150,120,400,50);

        integranteTabata = new JLabel("Tabata Fernanda");
        integranteTabata.setBounds(150,140,400,50);

        sala = new JLabel("2° Desenvolvimento de Sistemas");
        sala.setBounds(100,200,400,50);

        ano = new JLabel("2° Semestre - 2019");
        ano.setBounds(140,225,400,50);

        voltar = new JButton("Voltar");
        voltar.setBounds(100,300,200,50);
        voltar.setBackground(new Color(0xEFB62A));
        //getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER)); -> aqui eu ia deixar tudo centralizado, deu merda
        getContentPane().setLayout(null);
        getContentPane().add(titulo);
        getContentPane().add(integranteMiguel);
        getContentPane().add(integranteMarcos);
        getContentPane().add(integranteSidney);
        getContentPane().add(integranteTabata);
        getContentPane().add(sala);
        getContentPane().add(ano);
        getContentPane().add(voltar);

        voltar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == voltar){
            Menu janelaMenu = new Menu();
            this.dispose();
            janelaMenu.setVisible(true);
        }
    }
}
