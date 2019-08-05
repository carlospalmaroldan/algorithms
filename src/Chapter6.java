import java.util.List;

public class Chapter6 {


    public static  void main(String[] args){
        int[] A={0,16,4,10,14,7,9,3,2,8,1};
        maxHeapify(A,2);
        printArray(A);
        int[] B={0,4,1,3,2,16,9,10,14,8,7};
        buildMaxHeap(B);
        System.out.println("buildMaxHeap");
        printArray(B);

        int[] C={0,16,14,10,8,7,9,3,2,4,1};
        heapSort(C);
        System.out.println("heapSort");
        printArray(C);


        System.out.println("heapExtractMax");
        int[] D={0,15,13,9,5,12,8,7,4,0,6,2,1};
        System.out.println("max value = "+heapExtractMax(D));
        for(int j=0;j<D.length-1;j++) {
            System.out.println(D[j]);
        }

        System.out.println("maxHeapInsert");
        int[] E={0,15,13,9,5,12,8,7,4,0,6,2,1};

        printArray(maxHeapInsert(E,10));

        /*int[] G={0,15,13,9,0,2,1,7,4,5,6,12,8};
        minHeapify(G ,2);*/

        System.out.println("buildMinHeap");
        int[] F={0,15,13,9,5,12,8,7,4,0,6,2,1};
        buildMinHeap(F);
        printArray(F);

        System.out.println("minHeapSort");
        minHeapSort(F);
        printArray(F);

        System.out.println("heapSortIterative");
        int[] G={0,16,4,10,14,7,9,3,2,8,1};
        heapSortIterative(G,2);
        printArray(G);
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

    public static void maxHeapifyVariableHeapSize(int[] A,int heapsize,int i){
        int l=left(i);
        int r=right(i);
        int largest=0;

        if (l < heapsize && A[l]>A[i]) {
            largest=l;
        }else{
            largest=i;
        }
        if(r<heapsize && A[r]>A[largest]){
            largest=r;
        }
        if(largest!=i){
            int temp=A[i];
            A[i]=A[largest];
            A[largest]=temp;
            maxHeapifyVariableHeapSize(A,heapsize,largest);
        }
    }

    public static int parent(int i){
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


    public static void buildMaxHeap(int[] A){

        int limit=0;
        if(A.length%2==0) {
           limit= A.length / 2;
        }else{
            limit=A.length/2+1;
        }
        for(int j=limit;j>0;j--){
            maxHeapify(A,j);
        }
    }

    public static void heapSort(int[] A){
        buildMaxHeap(A);
        int temp=0;
        int heapsize=A.length;
        for(int i=A.length-1;i>1;i--){
            temp=A[i];
            A[i]=A[1];
            A[1]=temp;
            heapsize= heapsize-1;
            maxHeapifyVariableHeapSize(A,heapsize,1);
        }
    }

    public static int heapExtractMax(int[] A){
        if(A.length<1) {
            throw new RuntimeException("heap underflow");
        }
        int max=A[1];
        A[1]=A[A.length-1];
        maxHeapifyVariableHeapSize(A,A.length-1,1);

        return max;
    }

    public static void heapIncreaseKey(int[] A,int i,int key){
        if(key<A[i]){
            throw new RuntimeException("new key is smaller than current key");
        }
        A[i]=key;
        while (i>1 && A[parent(i)]<A[i]){
            int temp=A[i];
            A[i]=A[parent(i)];
            A[parent(i)]=temp;
            i=parent(i);
        }
    }

    public static int[] maxHeapInsert(int[] A,int key){
        int[] B=new int[A.length+1];
        for(int j=0;j<A.length;j++){
            B[j]=A[j];
        }
        B[B.length-1]=-10000;
        heapIncreaseKey(B,B.length-1,key);
        return B;
    }

    public static void printArray(int[] A){
        for(int j=0;j<A.length;j++) {
            System.out.println(A[j]);
        }
    }


    public static void minHeapify(int[] A,int i){
        int l=left(i);
        int r=right(i);
        int smallest=0;
        if(l<A.length && A[l]<A[i]){
            smallest=l;
        }else{smallest=i;}
        if(r<A.length && A[r]<A[smallest]){
            smallest=r;
        }
        if(smallest!=i){
            int temp=A[i];
            A[i]=A[smallest];
            A[smallest]=temp;
            minHeapify(A,smallest);
        }
    }

    public static void buildMinHeap(int[] A){
        int limit=0;
        if((A.length-1)%2==0){
            limit=A.length/2;
        }else{
            limit=(A.length-2)/2;
        }
        for(int i=limit;i>0;i--){
            minHeapify(A,i);
        }
    }

    public static void minHeapifyVariable(int[] A,int i,int heapsize){
        int l=left(i);
        int r=right(i);
        int smallest=0;
        if(l<heapsize && A[l]<A[i]){
            smallest=l;
        }else{smallest=i;}
        if(r<heapsize && A[r]<A[smallest]){
            smallest=r;
        }
        if(smallest!=i){
            int temp=A[i];
            A[i]=A[smallest];
            A[smallest]=temp;
            minHeapifyVariable(A,smallest,heapsize);
        }
    }
    public static void minHeapSort(int[] A){
        buildMinHeap(A);
        int heapsize=A.length;
        for(int i=0;i<A.length-2;i++){
            int temp = A[1];
            A[1] = A[heapsize - 1];
            A[heapsize - 1] = temp;
            heapsize=heapsize-1;
            minHeapifyVariable(A, 1,heapsize);
        }
    }

    public static void heapSortIterative(int[] A,int i){
        int position=i;
        int largest=i;
        while(largest<A.length){
            int l=left(largest);
            int r=right(largest);
            if (l < A.length && A[l] > A[largest]){
                largest=l;
            }
            if(r< A.length && A[r] >A[largest]){
                largest=r;
            }
            if(position!=largest){
                int temp=A[largest];
                A[largest]=A[position];
                A[position]=temp;
                position=largest;
            }else{return;}
        }
    }
}
