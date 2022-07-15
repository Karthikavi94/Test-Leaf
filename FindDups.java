package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] dupvalues = {12,23,45,10,34,11,7,23,10,34};
		Arrays.sort(dupvalues);
		
		for(int i=0; i<=dupvalues.length-1;i++)
		{
			if(dupvalues[i]==dupvalues[i+1])
				System.out.println("The duplicate value is:" +dupvalues[i]);
		}
		
		

	}
}

