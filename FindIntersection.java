package week1.day2;

public class FindIntersection {
  public static void main(String[] args) {
	 int[] values1 = {10,12,9,7,17};
	 int[] values2 = {1,12,3,4,9};
	 int[] values3 = new int[5];
	 int k=0;
	 System.out.println("Intersection of the two arrays ::");
	
	 for (int i = 0; i < values1.length; i++) {
		 for (int j = 0; j < values2.length; j++) {
			 if(values1[i] == values2[j])
			 {
				values3[k] =  values1[i];
				System.out.println(values3[k]);
				
			 }
		
		else {
		 
			 continue;
		}
		
	}
}
}}
