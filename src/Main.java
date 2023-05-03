import DataClasses.*;
import DataStructures.*;
import Output.*;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Presentation.welcome();
        DynamicArray<Usuario> usuarios = new DynamicArray<>();
        DoublyLinkedList<Usuario> usuarios2 = new DoublyLinkedList<>();
        DynamicArray<Formulario> formularios = new DynamicArray<>();
        DoublyLinkedList<Formulario> formularios2 = new DoublyLinkedList<>();

        System.out.println();
        System.out.println("Prueba lectura csv");
        System.out.println("-------------------------------------------------------------");

        ReadCSV reader = new ReadCSV();

        usuarios= reader.fillUserArray("C:\\Users\\Hexaw\\Downloads\\MOCK_DATA.csv");
        usuarios2 = reader.fillUserLinked("C:\\Users\\Hexaw\\Downloads\\MOCK_DATA.csv");

        formularios= reader.fillFormArray("C:\\Users\\Hexaw\\Downloads\\formsTenThousand.csv");
        formularios2 = reader.fillFormLinked("C:\\Users\\Hexaw\\Downloads\\forms.csv");

        //formularios.printString();
        formularios2.printList();

       // usuarios.printString();

       usuarios2.printList();

        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;

        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);

        System.out.println("Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos");
    }
}