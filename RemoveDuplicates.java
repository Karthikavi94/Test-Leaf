package week1.day2;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		//Remove duplicates
		
		String str = "Test words from the test sentence to check repeated test words";
		
		System.out.println(str);
		
		String text[] = str.split(" ");		//Convert given string into words
		
		for(int i=0; i<text.length;	i++) {
			
			for(int j=i+1; j<text.length; j++) {
			
				if(text[i].equalsIgnoreCase(text[j])) 	//Compare two strings
				{
					text[j]= ""; //Replace same words by space
				}
				
				}
			 System.out.print(text[i]+" "); 
					}
		
			
          }}

