package main.dataStructures.TreesAndGraphs.Two;
import main.dataStructures.TreesAndGraphs.Lib.DirectedGraph.Edge;
import main.dataStructures.TreesAndGraphs.Lib.DirectedGraph.Vertex;

public class RouteDirectedGraph {
    public boolean check(Vertex fromVertex, Vertex toVertex) {
        return checkVertexes(fromVertex, toVertex, false);
    }

    private boolean checkVertexes(Vertex fromVertex, Vertex toVertex, boolean exist) {
        for (Edge edge : fromVertex.out) {
            if (edge.to.equals(toVertex)) {
                return true;
            } else if (!edge.to.visited) {
                edge.to.visited = true;
                exist = checkVertexes(edge.to, toVertex, exist);
            }
        }
        return exist;
    }
}
