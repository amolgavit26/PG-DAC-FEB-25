

// PrepInsta 100 Coding Queations



// Section1 ---> Getting Started



/*
	Q1 Check if a Number is Positive or Negative in Java

class PrepInsta{
	
	public static void main(String args[]){
		
		int num = -10;
		
		if (num > 0){
			System.out.println ("The number is positive.");
		}else if (num < 0 ){
			System.out.println ("The number is negative.");
		}else{
			System.out.println ("The number is zero.");
		}
	
		
	}
}




	Q2 Java Program to Check Whether a Number is Even or Odd




class PrepInsta{
	
	public static void main(String args[]){
		
		int num = 13;
		
		if (num % 2 == 0){
			System.out.println (num + " is Even");
		}else{
			System.out.println (num + " is Odd");
	
		
	}
}
}


	Q3 Program to Find the Sum of First N Natural Numbers using java



class PrepInsta{
	
	public static void main(String args[]){
		
		int num = 10;
		int sum = 0;
		
		for(int i = 1; i <= num; i++){
			
			sum += i;
			
		}
			System.out.println ("Sum of " + num + " Natural Number is : " + sum);
	
	}
}



	Q4 Find the Sum of the Numbers in a Given Range in Java



class PrepInsta{
	
	public static void main(String args[]){
		
		int num1 = 5;
		int num2 = 10;
		int sum = 0;
		
		for(int i = num1; i <= num2; i++){
			
			sum += i;
			
		}
			System.out.println ("Sum of Natural Numbers from : " + num1 + " to " + num2 + " are " + sum);
	
	}
}


	Q5 Java Program to Find Greatest of Two Numbers



class PrepInsta{
	
	public static void main(String args[]){
		
		int num1 = 10, num2 = 20;
		
		int Greatest = (num1 > num2) ? num1 : num2;
		
		System.out.println (Greatest + " is the Greatest.");
	
	}
}




	Q6 Find the Greatest Number Among Three Numbers in Java


class PrepInsta{
	
	public static void main(String args[]){
		
		int num1 = 10, num2 = 40, num3 = 30;
		
		int Greatest = (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 : num3;
		
		System.out.println (Greatest + " is the Greatest.");
	
	}
}



	Q7 Java Program to Check Leap Year or not


class PrepInsta{
	
	public static void main(String args[]){
		
		int year = 1994;
		
		String leapYear = (year % 400 == 0) ? "not" : (year % 4 == 0 && year % 100 != 0) ? "a" : "not";
		
		System.out.println (year + " is " + leapYear + " leap year.");
	
	}
}




	Q8 Prime Number Program in Java



class PrepInsta{
	
	public static void main(String args[]){
		
		int num1 = 2;
		
		boolean counter = false;
		if (num1 < 2){
			counter = false;
		}
		
		for(int i = 2; i <= num1/2; ++i){
			
			if(num1 % i == 0){
				counter = true;
			}
		}
		if(!counter){
			System.out.println ("The given is number " + num1 + " is a prime");
		}else{
			System.out.println ("The given is number " + num1 + " is not prime");
		}
		
		
	}
}


	Q9 Sum of digits of a Number in Java




class PrepInsta{
	
	public static void main(String args[]){
		
		int num1 = 2254;
		int sum = 0;
		
		while(num1 != 0){
			sum += num1 % 10;
			num1 /= 10;
		}

		System.out.println ("Sum of digits : " + sum);
	
	}
}


	Q10 Reverse a given number in Java

class PrepInsta{
	
	public static void main(String args[]){
		
		int num1 = 2254;
		int last;
		int reverse = 0;
		
		while(num1 != 0){
			last = num1 % 10;
			reverse = reverse * 10 + last;
			num1 /= 10;
		}

		System.out.println ("Reversed Number: " + reverse);
	
	}
}



	Q11 Palindrome Program in Java

	
class PrepInsta{
	
	public static void main(String args[]){
		
	int num = 121, reverse = 0, last;
	
	int num1 = num;
	while(num1 != 0){
		last = num1 % 10;
		reverse = reverse * 10 + last;
		num1 /= 10;
	}
	
	if(num == reverse){
		System.out.println (num + " is Palindrome");		
	}else{
		System.out.println (num + " is not Palindrome");
	}


	}
}


	Q12 Fibonacci Series in Java
	


class PrepInsta{
	
	public static void main(String args[]){
		
	int num = 10, a = 0, b = 1, next;
	
	System.out.print(a + " " + b + " ");

	for(int i = 2; i < num; i++){
		next = a + b;
		a = b;
		b = next;
		System.out.print(next + " ");
	}

	}
}

	Q13 Factorial of a Number in Java
*/


class PrepInsta{
	
	public static void main(String args[]){
		
	int num = 5, sum = 1;
	
	for(int i = 1; i <= num; i++){
		
		sum *= i;
		
	}
	System.out.print("Factorial of " + num + " is " + sum);
	}
}
