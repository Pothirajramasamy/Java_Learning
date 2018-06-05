import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
		Scanner customer = new Scanner(System.in);
		int noOfCustomer= customer.nextInt();
		int[] ids = new int[noOfCustomer];
		for(int i=0;i<noOfCustomer;i++){
			ids[i]= customer.nextInt();
		}
		int max= ids[0];
		for(int j=1;j<ids.length;j++){
			if(max < ids[j])
			{
				max = ids[j];
			}
		}
		System.out.println("Next customer id is "+(max+1));
		customer.close();
	}

}
