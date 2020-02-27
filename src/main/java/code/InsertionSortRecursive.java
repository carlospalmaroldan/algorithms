package code;

public class InsertionSortRecursive {


    public static void main(String[] args){

        int[] A={2,1,5,0};
        insertionSortRecursive(A,3);
        for(int i=0;i<A.length;i++) {
            System.out.println(A[i]);
        }
    }

    public static void insertionSortRecursive(int[] A, int index){
        if(index>0){
            insertionSortRecursive(A, index-1);
            insert(A,index);
        }else {
            insert(A, index);
        }
    }

    public static void insert(int[] A,int j) {
        if (j < A.length - 1) {
            int k = A[j + 1];
            while (j > -1 && A[j] > k) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = k;
        }
    }
}
