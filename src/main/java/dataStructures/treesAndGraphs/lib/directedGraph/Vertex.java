package dataStructures.treesAndGraphs.lib.directedGraph;

import java.util.HashSet;

public class Vertex {
    public HashSet<Edge> in;
    public HashSet<Edge> out;
    public int data;
    public boolean visited =false;

    public Vertex(int data){
        this.data=data;
        in =new HashSet<Edge>();
        out= new HashSet<Edge>();
    }

    public Vertex addEdge(Vertex to){
        Edge e = new Edge(this,to);
        out.add(e);
        to.in.add(e);
        return this;
    }
}
