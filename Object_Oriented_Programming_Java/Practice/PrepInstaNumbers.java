

// PrepInsta 100 Coding Queations



// Section1 ---> Getting Started


/*

	Q1 Check if a Number is Positive or Negative in Java



class PrepInstaNumbers{
	
	public static void main(String args[]){
		
		int num1 = 36, num2 = 60, hcf = 0;
		
		for (int i = 1; i <= num1 || i <= num2; i++){
		if (num1 % i == 0 && num2 % i == 0)
			hcf = i;
		}

		System.out.println("The HCF: "+ hcf);

	}
}



	Q2 LCM of two numbers using Java





class PrepInstaNumbers{
	
	public static void main(String args[]){
		
		int num1 = 16, num2 = 24, hcf = 1;
		
		for (int i = 1; i <= num1 || i <= num2; i++){
		if (num1 % i == 0 && num2 % i == 0)
			hcf = i;
		}

		int lcm = (num1 * num2) / hcf;
		System.out.println ("The LCM: " + lcm);

	}
}



Q3 Java Program to find GCD or HCF of two numbers






class PrepInstaNumbers{
	
	public static void main(String args[]){
		
    int num1 = 36, num2 = 60, hcf=0;

    for (int i = 1; i <= num1 || i <= num2; i++)
      {
     if (num1 % i == 0 && num2 % i == 0)
        hcf = i;
      }

    System.out.println("The HCF: "+ hcf);

	}
}



Q4 Binary to decimal conversion using Java




//Java program to convert Binary number to decimal number


class PrepInstaNumbers{
	
	public static void main(String args[]){

		int binary = 1011; 
		int decimal = 0;		
		int n = 0;  
		while(binary > 0)
		{
			int temp = binary%10; 
			decimal += temp*Math.pow(2, n);  
			binary = binary/10;  
			n++;  
		}
		System.out.println("Decimal number : "+decimal); 
	}
}





Q5 Octal to decimal conversion using Java



//Java program to convert octal number to decimal number

class PrepInstaNumbers{
	
	public static void main(String args[]){
		
		int octal = 13; 
		int decimal = 0;
		int n = 0;  
		while(octal > 0)
		{
			int temp = octal % 10;  
			decimal += temp * Math.pow(8, n);  
			octal = octal/10;  
			n++;  
		}
		System.out.println("Decimal number : "+decimal);  
	}
}







Q6 Hexadecimal to Decimal Conversion in Java



class PrepInstaNumbers{
	
	public static void main(String args[]){

    String hex = "C9";
    
    String digits = "0123456789ABCDEF";  
    hex = hex.toUpperCase();  
    int val = 0;  
    for (int i = 0; i < hex.length(); i++){  
        char c = hex.charAt(i);  
        int d = digits.indexOf(c);  
        val = 16*val + d;  
        }  
    System.out.println (val);
	
	
  } 

}




*/