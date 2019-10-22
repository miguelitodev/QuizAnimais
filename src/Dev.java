import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Dev extends JFrame implements ActionListener {
    JLabel integranteMarcos, fotoMarcos, integranteMiguel, fotoMiguel, integranteNicolas, fotoNicolas, integranteTabata, fotoTabata;
    JButton voltar;

    public Dev(){
        //Montando a tela
        setTitle("Sobre");
        setSize(400,400);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(new Color(178, 178,255));

        fotoMarcos = new JLabel("");
        fotoMarcos.setBounds(210, 10, 110, 110);
        fotoMarcos.setIcon(new ImageIcon("img/marcos.png"));

        fotoMiguel = new JLabel("");
        fotoMiguel.setBounds(60, 10, 110, 110);
        fotoMiguel.setIcon(new ImageIcon("img/miguel.png"));

        fotoNicolas = new JLabel("");
        fotoNicolas.setBounds(60, 145, 110, 110);
        fotoNicolas.setIcon(new ImageIcon("img/nicolas.png"));

        fotoTabata = new JLabel("");
        fotoTabata.setBounds(210, 145, 110, 110);
        fotoTabata.setIcon(new ImageIcon("img/tabata.png"));

        integranteMarcos = new JLabel("Marcos Fleuri");
        integranteMarcos.setBounds(210, 105, 128, 50);

        integranteMiguel = new JLabel("Miguel Riquelme");
        integranteMiguel.setBounds(60, 105, 128, 50);

        integranteNicolas = new JLabel("Nicolas Santos");
        integranteNicolas.setBounds(60, 240, 128, 50);

        integranteTabata = new JLabel("Tabata Fernanda");
        integranteTabata.setBounds(210, 240, 128, 50);

        voltar = new JButton("Voltar");
        voltar.setBounds(100, 300, 200, 50);
        voltar.setBackground(new Color(0xEFB62A));

        getContentPane().setLayout(null);
        getContentPane().add(integranteMiguel);
        getContentPane().add(integranteMarcos);
        getContentPane().add(integranteNicolas);
        getContentPane().add(integranteTabata);
        getContentPane().add(fotoMarcos);
        getContentPane().add(fotoMiguel);
        getContentPane().add(fotoNicolas);
        getContentPane().add(fotoTabata);
        getContentPane().add(voltar);

        voltar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == voltar){
            Sobre sobre = new Sobre();
            this.dispose();
            sobre.setVisible(true);
        }
    }
}
