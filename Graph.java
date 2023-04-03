// This is a graphical representation of a graph using a group of vertices and edges.

import java.util.ArrayList;

public class Graph {
    ArrayList<Vertex> vertices;
    ArrayList<Edge> edges;
    
    public Graph() {
        vertices = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();
    }

    public void addVertex(String name) {
        Vertex v = new Vertex(vertices.size(), name);
        vertices.add(v);
    }

    public void addEdge(int v1, int v2) {//v1 and v2 are the ids of the vertices
        Edge e = new Edge(v1, v2);
        edges.add(e);
    }

    public String toString(){
        String s = "Vertices:";
        for (Vertex v : vertices) {
            s += v.toString() + " ";
        }
        s += "Edges:";
        for (Edge e : edges) {
            s += e.toString() + " ";
        }
        return s;        
    }

}
