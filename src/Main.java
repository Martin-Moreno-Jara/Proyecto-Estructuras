import DataClasses.*;
import DataStructures.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Prueba prototipo");
        System.out.println("-------------------------------------------------------------");


        LoginGUI login = new LoginGUI();

        //HEAP
        System.out.println(testCases.HeapCrear(1000));
        System.out.println(testCases.HeapCrear(10000));
        System.out.println(testCases.HeapCrear(100000));
        System.out.println(testCases.HeapCrear(1000000));

        System.out.println(testCases.HeapConsultar(1000));
        System.out.println(testCases.HeapConsultar(10000));
        System.out.println(testCases.HeapConsultar(100000));
        System.out.println(testCases.HeapConsultar(1000000));

        System.out.println(testCases.HeapInsert(1000));
        System.out.println(testCases.HeapInsert(10000));
        System.out.println(testCases.HeapInsert(100000));
        System.out.println(testCases.HeapInsert(1000000));

        System.out.println(testCases.HeapRemove(1000));
        System.out.println(testCases.HeapRemove(10000));
        System.out.println(testCases.HeapRemove(100000));
        System.out.println(testCases.HeapRemove(1000000));

        System.out.println(testCases.HeapExtractMax(1000));
        System.out.println(testCases.HeapExtractMax(10000));
        System.out.println(testCases.HeapExtractMax(100000));
        System.out.println(testCases.HeapExtractMax(1000000));

        System.out.println(testCases.HeapChangePriority(1000));
        System.out.println(testCases.HeapChangePriority(10000));
        System.out.println(testCases.HeapChangePriority(100000));
        System.out.println(testCases.HeapChangePriority(1000000));


        //Disjoin SET
       // System.out.println(testCases.setCreate(1000));
        //System.out.println(testCases.setCreate(10000));
        //System.out.println(testCases.setCreate(100000));
        System.out.println(testCases.setCreate(1000000));
/*
        System.out.println(testCases.setUnionFind(1000));
        System.out.println(testCases.setUnionFind(10000));
        System.out.println(testCases.setUnionFind(100000));
        System.out.println(testCases.setUnionFind(1000000));*/

    }
}