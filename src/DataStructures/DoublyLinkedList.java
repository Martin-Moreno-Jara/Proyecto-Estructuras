package DataStructures;

import DataClasses.Formulario;

import java.text.Normalizer;

public class DoublyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> prev;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(E data) {
        Node<E> newNode = new Node<>(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return temp.data;
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        Node<E> temp = tail;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return temp.data;
    }
    public boolean contains(String data) {
        Node<E> current = head;
        while (current != null) {
            if (current.data.toString().equals(data)) {
                return true;
            }
            current = current.next;
        }
   return false;
    }
    public void update(String data,String newData){
        Node<E> current = head;
        while (current != null) {
            if (current.data.toString().equals(data)) {
                if(current.data instanceof Formulario ){
                    Formulario reemplazo = (Formulario) current.data;
                    reemplazo.descripcion=newData;
                    current.data =(E)reemplazo;
                }
            }
            current = current.next;
        }
    }

    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
