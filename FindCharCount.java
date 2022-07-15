package week1.day2;

public class FindCharCount {
    public static void main(String[] args) {
		
    	String str = "Karthika";
    	char x = 'a';
    	int count = 0;
    	char[] str1= str.toCharArray();
    	for(int i =0; i<str1.length;i++) 
    	{
    		if(str1[i]== x) 
    			count++;
    	}
    	System.out.println(count);	
    	}
    	
	}


