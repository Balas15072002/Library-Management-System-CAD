package com.zsgs.readify.features.librarysetup;

import com.zsgs.readify.repository.dto.Library;

import java.util.Scanner;

public class LibrarySetUpView {
    private final LibrarySetUpModel model;
    private Scanner scan = new Scanner(System.in);

    public LibrarySetUpView(){
        model=new LibrarySetUpModel(this);
    }

    public void init() {
        model.init();
    }

    public void proceedToSetupLibrary() {
        System.out.println("\n----- Library Setup -----");
        Library library = new Library();

        library.setName(getLibraryName());
        library.setAddress(getAddress());
        library.setPhoneNo(getPhoneNumber());
        library.setEmailId(getEmail());
    }

    private String getEmail() {
        String email="";
        do{
            email= scan.nextLine();
            if(!email.matches(""))
        }
    }

    private String getPhoneNumber() {
        String phone="";
        System.out.println("Enter Phone Number: ");
        do {
            phone=scan.nextLine();
            if(!phone.matches("\\d{10}"))
                System.out.println("Phone number should be 10 digits\nEnter valid phone number: ");
            else
                break;
        }while (true);
        return phone;
    }

    private String getAddress() {
        String address="";
        System.out.println("Enter Library Address: ");
        do{
            address=scan.nextLine();
            if(address.length()<5 || address.length()>100)
                System.out.println("Address should be between 5 and 100 characters\nEnter valid address: ");
            else
                break;
        }while (true);
        return address;
    }

    private String getLibraryName() {
        String name = "";
        System.out.print("Enter Library Name: ");
        do{
            name=scan.nextLine();
            if(name.length()<3 || name.length()>50)
                System.out.println("Library name should be between 3 and 50 characters\nEnter valid name: ");
            else break;
        }while (true);
        return name;
    }
}
