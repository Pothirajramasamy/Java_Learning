
public class MultithreadingThreadC extends Thread

{
	// By extending Thread class
	public void run()
	{  
		System.out.println("This is Thread by extending Thread class...");  
		System.out.println(Thread.currentThread().getName());
	}  
	public static void main(String args[])
	{  
		MultithreadingThreadC t1=new MultithreadingThreadC();  
		t1.start();  
	}
}