package dynamic.programming.java;

import java.util.HashMap;

public class MakeStringPalindrome {
    
	private int count = 0;
	
	public int insertMinCharToPalindrome(String str)
	{   
		int len = str.length();		
		int mid = len/2;
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		
		//store first half of string into hashmap
		if(len%2 == 0)
		 for(int i = 0;i < mid;i++)
		 {
			hm.put(str.charAt(i),i); 
		 }
		else
		 for(int j = 0;j <= mid;j++)
		 {
			 hm.put(str.charAt(j),j); 
		 }
		
		
		
		
		return count;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		
		
	}

}
