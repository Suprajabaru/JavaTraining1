package com.java_corporate;

import java.util.Scanner;

public class Users3 {
	 
	public static void main(String[] args) {

		 Scanner sc; 

        SimpleTransaction1 ts=new SimpleTransaction1();


        int choice;

 

        System.out.println("Welcome ");

 

        do {
        

 

            System.out.println("1:Create account");

 

            System.out.println("2:Login");

 

            System.out.println("3:Exit");

 

            System.out.println("Choose option");

 

            sc=new Scanner(System.in);

 

            choice=sc.nextInt();

 

            switch (choice) {

 

            case 1: {

 

                ts.account();

 

                break;

 

            }

 

            case 2: {

 

                ts.login_account();

 

                break;

 

            }

 

            case 3: {

 

                System.out.println("Good bye...");

 

                break;

 

            }

 

            default:

 

                System.out.println("Invalid option");

 

            }

 

        }while(choice!=3);

 

        System.out.println("Thank you for using our service, Please visit again...");

 

        //sc.close();

 

    }

}
