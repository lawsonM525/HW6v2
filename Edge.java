// This class represents an edge between two vertices with specified indices.
import java.awt.Graphics;

public class Edge {
    private int v1;
    private int v2;

    public Edge(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public int getV1() {
        return v1;
    }

    public int getV2() {
        return v2;
    }

    public String toString() {
        return "(" + v1 + " <-> " + v2 + ")";
    }

    public void drawEdge(Graphics g, Point p1, Point p2 ) {
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
    }


}
