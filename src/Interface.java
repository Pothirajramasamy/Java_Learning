Main.java

import java.util.*;


public class Main 
{
	

	public static void main(String[] args) 
	{
		ArrayList<Port> pta = new ArrayList<Port>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the port details");
		String s = scan.nextLine();
		String[] arr = s.split(",");
		pta.add(new Port(Integer.valueOf(arr[0]),arr[1],arr[2]));
		String opt = "Yes";
		while(opt.equalsIgnoreCase("Yes"))
		{
			System.out.println("Do you want to continue[Yes/No]");
			String a = scan.nextLine(); 
			if ( a.equals("Yes"))
			{
				s = scan.nextLine();
				arr = s.split(",");
				pta.add(new Port(Integer.valueOf(arr[0]),arr[1],arr[2]));
				opt = "Yes";
			}
			else
			{
				opt = "No";
			}
		}
		System.out.println("Port details in sorted order");
		System.out.format("%-15s %-15s %-15s\n","Port Id","Name","Country");
		
		Collections.sort(pta);
		
		for (Port a :  pta)
		{
		System.out.println(a.toString());
		}

	}

}

Port.java

 
class Port implements Comparable<Port>

{

     
  Integer id;
  String name;
  String country;
  Port(){}
  public Port(Integer id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
  }
      
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString(){
        return String.format("%-15s %-15s %-15s\n",getId(),getName(),getCountry());
      }
    
	@Override
	public int compareTo(Port arg0) {
		
		return country.compareTo(arg0.getCountry());
	}
}



