package Line_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;

public class ParametricLine {

	Point3f Start;
	Point3f End;

	public ParametricLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;

	}//initialize constructor

	public void drawLine(Graphics g) {
		float t;
		Point3f CurrentPoint = new Point3f();
		for(t = 0; t <= 1; t += 0.001) {
			CurrentPoint.x = Start.getPostion(0)+(End.getPostion(0)-Start.getPostion(0))*t;
			CurrentPoint.y = Start.getPostion(1)+(End.getPostion(1)-Start.getPostion(1))*t;
			setPixel(g, (int) CurrentPoint.x, (int) CurrentPoint.y);
		}
	}//use equation P=Start+(End-Start)*t, draw line from 0<t<1
	
	public void drawLineColor(Graphics g) {
		float t;
		Point3f CurrentPoint = new Point3f();
		for(t = 0; t <= 1; t += 0.001) {
			CurrentPoint.x = Start.getPostion(0)+(End.getPostion(0)-Start.getPostion(0))*t;
			CurrentPoint.y = Start.getPostion(1)+(End.getPostion(1)-Start.getPostion(1))*t;
			setcolor(g, (int) CurrentPoint.x, (int) CurrentPoint.y);
		}
	}//this method is for drawing line in house

	
	public void setPixel(Graphics g, int x, int y) {
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// center 0,0 at center of the
											// screen for swing :-)

	}// adapt Swings coordinate system
	
	public void setcolor(Graphics g, int x, int y) {
		Color pixelColour = new Color(150,150,150);
		g.setColor(pixelColour);
		g.drawRect(x + 350, 600 - y, 1, 1);
	}//this method is for drawing house,the color is grey,move house at center of the screen
}
