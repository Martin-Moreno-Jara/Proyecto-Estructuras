import DataClasses.*;
import DataStructures.*;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        System.out.println("Prueba prototipo");
        System.out.println("-------------------------------------------------------------");


        //LoginGUI login = new LoginGUI();

        //HEAP
        //System.out.println(testCases.HeapCrear(1000));
        //System.out.println(testCases.HeapCrear(10000));
        //System.out.println(testCases.HeapCrear(100000));
        //System.out.println(testCases.HeapCrear(1000000));

        //System.out.println(testCases.HeapConsultar(1000));
        //System.out.println(testCases.HeapConsultar(10000));
        //System.out.println(testCases.HeapConsultar(100000));
        //System.out.println(testCases.HeapConsultar(1000000));

        //System.out.println(testCases.HeapInsert(1000));
        //System.out.println(testCases.HeapInsert(10000));
        //System.out.println(testCases.HeapInsert(100000));
        //System.out.println(testCases.HeapInsert(1000000));

        //System.out.println(testCases.HeapRemove(1000));
        //System.out.println(testCases.HeapRemove(10000));
        //System.out.println(testCases.HeapRemove(100000));
        //System.out.println(testCases.HeapRemove(1000000));

        //System.out.println(testCases.HeapExtractMax(1000));
        //System.out.println(testCases.HeapExtractMax(10000));
       // System.out.println(testCases.HeapExtractMax(100000));
        //System.out.println(testCases.HeapExtractMax(1000000));

        //System.out.println(testCases.HeapChangePriority(1000));
        //System.out.println(testCases.HeapChangePriority(10000));
        //System.out.println(testCases.HeapChangePriority(100000));
        //.out.println(testCases.HeapChangePriority(1000000));

        //System.out.println(testCases.heapSort(1000));
        //System.out.println(testCases.heapSort(10000));
        //System.out.println(testCases.heapSort(100000));
        //System.out.println(testCases.heapSort(1000000));


        //Disjoin SET
       //System.out.println(testCases.setCreate(1000));
        //System.out.println(testCases.setCreate(10000));
        //System.out.println(testCases.setCreate(100000));
        //System.out.println(testCases.setCreate(1000000));
        /*long startTime = System.nanoTime();//empieza medir el tiempo
        for(int i=0;i<1000000;i++){
            DisjointSet set = new DisjointSet(i);
            System.out.println(i);
        }
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long elapsedTimeMillis = TimeUnit.NANOSECONDS.toMillis(elapsedTime);
        System.out.println("Tiempo de ejecución: " + elapsedTimeMillis + " milisegundos y "+ elapsedTime+" nanosegundos");*/

        //System.out.println(testCases.setUnionFind(25));
        System.out.println(testCases.setUnionFind(50));
        //System.out.println(testCases.setUnionFind(75));
        //System.out.println(testCases.setUnionFind(100));

        //System.out.println(testCases.setUFind(25));
       //System.out.println(testCases.setUFind(50));
        //System.out.println(testCases.setUFind(75));
        //System.out.println(testCases.setUFind(100));



    }
}