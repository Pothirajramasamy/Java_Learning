
import java.util.*; 
	
public class LinkedHashMapC 
{
	/*
	 * A LinkedHashMap contains values based on the key.
	*It contains only unique elements.
	*It may have one null key and multiple null values.
	*It is same as HashMap instead maintains insertion order.
	 */
	 public static void main(String args[])
	 {  
	   
	  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
	  
	  hm.put(100,"first");  
	  hm.put(101,"second");  
	  hm.put(102,"third");  
	  
	  for(Map.Entry m:hm.entrySet())
	  {  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
	 }

