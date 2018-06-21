import java.util.*;  

public class TreeMapC 
{
	 public static void main(String args[])
	 {  
		 /*
		  * A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
		  *It contains only unique elements.
		  *It cannot have null key but can have multiple null values.
		  *It is same as HashMap instead maintains ascending order
		  */
	  TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
	  hm.put(100,"First");  
	  hm.put(102,"Second");  
	  hm.put(101,"Third");  
	  hm.put(103,"Fourth");  
	  
	  for( Map.Entry m:hm.entrySet())
	  {  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	 }  
}  
