package DataStructures;

import DataClasses.Formulario;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }

        T data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        } else {
            front.prev = null;
        }

        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        int count = 0;
        Node<T> current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public boolean contains(String data) {
        Node<T> current = front;
        while (current != null) {
            if (current.data.toString().equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void update(String data,String newData){
        Node<T> current = front;
        while (current != null) {
            if (current.data.toString().equals(data)) {
                if(current.data instanceof Formulario){
                    Formulario reemplazo = (Formulario) current.data;
                    reemplazo.descripcion=newData;
                    current.data =(T)reemplazo;
                }
            }
            current = current.next;
        }
    }
    public void print(){
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    }


