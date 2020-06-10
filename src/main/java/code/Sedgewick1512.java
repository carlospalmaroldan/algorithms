package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sedgewick1512 {

    int[] id;
    int count;

    public Sedgewick1512(int[] id){
        this.id = id;
        this.count = id.length;
    }

    int find(int p){
        List<Integer> nodes = new ArrayList<Integer>();
        while(p!=id[p]){
            nodes.add(p);
            p = id[p];
        }
        for(int i = 0; i < nodes.size();i++){
            id[nodes.get(i)] = p;
        }
        return p;
    }

    void union(int p, int q){
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) return;
        id[pRoot] = qRoot;
        count --;
    }

    Map<String,List<Integer>> improvedFind(int p){
        List<Integer> nodes = new ArrayList<>();
        Map<String,List<Integer>> output = new HashMap<>();
        List<Integer> root = new ArrayList<>();
        while(id[p] != p){
            nodes.add(p);
            p = id[p];
        }
        root.add(p);
        output.put("nodes",nodes);
        output.put("root",root);
        return output;
    }

    void improvedUnion(int p, int q){
        Map<String,List<Integer>> pMap = improvedFind(p);
        Map<String,List<Integer>> qMap = improvedFind(q);
        if(pMap.get("root").get(0) == qMap.get("root").get(0)) return;
        id[pMap.get("root").get(0)] = qMap.get("root").get(0);
        for (int i =0 ; i<pMap.get("nodes").size(); i++){
            id[pMap.get("nodes").get(i)] = qMap.get("root").get(0);
        }
        for(int i = 0; i < qMap.get("nodes").size(); i++){
            id[qMap.get("nodes").get(i)] = qMap.get("root").get(0);
        }
    }
}


