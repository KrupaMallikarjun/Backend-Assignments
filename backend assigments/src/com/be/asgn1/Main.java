package com.be.asgn1;

public class Main {
public static void main(String[] args) {
	Account customer=new Account();
	customer.deposite(300);
	customer.withdraw(100);
	System.out.println(customer.getbalance());
}
}
