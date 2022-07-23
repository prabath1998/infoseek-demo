package com.giz.infoseekdemo.ex;

class Customer {
	private int code;
	private String name;

	public Customer(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [code=" + code + ", name=" + name + "]";
	}
}
