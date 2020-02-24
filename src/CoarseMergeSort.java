public class CoarseMergeSort {


    public static void main(String[] args){

    }

    public static void coarseMergeSort(int[] A, int k){
        int[] minVector = new int[A.length/k];
        int[] minIndexes= new int[A.length/k];
        int[] B= new int[A.length];
        for(int m=0;m<A.length/k;m++){
            minVector[m]=A[m*k+1];
            minIndexes[m]=m*k+1;
        }
        for(int j=0;j<A.length;j++){
            B[j]=A[j];
        }
        for(int p=0;p<A.length;p++){
            
        }
    }


}
