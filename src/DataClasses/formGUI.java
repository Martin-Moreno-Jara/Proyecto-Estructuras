package DataClasses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formGUI extends JFrame{
    private JPanel mipanel;
    private JButton enviarButton;
    private JTextField nombre;
    private JTextField apellido;
    private JTextField cedula;
    private JTextField telefono;
    private JTextField genero;
    private JTextField edad;
    private JComboBox tipoAcoso;
    private JTextField Frecuencia;
    private JTextField ejercidoPor;
    private JTextArea Descripcion;
    private JComboBox formaContacto;
    private JButton cerrarSesiónButton;

    private int IdForm=0;

    public formGUI(){
        setContentPane(mipanel);
        setTitle("Formulario");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                LoginGUI login = new LoginGUI();
            }
        });
        cerrarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginGUI login = new LoginGUI();
            }
        });
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IdForm++;
                String formNombre = nombre.getText();
                String formApellido = apellido.getText();
                String formCedula = cedula.getText();
                String formTelefono = telefono.getText();
                String formGenero = genero.getText();
                String formEdad = edad.getText();
                String formTipo = (String) tipoAcoso.getSelectedItem();
                String formFrecuencia = Frecuencia.getText();
                String formEjercido = ejercidoPor.getText();
                String formDescripcion = Descripcion.getText();
                String formContacto = (String) formaContacto.getSelectedItem();
                Formulario nuevoFormulario = new Formulario(String.valueOf(IdForm),formNombre,formApellido,formCedula,formTelefono,formGenero,formEdad,formTipo,formFrecuencia,formEjercido,formDescripcion,formContacto);
                System.out.println(nuevoFormulario.nombre);
                System.out.println(nuevoFormulario.apellido);
                System.out.println(nuevoFormulario.cedula);
                System.out.println(nuevoFormulario.telefono);
                System.out.println(nuevoFormulario.genero);
                System.out.println(nuevoFormulario.edad);
                System.out.println(nuevoFormulario.tipo_de_acoso);
                System.out.println(nuevoFormulario.frecuencia);
                System.out.println(nuevoFormulario.ejercido_por);
                System.out.println(nuevoFormulario.descripcion);
                System.out.println(nuevoFormulario.forma_de_contacto);
            }
        });
    }

}
