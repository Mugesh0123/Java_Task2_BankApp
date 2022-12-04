package com.bank.app;

public class BankCustomException extends Exception{
String message;

public BankCustomException(String message) {
	
	this.message = message;
}

@Override
public String toString() {
	return "BankCustomException [message=" + message + "]";
}
}
