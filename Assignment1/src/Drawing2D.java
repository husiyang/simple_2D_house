import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GraphicsObjects.Point3f;
import Line_Algorithms.ExplicitLine;
import Line_Algorithms.ImplicitLine;
import Line_Algorithms.ParametricLine;
import Triangle_Algorithms.ParametricTriangle;

/*
 * 
 * This class to test your work and for you to make lines to draw your house , it will not compile till all the methods are complete in the other classes 
 * 
 */
public class Drawing2D extends JPanel {

	public Drawing2D() 
	{
		setBackground(Color.WHITE);

	}// set up graphics window

	public void paintComponent(Graphics g) // draw graphics in the panel
	{
		int width = getWidth(); // width of window in pixels
		int height = getHeight(); // height of window in pixels

		// as swing starts at 0 , 0 , will need to modify drawing

		super.paintComponent(g); // call superclass to make panel display
									// correctly

		g.setColor(Color.BLACK);
		
		//line test code 
		
		//ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		//ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
		//ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		
		//FirstLine.drawLine(g);
		//SecondLine.drawLine(g);
		//ThirdLine.drawLine(g);
		
		//Remove the comments for Explicit line and test it ,
		
		/*ExplicitLine FirstLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		ExplicitLine SecondLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0)); // 200
		ExplicitLine ThirdLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		ExplicitLine FourthLine = new ExplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);*/

		// */

		// Remove the comments for Implicit line and test it
		
		/*ImplicitLine FirstLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		ImplicitLine SecondLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
		ImplicitLine ThirdLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		ImplicitLine FourthLine = new ImplicitLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);*/

		// Remove the comments for Parametric line and test it
		
		/*ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 100, 0));
		ParametricLine SecondLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(200, 200, 0));
		ParametricLine ThirdLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(75, 200, 0));
		ParametricLine FourthLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(25, 200, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g); */
		

		// Remove the comments for an example of square using Parametric lines
		
		/*ParametricLine FirstLine = new ParametricLine(new Point3f(0, 0, 0), new Point3f(0, 300, 0));
		ParametricLine SecondLine = new ParametricLine(new Point3f(0, 300, 0), new Point3f(300, 300, 0));
		ParametricLine ThirdLine = new ParametricLine(new Point3f(300, 300, 0), new Point3f(300, 0, 0));
		ParametricLine FourthLine = new ParametricLine(new Point3f(300, 0, 0), new Point3f(0, 0, 0));

		FirstLine.drawLine(g);
		SecondLine.drawLine(g);
		ThirdLine.drawLine(g);
		FourthLine.drawLine(g);
		// */
		

		/*ParametricTriangle MyFirstTriangle = new ParametricTriangle(new Point3f(200, 0, 0), new Point3f(400,200, 0),
				new Point3f(200, 370, 0));

		MyFirstTriangle.drawTriangle(g);*/
		
		//insert your house drawings  here 
		Point3f a = new Point3f(0,0,0);
		Point3f b = new Point3f(200,0,0);
		Point3f c = new Point3f(0,200,0);
		Point3f d = new Point3f(200,200,0);
		Point3f e = new Point3f(50,0,0);
		Point3f f = new Point3f(150,0,0);
		Point3f h = new Point3f(50,50,0);
		Point3f i = new Point3f(150,50,0);
		Point3f j = new Point3f(50,100,0);
		Point3f k = new Point3f(75,100,0);
		Point3f l = new Point3f(50,125,0);
		Point3f m = new Point3f(75,125,0);
		Point3f n = new Point3f(125,100,0);
		Point3f o = new Point3f(150,100,0);
		Point3f p = new Point3f(125,125,0);
		Point3f q = new Point3f(150,125,0);
		Point3f r = new Point3f(-50,200,0);
		Point3f s = new Point3f(250,200,0);
		Point3f t = new Point3f(100,300,0);
		Point3f u = new Point3f((float) 187.5,200,0);
		Point3f v = new Point3f(200,230,0);
		Point3f w = new Point3f((float)187.5,(float)287.5,0);
		Point3f x = new Point3f(200,(float) 287.5,0);
		Point3f y = new Point3f(200,100,0);
		Point3f z = new Point3f(250,100,0);
		Point3f A = new Point3f(250,125,0);
		Point3f B = new Point3f(225,100,0);
		Point3f C = new Point3f(200,50,0);
		Point3f D = new Point3f(50,(float) 112.5,0);
		Point3f E = new Point3f(75,(float) 112.5,0);
		Point3f F = new Point3f((float) 62.5,100,0);
		Point3f G = new Point3f((float) 62.5,125,0);
		Point3f H = new Point3f(125,(float) 112.5,0);
		Point3f I = new Point3f(150,(float) 112.5,0);
		Point3f J = new Point3f((float) 137.5,100,0);
		Point3f K = new Point3f((float) 137.5,125,0);
		Point3f L = new Point3f(-50,-100,0);
		Point3f M = new Point3f(50,-100,0);
		Point3f N = new Point3f(0,75,0);
		Point3f O = new Point3f(-25,75,0);
		Point3f P = new Point3f(-25,50,0);
		Point3f Q = new Point3f(-50,50,0);
		Point3f R = new Point3f(-50,25,0);
		Point3f S = new Point3f(-75,25,0);
		Point3f T = new Point3f(-75,0,0);
		Point3f U = new Point3f(-200,0,0);
		Point3f V = new Point3f(400,0,0);
		ParametricTriangle abc = new ParametricTriangle(a,b,c);
		abc.drawTriangleColor1(g);
		ParametricTriangle dcb = new ParametricTriangle(d,c,b);
		dcb.drawTriangleColor1(g);
		ParametricTriangle rst = new ParametricTriangle(r,s,t);
		rst.drawTriangleColor1(g);
		ParametricTriangle uvw = new ParametricTriangle(u,v,w);
		uvw.drawTriangleColor1(g);
		ParametricTriangle xvw = new ParametricTriangle(x,v,w);
		xvw.drawTriangleColor1(g);
		ParametricLine yz = new ParametricLine(y,z);
		yz.drawLineColor(g);
		ParametricLine zA = new ParametricLine(z,A);
		zA.drawLineColor(g);
		ParametricLine BC = new ParametricLine(B,C);
		BC.drawLineColor(g);
		ParametricTriangle jkl = new ParametricTriangle(j,k,l);
		jkl.drawTriangleColor2(g);
		ParametricTriangle mkl = new ParametricTriangle(m,k,l);
		mkl.drawTriangleColor2(g);
		ParametricTriangle nop = new ParametricTriangle(n,o,p);
		nop.drawTriangleColor2(g);
		ParametricTriangle qop = new ParametricTriangle(q,o,p);
		qop.drawTriangleColor2(g);
		ParametricTriangle efh = new ParametricTriangle(e,f,h);
		efh.drawTriangleColor2(g);
		ParametricTriangle ifh = new ParametricTriangle(i,f,h);
		ifh.drawTriangleColor2(g);
		ParametricLine DE = new ParametricLine(D,E);
		DE.drawLineColor(g);
		ParametricLine FG = new ParametricLine(F,G);
		FG.drawLineColor(g);
		ParametricLine HI = new ParametricLine(H,I);
		HI.drawLineColor(g);
		ParametricLine JK = new ParametricLine(J,K);
		JK.drawLineColor(g);
		ParametricTriangle eLf = new ParametricTriangle(e,L,f);
		eLf.drawTriangleColor2(g);
		ParametricTriangle fML = new ParametricTriangle(f,M,L);
		fML.drawTriangleColor2(g);;
		ParametricLine NO = new ParametricLine(N,O);
		NO.drawLineColor(g);
		ParametricLine OP = new ParametricLine(O,P);
		OP.drawLineColor(g);
		ParametricLine PQ = new ParametricLine(P,Q);
		PQ.drawLineColor(g);
		ParametricLine QR = new ParametricLine(Q,R);
		QR.drawLineColor(g);
		ParametricLine RS = new ParametricLine(R,S);
		RS.drawLineColor(g);
		ParametricLine ST = new ParametricLine(S,T);
		ST.drawLineColor(g);
		ParametricLine UV = new ParametricLine(U,V);
		UV.drawLineColor(g);
	}	

	public static void main(String[] args) {
		Drawing2D panel = new Drawing2D();
		JFrame ScreenToDrawOn = new JFrame();
		ScreenToDrawOn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ScreenToDrawOn.setTitle("2D Drawing Application");
		ScreenToDrawOn.setSize(1000, 1000); // window is 500 pixels wide, 400
											// high
		ScreenToDrawOn.setVisible(true);
		ScreenToDrawOn.add(panel);

	}

}
