package com.ashok.example.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
//@Component
public class MyDataRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file:D:\\resources\\src?noop=true").to("file:D:\\resources\\dest");
	}

	

}
