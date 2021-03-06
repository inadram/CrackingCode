package dataStructures.treesAndGraphs.Two;

import dataStructures.treesAndGraphs.lib.directedGraph.Edge;
import dataStructures.treesAndGraphs.lib.directedGraph.Vertex;

import java.util.HashSet;

public class RouteDirectedGraphRecursively {

	public boolean checkRecursively(Vertex fromVertex, Vertex toVertex) {
		return checkVertexRecursively(fromVertex.out, toVertex, false);
	}

	private boolean checkVertexRecursively(HashSet<Edge> Edges, Vertex toVertex, boolean exist) {
		if (Edges.iterator().hasNext()) {
			Edge next = Edges.iterator().next();
			Edges.remove(next);

			if (next.to.equals(toVertex)) {
				return true;
			} else if (!next.to.visited) {
				next.to.visited = true;
				exist = checkVertexRecursively(next.to.out, toVertex, exist);
			}

			exist = checkVertexRecursively(Edges, toVertex, exist);
		}
		return exist;
	}


}
