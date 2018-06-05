import java.io.*;
public class Main 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
    {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter the total number of items");
		int n = Integer.parseInt(br.readLine());
		int total = 0;
		
		for ( int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter the shipping price of the item " + (i+1)+" :");
			try
			{
			total = total + Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException e)
			{
			System.out.println("Exception : "+e.getClass().getCanonicalName());
			System.out.println("Re-enter the item price :");	
			total = total + Integer.parseInt(br.readLine());
			}
			
		}	System.out.println("Total cost of the container is "+total);

		
	}
}
