package DataClasses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listsGUI extends JFrame{
    private JPanel miPanel;
    private JButton cerrarSesiónButton;
    private JTable table1;
    private JButton verDenunciaButton;

    public listsGUI(){
        setContentPane(miPanel);
        setTitle("UN campus sin acoso");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        cerrarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                login login = new login();
            }
        });
    }
}
