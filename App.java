package SpanningTree.EagerPrim;

public class App {

	public static void main(String[] args) {
		Graph graph = new Graph();
		
		Vertex vertexA = new Vertex("A");
		Vertex vertexB = new Vertex("B");
		Vertex vertexC = new Vertex("C");
		Vertex vertexD = new Vertex("D");
		Vertex vertexE = new Vertex("E");
		Vertex vertexF = new Vertex("F");
		Vertex vertexG = new Vertex("G");
		
		graph.addVertex(vertexA);
		graph.addVertex(vertexB);
		graph.addVertex(vertexC);
		graph.addVertex(vertexD);
		graph.addVertex(vertexE);
		graph.addVertex(vertexF);
		graph.addVertex(vertexG);
		
		graph.addEdge(new Edge(7, vertexA, vertexB));
		graph.addEdge(new Edge(5, vertexA, vertexD));
		graph.addEdge(new Edge(9, vertexD, vertexB));
		graph.addEdge(new Edge(15, vertexD, vertexE));
		graph.addEdge(new Edge(6, vertexD, vertexF));
		graph.addEdge(new Edge(7, vertexB, vertexE));
		graph.addEdge(new Edge(8, vertexB, vertexC));
		graph.addEdge(new Edge(5, vertexC, vertexE));
		graph.addEdge(new Edge(8, vertexF, vertexE));
		graph.addEdge(new Edge(11, vertexF, vertexG));
		graph.addEdge(new Edge(9, vertexE, vertexG));
		
		Algorithm alg = new Algorithm(graph);
		alg.spanningTree();
		alg.show();
	}

}
