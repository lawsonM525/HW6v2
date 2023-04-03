// Tester for GeomGraph.java
import java.awt.*;
import javax.swing.*;

public class GeomGraphTester extends JPanel {

    DrawingFrame frame;
    GeomGraph g;
    

    public GeomGraphTester(){
        g = new GeomGraph();
        frame = new DrawingFrame(g);
    }
    
    public void addVertexTester(){
        System.out.println("TESTING ADDVERTEX on drawing frame");
        System.out.println("Adding vertex A");
        g.addVertex("A");
        frame.update(g);
        System.out.println("Adding vertex B");
        g.addVertex("B");
        frame.update(g);
        System.out.println("Adding vertex C");
        g.addVertex("C");
        frame.update(g);  
    }

    public void addEdgeTester(){
        System.out.println("TESTING ADDEDGE");
        System.out.println("Graph = " + g.toString());
        System.out.println("Adding edge A-B");
        g.addEdge(0, 1);
        frame.update(g);
        System.out.println("Graph = " + g.toString());
        System.out.println("Adding edge B-C");
        g.addEdge(1, 2);
        frame.update(g);
        System.out.println("Graph = " + g.toString());
        System.out.println("Adding edge C-A");
        g.addEdge(2, 0);
        frame.update(g);
        System.out.println(g.toString());
    }

    public static void main(String[] args) {
        GeomGraphTester tester = new GeomGraphTester();
        tester.addVertexTester();
        tester.addEdgeTester();
    }
}
