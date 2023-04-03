import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawingPanel extends JPanel{

    ArrayList<Point> points = new ArrayList<Point>();
    ArrayList<Edge> edges = new ArrayList<Edge>();
    
    DrawingPanel(GeomGraph g){
        points = g.getPoints();
        this.setPreferredSize(new Dimension(500, 500));
    }

    DrawingPanel(){
        this.setPreferredSize(new Dimension(500, 500));
    }

    //The following paint function draws the points and edges of the graph
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        for (Point p : points) {
            p.drawPoint(g2D);
        }

        for (Edge e : edges) {
            Point p1 = points.get(e.getV1());
            Point p2 = points.get(e.getV2());
            g2D.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
        
    }


}