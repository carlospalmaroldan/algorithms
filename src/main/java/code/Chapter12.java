package main.java;

public class Chapter12 {




   public static void main(String[] args){
       /*Node node6= new Node();
       Node node5= new Node();
       Node node2= new Node();
       Node node7= new Node();
       Node node55 = new Node();
       Node node8=new Node();
       node6.setLeft(node5);
       node6.setKey(6L);
       node6.setRight(node7);
       node5.setParent(node6);
       node5.setLeft(node2);
       node5.setRight(node55);
       node5.setKey(5L);
       node2.setParent(node5);
       node2.setKey(2L);
       node55.setParent(node5);
       node55.setKey(5L);
       node7.setParent(node6);
       node7.setKey(7L);
       node7.setRight(node8);
       node8.setParent(node7);
       node8.setKey(8L);

       inOrderTreeWalk(node6);*/

       Node node15= new Node();
       Node node6= new Node();
       Node node3 = new Node();
       Node node2=new Node();
       Node node4 = new Node();
       Node node7=new Node();
       Node node13=new Node();
       Node node9=new Node();
       Node node18= new Node();
       Node node17= new Node();
       Node node20= new Node();

       node15.setLeft(node6);
       node15.setRight(node18);
       node15.setKey(15L);
       node6.setLeft(node3);
       node6.setRight(node7);
       node6.setKey(6L);
       node6.setParent(node15);
       node3.setParent(node6);
       node3.setLeft(node2);
       node3.setRight(node4);
       node3.setKey(3L);
       node2.setParent(node3);
       node2.setKey(2L);
       node4.setParent(node3);
       node4.setKey(4L);
       node7.setParent(node6);
       node7.setRight(node13);
       node7.setKey(7L);
       node13.setParent(node7);
       node13.setKey(13L);
       node13.setLeft(node9);
       node9.setParent(node13);
       node9.setKey(9L);
       node18.setParent(node15);
       node18.setRight(node20);
       node18.setLeft(node17);
       node18.setKey(18L);
       node17.setParent(node18);
       node17.setKey(17L);
       node20.setParent(node18);
       node20.setKey(20L);



       Node result= iterativeTreeSearch(node15,13L);
       System.out.println(result.getKey());


       System.out.println(minimum(node15).getKey());
       System.out.println(maximum(node15).getKey());
       System.out.println(successor(node13).getKey());
       System.out.println(predecessor(node17).getKey());
       Node node16 = new Node();
       node16.setKey(16L);
     /*  treeInsert(node15,node16);
       System.out.println("printing after the insertion");
       inOrderTreeWalk(node15);*/
       treeDelete(node3);
       System.out.println("printing after deletion");
       inOrderTreeWalk(node15);

   }


   public static void inOrderTreeWalk(Node node){
       if(node!=null){
           inOrderTreeWalk(node.getLeft());
           System.out.println(node.getKey());
           inOrderTreeWalk(node.getRight());
       }
   }

   public static Node iterativeTreeSearch(Node node,Long key){
       Node output= new Node();
       while(node != null &&  key!= node.getKey()){
           if(key<node.getKey()){
               node=node.getLeft();
           }else{
               node=node.getRight();
           }

       }
       return node;
   }

   public static Node minimum(Node node){
       while(node.getLeft() != null){
           node = node.getLeft();
       }
       return node;
   }

   public static Node maximum(Node node){
       while(node.getRight() != null){
           node = node.getRight();
       }
       return node;
   }

   public static Node successor(Node node){
       if(node.getRight() != null){
           return minimum(node.getRight());
       }else{
           Node parent= node.getParent();
           while(node.getParent() != null && parent.getRight() == node ){
               node = parent;
               parent = parent.getParent();
           }
           return parent;
       }
   }

   public static Node predecessor(Node node){
       if(node.getLeft() != null){
           return  maximum(node.getLeft());
       }else{
           Node parent= node.getParent();
           while(node.getParent() != null && parent.getLeft() == node ){
                node= parent;
                parent = parent.getParent();
           }
           return parent;
       }
   }


   public static void treeInsert(Node node,Node toInsert){
       Node parent = null;
       while(node != null) {
           parent=node;
           if (toInsert.getKey() < node.getKey()) {
               node = node.getLeft();
           } else if (toInsert.getKey() > node.getKey()) {
               node = node.getRight();
           }
       }
       toInsert.setParent(parent);
       if(toInsert.getKey()<parent.getKey()){
           parent.setLeft(toInsert);
       }else{
           parent.setRight(toInsert);
       }
   }

   public static void transplant(Node previous, Node actual){
       if(previous.getParent().getLeft()==previous){
           previous.getParent().setLeft(actual);
       }else if (previous.getParent().getRight() == previous){
           previous.getParent().setRight(actual);
       }
       if(actual != null){
           actual.setParent(previous.getParent());
       }
   }


   public static void treeDelete(Node node){
       if(node.getLeft() == null){
           transplant(node,node.getRight());
       }else if(node.getRight() == null){
           transplant(node,node.getLeft());
       }else{
           Node succesor= minimum(node.getRight());
           if(succesor.getParent() != node){
               transplant(succesor,succesor.getRight());
               succesor.setRight(node.getRight());
               succesor.getRight().setParent(succesor);
           }
           transplant(node,succesor);
           succesor.setLeft(node.getLeft());
           succesor.getLeft().setParent(succesor);
       }

   }

    public static class Node{
       private Node parent;
       private Node left;
       private Node right;
       private Long key;


        public void setKey(Long key) {
            this.key = key;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right){
           this.right=right;
        }

        public void setParent(Node parent){
            this.parent=parent;
        }

        public Node getLeft(){
            return this.left;
        }

        public Node getRight(){
            return this.right;
        }

        public Long getKey(){
            return this.key;
        }

        public Node getParent(){
            return this.parent;
        }

    }


}
