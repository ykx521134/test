package com.example.config;

public class LambdaExpress {
	public static void main(String[] args) {
	  A a = ()->"hello world";
	  System.out.println(a.sayHello());
	}
   
}

interface A{
	public String sayHello();
}