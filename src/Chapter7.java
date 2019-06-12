public class Chapter7 {
    public static  void main(String[] args){
        int[] A={13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11};
        quicksort(A,0,A.length-1);
        printArray(A);
    }

    public static int partition(int[] A,int p, int r){
        int x=A[r];
        int i=p-1;
        int temp=0;
        for(int j=p;j<r;j++){
            if(A[j]<x){
                i=i+1;
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;

            }
        }
        temp=A[i+1];
        A[i+1]=A[r];
        A[r]=temp;
        return i+1;
    }

    public static void quicksort(int[] A,int p,int r){
        if(p<r){
            int q=partition(A,p,r);
            quicksort(A,p,q-1);
            quicksort(A,q+1,r);
        }
    }

    public static void printArray(int[] A){
        for(int j=0;j<A.length;j++) {
            System.out.println(A[j]);
        }
    }
}
