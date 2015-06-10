package main.dataStructures.TreesAndGraphs;

import java.util.HashSet;

public class Vertex {
    HashSet<Edge> in;
    HashSet<Edge> out;
    String data;

    public Vertex(String data){
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
