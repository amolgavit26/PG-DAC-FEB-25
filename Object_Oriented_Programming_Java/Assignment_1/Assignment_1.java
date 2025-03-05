
import java.util.Scanner;

class Assignment_1 {
	public static void main (String args[]){
	
	/*
	
	Q1 Write a Java program to declare and initialize all eight primitive data types and print their values.

	static boolean a;
	static char b;
	static byte c;
	static short d;
	static int e;
	static long f;
	static float g;
	static double h;
	
	public static void main (String args[]){
	
		
		System.out.println("Boolean : " + a);
		System.out.println("char : " + b);
		System.out.println("byte : " + c);
		System.out.println("short : " + d);
		System.out.println("int : " + e);
		System.out.println("long : " + f);
		System.out.println("float : " + g);
		System.out.println("double : " + h);
	
	
	
	
	Q2 Write a Java program that takes two integers as input and performs all arithmetic operations on them.

		
	
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		int First = sc.nextInt();
		
		System.out.println("Enter the operator :");
		char operator = sc.next().charAt(0);
		
		System.out.println("Enter the second number :");
		int Second = sc.nextInt();
		
		
		float result = 0.0f;
		
		switch (operator){
			
			case '+':
			result = First + Second;
				break;
			
			case '-':
			result = First - Second;
				break;

			case '*':
			result = First * Second;
				break;

			case '/':
				if (Second == 0){
					System.out.println("Arithmetic Error Can't Devide by Zero");
				}
				else{
			result = First / Second;
				}
				break;
				
		default:
			System.out.println("You have select illegal operator.");
		}

		System.out.println("Result "+result);

	
	
	Q3 3. Implement a Java program to demonstrate implicit and explicit type casting.

	
	
	int intt1 = 10;
	double dubb1 = intt1;
	
	System.out.println(dubb1);
	
	double dubb2 = 55.21575265;
	int intt2 = (int) dubb2;

	System.out.println(intt2);
	

	
	
	
	
	Q4 Create a java program that converts a given integer to a double and vice versa using
wrapper classes.
	

	
		int intt = 15;
		
		Double num1 = new Double(intt);
		System.out.println(num1);
	
		
	
		double dubb = 10.0014d;
	
		Integer num2 = new Integer(dubb);
		System.out.println(num2);

	
	Q5 Write a Java program to swap two numbers using a temporary variable and without using a temporary variable.


		int num1 = 10, num2 = 20;
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println(num1 + " " + num2);
		
		
		int num1 = 10, num2 = 20;
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println(num1 + " " + num2);



	Q6 Develop a program that takes user input for a character and prints whether it is a vowel or consonant.



        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        
		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' ||x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
            System.out.println(x + " is a vowel.");
				}
        else{
            System.out.println(x + " is a consonant.");
        }


	Q7 Create a Java program to check whether a given number is even or odd using command-line arguments.




		int num1 = Integer.parseInt(args[0]);
		
		String result = num1 % 2 == 0 ? "Even" : "ODD";
	
		
		System.out.println(result);



*/









	
	}

}