package com.matrix.base;

import org.testng.annotations.BeforeSuite;

public class Base {
	
	@BeforeSuite
	public void init() {
		System.out.println("in BeforeSuite");
	}

}
