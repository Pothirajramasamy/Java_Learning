abstract class Car
{  
  abstract void run();  
}  
class Acura extends Car
{  
void run(){
System.out.println("running safely..");
}  

public static void main(String args[])
{  
 Car obj = new Acura();  
 obj.run();  
}  
}  
