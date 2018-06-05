Main.java

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Main  {
	
	public static void main(String[] args) 
	{
		List<User> eachuse = new ArrayList<User>();
		String s;
		
		try
		{
		Scanner scan = new Scanner(new File("input.txt"));
		
		while (scan.hasNext())
		{
			s = scan.nextLine();
			eachuse.add(new User(Long.valueOf(s.substring(0,5)),s.substring(5,15),s.substring(15,25),s.substring(25,35),s.substring(35,43),s.substring(43)));	
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.format("%-10s %-15s %-15s %-15s %-15s %s\n","id","First Name","Last Name","Username","Password","Mobile Number");
		
		for ( User u : eachuse)
		{
		System.out.format("%-10s %-15s %-15s %-15s %-15s %s\n",u.getId(),u.getFirstName(),u.getLastName(),u.getUsername(),u.getPassword(),u.getMobileNumber());
		}
	}
	
}

User.Java

import java.io.PrintStream;


public class User 
{
	
	private Long id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String mobileNumber;
	
	User(long id,String firstName,String lastName,String username,String password,String mobileNumber)
	{
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setUsername(username);
		setPassword(password);	
		setMobileNumber(mobileNumber);
	}
	
	User()
	{
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	 public String toString()
	{
		return String.format("%-10s %-15s %-15s %-15s %-15s %s\n", id, firstName, lastName, username, password, mobileNumber);	
	}
	
	
	
	

}
