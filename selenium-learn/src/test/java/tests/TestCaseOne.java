package tests;

import org.testng.annotations.BeforeMethod;

public class TestCaseOne {

	@BeforeMethod
	void beforeMethod(){
		System.out.println("Before method");
	}
}
