import java.util.*;  

public class HashMapC 
{
	
	/*
	 * A HashMap contains values based on the key.
	 *It contains only unique elements.
	 *It may have one null key and multiple null values.
	 *It maintains no order.
	 */
	
	public static void main(String args[])
	{  
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  hm.put(100,"first");  
		  hm.put(101,"second");  
		  hm.put(102,"third");  
		  for(Map.Entry m:hm.entrySet())
		  {  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	}	  
}
