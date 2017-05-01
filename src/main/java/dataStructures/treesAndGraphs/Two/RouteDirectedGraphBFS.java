package dataStructures.treesAndGraphs.Two;

import dataStructures.treesAndGraphs.lib.directedGraph.Edge;
import dataStructures.treesAndGraphs.lib.directedGraph.Vertex;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class RouteDirectedGraphBFS {
	public boolean check(Vertex fromVertex, Vertex toVertex) {
		Queue<HashSet<Edge>> edgesQueue = new LinkedList<HashSet<Edge>>();
		edgesQueue.add(fromVertex.out);
		boolean exist = false;
		while (edgesQueue.size() > 0 && !exist) {
			HashSet<Edge> edges = edgesQueue.remove();
			for (Edge edge : edges) {
				if (edge.to.equals(toVertex)) {
					exist = true;
					break;
				} else if (!edge.to.visited) {
					edge.to.visited = true;
					edgesQueue.add(edge.to.out);
				}
			}
		}
		return exist;
	}
}
