//This Program is to count the no. of characters to be removed for making Strings Anagram.
//Input: 2 Strings.
//Output: Count of characters to be removed for strings to be Anagram.

import java.util.Scanner;
public class Anagram {
 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String b = sc.next();
      System.out.println(areAnagram(a,b));
	}
	public static int areAnagram(String str1, String str2) {
		int count[] = new int[26];
		int count1[] = new int[26];
		int result = 0;
		//count the frequency of each character in string
		for(int i=0;i<str1.length();i++) 
			count[str1.charAt(i)-'a']++;
		for(int i=0;i<str2.length();i++)
			count1[str2.charAt(i)-'a']++;
		//traverse the count arrays to find the no of characters to be removed
		for(int i=0;i<26;i++)
			 result += Math.abs(count[i]-count1[i]);
		return result;
	}
}
