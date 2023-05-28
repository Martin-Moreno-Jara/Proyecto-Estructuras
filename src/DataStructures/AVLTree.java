package DataStructures;

    public class AVLTree<T extends Comparable> {
         static class Node<T extends Comparable<T>> implements Comparable<Node<T>> {

            T data;
            Node<T> left;
            Node<T> right;
            Node<T> parent;
            int height;
            public Node(T data){
                this.data = data;
                this.left=null;
                this.right=null;
                this.parent=null;
            }

            @Override
            public int compareTo(Node<T> o) {
                return this.data.compareTo(o.data);
            }
        }
        public Node root;
        int size;
        // constructor
        public AVLTree(){
            this.root=null;
            this.size=0;
        }

        //insert***********************************************************************************************************************
        public void insert(T data){
            root=insert(data,root);
        }
        private Node insert(T data,Node ref){
            Node newNode = new Node(data);
            if(ref==null){
                size++;
                return  newNode;
            }
            else if(ref.compareTo(newNode)>0){
                if(ref.left==null){
                    ref.left= newNode;
                    newNode.parent=ref;
                    size++;
                }else {
                    ref.left = insert(data, ref.left);
                }
            }

            else if(ref.compareTo(newNode)<0){
                if (ref.right==null){
                    ref.right= newNode;
                    newNode.parent=ref;
                    size++;
                }else {
                    ref.right = insert(data, ref.right);
                }
            }

            ref=rebalance(ref);
            return ref;
        }
        //*******************************************************************************************************************************************

        public void printInOrder(Node ref){
            if(ref!=null) {
                if (ref.left != null) {
                    printInOrder(ref.left);
                }
                System.out.print(ref.data+", ");
                if (ref.right != null) {
                    printInOrder(ref.right);
                }
            }else{
                System.out.println("Tree is empty");
            }
        }
        public int getHeight(Node ref) {
            if (ref == null) {
                return 0;
            }
            return 1 + Math.max(getHeight(ref.left), getHeight(ref.right));
        }
        public int checkBalance(Node ref) {
            if (ref == null) {
                return 0;
            }
            return getHeight(ref.right) - getHeight(ref.left);
        }

        public Node nearestAncestor(T node1,T node2){
            Node ref = root;
            if(ref==null || node1==null || node2==null){
                return null;
            }
            return nearestAncestor(ref,node1,node2);
        }
        private Node nearestAncestor(Node ref,T node1,T node2){

            if(ref==null){
                return null;
            }
            int compFirst = ref.compareTo(new Node(node1));
            int compSecond = ref.compareTo(new Node(node2));
            if(compFirst>0 && compSecond>0){
                return nearestAncestor(ref.left,node1,node2);
            }
            else if(compSecond<0 && compFirst<0){
                return nearestAncestor(ref.right,node1,node2);
            }else{
                return ref;
            }
        }

        private Node rotateRight(Node node) {

            Node temp=null;
            if(node.left!=null) {
                temp = node.left;
                node.left = temp.right;
                temp.right = node;
            }else{
                temp=node;
                temp.right=rotateRight(node.right);
                temp=rotateLeft(node);
            }
            return temp;
        }

        private Node rotateLeft(Node node) {
            Node temp=null;
            if(node.right!=null) {
                temp = node.right;
                node.right = temp.left;
                temp.left = node;
            }else{
                temp=node;
                temp.left=rotateLeft(node.left);
                temp=rotateRight(node);
            }
            return temp;
        }

        private Node rebalance(Node myNode){
            if(getHeight(myNode.left)-getHeight(myNode.right)>1){ // si esta más desbalanceado el hijo izquierdo
                if(getHeight(myNode.left.left)>getHeight(myNode.left.right)){// si esta más desbalanceado a la izquierda del hijo izquierdo
                    myNode = rotateRight(myNode);
                }else{
                    myNode = rotateLeft(myNode);
                    //myNode = rotateRight(myNode);
                }
            }
            else if(getHeight(myNode.left)-getHeight(myNode.right)<-1){ //si está más desbalanceado del lado derecho
                if(getHeight(myNode.right.right)>getHeight(myNode.right.left)){// si esta más desbalanceado a la derecha del hijo izquierdo
                    myNode = rotateLeft(myNode);
                }else{
                    myNode = rotateRight(myNode);
                }
            }
            if(myNode.parent==null){
                root=myNode;
            }
            return myNode;
        }
        public void printPreOrder(Node node){
            if(node!=null){
                System.out.print(node.data+", ");
                printPreOrder(node.left);
                printPreOrder(node.right);
            }
        }
        public T findMin(){
            Node start = root;
            T number;
            if(start!=null) {
                while (start.left != null) {
                    start = start.left;
                }
                number= (T) start.data;
            }else{
                number=null;
            }
            return number;
        }
        public T findMax() {
            Node start = root;
            T number;
            if (start != null) {
                while (start.right != null) {
                    start = start.right;
                }
                number=(T) start.data;
            }else{
                number=null;
            }
            return number;
        }
        public int heightBetweem(Node node, T value) {
            if (node == null) {
                return -1;
            }
            if (node.data.equals(value)) {
                return 1;
            }
            int height;
            if (value.compareTo(node.data) < 0) {
                height = heightBetweem(node.left, value);
            } else {
                height = heightBetweem(node.right, value);
            }
            if (height == -1) {
                return -1;
            } else {
                return height + 1;
            }
        }
        public void printPostOrder(Node root) {
            if (root == null) {
                return;
            }
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.data + " ");
        }
        public void delete(String data) {
            root = delete(data, root);
        }
        private Node findMinNode(Node ref) {
            if (ref == null) {
                return null;
            }
            while (ref.left != null) {
                ref = ref.left;
            }
            return ref;
        }

        private Node delete(String data, Node ref) {
            if (ref == null) {
                return null;
            }

            int cmp = data.compareTo(ref.data.toString());

            if (cmp < 0) {
                ref.left = delete(data, ref.left);
            } else if (cmp > 0) {
                ref.right = delete(data, ref.right);
            } else {
                if (ref.left == null && ref.right == null) {
                    ref = null;
                } else if (ref.left == null) {
                    ref = ref.right;
                } else if (ref.right == null) {
                    ref = ref.left;
                } else {
                    Node successor = findMinNode(ref.right);
                    ref.data = successor.data;
                    ref.right = delete(successor.data.toString(), ref.right);
                }
            }

            if (ref != null) {
                ref = rebalance(ref);
            }
            return ref;
        }
        public boolean find(String data) {
            return find(data, root);
        }

        private boolean find(String data, Node ref) {
            if (ref == null) {
                return false;
            }

            int cmp = data.compareTo(ref.data.toString());

            if (cmp < 0) {
                return find(data, ref.left);
            } else if (cmp > 0) {
                return find(data, ref.right);
            } else {
                return true;
            }
        }

        // update
        public void update(String oldData, T newData) {
            if (find(oldData)) {
                delete(oldData);
                insert(newData);
            }
        }


    }


