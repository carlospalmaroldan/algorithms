public class Chapter5 {


    public static  void main(String[] args){
        int[] A={0,16,4,10,14,7,9,3,2,8,1};
        maxHeapify(A,2);
        for(int j=0;j<A.length;j++) {
            System.out.println(A[j]);
        }
    }

    public static void maxHeapify(int[] A,int i){

        int l=left(i);
        int r=right(i);
        int largest=0;

        if (l < A.length && A[l]>A[i]) {
                    largest=l;
            }else{
            largest=i;
        }
        if(r<A.length && A[r]>A[largest]){
            largest=r;
        }
        if(largest!=i){
            int temp=A[i];
            A[i]=A[largest];
            A[largest]=temp;
            maxHeapify(A,largest);
        }


    }

    public int parent(int i){
        if(i%2==0) {
            return i / 2;
        }else{
            return (i-1)/2;
        }
    }

    public static int left(int i){
        return 2*i;
    }

    public static int right(int i){
        return 2*i+1;
    }

}
