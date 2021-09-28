package com.bridgelab;
	import java.util.Scanner;

	public class Main {
	    private void options() {
	        boolean status = true;
	        Scanner scan = new Scanner(System.in);
	        //Create object
	        AddressBookSystem addressBookSystem = new AddressBookSystem();

	        /*To print options to perform
	         *Choice to print add and display method
	         */
	        while (status) {
	            System.out.println("Enter your option : \n Press 1 to Add new person" +
	                    " \n Press 2 to Edit details \n Press 3 to Display details \n Press 9 to Quit");
	            int choice = scan.nextInt();
	            switch (choice) {
	                case 1:
	                    addressBookSystem.add();
	                    break;
	                case 2 :
	                    System.out.println("Enter your firstname to edit your details");
	                    String firstName = scan.next();
	                    addressBookSystem.edit(firstName);
	                    break;
	                case 3 :
	                    addressBookSystem.display();
	                    break;
	                default:
	                    status = false;
	            }
	        }
	    }

	    /*Main method to call options*/
	    public static void main(String args[]) {
	        Main main = new Main();
	        main.options();

	    }

}
