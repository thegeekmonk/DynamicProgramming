package dynamic.programming.java;

import java.util.HashMap;

public class MakeStringPalindrome {

	private int count = 0;

	public int insertMinCharToPalindrome(String str) {
		int len = str.length();
		int mid = len / 2;

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

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
