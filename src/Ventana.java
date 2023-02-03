import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Ventana extends  JFrame {
    private JTextField conusuario;
    private JPasswordField concontra;
    private JButton Salir;
    private JButton ingresar;
    private JLabel labelusuario;
    private JLabel labelpassword;
    private JPanel panel1;

    public Ventana() {
        super("LOGIN");
        setContentPane(panel1);
        ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Usuario="1111";
                String Contrasena="1111";
                String PASS= new String((concontra.getPassword()));
                if (conusuario.getText().equals(Usuario) && PASS.equals(Contrasena)) {

                    inicio frame2 = new inicio();
                    frame2.setVisible(true);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Ventana();
                frame.setSize(300, 300);
                frame.setVisible(true);

            }
        });
    }
}



