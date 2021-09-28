package com.bridgelab;

public class AddressBookSystem {
	public static void main(String[] args) {
        System.out.println("Welcome to Address Book ");
        Person person = new Person("Shivani" ,"tamboli", "Pune,Maharashtra", "pune", "Maharashtra", 9999999999L, "411057");
        System.out.println("Firstname:"+ person.getFirstName());
        System.out.println("Lastname:"+ person.getLastName());
        System.out.println("Address:"+ person.getAddress());
        System.out.println("City:"+ person.getCity());
        System.out.println("State:"+ person.getState());
        System.out.println("Phone number:"+ person.getPhoneNumber());
        System.out.println("Zip:"+ person.getZip());
    }
}
