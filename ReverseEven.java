package week1.day2;

public class ReverseEven {
	public static void main(String[] args) {
		//Reverse Even words
	
	   /*1.Convert given string into words
	    2.To check whether word is even
	    3.If even words, convert into char Array
	    4.Reverse the characters of words and print it*/
	
		String name = "Testing is my passion";
		String[] words =name.split(" ");
		System.out.println(words);
		for(int i=0;i<=words.length-1;i++) {
			if(i%2!=0) {
				char[] charArray = words[i].toCharArray();
				for(int j1 = charArray.length-1;j1>=0;j1--){
					System.out.print(charArray[j1]);
				}
				System.out.print(" ");
		    }
		    else {
		    	System.out.print(words[i]+ " ");
		    }
	    }
}}
	

