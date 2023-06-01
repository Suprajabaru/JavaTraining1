package com.java_corporate;

public class Accounts1 {


private int account_num;

private int pin;

private double balance;

private double[] transactions;

private int transactionCount;

public Accounts1() {

	balance = 0;

	transactions = new double[100];

	transactionCount = 0;

}

public int getAccount_num() {

	return account_num;

}

public void setAccount_num(int account_num) {

	this.account_num = account_num;

}

public int getPin() {

	return pin;

}

public void setPin(int pin) {

	this.pin = pin;

}

public double getBalance() {

	return balance;

}

public void setBalance(int balance) {

	this.balance = balance;

}

public double checkBalance() {

	return balance;

}

public void deposit(double amount) {

	if(amount>0) {

		balance+=amount;

		transactions[transactionCount++]=amount;

	}

	else {

		System.out.println("Invalid deposit amount.");

	}

}

public void withdraw(double amount) {

	if (amount > balance) {

		System.out.println("Insufficient balance.");

	} else if (amount <= 0) {

		System.out.println("Invalid withdrawal amount.");

	} else {

		balance -= amount;

		transactions[transactionCount++] = -amount;

	}
}

public void TransactionHistory() {

	 

    System.out.println("Transaction History:");



    if(transactionCount==0) {



        System.out.println("No Transaction has done");



    }



    for (int i = 0; i < transactionCount; i++) {



        if (transactions[i] > 0) {



            System.out.println("Deposit: $" + transactions[i]);



        } else {



            System.out.println("Withdraw: $" + (-transactions[i]));



        }
        


}
}
}


