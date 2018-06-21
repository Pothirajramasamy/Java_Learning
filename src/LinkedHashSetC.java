
import java.util.*;

public class LinkedHashSetC 
{
	public static void main(String args[])
	{
		//Extends HashSet
		//The elements will be returned in the order in which they were inserted.
		/*A HashSet is unordered and unsorted Set. 
		 * LinkedHashSet is the ordered version of HashSet.
		 * The only difference between HashSet and LinkedHashSet is that LinkedHashSet maintains the insertion order. 
		 * When we iterate through a HashSet, the order is unpredictable while it is predictable in case of LinkedHashSet
		 */
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		
		hs.add("First element");
	    hs.add("Second element");
	    System.out.println(hs);
	}
}
