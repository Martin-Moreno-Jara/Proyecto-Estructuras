package DataClasses;

import javax.swing.*;
import java.awt.event.*;

public class preguntarRuta extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JRadioButton crearNuevaDenunciaRadioButton;
    private JRadioButton verDenunciasRadioButton;

    private int ruta;
    public int close;

    public preguntarRuta() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setLocationRelativeTo(null);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        crearNuevaDenunciaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ruta =1;
            }
        });
        verDenunciasRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ruta=2;
            }
        });
    }

    private void onOK() {
        // add your code here
        if(ruta==1){
            close=1;
            formGUI form = new formGUI();
        }else if(ruta==2){
            System.out.println("ventana no hecha todavia");
            close=1;
        }else{
            JOptionPane.showMessageDialog(this,"Nada seleccionado");
            close=0;
        }
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

}
