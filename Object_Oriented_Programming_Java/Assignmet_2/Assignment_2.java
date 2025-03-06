class Assignment_2{
	

	// Q1 Write a program to swap two numbers without using a third variable and without using arithmetic operators like + or -.

	void question_1(int first, int second){
	first = first ^ second;
	second = first ^ second;
	first = first ^ second;
	
		System.out.println(first +" "+second);
	
		}
	
	
	// Q2 Write a program to check whether a given number is even or odd using only bitwise

	
	void question_2(int first){
	
		System.out.println((first ^ 1) == (first + 1) ? first + " is EVEN" : first + " is ODD");

		}
	
	
	
	// Q3 Implement a program that calculates the sum of digits of an integer using modulus (%) and division (/) operators.

	
	void question_3(int first){
		
	int sum = 0;
	
	while (first != 0){
		
		int last = first % 10;
		
		sum += last;
		
		first /= 10;
			}
	
		System.out.println(sum);
		
		}
		
	
	
	
	//Q4 Write a program to find whether a given number is divisible by 3 without using the modulus (%) or division (/) operators.

	
	void question_4(int first){
	
	int num1 = first;
	
	while(num1>3){
		
		num1 = (num1 & 3) + (num1 >> 2);
		
			}

	if(num1 == 0 || num1 == 3){
		
		System.out.println(first + " is divisible by 3");
		
			}
	else{
		
		System.out.println(first + " is not divisible by 3");
		
		}
	
	}
	
	
	
	//Q5 Write a Java program to swap two numbers using the += and -= operators only.

	
	void question_5(int first, int second){
	
	first += second;
	second = first - second;
	first -= second;
	
		System.out.println(first +" "+second);
	
		}
	
	
	
	// Q6 Write a program to find the largest of three numbers using only the ternary operator (? :).
	
	
	void question_6(int first, int second, int third){
	
	System.out.println( third > (first > second ? first : second) ? third : ((first > second ) ? first : second));
	
	//System.out.println(result);
		
		}
	
	
	
	// Q7 Implement a Java program that checks whether a given year is a leap year or not using logical (&&, ||) operators.


	void question_7(int year){
	
	boolean result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	
	if (result){
		System.out.println(year + " is Leap Year");
	}
	else {
		System.out.println(year + " is not a Leap Year");
	
		}
		}
		
		
	// Q8 Write a program that takes three boolean inputs and prints true if at least two of them are true.

		
	void question_8(boolean first, boolean second, boolean third){	
	
	boolean result = (first && second) || (second && third) || (first && third);
	
	System.out.println(result);
	
		}
		
		
	// Q9 Implement a Java program that checks if a number is within a specific range (20 to 50) without using if-else.
			// Hint: Use logical AND (&&) in a print statement.
		
		
	void question_9(int first, int second, int third){
	
	System.out.println((third >= first && third <= second) ? third + " within the given range." : third + " outside the given range.");
	
		}
		
		
	// Q10 Write a program to determine if a character is a vowel or a consonant using the ternary operator.
	
	void question_10(char latter){
	
	System.out.println((latter == 'a' || latter == 'e' || latter == 'i' || latter == 'o' || latter == 'u' || latter == 'A' || latter == 'E' || latter == 'I' || latter == 'O' || latter == 'U') ? latter + " is a vowel." : latter + " is a consonant.");

		}
		
		
	// Q11 Write a program to check if a given number is a power of 2 using bitwise operators.
		// Hint: n & (n - 1) == 0 for positive numbers
		
		
		void question_11(int first){
		
		if((first & (first-1))==0){
			
			System.out.println(first + " is a power of two");
				}
		else
			System.out.println(first + " is not a power of two");	
	} 

		
	// Q12 Write a Java program to multiply a number by 8 without using * or / operators.
			// Hint: Use bitwise left shift (<<).

		void question_12(int first){
			
		int result = first << 3;
		
		System.out.println(first + " * 8 = " +  result);
		
			}
		
		
	// Q13 Implement a Java program to find the absolute value of an integer using bitwise operators.
			// Hint: mask = num >> 31; abs = (num + mask) ^ mask;
		
		void question_13(int num){
			
		int mask = num >> 31;
		
		int x = (num + mask) ^ mask;
		
		System.out.println(x);
		
		}
			
			
	// Q14 Write a program to count the number of 1s (set bits) in a binary representation of a number using bitwise operations.
			// Hint: Use n & (n - 1).
	
		void question_14(int first){	
			
				int count = 0;
		while(first > 0){
            first = (first & (first - 1));
            count++;
        }
		System.out.println(count);
		}
			
	
	// Q15 Implement a program to swap odd and even bits of a number using bitwise operators.
			// Hint: Use masks: (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1.

		void question_15(int first){
			
		int evenBits = (first & 0xAAAAAAAA) >> 1; // this is use to get even bits and shift right
        int oddBits = (first & 0x55555555) << 1;   // this is use to get odd bits and shift left
        int result = (evenBits | oddBits);   
		System.out.println(result);
		
		}
	
	
	// Q16 Write a program that determines whether a given number is positive, negative, or zero using only the ternary operator
	
	
	void question_16(int first){
		
		System.out.println(first == 0? "zero" : (first>0)? first + " is positive" : first + " is negative");
		
		}
	
	
	// Q17 Implement a Java program that finds the minimum of four numbers using nested ternary operators
	
	void question_17(int first, int second, int third, int fourth){
	
		int res = (first<second && first<third && first < fourth)? first:(third < second && third < first && third < fourth)? third:(second < third && second < first && second < fourth)? second : fourth;
		System.out.println(res);
	}
	
	
	// Q18 Given a student’s percentage, print Pass if the percentage is 40 or above; 
		// otherwise, print Fail, using only the ternary operator
	
	void question_18(float first){
		
		System.out.println(first >= 40? "Pass" : "Fail");
	
		}
		
		
	// Q19 Write a Java program that checks whether a character is uppercase, lowercase, or not a letter using only the ternary operator
		
	void question_19(char first){
		
		int num = (int) first;
		System.out.println((num > 64 && num < 91)? first + " is Uppercase" : first + " is Lowercase");
		
		}
		
		
	// Q20 Implement a Java program that returns the absolute value of a given number using the ternary operator (without using Math.abs()).
		
	void question_20(int first){
		
		System.out.println((first > 0)? first + " is the absolute value of given number." : -first + " is the absolute value of given number.");

		}
		
		
		
		
	}
	
	
	
class Answers{
	
		public static void main(String args[]){
			
			Assignment_2 x1 = new Assignment_2();
			
									// {PUT the Required Parameteers Correctly.}
			x1.question_20(-20);		// Otherwise be ready to get the ERROR.
									// reqired: int --------> found int,int,string
									// reason: actual and formal argument lists differ in length
		}
	
	}	
	

	
	
	
	
	
	
	
	
	
	
