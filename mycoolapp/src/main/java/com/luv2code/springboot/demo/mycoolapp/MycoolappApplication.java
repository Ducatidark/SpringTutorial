package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	private int myInt;

	private String myString;

	private String myString2;
	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
