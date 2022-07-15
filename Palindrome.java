package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		//Palindome
		
		String str1 = "madam";
		String str2 = "";
	    char[] chars = str1.toCharArray();
	    
		for(int i= chars.length-1;i>=0;i--) {
		str2 = str2 + chars[i];
		}
		System.out.println(str2);
		if(str1.equals(str2)) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
	}

}
