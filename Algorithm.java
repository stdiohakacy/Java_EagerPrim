package SpanningTree.EagerPrim;

import java.util.List;
import java.util.PriorityQueue;

public class Algorithm {
	private List<Vertex> vertexList;
	private PriorityQueue<Vertex> heap;

	public Algorithm(Graph graph) {
		super();
		this.vertexList = graph.getVertexList();
		this.heap = new PriorityQueue<Vertex>();
	}
	
	public void spanningTree() {
		for (Vertex vertex : vertexList) {
			if(!vertex.isVisited()) {
				makePrimJarnik(vertex);
			}
		}
	}
	
	public void makePrimJarnik(Vertex vertex) {
		vertex.setDistance(0);
		heap.add(vertex);
		while (!heap.isEmpty()) {
			Vertex v = heap.remove();
			scanVertex(v);
		}
	}
	
	private void scanVertex(Vertex vertex) {
		vertex.setVisited(true);
		for (Edge edge : vertex.getAdjacencies()) {
			Vertex target = edge.getTargetVertex();
			if(target.isVisited())
				continue;
			if(edge.getWeight() < target.getDistance()) {
				target.setDistance(edge.getWeight());
				target.setMinEdge(edge);
				
				if(this.heap.contains(target)) {
					this.heap.remove(target);
				}
				this.heap.add(target);
			}
		}
	}
	
	
	
	public void show() {
		for (Vertex vertex : vertexList) {
			if(vertex.getMinEdge() != null) {
				Edge edge = vertex.getMinEdge();
				System.out.println("Edge " + edge.getStartVertex() + " - " + edge.getTargetVertex());
			}
		}
	}

}
