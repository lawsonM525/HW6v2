import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class GeomGraph extends Graph{
    public ArrayList<Point> points;
    public ArrayList<Edge> edges = new ArrayList<Edge>();
    Random rand = new Random();

    public GeomGraph() {
        super();
        points = new ArrayList<Point>();
    }  

    public void addVertex(String name) {
        super.addVertex(name);

        //make a random x and y
        int x = rand.nextInt(500);
        int y = rand.nextInt(500);

        Point p = new Point(x, y, name);
        points.add(p);
    }

    public void addEdge(int v1, int v2) {
        super.addEdge(v1, v2);

        Edge e = new Edge(v1, v2);
        edges.add(e);
    }

    public void drawGraph(Graphics g) {
        for (Point p : points) {
            p.drawPoint(g);
        }
        for (Edge e : edges) {
            e.drawEdge(g, points.get(e.getV1()), points.get(e.getV2()));
        }
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    
}
