public class MergeSort {


    public static void main(String[] args){


        int[] A={1,4,2,6,9,7,3,5,8,8};
        int[] B=mergeSort(A);


        for(int h=0;h<B.length;h++){
            System.out.println(B[h]);
        }
    }

    public static int[] mergeSort(int[] A){
        if(A.length>2){
            int[] right=right(A);
            int[] left=left(A);
            int[] sortedRight=mergeSort(right);
            int[] sortedLeft=mergeSort(left);
            return merge(sortedLeft,sortedRight);
        }else{
            if(A.length==1){
                return A;
            }
            if(A[0]<A[1]){
                return A;
            }else{
                int temp=A[0];
                A[0]=A[1];
                A[1]=temp;
                return A;
            }
        }
    }


    public static int[] left(int[] A){
        int[] left=new int[A.length/2];
        for(int i=0;i<A.length/2;i++){
            left[i]=A[i];
        }
        return left;
    }

    public static int[] right(int[] A){
        int[] right;
        if(A.length%2==0){
            right=new int[A.length/2];
            for(int i=0;i<A.length/2;i++){
                right[i]=A[A.length/2+i];
            }
        }else{
            right=new int[A.length/2+1];
            for(int i=0;i<A.length/2+1;i++){
                right[i]=A[A.length/2+i];
            }
        }

        return right;
    }


   public static int[] merge(int[] sortedLeft,int[] sortedRight){
            int i=0;
            int j=0;
            int[] output=new int[sortedLeft.length+sortedRight.length];
            int k=0;
            for(int p=0;p<sortedLeft.length+sortedRight.length;p++){
                if(i>sortedLeft.length-1){
                    for(int l=j;l<sortedRight.length;l++){
                        output[k]=sortedRight[l];
                        k=k+1;
                    }
                    return output;
                }
                if(j>sortedRight.length-1){
                    for(int o=i;o<sortedLeft.length;o++){
                        output[k]=sortedLeft[o];
                        k=k+1;
                    }
                    return output;
                }
                if(sortedLeft[i]<sortedRight[j]){
                    output[k]=sortedLeft[i];
                    i=i+1;
                    k=k+1;
                }else{
                    output[k]=sortedRight[j];
                    j=j+1;
                    k=k+1;
                }
            }
            return output;
   }
}
