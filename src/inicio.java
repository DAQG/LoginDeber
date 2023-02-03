import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class inicio extends JFrame {
    private JButton JButton;
     JPanel panel2;
    private JSlider slider1;
    private JLabel l1;
    private JPasswordField passwordField1;
    private JButton SALIRButton;
    private JLabel l2;
    private JButton Iniciar;

    public inicio(){
        super("APLICACIONES");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        add(slider1);

        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                l1.setText("La valor es: " + slider1.getValue());
            }
        } );


        Iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l2.setText("La clave es: " + passwordField1.getText());
            }
        });

    }
}
