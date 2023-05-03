import DataClasses.*;
import DataStructures.*;
import Output.*;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        
        Presentation.welcome();
        DynamicArray<Formulario> MilFormulariosArray = new DynamicArray<>();
        DoublyLinkedList<Formulario> MilFormulariosLinked = new DoublyLinkedList<>();
        DynamicArray<Formulario> DiezMilFormulariosArray = new DynamicArray<>();
        DoublyLinkedList<Formulario> DiezMilFormulariosLinked = new DoublyLinkedList<>();
        DynamicArray<Formulario> CienMilFormulariosArray = new DynamicArray<>();
        DoublyLinkedList<Formulario> CienMilFormulariosLinked = new DoublyLinkedList<>();
        DynamicArray<Formulario> MillonFormulariosArray = new DynamicArray<>();
        DoublyLinkedList<Formulario> MillonFormulariosLinked = new DoublyLinkedList<>();

        System.out.println();
        System.out.println("Prueba lectura csv");
        System.out.println("-------------------------------------------------------------");


        //-----------------------------------------instanciación de pruebas

        ReadCSV reader = new ReadCSV();
        //MilFormulariosArray =reader.fillFormArray("C:\\Users\\Hexaw\\Downloads\\formsThousand.csv");
        //MilFormulariosLinked= reader.fillFormLinked("C:\\Users\\Hexaw\\Downloads\\formsThousand.csv");

        //DiezMilFormulariosArray = reader.fillFormArray("C:\\Users\\Hexaw\\Downloads\\formsTenThousand.csv");
        //DiezMilFormulariosLinked = reader.fillFormLinked("C:\\Users\\Hexaw\\Downloads\\formsTenThousand.csv");

        //CienMilFormulariosArray = reader.fillFormArray("C:\\Users\\Hexaw\\Downloads\\formsHundredThousand.csv");
        //CienMilFormulariosLinked = reader.fillFormLinked("C:\\Users\\Hexaw\\Downloads\\formsHundredThousand.csv");

       //MillonFormulariosArray = reader.fillFormArray("C:\\Users\\Hexaw\\Downloads\\formsMillion.csv");
        MillonFormulariosLinked = reader.fillFormLinked("C:\\Users\\Hexaw\\Downloads\\formsMillion.csv");
        //---------------------------------------------------------------------------------------------------------------


        //----------------------------------------------------Impresión de listas cosulta todos los datos---------------------------------------

        //MilFormulariosArray.printString();
        //MilFormulariosLinked.printList();

        //DiezMilFormulariosArray.printString();
        //DiezMilFormulariosLinked.printList();

        //CienMilFormulariosArray.printString();
        //CienMilFormulariosLinked.printList();

        //MillonFormulariosArray.printString();
        MillonFormulariosLinked.printList();
        //--------------------------------------------------------------------------------------------------------------

        //------------------------------------------------Insersión de un solo dato
        //MilFormulariosArray.pushBack(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //MilFormulariosLinked.addLast(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));

        //DiezMilFormulariosArray.pushBack(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //DiezMilFormulariosLinked.addLast(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));

        //CienMilFormulariosArray.pushBack(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //CienMilFormulariosLinked.addLast(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));

        //MillonFormulariosArray.pushBack(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        MillonFormulariosLinked.addLast(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        //------------------------------------------------------------------------------------------------------------------
        long startTime = System.nanoTime();//empieza medir el tiempo

        //----------------------------------------------Eliminación de un solo dato
        //MilFormulariosArray.popBack();
        //MilFormulariosLinked.removeLast();

        //DiezMilFormulariosArray.popBack();
        //DiezMilFormulariosLinked.removeLast();

        //CienMilFormulariosArray.popBack();
        //CienMilFormulariosLinked.removeLast();

        //MillonFormulariosArray.popBack();
        MillonFormulariosLinked.removeLast();
        //------------------------------------------------------------------------------------------------------------------------------------

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        System.out.println();
        System.out.println("Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos");
    }
}