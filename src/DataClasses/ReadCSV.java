package DataClasses;

import DataStructures.*;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadCSV {
    BufferedReader lector;
    String linea;
    String[] partes =null;

    public DynamicArray<Usuario> fillUserArray(String ruta){
        DynamicArray<Usuario> usuarios = new DynamicArray<>();
        try{
            lector = new BufferedReader(new FileReader(ruta));
            while((linea=lector.readLine())!=null){
                partes = linea.split(",");
                Usuario user = createUser();
                usuarios.pushBack(user);
            }
            lector.close();
            linea=null;
            partes=null;
        }catch (Exception e){
            System.out.println("Error at: "+e);
        }
        return usuarios;
    }
    public Queue<Formulario> fillFormQueue(String ruta){
        Queue<Formulario> formularios = new Queue<>();
        try{
            lector = new BufferedReader(new FileReader(ruta));
            while((linea=lector.readLine())!=null){
                partes = linea.split(",");
                Formulario form = createForm();
                formularios.enqueue(form);
            }
            lector.close();
            linea=null;
            partes=null;
        }catch (Exception e){
            System.out.println("Error at: "+e);
        }
        return formularios;
    }
    public Queue<Usuario> fillUserQueue(String ruta){
        Queue<Usuario> usuarios = new Queue<>();
        try{
            lector = new BufferedReader(new FileReader(ruta));
            while((linea=lector.readLine())!=null){
                partes = linea.split(",");
                Usuario user = createUser();
                usuarios.enqueue(user);
            }
            lector.close();
            linea=null;
            partes=null;
        }catch (Exception e){
            System.out.println("Error at: "+e);
        }
        return usuarios;
    }
    public DoublyLinkedList<Usuario> fillUserLinked(String ruta){
        DoublyLinkedList<Usuario> usuarios = new DoublyLinkedList<>();
        try{
            lector = new BufferedReader(new FileReader(ruta));
            while((linea=lector.readLine())!=null){
                partes = linea.split(",");
                Usuario user = createUser();
                usuarios.addLast(user);
            }
            lector.close();
            linea=null;
            partes=null;
        }catch (Exception e){
            System.out.println("Error at: "+e);
        }
        return usuarios;
    }

    public DynamicArray<Formulario> fillFormArray(String ruta){
        DynamicArray<Formulario> forms = new DynamicArray<>();
        try{
            lector = new BufferedReader(new FileReader(ruta));
            while((linea=lector.readLine())!=null){
                partes = linea.split(",");
                Formulario form = createForm();
                forms.pushBack(form);
            }
            lector.close();
            linea=null;
            partes=null;
        }catch (Exception e){
            System.out.println("Error at: "+e);
        }
        return forms;
    }

    public DoublyLinkedList<Formulario> fillFormLinked(String ruta){
        DoublyLinkedList<Formulario> forms = new DoublyLinkedList<>();
        try{
            lector = new BufferedReader(new FileReader(ruta));
            while((linea=lector.readLine())!=null){
                partes = linea.split(",");
                Formulario form = createForm();
                forms.addLast(form);
            }
            lector.close();
            linea=null;
            partes=null;
        }catch (Exception e){
            System.out.println("Error at: "+e.getCause());
        }
        return forms;
    }

    public Usuario createUser(){
        Usuario user = new Usuario(partes[0],partes[1],partes[2],partes[3]);
        return user;
    }
    public Formulario createForm(){
        Formulario form = new Formulario(partes[0],partes[1],partes[2],partes[3],partes[4],partes[5],partes[6],partes[7],partes[8],partes[9],partes[10],partes[11]);
        return form;
    }
    public AVLTree<Formulario> fillFormAVL(String ruta){
        AVLTree<Formulario> formularios = new AVLTree<>();
        try{
            lector = new BufferedReader(new FileReader(ruta));
            while((linea=lector.readLine())!=null){
                partes = linea.split(",");
                Formulario form = createForm();
                formularios.insert(form);
            }
            lector.close();
            linea=null;
            partes=null;
        }catch (Exception e){
            System.out.println("Error at: "+e);
        }
        return formularios;
    }
    public Heap fillHeap(int testSize){
        Heap heap = new Heap(testSize+3);
        for(int i=0;i<=testSize;i++){
            heap.insert(i);
        }
        return heap;
    }
    public DisjointSet[] fillSet(int testSize){
        DisjointSet[] D = new DisjointSet[testSize];
        DoublyLinkedList<DisjointSet> sets = new DoublyLinkedList<>();
        for(int i=0;i<testSize;i++){
            DisjointSet set = new DisjointSet(i);
            //sets.addLast(set);
            D[i]=set;
        }
        return D;
    }
}
