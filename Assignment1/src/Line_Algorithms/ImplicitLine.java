package Line_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;
import GraphicsObjects.Vector3f;

public class ImplicitLine {

	Point3f Start;
	Point3f End;

	public ImplicitLine(Point3f Start, Point3f End) {
		this.Start = Start;
		this.End = End;

	}//initialize constructor

	public void drawLine(Graphics g) {
		float x,y;
		if(Start.getPostion(0) < End.getPostion(0) && Start.getPostion(1) < End.getPostion(1)) {
			for (x = Start.getPostion(0); x <= End.getPostion(0); x++) {
				for (y = Start.getPostion(1); y <= End.getPostion(1); y++) { 
					Point3f p = new Point3f(x,y,0);
					if(Distance(p,Start,End) < 0.5) {
						setPixel(g,(int)p.x,(int)p.y);
					}
				}
			}
		} else if(Start.getPostion(0) > End.getPostion(0) && Start.getPostion(1) > End.getPostion(1)) {
			for (x = End.getPostion(0); x <= Start.getPostion(0); x++) {
				for (y = End.getPostion(1); y <= Start.getPostion(1); y++) { 
					Point3f p = new Point3f(x,y,0);
					if(Distance(p,End,Start) < 0.5) {
						setPixel(g,(int)p.x,(int)p.y);
					}
				}
			}
		} else if(Start.getPostion(0) < End.getPostion(0) && Start.getPostion(1) > End.getPostion(1)) {
			for (x = Start.getPostion(0); x <= End.getPostion(0); x++) {
				for (y = Start.getPostion(1); y <= End.getPostion(1); y--) { 
					Point3f p = new Point3f(x,y,0);
					if(Distance(p,Start,End) < 0.5) {
						setPixel(g,(int)p.x,(int)p.y);
					}
				}
			}
		} else if(Start.getPostion(0) > End.getPostion(0) && Start.getPostion(1) < End.getPostion(1)) {
			for (x = End.getPostion(0); x <= Start.getPostion(0); x++) {
				for (y = End.getPostion(1); y <= Start.getPostion(1); y--) { 
					Point3f p = new Point3f(x,y,0);
					if(Distance(p,End,Start) < 0.5) {
						setPixel(g,(int)p.x,(int)p.y);
					}
				}
			}
		}
	}//draw line from xmin and ymin to xmax and ymax, if distance between line and point is less than 0.5,then draw the pixel

	public float Distance(Point3f Check, Point3f Beginning, Point3f Ending) {
		float A = Beginning.getPostion(1)-Ending.getPostion(1);
		float B = Ending.getPostion(0)-Beginning.getPostion(0);
		float C = Beginning.getPostion(0)*(Ending.getPostion(1)-Beginning.getPostion(1)) - Beginning.getPostion(1)*(Ending.getPostion(0)-Beginning.getPostion(0));
		return (float) (Math.abs(A*Check.getPostion(0)+B*Check.getPostion(1)+C)/Math.sqrt(A*A+B*B));
	}//use equation distance=|Ax0+By0+c|/Math.sqrt(A^2+B^2), use Beginning and Ending to compute A,B,C

	public void setPixel(Graphics g, int x, int y) {
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// center 0,0 at center of the
											// screen

	}//adapt Swings coordinate system

}
