Main.java

import java.util.Scanner;

public class Main
{
    static int numOfConatainers;
    
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of containers :");
		int numOfConatainers = scan.nextInt();
		Container c = new Container();
		c.containerNumber = String.valueOf(numOfConatainers);
		//System.out.println(numOfConatainers);
		Cargo[] o = new Cargo[numOfConatainers];
		Container[] con = new Container[numOfConatainers];

		for (int i = 0 ; i < numOfConatainers ; i++ )
		{
			System.out.println("Enter the container " +(i+1) +" details :");
			String containerDetails = scan.next();
			//System.out.println(containerDetails);
			String[] arr = containerDetails.split(",");
			con[i] = new Container(arr[0], Float.parseFloat(arr[1]) ,Float.parseFloat(arr[2]),Float.parseFloat(arr[3]),Double.parseDouble(arr[4]));
			o[i] = new Cargo(Float.parseFloat(arr[1]),Float.parseFloat(arr[2]),Float.parseFloat(arr[3]),Double.parseDouble(arr[4]));		
		}
		System.out.println("Container details are");
		System.out.format("%-20s %-15s %-15s %-15s %s\n", "Container Number", "Length", "Width", "Height", "Weight");
		for (int i = 0 ; i < numOfConatainers ; i++ )
		{
			con[i].displayContainerDetails();
		}
	}
	
	
}

Cargo.java


public class Cargo 
{
    protected Float length;
	protected Float width;
	protected Float height;
	protected Double weight;
	
	public Float getLength() {
		return length;
	}
	public void setLength(Float length) {
		this.length = length;
	}
	public Float getWidth() {
		return width;
	}
	public void setWidth(Float width) {
		this.width = width;
	}
	public Float getHeight() {
		return height;
	}
	public void setHeight(Float height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	public  Cargo(Float length,Float width,Float height,Double weight )
	{
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;		
	}
	public Cargo()
	{
		
	}

}


Container.java

class Container extends Cargo
{

    String containerNumber;
	Cargo co = new Cargo();
	//Main m = new Main();
	
	public Container( )
	{

	}
	public Container(String containerNumber,Float length,Float width,Float height,Double weight )
	{
		super.length = length;
		super.width = width;
		super.height = height;
		super.weight = weight;
		this.containerNumber = containerNumber;
	}
	

	public Container( String containerNumber)
	{
		this.containerNumber = containerNumber;
	}
	
	public String getContainerNumber() {
		return containerNumber;
	}

	public void setContainerNumber(String containerNumber) {
		this.containerNumber = containerNumber;
	}

	public void displayContainerDetails( )
	{
		System.out.format("%-20s %-15s %-15s %-15s %s\n",this.containerNumber,this.length,this.width,this.height,this.weight);
	}

}




