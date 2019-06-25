public class Chapter7 {
    public static  void main(String[] args){
        int[] A={13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11};
        quicksort(A,0,A.length-1);
        printArray(A);
        int[] B={13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11};
        quicksortDecrease(B,0,B.length-1);
        System.out.println("Decreasing");
        printArray(B);
        int[] C={13, 19, 9, 5, 12, 8, 7, 4, 11, 2, 6, 21};
        quicksortHoare(C,0,C.length-1);
        System.out.println("Hoare");
        printArray(C);
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

    public static void quicksortHoare(int[] A,int p,int r){
        if(p<r){
            int q=hoarePartition(A,p,r);
            quicksortHoare(A,p,q);
            quicksortHoare(A,q+1,r);
        }
    }

    public static  int partitionDecrease(int[] A,int p, int r){
        int x=A[r];
        int i=p-1;
        int temp=0;
        for(int j=p;j<r;j++){
            if(A[j]>x){
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

    public static void quicksortDecrease(int[] A,int p,int r){
        if(p<r){
            int q=partitionDecrease(A,p,r);
            quicksortDecrease(A,p,q-1);
            quicksortDecrease(A,q+1,r);
        }
    }

    public static void printArray(int[] A){
        for(int j=0;j<A.length;j++) {
            System.out.println(A[j]);
        }
    }

    public static int hoarePartition(int[] A,int p,int r){
        int x=A[p];
        int i=p-1;
        int j=r+1;
        while(true){
            do{
                j=j-1;
            }while(A[j]>x);
            do{
                i=i+1;
            }while(A[i]<x);

            if (i<j){
                int temp= A[i];
                A[i]=A[j];
                A[j]=temp;
            }else{
                return j;
            }
        }
    }
}
