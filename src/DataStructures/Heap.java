package DataStructures;

public class Heap {
    private int maxSize;
    private int size;
    public int[] heap;

    public Heap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[maxSize];
    }

    public int parent(int i) {
        return i / 2;
    }

    public int leftChild(int i) {
        return 2 * i;
    }

    public int rightChild(int i) {
        return (2 * i) + 1;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void siftUp(int i) {
        while (i > 0 && heap[parent(i)] < heap[i]) {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    private void siftDown(int i) {
        int maxIndex = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left <= size && heap[left] > heap[maxIndex]) {
            maxIndex = left;
        }
        if (right <= size && heap[right] > heap[maxIndex]) {
            maxIndex = right;
        }
        if (i != maxIndex) {
            swap(i, maxIndex);
            siftDown(maxIndex);
        }
    }

    public void insert(int value) {
        if (size == maxSize) {
            throw new IllegalStateException("Heap is full");
        }
        size++;
        heap[size] = value;
        siftUp(size);
    }

    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int result = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftDown(0);
        return result;
    }

    public void remove(int i) {
        if (i < 0 || i >= size) {
            throw new IllegalArgumentException("Invalid index");
        }
        heap[i] = 1000000000;
        siftUp(i);
        extractMax();
    }

    public void changePriority(int i, int p) {
        if (i < 0 || i >= size) {
            throw new IllegalArgumentException("Invalid index");
        }

        int oldp = heap[i];
        heap[i] = p;

        if (p > oldp) {
            siftUp(i);
        } else {
            siftDown(i);
        }
    }
    public void printHeap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    public void buildHeap(int[] array) {
        size = array.length;
        heap = new int[maxSize];
        System.arraycopy(array, 0, heap, 0, size);

        for (int i = size / 2; i >= 0; i--) {
            siftDown(i);
        }
    }

}
