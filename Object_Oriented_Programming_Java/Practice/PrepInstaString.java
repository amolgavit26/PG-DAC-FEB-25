



/*
Q1 Java Program to check a character is a Vowel or Consonant



class PrepInstaString{
	
	
     public static void main(String[] args){
		
	char c = 'H';   
 
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
        System.out.println(c + " is a vowel ");
        }
        else
        {
            System.out.println(c + " is a consonant ");
        }
	}
	
}


Q2 Java program to check a character is an alphabet or not




class PrepInstaString{
	
	
     public static void main(String[] args){
		char ch;
                              
        ch = '%';
		
		
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
	      System.out.println("The character " + ch + " is an Alphabet");
	  
	else
	      System.out.println("The character " + ch + " is not an Alphabet");
	
	}
	
}


Q3Java Program for Calculating ASCII value of a character





class PrepInstaString{
	
	
     public static void main(String[] args){
		
		char c='A';	
		
		int i = c;
		
		System.out.println("ASCII value of "+c+" is "+i);
		
		
	}
}


Q4 Java Program to find length of the string without using length function




class PrepInstaString{
	
	
     public static void main(String[] args){

		int length=0;
		
            String s = "amolgavit26";
            for (char c1 : s.toCharArray()) 
					
			length++;
			
		System.out.println("Length of String is : "+length);
		
	}
	
}





Q5 Java program to toggle each character in a string



class PrepInstaString{
	
	
     public static void main(String[] args){
		 
		 
	 String s = "AmolGavit26";
	 String s1 = "";
	 
	 for (int i = 0; i < s.length(); i++) {
		 
		if(Character.isUpperCase(s.charAt(i))) 
			
			 s1 = s1+Character.toLowerCase(s.charAt(i));
			 
		else 
			 s1 = s1+Character.toUpperCase(s.charAt(i));
	}
	System.out.println("Toggle String is : "+s1);
	 
  }
	
}



Q6 Java program to count the number of vowels in a String


class PrepInstaString{
	
	
     public static void main(String[] args){
		
		String s = "amolgavit";
		char[] c = s.toCharArray();
		int vowel=0;
		
		for (int i = 0; i < s.length(); i++) { 
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
                vowel++; 
		}
  
	System.out.println("Vowels: " + vowel);
    }
}


Q7 Java Program to Remove Vowels from a String




class PrepInstaString{
	
	
     public static void main(String[] args){
		
        String s = "Amolgavit";
		
        String s1 = "";
		
        s1 = s.replaceAll("[aeiouAEIOU]", "");
		
        System.out.println("String after removing vowel : "+s1); 
	}

}


*/