package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.JFPrincipalWindow;

public class Control implements ActionListener{
	JFPrincipalWindow jfPrincipalWindow;

	public Control() {
		jfPrincipalWindow=new JFPrincipalWindow(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (Commands.valueOf(e.getActionCommand())) {
		case CREATE_LINE:
			paintLine();
			break;
		case CREATE_RECTANGLE:
			drawRectangle();
			break;
		case CREATE_CIRCLE:
			drawCircle();
			break;
		case CREATE_OVAL:
			drawOval();
			break;
		case CREATE_ARC:
			drawArc();
			break;
		case CREATE_POLYGON:
			drawPolygon();
			break;
		default:
			break;
		}
	}
	
	private void drawPolygon() {
		jfPrincipalWindow.drawPolygon(jfPrincipalWindow.getPanel().getGraphics());
	}
	
	private void drawArc() {
		jfPrincipalWindow.drawArc(jfPrincipalWindow.getPanel().getGraphics());
	}
	
	private void drawOval() {
		jfPrincipalWindow.drawOval(jfPrincipalWindow.getPanel().getGraphics());
	}
	
	private void drawRectangle() {
		jfPrincipalWindow.drawRectangle(jfPrincipalWindow.getPanel().getGraphics());
	}
	
	private void paintLine() {
		jfPrincipalWindow.drawLine(jfPrincipalWindow.getPanel().getGraphics());
	}
	
	private void drawCircle() {
		jfPrincipalWindow.drawCircle(jfPrincipalWindow.getPanel().getGraphics());
	}
	
}
