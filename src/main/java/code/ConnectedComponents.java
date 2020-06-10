package code;

public class ConnectedComponents {
    int[] array;
    int[] sizes;
    int M;
    int N;
    public ConnectedComponents(int[][] matrix){
        M = matrix.length;
        N = matrix[0].length;
        sizes = new int[M*N];
        array = new int[M*N];
        for(int i =0 ; i<M*N;i++){
            array[i] = i;
            sizes[i] = 1;
        }

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(j-1>=0 && matrix[i][j] == 1 && matrix[i][j-1] == 1){
                    union(array[i*N+j],array[i*N+j-1]);
                }
                if(j+1 <= N-1 && matrix[i][j] == 1 && matrix[i][j+1]==1){
                    union(array[i*N+j],array[i*N+j+1]);
                }
                if(i-1 >=0 && matrix[i][j] == 1 && matrix[i-1][j] == 1 ){
                    union(array[i*N+j],array[(i-1)*N+j]);
                }
                if(i+1 <= M-1 && matrix[i][j] == 1 && matrix[i+1][j] == 1){
                    union(array[i*N+j],array[(i+1)*N+j]);
                }
            }
        }

    }

    public boolean connected(int i, int j){
        return root(i) == root(j);
    }

    public boolean connected(int[] point1,int[] point2){
        int i=point1[0]*N + point1[1];
        int j=point2[0]*N + point2[1];
        return root(i)==root(j);
    }

    public int root(int i){
        if(array[i] == i){
            return i;
        }else{
            return root(array[i]);
        }
    }

    public void union(int i, int j){
        int firstRoot = root(i);
        int secondRoot = root(j);
        if(firstRoot == secondRoot) return;
        if(sizes[firstRoot]< sizes[secondRoot]){
            array[firstRoot] = secondRoot;
            sizes[secondRoot] = sizes[secondRoot]+ sizes[firstRoot];
        }else {
            array[secondRoot] = firstRoot;
            sizes[firstRoot] = sizes[firstRoot] + sizes[secondRoot];
        }
    }

    public int[] getSizes(){
        return sizes;
    }

    public int[] getArray(){
        return array;
    }

}
