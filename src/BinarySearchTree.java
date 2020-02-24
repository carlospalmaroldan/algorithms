

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

            stringBuilder.append(toString(root,0));
        }
        return stringBuilder.toString();
    }

    private String toString(Node<K> node,int level){

        if(node.key == null){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<3*level;i++){
            stringBuilder.append("-");
        }
          stringBuilder.append(node.key.toString() +"\n"+ toString(node.left,level+1)+toString(node.right,level+1));
        return stringBuilder.toString();
    }

    private String toStringChild(Node<K> node){
        if(node.key == null){
            return "";
        }
        return node.key.toString() + " ";
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
        BinarySearchTree<Integer> stringTree = new BinarySearchTree<>();
        stringTree.insert(4);
        stringTree.insert(2);
        stringTree.insert(6);
        stringTree.insert(1);
        stringTree.insert(3);
        stringTree.insert(5);
        stringTree.insert(7);
        stringTree.insert(8);
        System.out.println(stringTree.size());

        System.out.println(stringTree);
    }

}
