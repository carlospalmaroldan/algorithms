public class QuickSort {


    public static void main(String[] args){
        int[] A= new int[]{10,80,30,90,40,50,70};
        quickSort(A,0,A.length-1);
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }

    public static void quickSort(int[] A,int start,int end){
        int pivot=A[end];
        int smaller=-1;
        int temp=0;
        for(int j=0;j<A.length;j++){
            if(A[j]<pivot){
                smaller=smaller+1;
                temp=A[j];
                A[j]=A[smaller];
                A[smaller]=temp;
            }
        }
        smaller=smaller+1;
        A[end]=A[smaller];
        A[smaller]=pivot;

        if(smaller>1 && smaller<end-1) {
            quickSort(A,start,smaller-1);
            quickSort(A,smaller+1,end);
        }


    }


}
