package Selenium2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

public class IgnoreExceptionInTestNG {

	@Test(expectedExceptions=ArithmeticException.class)
	public void test1(){
		System.out.println("test1!!");
		System.out.println(20/0);
	}
	
	@Test(expectedExceptions=FileNotFoundException.class)
	public void test2() throws FileNotFoundException{
		System.out.println("test2!!");
		FileInputStream fis=new FileInputStream("D:/file.txt");
		}
	
}
