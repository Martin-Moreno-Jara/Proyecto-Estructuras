import DataClasses.*;
import DataStructures.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Prueba prototipo");
        System.out.println("-------------------------------------------------------------");


        //LoginGUI test = new LoginGUI();
        AVLTree<String> myTree = new AVLTree<>();
        /*myTree.insert("a");
        myTree.insert("x");
        myTree.insert("b");
        myTree.printInOrder(myTree.root);
        myTree.delete("b");
        System.out.println();
        myTree.printInOrder(myTree.root);
        System.out.println(myTree.find("a"));
        myTree.update("a","t");
        System.out.println();
        myTree.printInOrder(myTree.root);*/



       /* Heap heap = new Heap(10);
        heap.insert(3);
        heap.printHeap();

        DisjointSet set = new DisjointSet(10);
        DisjointSet set2 = new DisjointSet(1);
        set.union(1,9);
        System.out.println(set.find(8));*/
        ReadCSV read = new ReadCSV();
        System.out.println(testCases.HeapConsultar(1000000));





    }
}