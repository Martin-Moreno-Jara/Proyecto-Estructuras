package DataClasses;

import DataStructures.DoublyLinkedList;
import DataStructures.DynamicArray;
import DataStructures.Queue;

import java.util.concurrent.TimeUnit;

public class testCases {
    public static String dirMilDatos="C:\\Users\\Hexaw\\Downloads\\formsThousand.csv";
    public static String dirCienMilDatos="C:\\Users\\Hexaw\\Downloads\\formsTenThousand.csv";
    public static String dirDiezMilDatos="C:\\Users\\Hexaw\\Downloads\\formsHundredThousand.csv";
    public static String dirMillonDatos="C:\\Users\\Hexaw\\Downloads\\formsMillion.csv";
    public static String ArrayCrear(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo

        DynamicArray<Formulario> MilFormulariosArray = new DynamicArray<>();
        ReadCSV reader = new ReadCSV();
        MilFormulariosArray =reader.fillFormArray(ruta);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);

        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String ArrayConsultar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        DynamicArray<Formulario> MilFormulariosArray = new DynamicArray<>();
        ReadCSV reader = new ReadCSV();
        MilFormulariosArray =reader.fillFormArray(ruta);
        MilFormulariosArray.printString();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);

        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String ArrayInsertar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        DynamicArray<Formulario> MilFormulariosArray = new DynamicArray<>();
        ReadCSV reader = new ReadCSV();
        MilFormulariosArray =reader.fillFormArray(ruta);
        MilFormulariosArray.pushFront(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String ArrayEliminar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        DynamicArray<Formulario> MilFormulariosArray = new DynamicArray<>();
        ReadCSV reader = new ReadCSV();
        MilFormulariosArray =reader.fillFormArray(ruta);
        MilFormulariosArray.popBack();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String ArrayBuscar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        DynamicArray<Formulario> MilFormulariosArray = new DynamicArray<>();
        ReadCSV reader = new ReadCSV();
        MilFormulariosArray =reader.fillFormArray(ruta);
        boolean busquedaArray = MilFormulariosArray.contains("Sriwing");
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String ArrayActualizar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        DynamicArray<Formulario> MilFormulariosArray = new DynamicArray<>();
        ReadCSV reader = new ReadCSV();
        MilFormulariosArray =reader.fillFormArray(ruta);
        MilFormulariosArray.update("descripcion","lizard");
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    // LINKED
    public static String LinkedCrear(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        DoublyLinkedList<Formulario> formularioLinkedList = new DoublyLinkedList<>();
        ReadCSV reader = new ReadCSV();
        formularioLinkedList =reader.fillFormLinked(ruta);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);

        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String LinkedConsultar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        DoublyLinkedList<Formulario> formularioLinkedList = new DoublyLinkedList<>();
        ReadCSV reader = new ReadCSV();
        formularioLinkedList =reader.fillFormLinked(ruta);;
        formularioLinkedList.printList();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);

        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String LinkedInsertar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        DoublyLinkedList<Formulario> formularioLinkedList = new DoublyLinkedList<>();
        ReadCSV reader = new ReadCSV();
        formularioLinkedList =reader.fillFormLinked(ruta);
        formularioLinkedList.addFirst(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String LinkedEliminar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        DoublyLinkedList<Formulario> formularioLinkedList = new DoublyLinkedList<>();
        ReadCSV reader = new ReadCSV();
        formularioLinkedList =reader.fillFormLinked(ruta);
        formularioLinkedList.removeLast();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String LinkedBuscar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        DoublyLinkedList<Formulario> formularioLinkedList = new DoublyLinkedList<>();
        ReadCSV reader = new ReadCSV();
        formularioLinkedList =reader.fillFormLinked(ruta);
        boolean busquedaArray = formularioLinkedList.contains("Sriwing");
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String LinkedActualizar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        DoublyLinkedList<Formulario> formularioLinkedList = new DoublyLinkedList<>();
        ReadCSV reader = new ReadCSV();
        formularioLinkedList =reader.fillFormLinked(ruta);
        formularioLinkedList.update("descripcion","lizard");
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }

    //QUEUE
    public static String QueueCrear(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        Queue<Formulario> queue;
        ReadCSV reader = new ReadCSV();
        queue =reader.fillFormQueue(ruta);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);

        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String QueueConsultar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        Queue<Formulario> queue;
        ReadCSV reader = new ReadCSV();
        queue =reader.fillFormQueue(ruta);
        queue.print();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);

        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String QueueInsertar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        Queue<Formulario> queue;
        ReadCSV reader = new ReadCSV();
        queue =reader.fillFormQueue(ruta);
        queue.enqueue(new Formulario("1","M","J","123","1234","F","32","A","B","X","R","G"));
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String QueueEliminar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        Queue<Formulario> queue;
        ReadCSV reader = new ReadCSV();
        queue =reader.fillFormQueue(ruta);
        queue.dequeue();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String QueueBuscar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        Queue<Formulario> queue;
        ReadCSV reader = new ReadCSV();
        queue =reader.fillFormQueue(ruta);
        boolean busquedaArray = queue.contains("Sriwing");
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
    public static String QueueActualizar(String ruta){
        long startTime = System.nanoTime();//empieza medir el tiempo
        Queue<Formulario> queue;
        ReadCSV reader = new ReadCSV();
        queue =reader.fillFormQueue(ruta);
        queue.update("descripcion","lizard");
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        return "Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos";
    }
}
