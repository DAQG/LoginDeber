import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class v1 extends Ventana{
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
    String user;


    public v1(){
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
    }




}

