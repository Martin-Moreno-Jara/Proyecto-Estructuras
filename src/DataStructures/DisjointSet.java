package DataStructures;

public class DisjointSet {
    private int[] parent;
    private int[] rank;

    public DisjointSet(int size) {
        parent = new int[size];
        rank = new int[size];

        // Inicializar cada elemento como su propio padre y rango 0
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    // Buscar el representante (raíz) del conjunto al que pertenece el elemento 'x'
    public int find(int x) {
        if (parent[x] != x) {
            // Compresión de ruta: hacer que el padre de 'x' sea directamente la raíz
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    // Unir dos conjuntos por sus representantes (raíces)
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            // Unir el conjunto de menor rango al de mayor rango
            if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }
}

