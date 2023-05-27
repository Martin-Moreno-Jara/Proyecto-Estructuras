package DataClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginGUI extends JFrame{
    private JPanel panelHeader;
    private JPanel panelLogo;
    private JPanel panelTitulo;
    private JPanel panelBienvenida;
    private JPanel panelLogin;
    private JPanel panelBotonIn;
    private JPanel panelBotonRe;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton ingresarButton;
    private JButton registrarseButton;
    private JPanel panelInstruccion;
    private JPanel panelFrase;
    private JPanel panelMain;
    private JButton verCasosDePruebaButton;


    public LoginGUI() {
    setContentPane(panelMain);
    setTitle("UN campus sin acoso");
    setSize(630,350);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);

    ingresarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            preguntarRuta dialog = new preguntarRuta();
            dialog.pack();
            dialog.setVisible(true);
            if(dialog.close==1){
                setVisible(false);
            }

        }
    });
        ingresarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                ingresarButton.setBackground(new Color(59,110,60));
                ingresarButton.setForeground(Color.white);
            }
        });
        ingresarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                ingresarButton.setBackground(new Color(238,238,238));
                ingresarButton.setForeground(Color.black);
            }
        });
        registrarseButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                registrarseButton.setBackground(new Color(59,110,60));
                registrarseButton.setForeground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                registrarseButton.setBackground(new Color(238,238,238));
                registrarseButton.setForeground(Color.black);
            }
        });
        verCasosDePruebaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PruebasGUI pruebas = new PruebasGUI();
                setVisible(false);
            }
        });
    }
}
