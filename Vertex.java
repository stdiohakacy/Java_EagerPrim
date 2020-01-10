package SpanningTree.EagerPrim;

import java.util.ArrayList;
import java.util.List;


public class Vertex implements Comparable<Vertex> {

	private String name;
	private Edge minEdge;
	private boolean isVisited;
	private double distance = Double.POSITIVE_INFINITY;
	private List<Edge> adjacencies;

	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacencies = new ArrayList<Edge>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Edge getMinEdge() {
		return minEdge;
	}

	public void setMinEdge(Edge minEdge) {
		this.minEdge = minEdge;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Vertex [name=" + name + "]";
	}
	
	

	public List<Edge> getAdjacencies() {
		return adjacencies;
	}

	public void setAdjacencies(List<Edge> adjacencies) {
		this.adjacencies = adjacencies;
	}

	@Override
	public int compareTo(Vertex otherVertex) {
		return Double.compare(this.distance, otherVertex.getDistance());
	}
	
	public void addEdge(Edge edge) {
		this.adjacencies.add(edge);
	}

}
