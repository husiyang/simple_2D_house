package GraphicsObjects;



public class Vector3f {

	public float x=0;
	public float y=0;
	public float z=0;
	
	public Vector3f() 
	{  
		x = 0.0f;
		y = 0.0f;
		z = 0.0f;
	}// default constructor
	 
	public Vector3f(float x, float y, float z) 
	{ 
		this.x = x;
		this.y = y;
		this.z = z;
	}//initializing constructor
	 
	public Vector3f PlusVector(Vector3f Additonal) 
	{ 
		Vector3f b = new Vector3f();
		b.x = x + Additonal.x;
		b.y = y + Additonal.y;
		b.z = z + Additonal.z;
		return b;
	} //Vector plus a Vector
	 
	public Vector3f MinusVector(Vector3f Minus) 
	{ 
		Vector3f b = new Vector3f();
		b.x = x - Minus.x;
		b.y = y - Minus.y;
		b.z = z - Minus.z;
		return b;
	}//Vector minus a Vector
	  
	public Point3f PlusPoint(Point3f Additonal) 
	{ 
		 Point3f a = new Point3f();
		 a.x = x + Additonal.getPostion(0);
		 a.y = y + Additonal.getPostion(1);
		 a.z = z + Additonal.getPostion(2);
		 return a;
	} //Vector plus a Point
	
	public Vector3f byScalar(float scale )
	{
		 Vector3f b = new Vector3f();
		 b.x = scale*x;
		 b.y = scale*y;
		 b.z = scale*z;
		 return b;
	}//a Vector * Scalar
	
	public Vector3f  NegateVector()
	{
		Vector3f b = new Vector3f();
		b.x = (-1)*b.x;
		b.y = (-1)*b.y;
		b.z = (-1)*b.z;
		return b;
	}//the negative of a Vector
	
	public float length()
	{
		Vector3f b = new Vector3f();
		float length = (float) Math.sqrt(b.x*b.x + b.y*b.y + b.z*b.z);
		return length;
	}//getting the length of a Vector
	
	public Vector3f Normal()
	{
		Vector3f b = new Vector3f();
		return b.byScalar((1/b.length()));
	}//getting the Normal  of a Vector

	public float dot(Vector3f v)
	{ 
		float dot;
		dot = x*v.x + y*v.y + z*v.z;
		return dot;
	}//getting the dot product of two Vectors
	
	public Vector3f cross(Vector3f v)  
	{ 
		Vector3f b = new Vector3f();
		b.x = y*v.z - z*v.y;
		b.y = z*v.x - x*v.z;
		b.z = x*v.y - y*v.x;
		return b;
	}//getting the cross product of two Vectors 
 
}
	 
	   

/*

										MMMM                                        
										MMMMMM                                      
 										MM MMMM                                    
 										MMI  MMMM                                  
 										MMM    MMMM                                
 										MMM      MMMM                              
  										MM        MMMMM                           
  										MMM         MMMMM                         
  										MMM           OMMMM                       
   										MM             .MMMM                     
MMMMMMMMMMMMMMM                        MMM              .MMMM                   
MM   IMMMMMMMMMMMMMMMMMMMMMMMM         MMM                 MMMM                 
MM                  ~MMMMMMMMMMMMMMMMMMMMM                   MMMM               
MM                                  OMMMMM                     MMMMM            
MM                                                               MMMMM          
MM                                                                 MMMMM        
MM                                                                   ~MMMM      
MM                                                                     =MMMM    
MM                                                                        MMMM  
MM                                                                       MMMMMM 
MM                                                                     MMMMMMMM 
MM                                                                  :MMMMMMMM   
MM                                                                MMMMMMMMM     
MM                                                              MMMMMMMMM       
MM                             ,MMMMMMMMMM                    MMMMMMMMM         
MM              IMMMMMMMMMMMMMMMMMMMMMMMMM                  MMMMMMMM            
MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM               ZMMMMMMMM              
MMMMMMMMMMMMMMMMMMMMMMMMMMMMM          MM$             MMMMMMMMM                
MMMMMMMMMMMMMM                       MMM            MMMMMMMMM                  
  									MMM          MMMMMMMM                     
  									MM~       IMMMMMMMM                       
  									MM      DMMMMMMMM                         
 								MMM    MMMMMMMMM                           
 								MMD  MMMMMMMM                              
								MMM MMMMMMMM                                
								MMMMMMMMMM                                  
								MMMMMMMM                                    
  								MMMM                                      
  								MM                                        
                             GlassGiant.com */