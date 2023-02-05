import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Imc {
    private JLabel l1;
    private JLabel PESO;
    private JTextField tf1peso;
    private JLabel altura;
    private JTextField tf2altura;
    private JButton Calcular;
    private JTextField Respuesta;
    public JPanel panelimc;
    private JButton regresarButton;

    public Imc() {
        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double peso= new Double(tf1peso.getText());
                Double al= new Double((tf2altura.getText()));
                double total=peso/(al*al);
                String result= String.valueOf(total);
                Respuesta.setText(result);
            }
        });

        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame imc= new JFrame("Imc");
                imc.setContentPane(new Componentes().panel2);
                imc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                imc.pack();
                imc.setSize(500,500);
                imc.setLocationRelativeTo(null);
                imc.setVisible(true);


            }
        });
    }
}
