package com.slk.training.programs;

import com.slk.training.service.EnglishHelloService;
import com.slk.training.service.HelloService;
import com.slk.training.service.SpanishHelloService;

public class P01_TestingHelloService {

	public P01_TestingHelloService() {
	}

	public static void main(String[] args) {
		HelloService service;
		service = new EnglishHelloService();
		service.greet();
		service = new SpanishHelloService();
		service.greet();
	}

}
