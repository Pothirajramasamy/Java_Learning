
public class MultithreadingRunnableC implements Runnable

{
	// By implementing  Runnable 
	public void run()
	{  
		System.out.println("This is Tread by implementing Runnable Interface...");  
	}  
	public static void main(String args[])
	{  
		MultithreadingRunnableC m1=new MultithreadingRunnableC();  
		Thread t1 = new Thread(m1);  
		t1.start();  
	}
}