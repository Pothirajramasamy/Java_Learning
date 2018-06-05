Main.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

          //fill your code
          Scanner Sc = new Scanner (System.in);
    	System.out.println("Enter the total number of users");
		int noOfUsers = Sc.nextInt();
		System.out.println("Enter user details");
		User[] userObjects = new User[noOfUsers];
		for(int i = 0; i<noOfUsers;i++ ){
			String userdetails = Sc.next();
			String[] user= userdetails.split(",");
			userObjects[i] = new User(user[0], user[1], user[2], user[3]);
		}
		System.out.println("1)Search user by user name");
		System.out.println("2)Search user by first name and last name");
		System.out.println("Enter your option");
		int option = Sc.nextInt();
		if(option == 1){
			System.out.println("Enter the user name to search");
			String name = Sc.next();
			User user = new User();
			user = user.findUser(userObjects, name);
			if(user != null){
				System.out.println("User details :");
				System.out.println("Username :"+user.getUserName());
				System.out.println("FirstName :"+user.getFirstName());
				System.out.println("LastName :"+user.getLastName());
				System.out.println("Contact :"+user.getContact());
			} else{
				System.out.println("User not found");
			}
			
		} else {
		System.out.println("Enter the first name to search");
    		String first = Sc.next();
			System.out.println("Enter the last name to search");
			String last = Sc.next();
			User user = new User();
			user = user.findUser(userObjects, first,last);
			if(user != null){
				System.out.println("User details :");
				System.out.println("Username :"+user.getUserName());
				System.out.println("FirstName :"+user.getFirstName());
				System.out.println("LastName :"+user.getLastName());
				System.out.println("Contact :"+user.getContact());
			} else{
				System.out.println("User not found");
			}
		}
		
    }
    
}


User.java


public class User {
    private String userName;
    private String firstName;
    private String lastName;
    private String contact;

    public User(String userName, String firstName, String lastName, String contact) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
    }

    User() {}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    //fill your code
    User findUser(User userArray[],String userName){
    	User findUser = null;
		for(int i = 0; i<userArray.length; i++){
			if(userName.equals(userArray[i].userName)){
				findUser = userArray[i];
			}
		}
		return findUser;
	}
	
	User findUser(User userArray[],String firstName, String lastName){
		User findUser = null;
		for(int i = 0; i<userArray.length; i++){
			if(firstName.equals(userArray[i].firstName) && lastName.equals(userArray[i].lastName)){
				findUser = userArray[i];
			}
		}
		return findUser;
	}
}
