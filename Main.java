package solo;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     
     System.out.println("Enter firstname: ");
     String firstName = read.nextLine();
     
     System.out.println("Enter secondname: ");
     String secondName = read.nextLine();
     
     System.out.println("Enter age: ");
     int age = read.nextInt();
     
     System.out.println("Enter room number: ");
     int roomNumber = read.nextInt();

     Customer customer = new Customer();
    
     customer.firstName = firstName;
     customer.secondName = secondName;
     customer.age = age;
     customer.roomNumber = roomNumber;
   
     customer.saveCustomerInfo();
}
}

class Customer {
	String firstName;
	String secondName;
	int age;
	int roomNumber;
	
	public void saveCustomerInfo(){
		System.out.println("First name: " + firstName);
		System.out.println("Second name: " + secondName);
		System.out.println("Age: " + age);
		System.out.println("Room Number: " + roomNumber);
 }
}	
