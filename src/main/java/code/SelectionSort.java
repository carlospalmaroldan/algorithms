package code;

public class SelectionSort {

    public static void main(String[] args){
        int[] A={13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11};
        for(int j=0;j<A.length-1;j++){
            int min= A[j];
            int index = j;
            for(int i=j;i<A.length;i++){
                if(A[i]<min){
                    min = A[i];
                    index = i;
                }
            }
            A[index]=A[j];
            A[j]=min;
        }
        for(int i=0;i<A.length;i++)
        System.out.println(A[i]);
    }


}
