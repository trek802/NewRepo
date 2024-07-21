package test.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise{
		
public static void main(String[] args) {
	System.out.println("New line added by current guy");
	
	System.out.println("New line added by New guy");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.co.in");
	}
}