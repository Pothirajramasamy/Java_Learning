import java.util.*;

public class HashSetC
{
	public static void main(String[] args)
	{
		//HashSet stores the elements by using a mechanism called hashing.
		//HashSet contains unique elements only
		//The HashSet class extends AbstractSet class which implements Set interface
		HashSet<String> set=new HashSet<String>();  
		set.add("First Element");  
		set.add("Second Element");  
		
		System.out.println(set);
	}

}
