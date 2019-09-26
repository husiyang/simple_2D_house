package Line_Algorithms;

import java.awt.Graphics;

import GraphicsObjects.Point3f;

public class ExplicitLine {
	
	Point3f Start;
	Point3f End;
	float slope; 
	 
	public ExplicitLine(Point3f Start, Point3f End) { 
		this.Start = Start;
		this.End = End;
		slope = getSlope(); // I need to implement this before the class will compile 
	}//initialize constructor
	
	public float getSlope()
	{
		if(End.getPostion(0)-Start.getPostion(0) == 0) {
			return (Float) null;
		} else {
			return (End.getPostion(1)-Start.getPostion(1))/(End.getPostion(0)-Start.getPostion(0));
		}
	}// slope = End.y-Start.y/End.x-Start.x. If line is perpendicular to x-axis,then slope is 0
	
	public void drawLine(Graphics g)
	{
		float c = Start.getPostion(1)-slope*Start.getPostion(0);
		float b = Start.getPostion(0)-(1/slope)*Start.getPostion(1);
		float x,y;
		if(End.getPostion(0)-Start.getPostion(0) > 0) {
			if(End.getPostion(1)-Start.getPostion(1) > 0) {
				if(slope < 1) {
					for(x = Start.getPostion(0); x < End.getPostion(0); x++) {
						y = slope*x + c;
						setPixel(g,(int)x,(int)y);
					}
				} else {
					for(y = Start.getPostion(1); y < End.getPostion(1); y++) {
						x = (1/slope)*y + b;
						setPixel(g,(int)x,(int)y);
					}
				}
			} else {
				if(slope > -1) {
					for(x = Start.getPostion(0); x < End.getPostion(0); x++) {
						y = slope*x + c;
						setPixel(g,(int)x,(int)y);
					}
				} else {
					for(y = Start.getPostion(1); y > End.getPostion(1); y--) {
						x = (1/slope)*y + b;
						setPixel(g,(int)x,(int)y);
					}
				}
			}
		}
	}//use equation y=mx+c when -1<slope<1, use equation x=ny+b when slope>1 and slope<-1
	
	
	public void setPixel(Graphics g,int x,int y)  
	{
		g.drawRect(x+500, 500-y, 1,1);  // + 500 offset is to make the center 0,0 at center of the screen 
		  
	}//adapt Swings coordinate system 

}
