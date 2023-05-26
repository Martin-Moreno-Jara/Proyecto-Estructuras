package DataClasses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JFrame{
    private JPanel panelMain;
    private JLabel myLabel;
    private JLabel lbName;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton entrarButton;
    private JButton registrarseButton;

    public test(){
        setContentPane(panelMain);
        setTitle("UN campus sin acoso");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("funciono");
                preguntarRuta dialog = new preguntarRuta();
                dialog.pack();
                dialog.setVisible(true);
                System.out.println(dialog.close);
                if(dialog.close==1){
                    setVisible(false);
                }
                //System.exit(0);
            }
        });
    }
}
