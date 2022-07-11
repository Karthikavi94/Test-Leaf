package week1.day1;

import java.nio.file.spi.FileSystemProvider;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstnumber = 0;
		int secondnumber =1;
		int sum = 0;
		System.out.println(firstnumber);
		System.out.println(secondnumber);
        for (int i = 0; i <=11; i++) {
        	sum = firstnumber + secondnumber;
        	firstnumber = secondnumber;
        	secondnumber = sum;
        	System.out.println(sum);
        	
			
		}
	}

}
