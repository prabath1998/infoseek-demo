package com.giz.infoseekdemo.ex;

public class Demo extends CustomerStack{
	public static void main(String args[]) {
		CustomerStack stack = new CustomerStack();
		stack.push(new Customer(1001, "Danapala"));
		stack.push(new Customer(1002, "Gunapala"));
		stack.push(new Customer(1003, "Somapala"));
		stack.push(new Customer(1004, "Siripala"));
		stack.printCustomerStack();
		
		// [1004-Siripala, 1003-Gunapala, 1002-Gunapala, 1001-Danapala]
		stack.pop();
		stack.printCustomerStack();
		// [1004-Siripala, 1003-Gunapala, 1002-Gunapala, 1001-Danapala]		
	}

}
