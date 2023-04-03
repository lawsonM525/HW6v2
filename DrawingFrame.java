import java.awt.*;
import javax.swing.*;

public class DrawingFrame extends JFrame{

    DrawingPanel panel;

    DrawingFrame(GeomGraph g){

        panel = new DrawingPanel(g);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit the program when the window is closed

        this.add(panel);//adds the panel to the frame   
        this.pack();
        
        this.setLayout(null);// allows fram to appear in middle of screen
        this.setVisible(true);//makes the window visible
    }

    public void update(GeomGraph g){
        panel = new DrawingPanel(g);
        this.add(panel);
        this.repaint();
    }

    public void clear(){
        panel = new DrawingPanel();
        this.add(panel);
        this.repaint();
    }

}

