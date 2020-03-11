package code;

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

    public Node<K> get(K key){

       return get(root,key);
    }

    private Node<K> get(Node<K> present,K key){
        if(present.isEmpty()) return new Node<>();
        if(present.key == key){
            return present;
        }
        if(key.compareTo(present.key)<0){
           return get(present.left,key);
        } else if (key.compareTo(present.key) > 0) {
            return get(present.right,key);
        }
        return new Node<>();
    }

    private Node<K> nonRecursiveGet(K key){
        return nonRecursiveGet(root,key);
    }

    private Node<K> nonRecursiveGet(Node<K> present,K key){
        while(present.key != key && !present.isEmpty()){

        }
        return new Node<>();
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

    public String nonRecursiveTreeTraversal(){
        Node<K> present = root;
        Stack<K> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        while(stack.size != 0 || !present.isEmpty()){
            if(!present.isEmpty()){
                stack.push(present);
                present = present.left;
            }else{
                Node<K> node = stack.pop();
                stringBuilder.append(node.key);
                present = node.right;
            }
        }
        return stringBuilder.toString();
    }


    public Node<K> deleteNode(K key){
      root =  deleteNode(root,key);
      return root;
    }

    private Node<K> deleteNode(Node<K> present,K key){
            Node<K> nodeToReturn = new Node<>();
            if(present.isEmpty()){
                return nodeToReturn;
            }
            if(present.key == key){
                this.size = size - 1;
                if(!present.right.isEmpty()){
                    nodeToReturn = locateMinimum(present.right);
                    deleteMinimum(present.right);
                    nodeToReturn.left = present.left;
                    if(present.right != nodeToReturn){
                       nodeToReturn.right= present.right;
                    }
                    return nodeToReturn;
                }
                if(!present.left.isEmpty()){
                    nodeToReturn = present.left;
                    return nodeToReturn;
                }
                nodeToReturn.right = new Node<>();
                nodeToReturn.left = new Node<>();
                nodeToReturn.key = null;
                return nodeToReturn;
            }

            if(key.compareTo(present.key)<0) {
                present.left = deleteNode(present.left, key);
                    return  present;
            }else {
                present.right = deleteNode(present.right, key);
                    return present;
            }
    }


    public Node<K> locateMinimum(){
        return locateMinimum(root);
    }

    public Node<K> deleteMinimum(){
        return deleteMinimum(root);
    }

    private Node<K> deleteMinimum(Node<K> node){
        if(root.isEmpty()) return new Node<>();
        if(!node.left.isEmpty()){
            node.left = deleteMinimum(node.left);
        }else{
            return new Node<>();
        }
        return node;
    }

    private Node<K> locateMinimum(Node<K> root){
        if(root.isEmpty()) return new Node<>();
        if(!root.left.isEmpty()){
           return locateMinimum(root.left);
        }else {
            return root;
        }

    }


    public static class Node<K>{
            private Node<K> right;
            private Node<K> left;
            private K key;


            public  boolean isEmpty(){
                return key == null;
            }

            public Node(){};

            public String toString(){
                if(key != null) {
                    return key.toString();
                }else{
                    return "";
                }
            }
    }

    private static class Stack<K>{
        Node<K>[] innerArray;
        int currentPosition=0;
        int size = 0;
        public Stack(Node<K>[] innerArray){
            this.innerArray = innerArray;
        }
        public Stack(){
            this.innerArray = new Node[1];
        }
        public boolean isEmpty(){
            return innerArray.length == 0;
        }
        public void push(Node<K> node){
            if(currentPosition == innerArray.length-1){
                Node<K>[] copyArray =new Node[innerArray.length*2];
                for(int i=0;i<innerArray.length;i++){
                    copyArray[i] = innerArray[i];
                }
                innerArray = copyArray;
            }
            innerArray[currentPosition++] = node;
            size = size +1;
        }
        public Node<K> pop(){
            if(innerArray[currentPosition-1]==null){
                return null;
            }
            Node<K> nodeToReturn = innerArray[--currentPosition];
            size = size -1;
            innerArray[currentPosition] = null;
            return nodeToReturn;
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

        System.out.println(integerTree.locateMinimum());
        /*integerTree.deleteMinimum();*/



        /*List<Node<Integer>> list=integerTree.retrieveInOrder();
        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }*/

       integerTree.deleteNode(6);

        System.out.println(integerTree);
       /* System.out.println(node);*/
    }

}
