package ds;

import interfaces.DisjointSet;

public class DisjointSet implements DisjointSetInterface {
    int size;
    int parent[];
    int rank[];
    public DisjointSet(size){
        this.size = size;
        parent = new int[size];
        rank = new int[size];

        for(int i = 0;i < size; i++)
            parent[i] = i;
        
        for(int i = 0;i < size; i++)
            rank[i] = 0;
    }
    public void union(int set1, int set2){
        int parentSet1 = find(set1);
        int parentSet2 = find(set2);

        if(rank[parentSet1] > rank[parentSet2]){
            parent[parentSet2] = parentSet1;
        }else if(rank[parentSet1] < rank[parentSet2]){
            parent[parentSet1] = parentSet2;
        }else{
            parent[parentSet2] = parentSet1;
            rank[parentSet1] ++;
        }
    }
    public int find(int set){
        // with path compression
        if(parent[set] == set)
            return set;
       
        parent[set] =  find(parent[set]);;

        return parent[set];
    }
    public int size() {
        return this.size;
    }
}
