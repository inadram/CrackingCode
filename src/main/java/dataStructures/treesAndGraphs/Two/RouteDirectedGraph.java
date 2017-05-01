package dataStructures.treesAndGraphs.Two;
import  dataStructures.treesAndGraphs.lib.directedGraph.Edge;
import  dataStructures.treesAndGraphs.lib.directedGraph.Vertex;

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
