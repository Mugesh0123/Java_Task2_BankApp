package com.bank.app;
import java.util.Scanner;
public class AccountDetail {	
 
private String costumerName;
private String BankAccType;
private int BankAccountNumber;
private int AvailbleBalance;
public void createAccount() {
     	Scanner in1 = new Scanner(System.in);
		System.out.println("Enter the customer name : ");
		costumerName = in1.nextLine();
		System.out.println("enter the bank acc type name : ");
		BankAccType = in1.nextLine();
		System.out.println("enter the bank account number : ");
		BankAccountNumber = in1.nextInt();
		System.out.println("initial deposite amount : ");
		AvailbleBalance = in1.nextInt();
}
public void showAllAccount() {
	System.out.println("customer name : " + costumerName);
	System.out.println("bank ACC type : " + BankAccType);
	System.out.println("bank account number : " + BankAccountNumber);
	System.out.println("available balance : " + AvailbleBalance);
	System.out.println("......");
}
public boolean searchAcc(int AccNumber) {
	if(BankAccountNumber == AccNumber) {
		return true;
	}
	return false;	
}
public void showBalance() {
	System.out.println("available balance : " + AvailbleBalance);
}

public void depositeBalance() {
	    Scanner in2 = new Scanner(System.in);
		int DepositeBalance;
		System.out.println("deposite amount : ");
		DepositeBalance = in2.nextInt();
		AvailbleBalance =  AvailbleBalance + DepositeBalance ;
		System.out.println("Availble Balance : " + AvailbleBalance);
}
public void withDrawBalance() {
	    Scanner in3 = new Scanner(System.in);
		int withDrawBalance;
		System.out.println("With Draw Balance Amount : ");
		withDrawBalance = in3.nextInt();
		AvailbleBalance =  AvailbleBalance - withDrawBalance ;
		System.out.println("Availble Balance : " + AvailbleBalance);
}
}
