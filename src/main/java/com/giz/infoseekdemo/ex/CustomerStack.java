package com.giz.infoseekdemo.ex;

import java.util.Stack;

public class CustomerStack {
	public static Stack stk = new Stack();
	Customer stack[] = new Customer[4];
	int top = 0;

	public void push(Customer customer) {
		if (top == 5) {
			System.out.println("Stack is full");
		} else {
			stack[top] = customer;
			top++;
		}
	}

	public void printCustomerStack() {
		for (Customer c : stack) {
			System.out.println(c + " ");
		}
		System.out.println(" ");
	}

	public Customer pop() {
		top--;
		Customer lastCustomer = stack[top];
		stack[top] = null;
		return lastCustomer;
	}	
}
