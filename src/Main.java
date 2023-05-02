import DataClasses.*;
import DataStructures.*;

import java.text.Normalizer;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        DynamicArray<String> array = new DynamicArray<>();
       array.pushFront("a");
       array.pushBack("z");
       array.popFront();
       array.printString();
        System.out.println(array.contains("z"));

        DynamicArray<Usuario> users = new DynamicArray<>();
        users.pushFront(new Usuario("Jose","Martinez","josmart@unal.edu.co","123"));
        users.printString();

        DoublyLinkedList<String> listaEnlazada = new DoublyLinkedList<>();
        listaEnlazada.addFirst("l");
        listaEnlazada.printList();

        DoublyLinkedList<Formulario> form = new DoublyLinkedList<>();
        form.addFirst(new Formulario(1,"Jose","Hernandez",102344,31030123,"M",13,"uno","3","muchos","paso","correo"));
        form.isEmpty();
        form.printList();
        for(int j=1;j<=10000;j++){
            String myString = String.valueOf(j);
            array.pushBack(myString);
            listaEnlazada.addLast(myString);
        }
        listaEnlazada.printList();
        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;

        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);

        System.out.println("Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos");
    }
}