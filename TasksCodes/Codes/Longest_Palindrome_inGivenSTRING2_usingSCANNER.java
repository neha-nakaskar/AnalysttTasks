package string;

import java.util.Scanner;

public class Longest_Palindrome_inGivenSTRING2_usingSCANNER {

	public static void main(String[] args) {
		System.out.println(longestPalindromeString());

	}
		
		
		
		
		
		static public String intermediatePalindrome(String s, int left, int right) {
			if (left > right) return null;
			while (left >= 0 && right < s.length()
					&& s.charAt(left) == s.charAt(right)) {
				left--;
				right++;
			}
			return s.substring(left + 1, right);
		}

		public static String longestPalindromeString() {
			
			System.out.println("Enter String  ");
			Scanner in= new Scanner(System.in);
			String s=in.next();
			if (s == null) return null;
			String longest = s.substring(0, 1);
			for (int i = 0; i < s.length() - 1; i++) {
				
				String palindrome = intermediatePalindrome(s, i, i);
				if (palindrome.length() > longest.length()) {
					longest = palindrome;
				}
				
				palindrome = intermediatePalindrome(s, i, i + 1);
				if (palindrome.length() > longest.length()) {
					longest = palindrome;
				}
			}
			return longest;
		}

	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	


