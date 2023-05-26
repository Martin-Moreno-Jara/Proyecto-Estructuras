package DataClasses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formGUI extends JFrame{
    private JLabel label;
    private JPanel mipanel;
    private JButton enviarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JComboBox comboBox1;
    private JTextField textField7;
    private JTextField textField8;
    private JTextArea textArea1;
    private JComboBox comboBox2;

    public formGUI(){
        setContentPane(mipanel);
        setTitle("Formulario");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                test test = new test();
            }
        });
    }

}
