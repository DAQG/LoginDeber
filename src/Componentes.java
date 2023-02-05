import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

public class Componentes extends Login {
    public JPanel panel2;
    public JLabel name;
    private JSlider slider1;
    private JLabel edad;
    private JComboBox genero;
    private JLabel genero2;
    private JCheckBox estudiante;
    private JCheckBox profe;
    private JLabel mosEs;
    private JList list1;
    private JLabel facultad;
    private JButton IMCButton;
    private JLabel COMPONENTES2;
    private JButton Traduccion;
    private JButton salir;
    String user;


    public Componentes(){

    name.setText("Bienvenido " + user);

    slider1.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            edad.setText("Edad: " + slider1.getValue());
        }
    });

    genero.addItem("Hombre");
    genero.addItem("Mujer");
    genero.addItem("Personalizado");

    genero.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
           genero2.setText((String)(genero.getSelectedItem()));

            }
        });

        ButtonGroup b1 = new ButtonGroup();
        b1.add(estudiante);
        b1.add(profe);

    estudiante.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                mosEs.setText((estudiante.getText()));
            }
        });

    profe.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {

            mosEs.setText((profe.getText()));
        }
    });

    String facultades[]={"Ingenieria Electrica y Electronica", "ESFOT", "Ingenieria Quimica",
    "Ingenieria Agroindustria", "Ingenieria Mecánica", "Ciencias Administrativas", "Ciencias", "Sistemas"};
    list1.setListData(facultades);

    list1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            facultad.setText((String)(list1.getSelectedValue()));
        }
    });

        IMCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame imc= new JFrame("Imc");
                imc.setContentPane(new Imc().panelimc);
                imc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                imc.pack();
                imc.setSize(500,500);
                imc.setLocationRelativeTo(null);
                imc.setVisible(true);
                dispose();
            }
        });
        Traduccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame tradu= new JFrame("traduccion");
                tradu.setContentPane(new traduccion().pprincipal);
                tradu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                tradu.pack();
                tradu.setSize(500,500);
                tradu.setLocationRelativeTo(null);
                tradu.setVisible(true);
                dispose();

            }
        });
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame imc= new JFrame("Componentes");
                imc.setContentPane(new Login().panel1);
                imc.setSize(500,500);
                imc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                imc.pack();
                imc.setVisible(true);
                dispose();
            }
        });
    }
}

