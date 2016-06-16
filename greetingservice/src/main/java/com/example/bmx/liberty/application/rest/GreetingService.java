package com.example.bmx.liberty.application.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// curl https://rest1.eu-gb.mybluemix.net/greeting

@Path("greeting")
public class GreetingService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Greeting getGreeting() {
		final Greeting g = new Greeting("Hello world!");

		return g;
	}

}