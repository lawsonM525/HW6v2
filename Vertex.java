
// This class represents a vertex in the graph.
// It contains the vertex's id and name ...and eventually other information


public class Vertex {
    private int id;
    private String name;

    public Vertex(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String changeName(String newName) {
        name = newName;
        return name;
    }

    public String toString() {
        return "(" + id + ": " + name + ")";
    }

    
}