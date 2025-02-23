//Section III of Third Assignment of Day_3


import java.util.Scanner;


class LamborghiniExercise{

	public static void main (String[] args){

/*

// Q1 Write a program to calculate the sum of the first 50 natural numbers. 

	int number = 50;
	int sum = 0;

	for (int i = 1; i <= number; i++){
		sum += i;
			}
		
		System.out.println("Sum of first "+ number + " Natural Number = "+ sum);
				





//Q2 Write a program to compute the factorial of the number 10. 


	int number = 10;
	int factorial = 1;
	int i = 1;

	while (i <= number){
		factorial *= i;
		i++;

			}
	System.out.println("Sum of 10 factorial = "+ factorial);




//Q3 Write a program to print all multiples of 7 between 1 and 100. 

	int i = 7;

	for(int number = i; number <= 100; number += i){
			System.out.println(number + " ");
				}





//Q4 Write a program to reverse the digits of the number 1234. The output should be 4321. 



	int number = 1234;
	int reverse = 0;

	while(number != 0) {
		int last = number % 10;
		reverse = reverse * 10 + last;
		number /= 10;
		}
	
	System.out.println("Reverse Number is " + reverse);




//Q5 Write a program to print the Fibonacci sequence up to the number 21. 

	
	int Number = 21;

	int num1 = 0;
	int num2 = 1;
	
	for ( int i = 0; i < Number; i++ ){

	System.out.println(num1 + " ");

	int num3 = num2 + num1;
	num1 = num2;
	num2 = num3;
	}



//Q6 Write a program to find and print the first 5 prime numbers. 




	Scanner x = new Scanner(System.in);
	System.out.println("Enter the Number");
	int number = x.nextInt();

	int count = 0, j;

	for (int i = 1; count < number; i++) {				
		for (j = 2; i % j != 0; j++);

		if (j == i) { 
		System.out.println(" " + i);	
		}
		}





//Q7 Write a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6). 



 	int num = 9876;
          int sum = 0;
   
          for(int i=1; i<=num; i++)
           {
  	       int result = num%10;
		sum = sum  + result;
		num = num / 10;
        
	   } 
         System.out.println("Addition Of 9876 is :" + sum);






//Q8 Write a program to count down from 10 to 0, printing each number. 



      int num = 10;

      for(int i = num; i >= 0; i--)
      {
         System.out.println(i + " ");
      }   






//Q9 Write a program to find and print the largest digit in the number 4825. 



     int num = 4825;
     int largeDigit = 0;
     
      while(num > 0)
      {
        int digit = num % 10;
       
        if(digit > largeDigit)
          {
 		largeDigit = digit;
	   }

            num = num / 10;

      }
        System.out.println("The Largest digit is:"+ largeDigit);





//10 Write a program to print all even numbers between 1 and 50. 



       int num = 50;
        int i = 1;
        
         for( ; i <= num; i++)
            {
	      if(i % 2 == 0)
               {
 		 System.out.print(i + " ");
		}
	      }






//11. Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression 


       int num1 = 16;
       int num2 = 4;

       int result = ++num1 + num2--;

       System.out.println("Result: " + result);
       System.out.println("Updated Value of num1: " + num1);
       System.out.println("Updated Value of num2: " + num2);




//Q12 Write a program to draw the following pattern:
*****
*****
*****
*****
***** 

	for(int i = 1; i <= 5; i++){
		for(int j = 1; j <= 5; j++){ 
                	System.out.print("*");
              	}
               	System.out.println();
	   }






//Q13 Write a program to print the following pattern:
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2 
1





          int number = 5;
          for(int i=1; i<=number;i++)
           {
 		for(int j=1;j<=i;j++)
                 {
 		    System.out.print(i);
  		      if(j<i){
                 	  System.out.print("*");
                     }
		}
                 System.out.println();
           }
  
           for(int i = number; i>=1; i--){
		 for(int j = 1; j<=i;j++){
 		    System.out.print(i);

                    if(j < i){
			System.out.print("*");
		      }
		  }
			System.out.println();
		} 









//Q14 Write a program to print the following pattern:
 *
 **
 ***
 *****
 *******
 *********




      int number = 10;
   
       for(int i=1; i<=number; i+=2)
        {
          for(int j=1; j<=i;j+=1)
          {
  	    System.out.print("*");    
      }
	System.out.println();
    }




//Q15 Write a program to print the following pattern:
   *
  **
  ***
 ****
***** 




	int number = 5;
       
        for(int i = 1; i<=number; i++)
        {
  	  for(int j = 1; j<=number-i; j++)
           {
               System.out.print(" ");
            }
          for(int k = 1; k<=2*i-1; k++)
         {
               System.out.print("*");

	}
               System.out.println();

        }





//Q16 Write a program to print the following pattern:
 *
 ***
 *****
 *******
********* 




      int number = 5;
   
      for(int i=1; i<=number; i++)
       {
	 for(int j=1; j<=number; j++)
         {
   	   System.out.print(" ");
	}

         for(int k=1; k<= 2*i-1; k++)
           {
              System.out.print("*");   
	    }
          System.out.println();
	}



//Q17 Write a program to print the following pattern:
*****
 ****
 ***
 **
 * 




       int number = 5;
    
       for(int i = number; i>=1; i--)
        {
	  for(int j = 1; j<=i; j++)
             {
		System.out.print("*");
	  }
        System.out.println();
     }




//Q18 Write a program to print the following pattern:
    *
   ***
  *****
 *******
  *****
   ***
    * 






        int number = 5;

        // Upper half of the diamond
        for (int i = 0; i  <  number; i++) {
            // Print spaces
            for (int j = number - 1; j  >  i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; k  <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = 1; i  <  n; i++) {
            // Print spaces
            for (int j = 0; j  <  i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = number - 1; k  >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }






//Q19 Write a program to print the following pattern:
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5





       int number = 5;
      
       for(int i=1; i<=number; i++)
      {
          int product = 1;
 	  for(int j=1; j<=i;j++)
           {
           product = product * j;   
	   if(j>1)
              {
              System.out.print("*");
	   }
            System.out.print(j);
         }
          System.out.println();
	}





//Q21 Write a program to print the following pattern:
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9 






      int number = 5;
      int odd = 1;

      for(int i=1; i<=number; i++)
       {
         int codd  =1;
         for(int j=1; j<=i; j++)
         {
           System.out.print(codd);
           if(j < i)
           {
	      System.out.print("*");
          }
            codd = codd + 2;
	}
          System.out.println();
     }





//Q22 Write a program to print the following pattern:
*********
 *******
 *****
 ***
 *
 ***
 *****
 *******
*********




	int number = 5;
   
        for(int i=number; i>=1;i--)
         {
           for(int j=i; j>=1;j--)
            {
  		System.out.print("*");
	   }
           System.out.println();
      	 }

         for(int i=1; i<=n;i++)
           {
  	       for(int j=1;j<=i;j++)
                 {
		    System.out.print("*");
		   }
            System.out.println();
	    }




//Q23 Write a program to print the following pattern:
11111
22222
33333
44444
55555




      int number = 5;
    
       for(int i=1; i<=number; i++)
        {
           for(int j=1; j<=n; j++)
          {
            System.out.print(i);
       }
         System.out.println();
     }




//Q24 Write a program to print the following pattern:
1
22
333
4444
55555





      int number = 5;
    
       for(int i=1; i<=number; i++)
        {
           for(int j=1; j<=i; j++)
          {
            System.out.print(i);
       }
         System.out.println();
     }


//Q25 Write a program to print the following pattern:
1
12
123
1234
12345 




     int number = 5;
    
     for(int i=1; i<=number; i++)
      {
          for(int j=1; j<=i;j++)
        {
         System.out.print(j);
       }
          System.out.println(); 
  }



//Q26 Write a program to print the following pattern:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15





       int number=5;
       int line = 1;

   for(int i=1; i<=number; i++)
     {
        for(int j=1; j<=i; j++)
        {
           System.out.print(line + " ");
           line++;
       }
       System.out.println();
    }


*/

















}

}