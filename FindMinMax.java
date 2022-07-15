package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] values = { 10,23,5,45,56,76,78};
          int length = values.length;
          Arrays.sort(values);
          System.out.println("The min value is:" +values[0]);
          System.out.println("The max value is:" +values[length-1]);
	}
	

}
