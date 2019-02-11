package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class DrawComponent extends JComponent{
	
	
	public void drawRectangle(Graphics g) {
		Graphics2D g2D=(Graphics2D)g;
		Rectangle rectangle=new Rectangle(5, 5, 100, 200);
		g2D.draw(rectangle);
	}

}
