package com.bank.app;

import java.util.Iterator;
import java.util.Scanner;

public class MainDriver {
 static Scanner in = new Scanner(System.in);
	public static void main(String[] args) throws BankCustomException {
		System.out.println("Enter the customer count : ");
		int CstmrCunt = in.nextInt();
		AccountDetail accountDetails[] = new AccountDetail[CstmrCunt];
		for (int i = 0; i < accountDetails.length; i++) {
			accountDetails[i] = new AccountDetail();
			accountDetails[i].createAccount();
		}
		int menuOption;
		
		do {
			System.out.println("....bank application menu section....");
			System.out.println("1. display all account ");
			System.out.println("2. search acc by acc number ");
			System.out.println("3. check acc balance");
			System.out.println("4. deposite money throught acc number & branch name ");
			System.out.println("5. withdraw money through acc number ");
			System.out.println("6. exit bank app");
			menuOption = in.nextInt();
			switch(menuOption) {
			case 1 :
				for (int i = 0; i < accountDetails.length; i++) {
					accountDetails[i].showAllAccount();
				}
				break;
			case 2 :
				 System.out.println("enter account number : ");
				 int AccNumber = in.nextInt();
				 boolean found=false;
				for (int i = 0; i < accountDetails.length; i++) {
					found = accountDetails[i].searchAcc(AccNumber);
					if (found) {
						accountDetails[i].showAllAccount();
					}
					if (!found) {
						throw new BankCustomException("account not available");
					}
				}
				
				break;
			case 3:
				 System.out.println("enter account number : ");
				  AccNumber = in.nextInt();
				  found=false;
				for (int i = 0; i < accountDetails.length; i++) {
					found = accountDetails[i].searchAcc(AccNumber);
					if (found) {
						accountDetails[i].showBalance();
					}
					if (!found) {
						throw new BankCustomException("your account number is wrong!!! re enter acc no");
					}
				}
				break;
			case 4:
				System.out.println("enter account number : ");
				  AccNumber = in.nextInt();
				  found=false;
				for (int i = 0; i < accountDetails.length; i++) {
					found = accountDetails[i].searchAcc(AccNumber);
					if (found) {
						accountDetails[i].depositeBalance();
					}
					if (!found) {
						throw new BankCustomException("your account number is wrong, so you cannt deposite sorry!!!");
					}
				}
				break;	
			case 5:
				System.out.println("enter account number : ");
				  AccNumber = in.nextInt();
				  found=false;
				for (int i = 0; i < accountDetails.length; i++) {
					found = accountDetails[i].searchAcc(AccNumber);
					if (found) {
						accountDetails[i].withDrawBalance();
					}
					if (!found) {
						throw new BankCustomException("your account number is wrong!! so, you cannt withdraw amount");
					}
				}
				break;	
			case 6:
				System.out.println("thanks for visiting");
			}				
		} while (menuOption != 6);
	}
}
