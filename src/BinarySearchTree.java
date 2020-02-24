import java.util.ArrayList;
import java.util.List;

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
        for(int i = 0; i< (3*level - 3); i++){
            stringBuilder.append("  ");
        }

        if(level > 0) {
            for (int i = 0; i < 3; i++) {
                stringBuilder.append("_ ");
            }
        }
          stringBuilder.append(node.key.toString() +"\n"+ toString(node.left,level+1)+toString(node.right,level+1));
        return stringBuilder.toString();
    }


    public List<Node<K>> retrieveInOrder(){
        return retrieveInOrder(root);
    }

    private List<Node<K>> retrieveInOrder(Node<K> node){
        List<Node<K>> list = new ArrayList<>();
        if(!node.isEmpty()) {
            list.addAll(retrieveInOrder(node.left));
            list.add(node);
            list.addAll(retrieveInOrder(node.right));
        }
        return list;

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

        public String toString(){
            return key.toString();
        }
    }

    public static void main(String[] args){
        BinarySearchTree<Integer> integerTree = new BinarySearchTree<>();
        integerTree.insert(4);
        integerTree.insert(2);
        integerTree.insert(6);
        integerTree.insert(1);
        integerTree.insert(3);
        integerTree.insert(5);
        integerTree.insert(7);
        integerTree.insert(8);
        integerTree.insert(9);


       /* System.out.println(stringTree);*/
        List<Node<Integer>> list=integerTree.retrieveInOrder();
        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}
