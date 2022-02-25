package com.raju.shor;

import java.io.Serializable;

public class ShortMainKey implements Serializable {
	private String messages;

	public static void main(String[] args) {

		System.out.println("Hello World");
	}

	public String getMessage() {
		return messages;
	}

	public void setMessage(String message) {
		this.messages = message;
	}
}
