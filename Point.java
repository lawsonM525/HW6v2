// This class represents a graphical representation of a vertex in a graph

import java.awt.*;
import javax.swing.*;

public class Point{
    int x;
    int y;
    int radius;
    Color color;
    String name;

    public Point(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.radius = 5;
        this.color = Color.pink;
        this.name = name;
    }

    public void drawPoint(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
        g.setColor(Color.BLACK);
        g.drawString(name, x + radius, y + radius);
    }

    public void drawPoint(Graphics g, Color color) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
        g.setColor(Color.BLACK);
        g.drawString(name, x + radius, y + radius);
    }

}