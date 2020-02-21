

public class BinarySearchTree<K extends Comparable> {
    private Node<K> root = new Node<>();
    private int size;

    public void insert(K key){
        insert(root,key);
    }

    public int size(){
        return size;
    }


    private void insert(Node node,K key){

        if(node.isEmpty()){
            node.key = key;
            node.right = new Node<>();
            node.left = new Node<>();
            size = size + 1;
            return;
        }else{
            if(key.compareTo(node.key) < 0){
                insert(node.left,key);
            }else{
                insert(node.right,key);
            }
        }

    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        if(root.isEmpty()){
            return " ";
        }else{

            stringBuilder.append(toString(root));
        }
        return stringBuilder.toString();
    }

    private String toString(Node<K> node){

        if(node.key == null){
            return " ";
        }

         return node.key.toString() + " \n " +
             toString(node.left) + toString(node.right);
    }


    private static class Node<K>{
        private Node<K> right;
        private Node<K> left;
        private K key;
        public Node(K key){
            this.key = key;
            this.left = new Node<K>();
            this.right = new Node<K>();
        }

        public  boolean isEmpty(){
            return key == null;
        }

        public Node(){};
    }

    public static void main(String[] args){
        BinarySearchTree<String> stringTree = new BinarySearchTree<>();
        stringTree.insert("S");
        stringTree.insert("E");
        stringTree.insert("X");
        stringTree.insert("A");
        stringTree.insert("R");
        stringTree.insert("C");
        stringTree.insert("H");
        stringTree.insert("M");
        System.out.println(stringTree.size());

        System.out.println(stringTree);
    }

}
