package DataClasses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebasGUI extends JFrame{
    private JPanel header;
    private JRadioButton array;
    private JRadioButton LinkedList;
    private JRadioButton Queue;
    private JRadioButton AVL;
    private JRadioButton diezK;
    private JRadioButton cienK;
    private JRadioButton millon;
    private JRadioButton mil;
    private JRadioButton creaciónRadioButton;
    private JRadioButton consultaRadioButton;
    private JRadioButton inserciónRadioButton;
    private JRadioButton eliminaciónRadioButton;
    private JRadioButton busquedaRadioButton;
    private JRadioButton actualizaciónRadioButton;
    private JTextPane paneResultados;
    private JButton verResultadoButton;
    private JPanel panelMain;
    private JButton volverButton;

    public PruebasGUI() {
    setContentPane(panelMain);
    setTitle("UN campus sin acoso");
    setSize(750,450);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);

        ButtonGroup estructuras = new ButtonGroup();
        estructuras.add(array);
        estructuras.add(LinkedList);
        estructuras.add(Queue);
        estructuras.add(AVL);

        ButtonGroup tamanos = new ButtonGroup();
        tamanos.add(diezK);
        tamanos.add(cienK);
        tamanos.add(millon);
        tamanos.add(mil);

        ButtonGroup operacion = new ButtonGroup();
        operacion.add(creaciónRadioButton);
        operacion.add(consultaRadioButton);
        operacion.add(inserciónRadioButton);
        operacion.add(eliminaciónRadioButton);
        operacion.add(busquedaRadioButton);
        operacion.add(actualizaciónRadioButton);
    verResultadoButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginGUI login = new LoginGUI();
                dispose();
            }
        });
        verResultadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ARRAY
                if(array.isSelected() && mil.isSelected() && creaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayCrear(testCases.dirMilDatos));
                }else if(array.isSelected() && mil.isSelected() && consultaRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayConsultar(testCases.dirMilDatos));
                }else if(array.isSelected() && mil.isSelected() && inserciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayInsertar(testCases.dirMilDatos));
                }else if(array.isSelected() && mil.isSelected() && eliminaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayEliminar(testCases.dirMilDatos));
                }else if(array.isSelected() && mil.isSelected() && busquedaRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayBuscar(testCases.dirMilDatos));
                }else if(array.isSelected() && mil.isSelected() && actualizaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayActualizar(testCases.dirMilDatos));
                }
                else if(array.isSelected() && diezK.isSelected() && creaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayCrear(testCases.dirDiezMilDatos));
                }else if(array.isSelected() && diezK.isSelected() && consultaRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayConsultar(testCases.dirDiezMilDatos));
                }else if(array.isSelected() && diezK.isSelected() && inserciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayInsertar(testCases.dirDiezMilDatos));
                }else if(array.isSelected() && diezK.isSelected() && eliminaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayEliminar(testCases.dirDiezMilDatos));
                }else if(array.isSelected() && diezK.isSelected() && busquedaRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayBuscar(testCases.dirDiezMilDatos));
                }else if(array.isSelected() && diezK.isSelected() && actualizaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayActualizar(testCases.dirDiezMilDatos));
                }
                else if(array.isSelected() && cienK.isSelected() && creaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayCrear(testCases.dirCienMilDatos));
                }else if(array.isSelected() && cienK.isSelected() && consultaRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayConsultar(testCases.dirCienMilDatos));
                }else if(array.isSelected() && cienK.isSelected() && inserciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayInsertar(testCases.dirCienMilDatos));
                }else if(array.isSelected() && cienK.isSelected() && eliminaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayEliminar(testCases.dirCienMilDatos));
                }else if(array.isSelected() && cienK.isSelected() && busquedaRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayBuscar(testCases.dirCienMilDatos));
                }else if(array.isSelected() && cienK.isSelected() && actualizaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayActualizar(testCases.dirCienMilDatos));
                }
                else if(array.isSelected() && millon.isSelected() && creaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayCrear(testCases.dirMillonDatos));
                }else if(array.isSelected() && millon.isSelected() && consultaRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayConsultar(testCases.dirMillonDatos));
                }else if(array.isSelected() && millon.isSelected() && inserciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayInsertar(testCases.dirMillonDatos));
                }else if(array.isSelected() && millon.isSelected() && eliminaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayEliminar(testCases.dirMillonDatos));
                }else if(array.isSelected() && millon.isSelected() && busquedaRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayBuscar(testCases.dirMillonDatos));
                }else if(array.isSelected() && millon.isSelected() && actualizaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.ArrayActualizar(testCases.dirMillonDatos));
                }
                //LINKEDLIST
                if(LinkedList.isSelected() && mil.isSelected() && creaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedCrear(testCases.dirMilDatos));
                }else if(LinkedList.isSelected() && mil.isSelected() && consultaRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedConsultar(testCases.dirMilDatos));
                }else if(LinkedList.isSelected() && mil.isSelected() && inserciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedInsertar(testCases.dirMilDatos));
                }else if(LinkedList.isSelected() && mil.isSelected() && eliminaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedEliminar(testCases.dirMilDatos));
                }else if(LinkedList.isSelected() && mil.isSelected() && busquedaRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedBuscar(testCases.dirMilDatos));
                }else if(LinkedList.isSelected() && mil.isSelected() && actualizaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedActualizar(testCases.dirMilDatos));
                }
                else if(LinkedList.isSelected() && diezK.isSelected() && creaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedCrear(testCases.dirDiezMilDatos));
                }else if(LinkedList.isSelected() && diezK.isSelected() && consultaRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedConsultar(testCases.dirDiezMilDatos));
                }else if(LinkedList.isSelected() && diezK.isSelected() && inserciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedInsertar(testCases.dirDiezMilDatos));
                }else if(LinkedList.isSelected() && diezK.isSelected() && eliminaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedEliminar(testCases.dirDiezMilDatos));
                }else if(LinkedList.isSelected() && diezK.isSelected() && busquedaRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedBuscar(testCases.dirDiezMilDatos));
                }else if(LinkedList.isSelected() && diezK.isSelected() && actualizaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedActualizar(testCases.dirDiezMilDatos));
                }
                else if(LinkedList.isSelected() && cienK.isSelected() && creaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedCrear(testCases.dirCienMilDatos));
                }else if(LinkedList.isSelected() && cienK.isSelected() && consultaRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedConsultar(testCases.dirCienMilDatos));
                }else if(LinkedList.isSelected() && cienK.isSelected() && inserciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedInsertar(testCases.dirCienMilDatos));
                }else if(LinkedList.isSelected() && cienK.isSelected() && eliminaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedEliminar(testCases.dirCienMilDatos));
                }else if(LinkedList.isSelected() && cienK.isSelected() && busquedaRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedBuscar(testCases.dirCienMilDatos));
                }else if(LinkedList.isSelected() && cienK.isSelected() && actualizaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedActualizar(testCases.dirCienMilDatos));
                }
                else if(LinkedList.isSelected() && millon.isSelected() && creaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedCrear(testCases.dirMillonDatos));
                }else if(LinkedList.isSelected() && millon.isSelected() && consultaRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedConsultar(testCases.dirMillonDatos));
                }else if(LinkedList.isSelected() && millon.isSelected() && inserciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedInsertar(testCases.dirMillonDatos));
                }else if(LinkedList.isSelected() && millon.isSelected() && eliminaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedEliminar(testCases.dirMillonDatos));
                }else if(LinkedList.isSelected() && millon.isSelected() && busquedaRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedBuscar(testCases.dirMillonDatos));
                }else if(LinkedList.isSelected() && millon.isSelected() && actualizaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.LinkedActualizar(testCases.dirMillonDatos));
                }
                //QUEUE

                if(Queue.isSelected() && mil.isSelected() && creaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueCrear(testCases.dirMilDatos));
                }else if(Queue.isSelected() && mil.isSelected() && consultaRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueConsultar(testCases.dirMilDatos));
                }else if(Queue.isSelected() && mil.isSelected() && inserciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueInsertar(testCases.dirMilDatos));
                }else if(Queue.isSelected() && mil.isSelected() && eliminaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueEliminar(testCases.dirMilDatos));
                }else if(Queue.isSelected() && mil.isSelected() && busquedaRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueBuscar(testCases.dirMilDatos));
                }else if(Queue.isSelected() && mil.isSelected() && actualizaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueActualizar(testCases.dirMilDatos));
                }
                else if(Queue.isSelected() && diezK.isSelected() && creaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueCrear(testCases.dirDiezMilDatos));
                }else if(Queue.isSelected() && diezK.isSelected() && consultaRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueConsultar(testCases.dirDiezMilDatos));
                }else if(Queue.isSelected() && diezK.isSelected() && inserciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueInsertar(testCases.dirDiezMilDatos));
                }else if(Queue.isSelected() && diezK.isSelected() && eliminaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueEliminar(testCases.dirDiezMilDatos));
                }else if(Queue.isSelected() && diezK.isSelected() && busquedaRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueBuscar(testCases.dirDiezMilDatos));
                }else if(Queue.isSelected() && diezK.isSelected() && actualizaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueActualizar(testCases.dirDiezMilDatos));
                }
                else if(Queue.isSelected() && cienK.isSelected() && creaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueCrear(testCases.dirCienMilDatos));
                }else if(Queue.isSelected() && cienK.isSelected() && consultaRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueConsultar(testCases.dirCienMilDatos));
                }else if(Queue.isSelected() && cienK.isSelected() && inserciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueInsertar(testCases.dirCienMilDatos));
                }else if(Queue.isSelected() && cienK.isSelected() && eliminaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueEliminar(testCases.dirCienMilDatos));
                }else if(Queue.isSelected() && cienK.isSelected() && busquedaRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueBuscar(testCases.dirCienMilDatos));
                }else if(Queue.isSelected() && cienK.isSelected() && actualizaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueActualizar(testCases.dirCienMilDatos));
                }
                else if(Queue.isSelected() && millon.isSelected() && creaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueCrear(testCases.dirMillonDatos));
                }else if(Queue.isSelected() && millon.isSelected() && consultaRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueConsultar(testCases.dirMillonDatos));
                }else if(Queue.isSelected() && millon.isSelected() && inserciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueInsertar(testCases.dirMillonDatos));
                }else if(Queue.isSelected() && millon.isSelected() && eliminaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueEliminar(testCases.dirMillonDatos));
                }else if(Queue.isSelected() && millon.isSelected() && busquedaRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueBuscar(testCases.dirMillonDatos));
                }else if(Queue.isSelected() && millon.isSelected() && actualizaciónRadioButton.isSelected()){
                    paneResultados.setText(testCases.QueueActualizar(testCases.dirMillonDatos));
                }
            }
        });
    }
}
