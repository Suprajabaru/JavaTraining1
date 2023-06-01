package com.java_corporate;

import java.util.Scanner;



public class SimpleTransaction1 {

	Scanner sc=new Scanner(System.in);

	Accounts1 ac=new Accounts1();

	int choice;

	public void account() 
	{	
		System.out.println("Enter your account number");

		int account_no=sc.nextInt();

		ac.setAccount_num(account_no);

		System.out.println("Enter your pin number");

		int pin=sc.nextInt();

		ac.setPin(pin);

		System.out.println("Enter the balance");

		int balance=sc.nextInt();

		ac.setBalance(balance);

		System.out.println(ac.getAccount_num());

		System.out.println(ac.getBalance());
		
		System.out.println(ac.getPin());

	}



	public void login_account() {

		System.out.println("Enter the account number");

		int account_no=sc.nextInt();

		if(account_no==ac.getAccount_num()) {

			System.out.println("Enter the pin number");

			int pin=sc.nextInt();

			if(pin==ac.getPin()) {

				System.out.println("login sucessfull");

				do {

					System.out.println("Welcome "+account_no);
					System.out.println("1. for Checking Balance");
					System.out.println("2. for Deposit");
					System.out.println("3. for Withdraw");
					System.out.println("4. forView Transaction History");
					System.out.println("5. for Exit");
					System.out.print("Choose an option to perform: ");

					choice = sc.nextInt();

					switch (choice) 
					{

					case 1:
						System.out.println("Current balance: $" + ac.checkBalance());
						break;

					case 2:
						System.out.print("Enter deposit amount: $");
						double depositAmount = sc.nextDouble();
						ac.deposit(depositAmount);
						break;

					case 3:
						System.out.print("Enter withdrawal amount: $");
						double withdrawalAmount = sc.nextDouble();
						ac.withdraw(withdrawalAmount);
						break;

					case 4:
                        ac.TransactionHistory();
                        break;

 
					case 5:
						System.out.println("Goodbye!!! Thanks for your choosing our ATM");
						break;

					default:
						System.out.println("Invalid option. Please try again.");

					}

					System.out.println();

				} 
				while (choice != 5);

			}else
			{
				System.out.println("you entered Invalid pin");
			}

		}else
		{

			System.out.println("Account number is Invalid");
		}

		//sc.close();
}
}
