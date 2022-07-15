package week1.day2;

public class ChangeOddIndexToUpperCase {
       public static void main(String[] args) {
		String str = "karthika";
		char[] chars = str.toCharArray();
		
		for(int i =0; i< chars.length;i++) {
			if(i%2!=0) {
				char uppercase = Character.toUpperCase(chars[i]);
			System.out.println(uppercase);
		} 
		else
		{
			System.out.println(chars[i]);	
		}
	}
       }
}
