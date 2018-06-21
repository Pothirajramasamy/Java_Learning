
import java.util.*;

public class VectorClass
{
	public static void main(String[] args)
	{
		//Vector is Dynamic array;
		  Vector v = new Vector();
		  System.out.println("***Default Vector Constructor***");
	      System.out.println("Initial size: " + v.size());
	      System.out.println("Initial capacity: " + v.capacity());
	      System.out.println("--------------------------------");
	      
	      Vector v1 = new Vector(15);
	      v1.addElement(new Integer(11));
	      v1.addElement(new Integer(22));
	      v1.addElement(new Integer(33));
	      System.out.println("***Vector Constructor with Size 3***");
	      System.out.println("Initial size: " + v1.size());
	      System.out.println("Initial capacity: " + v1.capacity());
	      System.out.println("--------------------------------");
	      
	      System.out.println("***First and Last Element***");
	      
	      System.out.println("First element: " + (Integer)v1.firstElement());
	      System.out.println("Last element: " + (Integer)v1.lastElement());
	      System.out.println("--------------------------------");  
	}

}
