package com.example.bmx.liberty.application.rest;

public class Greeting {
	private String greeting;

	public Greeting() {
	}

	public Greeting(final String greeting) {
		this.greeting = greeting;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(final String greeting) {
		this.greeting = greeting;
	}

	@Override
	public String toString() {
		return "Greeting [greeting=" + greeting + "]";
	}
}
