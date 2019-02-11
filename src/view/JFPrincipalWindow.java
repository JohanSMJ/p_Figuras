package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import controller.Commands;
import controller.Control;

public class JFPrincipalWindow extends JFrame{
	
	JToolBar toolBar;
	JButton buttonLine,buttonRectangle, buttonCircle,buttonOval,
	buttonArc, buttonPolygon;
	JPanel panel;
	
	private static final long serialVersionUID = 1L;
	
	
	public JFPrincipalWindow(Control control) {
		setTitle("figuras");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		this.inItComponents();
		this.setCommands(control);
		this.setVisible(true);
	}
	
	private void inItComponents() {
		toolBar=new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setBackground(Color.BLACK);
		
		buttonLine=new JButton("LINE");
		toolBar.add(buttonLine);
		buttonRectangle=new JButton("RECTANGLE");
		toolBar.add(buttonRectangle);
		buttonCircle=new JButton("CIRCLE");
		toolBar.add(buttonCircle);
		buttonOval=new JButton("OVAL");
		toolBar.add(buttonOval);
		buttonArc=new JButton("ARC");
		toolBar.add(buttonArc);
		buttonPolygon=new JButton("POLYGON");
		toolBar.add(buttonPolygon);
		
		
		this.add(toolBar,BorderLayout.NORTH);
		panel=new JPanel();
		panel.setOpaque(true);
		panel.setBackground(Color.GRAY);
		
		this.add(panel, BorderLayout.CENTER);
	}
	
	private void setCommands(Control control) {
		buttonLine.setActionCommand(Commands.CREATE_LINE.name());
		buttonLine.addActionListener(control);
		buttonRectangle.setActionCommand(Commands.CREATE_RECTANGLE.name());
		buttonRectangle.addActionListener(control);
		buttonCircle.setActionCommand(Commands.CREATE_CIRCLE.name());
		buttonCircle.addActionListener(control);
		buttonOval.setActionCommand(Commands.CREATE_OVAL.name());
		buttonOval.addActionListener(control);
		buttonArc.setActionCommand(Commands.CREATE_ARC.name());
		buttonArc.addActionListener(control);
		buttonPolygon.setActionCommand(Commands.CREATE_POLYGON.name());
		buttonPolygon.addActionListener(control);
		
	}
	
	public void drawArc(Graphics g) {
		Graphics2D g2D=(Graphics2D)g;
		g2D.drawArc(50, 50, 100, 150, 100, 90);
	}
	
	public void drawPolygon(Graphics g) {
		Graphics2D g2D=(Graphics2D)g;
		int[]xpoints= {40,60, 100,120,100,70};
		int[] ypoints= {50,80, 80,50,50,50};
		Polygon polygon=new Polygon(xpoints, ypoints, 6);
		g2D.drawPolygon(polygon);
		
		
	}
	
	public void drawOval(Graphics g) {
		Graphics2D g2D=(Graphics2D)g;
		g2D.drawOval(100, 150, 170, 50);
	}
	
	public void drawRectangle(Graphics g) {
		Graphics2D g2D=(Graphics2D)g;
		Rectangle rectangle=new Rectangle(  100, 100,panel.getWidth()/3,panel.getHeight()/3);
		g2D.draw(rectangle);
	}
	
	public void drawCircle(Graphics g) {
		Graphics2D g2D=(Graphics2D)g;
		g2D.drawOval(50, 50, 70, 70);
	}
	
	public void drawLine(Graphics g) {
		Graphics2D g2D=(Graphics2D)g;
		g2D.setColor(Color.decode(this.createRandomColor()));
		g2D.drawLine(0, 0, panel.getWidth(), panel.getHeight());
		
	}
	
	
	private String createRandomColor() {
		String color="#";
		int number=0;
		for (int i = 0; i < 6; i++) {
			number=(int) (Math.random() * 15) ;
			color+=this.setCharHex(number);
		}
		return color;
	}
	
	private String setCharHex(int number) {
		String temp="";
		switch (number) {
		case 10:
			temp="A";
			break;
		case 11:
			temp="B";
			break;
		case 12:
			temp="C";
			break;
		case 13:
			temp="D";
			break;
		case 14:
			temp="E";
			break;
		case 15:
			temp="B";
			break;

		default:
			temp=""+number;
			break;
		}
		
		return temp;
	}

	public void drawSquare() {
		
	}
	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	
	
	
}
