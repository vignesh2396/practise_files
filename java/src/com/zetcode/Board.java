package com.zetcode;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

public class Board extends JPanel {
    @Override
    public void paintComponent(Graphics g){ //The painting is done inside the paintComponent() method.
        super.paintComponent(g);
        drawDonut(g);
    }

    private void drawDonut(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        //The rendering hints are used to make the drawing smooth.
        RenderingHints rh;
        rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        //We get the height and the width of the window.
        // We need them to center the donut shape on the window.
        Dimension size = getSize();
        double w = size.getWidth();
        double h = size.getHeight();

        //Here we create the ellipse.
        Ellipse2D e = new Ellipse2D.Double(0,0,80,180);
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(Color.orange);

        //Here the ellipse is rotated 72 times to create a donut shape.
        for (double deg = 0; deg < 360; deg += 10){
            AffineTransform at
                    = AffineTransform.getTranslateInstance(w/2,h/2);
            at.rotate(Math.toRadians(deg));
            g2d.draw(at.createTransformedShape(e));
        }

    }

}
