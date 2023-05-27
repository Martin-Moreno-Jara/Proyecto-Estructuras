import DataClasses.*;
import DataStructures.*;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {



        DoublyLinkedList<Formulario> MilFormulariosLinked = new DoublyLinkedList<>();
        DynamicArray<Formulario> DiezMilFormulariosArray = new DynamicArray<>();
        DoublyLinkedList<Formulario> DiezMilFormulariosLinked = new DoublyLinkedList<>();
        DynamicArray<Formulario> CienMilFormulariosArray = new DynamicArray<>();
        DoublyLinkedList<Formulario> CienMilFormulariosLinked = new DoublyLinkedList<>();
        DynamicArray<Formulario> MillonFormulariosArray = new DynamicArray<>();
        DoublyLinkedList<Formulario> MillonFormulariosLinked = new DoublyLinkedList<>();
        Queue<Formulario> MilFormulariosQueue = new Queue<>();
        Queue<Formulario> DiezMilFormulariosQueue = new Queue<>();
        Queue<Formulario> CienMilFormulariosQueue = new Queue<>();
        Queue<Formulario> MillonFormulariosQueue = new Queue<>();

        System.out.println();
        System.out.println("Prueba prototipo");
        System.out.println("-------------------------------------------------------------");



        //-----------------------------------------instanciación de pruebas


        //
        //MilFormulariosLinked= reader.fillFormLinked("C:\\Users\\Hexaw\\Downloads\\formsThousand.csv");
        //MilFormulariosQueue = reader.fillFormQueue("C:\\Users\\Hexaw\\Downloads\\formsThousand.csv");

        //DiezMilFormulariosArray = reader.fillFormArray();
        //DiezMilFormulariosLinked = reader.fillFormLinked("C:\\Users\\Hexaw\\Downloads\\formsTenThousand.csv");
        //DiezMilFormulariosQueue = reader.fillFormQueue("C:\\Users\\Hexaw\\Downloads\\formsTenThousand.csv");

        //CienMilFormulariosArray = reader.fillFormArray("");
        //CienMilFormulariosLinked = reader.fillFormLinked("C:\\Users\\Hexaw\\Downloads\\formsHundredThousand.csv");
        //CienMilFormulariosQueue = reader.fillFormQueue("C:\\Users\\Hexaw\\Downloads\\formsHundredThousand.csv");

        //MillonFormulariosArray = reader.fillFormArray("C:\\Users\\Hexaw\\Downloads\\formsMillion.csv");
        //MillonFormulariosLinked = reader.fillFormLinked("C:\\Users\\Hexaw\\Downloads\\formsMillion.csv");
        //MillonFormulariosQueue = reader.fillFormQueue("");
        //---------------------------------------------------------------------------------------------------------------


        //----------------------------------------------------Impresión de listas cosulta todos los datos---------------------------------------
        System.out.println("CONSULTA");

        //
        //MilFormulariosLinked.printList();
        //MilFormulariosQueue.print();

        //DiezMilFormulariosArray.printString();
        //DiezMilFormulariosLinked.printList();
        //DiezMilFormulariosQueue.print();

        //CienMilFormulariosArray.printString();
        //CienMilFormulariosLinked.printList();
        //CienMilFormulariosQueue.print();

        //MillonFormulariosArray.printString();
        //MillonFormulariosLinked.printList();
        //MillonFormulariosQueue.print();
        //--------------------------------------------------------------------------------------------------------------

        //------------------------------------------------Insersión de un solo dato
        System.out.println("INSERCIÓN");
        // DiezMilFormulariosArray.pushFront(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //CienMilFormulariosArray.pushFront(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //MillonFormulariosArray.pushFront(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));

        //MilFormulariosLinked.addFirst(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //DiezMilFormulariosLinked.addFirst(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //CienMilFormulariosLinked.addFirst(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //MillonFormulariosLinked.addFirst(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));


        //MilFormulariosArray.pushBack(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //MilFormulariosLinked.addLast(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        MilFormulariosQueue.enqueue(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        MilFormulariosQueue.print();

        //DiezMilFormulariosArray.pushBack(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //DiezMilFormulariosLinked.addLast(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //DiezMilFormulariosQueue.enqueue(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));


        //CienMilFormulariosArray.pushBack(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //CienMilFormulariosLinked.addLast(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //CienMilFormulariosQueue.enqueue(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));


        //MillonFormulariosArray.pushBack(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //MillonFormulariosLinked.addLast(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //MillonFormulariosQueue.enqueue(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));

        //------------------------------------------------------------------------------------------------------------------


        //----------------------------------------------Eliminación de un solo dato
        System.out.println("ELIMINACIÓN");
        //MilFormulariosArray.popFront();
        //DiezMilFormulariosArray.popFront();
        //CienMilFormulariosArray.popFront();
        //MillonFormulariosArray.popFront();


        //MilFormulariosLinked.removeFirst();
        //DiezMilFormulariosLinked.removeFirst();
        //CienMilFormulariosLinked.removeFirst();
        //MillonFormulariosLinked.removeFirst();

        //MilFormulariosArray.popBack();
        //MilFormulariosLinked.removeLast();
        MilFormulariosQueue.dequeue();
        MilFormulariosQueue.print();

        //DiezMilFormulariosArray.popBack();
        //DiezMilFormulariosLinked.removeLast();
        //DiezMilFormulariosQueue.dequeue();


        //CienMilFormulariosArray.popBack();
        //CienMilFormulariosLinked.removeLast();
        //CienMilFormulariosQueue.dequeue();

        //MillonFormulariosArray.popBack();
        //MillonFormulariosLinked.removeLast();
        //MillonFormulariosQueue.dequeue();

        //------------------------------------------------------------------------------------------------------------------------------------

        //------------------------------------------------------------------- Busqueda de un solo dato.
        System.out.println("BUSQUEDA DE UN DATO");

        //
        //boolean busquedaLinked = MilFormulariosLinked.contains("Sriwing");
        boolean busquedaQueue = MilFormulariosQueue.contains("Sriwing");

        //boolean busquedaArray = DiezMilFormulariosArray.contains("Sriwing");
        //boolean busquedaLinked =DiezMilFormulariosLinked.contains("Sriwing");
        //boolean busquedaQueue = DiezMilFormulariosQueue.contains("Sriwing");

        //boolean busquedaArray = CienMilFormulariosArray.contains("Sriwing");
        //boolean busquedaLinked =CienMilFormulariosLinked.contains("Sriwing");
        //boolean busquedaQueue = CienMilFormulariosQueue.contains("Sriwing");

        //boolean busquedaArray = MillonFormulariosArray.contains("Sriwing");
        //boolean busquedaLinked =MillonFormulariosLinked.contains("Sriwing");
        //boolean busquedaQueue = MillonFormulariosQueue.contains("Sriwing");

        //System.out.println(busquedaArray);
        //System.out.println(busquedaLinked);
        System.out.println(busquedaQueue);

        //------------------------------------------------------------------------------------------------------------------------------------

        //----------------------------------------Actualizacion
        System.out.println("ACTUALIZACIÓN");
        //;
        //MilFormulariosLinked.update("descripcion","lizard");
        MilFormulariosQueue.update("Sindangrasa","lizard");
        MilFormulariosQueue.print();


        //DiezMilFormulariosArray.update("descripcion","lizard");
        //DiezMilFormulariosLinked.update("descripcion","lizard");
        //DiezMilFormulariosQueue.update("descripcion","lizard");

        //CienMilFormulariosArray.update("descripcion","lizard");
        //CienMilFormulariosLinked.update("descripcion","lizard");
        //CienMilFormulariosQueue.update("descripcion","lizard");

        //MillonFormulariosArray.update("descripcion","lizard");
        //MillonFormulariosLinked.update("descripcion","lizard");
        //MillonFormulariosQueue.update("descripcion","lizard");





        LoginGUI test = new LoginGUI();


    }
}