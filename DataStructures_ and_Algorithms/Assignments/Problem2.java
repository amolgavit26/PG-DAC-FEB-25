import java.util.*;

class Problem2{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input 2 Strings: ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		System.out.println(str1 + " & " + str2 + " are anagrams? " + anagram(str2, str1));
		
		System.out.println("Input a sentence: ");
		str1 = sc.nextLine();
		
		System.out.println("Longest Word in " + str1 + " is: " + largestWord(str1));
		int[] res = findVC(str1);
		
		System.out.println("Vowenls: " + res[0] + ", Constants: " + res[1]);	
	}
	
	public static String largestWord(String s){
		String[] words = s.split("\\s+");
		
		String longword = "";
		
		for(int i = 0; i < words.length; i++){
			if(words[i].length() > longword.length())
				longword = words[i];
		}
		return longword;
	}
	
	public static boolean anagram(String s1, String s2){
		if(s1.length() != s2.length()) 
			return false;
		
		s1 = s1.toLowerCase();
		s2 = s2.toUpperCase();
		
		int frequency[] = new int[26];
		
		for(int i = 0; i < s1.length(); i++){
			frequency[s1.charAt(i)-'a']++;
			frequency[s2.charAt(i)-'a']--;
		}
		
		for(int i = 0; i < frequency.length; i++){
			if(frequency[i] != 0) 
				return false;		
		}
		return true;
	}
	
	public static int[] findVC(String s){
		s = s.toLowerCase();
		
		String[] words = s.split("\\s+");
		int count1 = 0, count2 = 0;
		
		for(int i = 0; i < words.length; i++){
			for(int j = 0; j < words[i].length(); j++){
				if(words[i].charAt(j)=='a' || words[i].charAt(j)=='i' || words[i].charAt(j)=='e' || words[i].charAt(j)=='o' || words[i].charAt(j)=='u'){
					count1++;
				} else {
					count2++;
				}
			}
		}
		return new int[]{count1++, count2++};
	}
}