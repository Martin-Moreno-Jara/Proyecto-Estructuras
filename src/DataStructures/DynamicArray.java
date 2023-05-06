package DataStructures;

import DataClasses.Formulario;

public class DynamicArray<T> {
    int capacity;
    T[] list;
    public int size;


    //constructors------------------------------------
    public DynamicArray(int cap) {
        this.capacity = cap;
        this.size = 0;
        this.list = (T[]) new Object[5];
    }
    public DynamicArray(){
        this(5);
        this.size = 0;
    }
    //-------------------------------------------------
    public boolean isFull(){
        boolean full=false;
        full = size == capacity;
        return full;
    }
    public boolean isEmpty(){
        boolean empty=false;
        try {
            empty= size == 0;
        }catch (RuntimeException e){
            System.out.println(e.toString());
        }
        return empty;
    }
    public void pushBack(T value) {
        if (isFull()) {
            this.capacity*=2;
            T[] newList = (T[]) new Object[this.capacity];
            System.arraycopy(this.list,0,newList,0,this.size);
            this.list = newList;
            pushBack(value);
        }else {
            list[this.size]=value;
            this.size++;
        }

    }

    public void pushFront(T value){
        if(isFull()){
            this.capacity*=2;
            T[] newList = (T[]) new Object[this.capacity];
            System.arraycopy(this.list,0,newList,0,this.size);
            this.list = newList;
            pushFront(value);
        }
        else{
            if(isEmpty()){
                this.list[0]=value;
            }else{
                for(int i=size;i>0;i--) {
                    list[i] = list[i - 1];
                }
                this.list[0]=value;
            }
            size++;
        }
    }
    public T popBack(){
        T aux;
        if(!isEmpty()){
            aux =list[size-1];
            size--;
        }
        else{
            System.out.println("Can't pop. List is empty");
            aux=null;
        }
        return aux;
    }
    public T popFront() {
        T aux;
        if(!isEmpty()){
            aux = list[0];
            for (int i = 0; i < size - 1; i++) {
                list[i] = list[i + 1];
            }
            size--;
        }else{
            System.out.println("Lista vacia");
            aux=null;
        }
        return aux;
    }
    public boolean contains(String element) {
        boolean returnedValue = false;
        if (!isEmpty()) {
            for (int i = 0; i <this.size; i++) {
                if (this.list[i].toString().equals(element)) {
                    returnedValue = true;
                    break;
                }
            }
        }
        return returnedValue;
    }
    public void update(String old, String newData){
        if (!isEmpty()) {
            for (int i = 0; i <this.size; i++) {
                if (this.list[i].toString().equals(old)) {
                    if(this.list[i] instanceof Formulario){
                        Formulario reemplazo = (Formulario) this.list[i];
                        reemplazo.descripcion=newData;
                        this.list[i]=(T)reemplazo;
                    }
                }

                }
            }
    }

    public void printString(){
        if(this.size<=this.capacity){
            for(int i=0;i<size;i++){
                System.out.print(this.list[i]);
                if(!(i==size-1)){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}