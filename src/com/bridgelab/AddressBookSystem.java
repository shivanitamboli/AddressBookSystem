package com.bridgelab;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class AddressBookSystem implements Info {
	    //ArrayList Declarer
	    ArrayList<Person> book = new ArrayList<>();
	    //Creating scanner class object
	    Scanner scan = new Scanner(System.in);

	    public void add() {
	        //user input to print the details
	        System.out.println("Enter the  Firstname: ");
	        String firstName = scan.nextLine();
	        System.out.println("Enter the  Lastname: ");
	        String lastName = scan.nextLine();
	        System.out.println("Enter the  Address: ");
	        String address = scan.nextLine();
	        System.out.println("Enter the  City: ");
	        String city = scan.nextLine();
	        System.out.println("Enter the  State: ");
	        String state = scan.nextLine();
	        System.out.println("Enter the Phone Number: ");
	        long phoneNumber = scan.nextLong();
	        System.out.println("Enter the Zip code: ");
	        scan.nextLine();
	        String zip = scan.nextLine();
	        Person person = new Person(firstName, lastName, address, city, state, phoneNumber, zip);
	        book.add(person);
	        System.out.println("Successfully Add ...");
	    }

	    //Display the person details added
	    public void display() {
	        for (Person person : book)
	            System.out.println(person);
	    }
	}