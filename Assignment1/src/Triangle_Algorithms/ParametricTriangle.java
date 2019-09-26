package Triangle_Algorithms;

import java.awt.Color;
import java.awt.Graphics;

import GraphicsObjects.Point3f;

public class ParametricTriangle {

	Point3f A;
	Point3f B;
	Point3f C;

	public ParametricTriangle(Point3f a, Point3f b, Point3f c) {
		this.A = a;
		this.B = b;
		this.C = c;
	}//initialize constructor

	public void drawTriangle(Graphics g) {
		float x,y;
		float u,v,w;
		float miny = Math.min(A.getPostion(1), Math.min(B.getPostion(1), C.getPostion(1)));
		float minx = Math.min(A.getPostion(0), Math.min(B.getPostion(0), C.getPostion(0)));
		float maxy = Math.max(A.getPostion(1), Math.max(B.getPostion(1), C.getPostion(1)));
		float maxx = Math.max(A.getPostion(0), Math.max(B.getPostion(0), C.getPostion(0)));
		for(x = minx; x < maxx; x++) {
			for(y = miny; y < maxy; y++) {
				Point3f p = new Point3f(x,y,0);
				u = Distance(p,B,C)/Distance(A,B,C);
				v = Distance(p,A,C)/Distance(B,A,C);
				w = 1-u-v;
				if(w < 0 || u < 0 || v < 0) continue;
				p.x = u*A.getPostion(0) + v*B.getPostion(0) + w*C.getPostion(0);
				p.y = u*A.getPostion(1) + v*B.getPostion(1) + w*C.getPostion(1);
				setPixel(g,(int)p.x,(int)p.y,u,v,w);
			}
		}
	}//use equation P=u*A+v*B+w*C,if u,v,w<0,then the point is not in triangle.
	
	public void drawTriangleColor1(Graphics g) {
		float x,y;
		float u,v,w;
		float miny = Math.min(A.getPostion(1), Math.min(B.getPostion(1), C.getPostion(1)));
		float minx = Math.min(A.getPostion(0), Math.min(B.getPostion(0), C.getPostion(0)));
		float maxy = Math.max(A.getPostion(1), Math.max(B.getPostion(1), C.getPostion(1)));
		float maxx = Math.max(A.getPostion(0), Math.max(B.getPostion(0), C.getPostion(0)));
		for(x = minx; x < maxx; x++) {
			for(y = miny; y < maxy; y++) {
				Point3f p = new Point3f(x,y,0);
				u = Distance(p,B,C)/Distance(A,B,C);
				v = Distance(p,A,C)/Distance(B,A,C);
				w = 1-u-v;
				if(w < 0 || u < 0 || v < 0) continue;
				p.x = u*A.getPostion(0) + v*B.getPostion(0) + w*C.getPostion(0);
				p.y = u*A.getPostion(1) + v*B.getPostion(1) + w*C.getPostion(1);
				setcolor1(g,(int)p.x,(int)p.y);
			}
		}
	}//this method is for drawing grey triangle in house
	
	public void drawTriangleColor2(Graphics g) {
		float x,y;
		float u,v,w;
		float miny = Math.min(A.getPostion(1), Math.min(B.getPostion(1), C.getPostion(1)));
		float minx = Math.min(A.getPostion(0), Math.min(B.getPostion(0), C.getPostion(0)));
		float maxy = Math.max(A.getPostion(1), Math.max(B.getPostion(1), C.getPostion(1)));
		float maxx = Math.max(A.getPostion(0), Math.max(B.getPostion(0), C.getPostion(0)));
		for(x = minx; x < maxx; x++) {
			for(y = miny; y < maxy; y++) {
				Point3f p = new Point3f(x,y,0);
				u = Distance(p,B,C)/Distance(A,B,C);
				v = Distance(p,A,C)/Distance(B,A,C);
				w = 1-u-v;
				if(w < 0 || u < 0 || v < 0) continue;
				p.x = u*A.getPostion(0) + v*B.getPostion(0) + w*C.getPostion(0);
				p.y = u*A.getPostion(1) + v*B.getPostion(1) + w*C.getPostion(1);
				setcolor2(g,(int)p.x,(int)p.y);
			}
		}
	}//this method is for drawing green triangle in house

	
	public void setPixel(Graphics g, int x, int y,float R, float G, float B) {
		Color pixelColour = new Color(R, G, B);
		g.setColor(pixelColour);
		g.drawRect(x + 500, 500 - y, 1, 1); // + 500 offset is to make the
											// center 0,0 at center of the
											// screen
		
	}//adapt Swings coordinate system 
	
	public void setcolor1(Graphics g, int x, int y) {
		Color pixelColour = new Color(150,150,150);
		g.setColor(pixelColour);
		g.drawRect(x + 350, 600 - y, 1, 1);
	}//this method is for drawing grey pixel in house
	
	public void setcolor2(Graphics g, int x, int y) {
		Color pixelColour = new Color(33,219,23);
		g.setColor(pixelColour);
		g.drawRect(x + 350, 600 - y, 1, 1);
	}//this method is for drawing green pixel in house
	
	public float Distance(Point3f Check, Point3f Beginning, Point3f Ending) {
		float A = Beginning.getPostion(1)-Ending.getPostion(1);
		float B = Ending.getPostion(0)-Beginning.getPostion(0);
		float C = Beginning.getPostion(0)*(Ending.getPostion(1)-Beginning.getPostion(1)) - Beginning.getPostion(1)*(Ending.getPostion(0)-Beginning.getPostion(0));
		return (float) (Math.abs(A*Check.getPostion(0)+B*Check.getPostion(1)+C)/Math.sqrt(A*A+B*B));
	}//use equation distance=|Ax0+By0+c|/Math.sqrt(A^2+B^2), use Beginning and Ending to compute A,B,C
}
