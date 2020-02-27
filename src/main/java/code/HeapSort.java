package main.java;

public class HeapSort {


    public static void main(String[] args){
        int[] A=new int[]{9,4,6,1,7,3,5,8};
        int[] B=maxHeapify(A);
        for(int i=0;i<B.length;i++){
            System.out.println(B[i]);
        }
    }

    public static void heapSort(int[] A){


    }

    public static int[] maxHeapify(int[] A){
            int[] B=new int[A.length+1];
            for(int j=0;j<A.length;j++){
                B[j+1]=A[j];
            }

            for(int i=1;i<A.length/2+1;i++){
                    sortSubTree(i,B);
            }
            return B;
    }

    public static void sortSubTree(int i, int[] A){
        if(2*i+1<=A.length-1  && A[2*i+1]<A[2*i]  && A[i]<A[2*i]  ){
                int temp = A[i];
                A[i] = A[2 * i];
                A[2 * i] = temp;
                sortSubTree(2 * i, A);
        }else if(2*i+1<=A.length-1  && A[i]<A[2*i+1] && A[2*i]<A[2*i+1]){
               int temp=A[i];
               A[i]=A[2*i+1];
               A[2*i+1]=temp;
               sortSubTree(2*i+1,A);
        }else if(2*i <= A.length-1 && 2*i+1 > A.length-1 && A[i]<A[2*i]){
               int temp = A[i];
               A[i] = A[2 * i];
               A[2 * i] = temp;
        }
    }
}
