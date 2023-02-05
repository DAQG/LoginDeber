import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class traduccion {
    public JPanel pprincipal;
    public JPanel panelani;
    public JPanel panelmenu;
    private JRadioButton Lion;
    private JRadioButton Shark;
    private JRadioButton Eagle;
    private JRadioButton Butterfly;
    private JRadioButton Scorpion;
    private JLabel ciudad;
    private JTextField tfciudad;
    private JLabel salida;
    private JButton Regresar;

    public traduccion() {

        Lion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salida.setText("Leon");
            }
        });
        Shark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salida.setText("Shark");
            }
        });
        Eagle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salida.setText("Aguila");
            }
        });
        Butterfly.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salida.setText("Mariposa");
            }
        });
        Scorpion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salida.setText("Escorpion");
            }
        });
        Regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame trad= new JFrame("traduccion");
                trad.setContentPane(new Componentes().panel2);
                trad.setSize(500,500);
                trad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                trad.pack();
                trad.setVisible(true);

            }
        });
    }

}
