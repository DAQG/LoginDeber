import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Ventana extends  JFrame {
    public JTextField conusuario;
    private JPasswordField concontra;
    private JButton Salir;
    public JButton ingresar;
    private JLabel labelusuario;
    private JLabel labelpassword;
    private JPanel panel1;

    public Ventana() {
        super("LOGIN");
        setContentPane(panel1);
        ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 frame2 = new v1();
                String Usuario="user";
                String Contrasena="user";
                String PASS= new String((concontra.getPassword()));
                frame2.user = concontra.getText();
                frame2.name.setText("Bienvenido "+frame2.user + "!!!");
                if (frame2.user.equals(Usuario) && PASS.equals(Contrasena)) {

                    frame2.setContentPane(frame2.panel2);
                    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame2.pack();
                    frame2.setSize(500, 500);
                    frame2.setLocationRelativeTo(null);
                    frame2.setVisible(true);

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
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(500, 500);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
    }
}



