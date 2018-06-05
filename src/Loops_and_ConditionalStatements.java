import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
		
		try(Scanner code = new Scanner(System.in))
				{
		
		System.out.println("Enter the shipment code :");
		
		int code1 = code.nextInt();
		
		int[] arr = new int[3];
		
		for ( int i = 0 ; i < 3 ; i ++)
		{
			arr[i] = code1%10;
			code1 = code1/10;
		}
		if ( arr[0] == 1 && arr[1] == 1 )
		{
			if ( arr[2] == 1 )
			{
				System.out.println("All ways");
			}else 
			{
				System.out.println("Waterway and Roadway");
			}
		}
		if ( arr[0] == 1 && arr[1] == 0 )
			{
				if (arr[2] == 1 )
				{
					System.out.println("Airway and Roadway");
				}
				else
				{
					System.out.println(" Roadway");
				}
			
			}
		if ( arr[0] == 0 )
		{
			if (  arr[1] == 1 && arr[2] == 1)
			{
				System.out.println("Airway and Waterway");
			}
			else if (  arr[1] == 0 && arr[2] == 1 )
			{
				System.out.println("Airway");
			}
			else
			{
				System.out.println("Waterway");
			}
		}
				}
	}	
			
		//System.out.println("Value is "+ arr[0]);
		//System.out.println("Value is "+ arr[1]);
		//System.out.println("Value is "+ arr[2]);
	
	}
