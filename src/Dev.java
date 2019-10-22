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
        fotoMarcos.setBounds();
        fotoMarcos.setIcon(new ImageIcon();

        fotoMiguel = new JLabel("");
        fotoMiguel.setBounds();
        fotoMiguel.setIcon(new ImageIcon();

        fotoNicolas = new JLabel("");
        fotoNicolas.setBounds();
        fotoNicolas.setIcon(new ImageIcon();

        fotoTabata = new JLabel("");
        fotoTabata.setBounds();
        fotoTabata.setIcon(new ImageIcon();

        integranteMarcos = new JLabel("Marcos Fleuri");
        integranteMarcos.setBounds();

        integranteMiguel = new JLabel("Miguel Riquelme");
        integranteMiguel.setBounds();

        integranteNicolas = new JLabel("Sidney Oliveira");
        integranteNicolas.setBounds();

        integranteTabata = new JLabel("Tabata Fernanda");
        integranteTabata.setBounds();

        voltar = new JButton("Voltar");
        voltar.setBounds();
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
