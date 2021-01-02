package dynamic.programming.java;

import java.util.HashMap;

public class MakeStringPalindrome {

	public static int insertMinCharToPalindrome(String str) {
		int len = str.length();
		int mid = len / 2;
        
		int count = 0;
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		// store first half of string into Hashmap
		if (len % 2 == 0)
			for (int i = 0; i < mid; i++) {
				hm.put(str.charAt(i), i);
			}
		else
			for (int j = 0; j <= mid; j++) {
				hm.put(str.charAt(j), j);
			}

		// search for 2nd half of string in Hashmap
		if (len % 2 == 0)
			for (int i = mid; i < len; i++) {
				if(hm.containsKey(str.charAt(i)))
					count++;
			}
		else
			for (int j = mid+1; j < len; j++) {				
				if(hm.containsKey(str.charAt(j)))
					count++;
			}

		return 2*count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub         
		 //String str = "ab3db";
		  String str = "ab3pq"; 
				
		 System.out.println("Minm Character Required : "+insertMinCharToPalindrome(str));
		 
	}

}
