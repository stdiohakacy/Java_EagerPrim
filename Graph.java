package SpanningTree.EagerPrim;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private List<Vertex> vertexList;
	private List<Edge> edgeList;

	public Graph() {
		super();
		this.vertexList = new ArrayList<Vertex>();
		this.edgeList = new ArrayList<Edge>();
	}

	public void addVertex(Vertex vertex) {
		this.vertexList.add(vertex);
	}

	public void addEdge(Edge edge) {
		Vertex start = edge.getStartVertex();
		Vertex target = edge.getTargetVertex();

		this.vertexList.get(vertexList.indexOf(start)).addEdge(new Edge(edge.getWeight(), start, target));
		this.vertexList.get(vertexList.indexOf(target)).addEdge(new Edge(edge.getWeight(), target, start));
	}

	public List<Vertex> getVertexList() {
		return vertexList;
	}

	public void setVertexList(List<Vertex> vertexList) {
		this.vertexList = vertexList;
	}

	public List<Edge> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(List<Edge> edgeList) {
		this.edgeList = edgeList;
	}

}
