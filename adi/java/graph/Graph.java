package com.graph;

public class Graph {
    private Bag[] arr;
    private int V;
    private int E;
    private boolean[] marked;
    private int[] edgeTo;
    private Graph(int k){
        arr=new Bag[k];
        for(int i=0;i<k;i++){
            arr[i]=new Bag();
        }
        this.V=k;
    }

    public void dfs(){

    }

    public int edge(){
        return E;
    }

    public int vertex(){
        return V;
    }

    public void addEgde(int v,int w){
        arr[v].insert(w);
        arr[w].insert(v);
        E++;
    }

    public int degree(int v){
        int count=0;
        for(int a:arr[v]){
            count++;
        }
        return count;
    }

    public int maxDegree(){
        int max=0;
        for(int i=0;i<V;i++){
            max=max<degree(i)?degree(i):max;
        }
        return max;
    }

    public float avgDegree(){
        int avg=0;
        for(int i=0;i<V;i++){
            avg+=degree(i);
        }
        return (float)avg/V;
    }
}
