import java.util.*;

public class LinkedListll 
{
	public static void main(String[] args)
	{
		/*LinkedList class can contain duplicate elements.
		 * LinkedList class maintains insertion order
		 * LinkedList class is non synchronized
		 * LinkedList class, manipulation is fast because no shifting needs to be occurred
		 * LinkedList class can be used as list, stack or queue.
		 */
		
		LinkedList<String>  ll =new LinkedList<String>();  
		  ll.add("First Element");  
		  ll.add("Second Element");  
		  ll.add("Third Element");  
		  ll.add("Fourth Element");  
		  
		  Iterator<String> itr = ll.iterator();  
		  
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  
		  }  		
	}

}
