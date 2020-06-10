package code;

public class WeightedQuickUnion {
    private int[] id;
    private int[] size;
    private int count;

    public WeightedQuickUnion(int N){
        id = new int[N];
        size= new int[N];
        for(int i=0; i< N;i++) {
            id[i] = i;
            size[i] = 1;
        }
        count = N-1;
    }

    public int find(int p){
        while(p!=id[p]) p = id[p];
        return p;
    }

    public void union(int p, int q){
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) return;
        if(size[p]<size[q]){
            id[pRoot] = qRoot;
            size[qRoot]++;
        }else{
            id[qRoot] = pRoot;
            size[pRoot]++;
        }
        count--;
    }

    public boolean connected(int p,int q){
        return find(p)==find(q);
    }

    public int getCount(){
        return count;
    }
}
