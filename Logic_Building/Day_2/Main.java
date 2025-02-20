//Section I of Second Assignment of Day_2

/*

//Snippet 1:
public class Main {
 public void main(String[] args) {
 System.out.println("Hello, World!");
 }
} 



Error: Main method is not static in class Main, please define the main method as:
   public static void main(String[] args)


We have got the error while running the code, "Must define ther methode as 'static'".

The correct code should be



public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 }
} 











//Snippet 2:
public class Main {
 static void main(String[] args) {
 System.out.println("Hello, World!");
 }
} 




Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application


"Must Define the Main Methode"

Correct One



public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 }
} 






//Snippet 3:
public class Main {
 public static int main(String[] args) {
 System.out.println("Hello, World!");
 return 0;
 }
}

Error: Main method must return a value of type void in class Main, please
define the main method as:
   public static void main(String[] args)







//Snippet 4:
public class Main {
 public static void main() {
 System.out.println("Hello, World!");
 }
} 

Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application


The Java runtime system looks specifically for a method with a single String[] type parameter, because it wants to pass the parameters to your main method. If such a method is not present, it informs you through an exception.

the correct code will be
public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 }
} 





//Snippet 5:
public class Main {
 public static void main(String[] args) {
 System.out.println("Main method with String[] args");
 }
 public static void main(int[] args) {
 System.out.println("Overloaded main method with int[] args");
 }
}

Main.java:125: error: class, interface, or enum expected
Main method with String[] args

"yes we can have multiple main methodes in java, but theys must be seperate and the output of the of the compiler will to two diffrent class files.









//Snippet 6:
public class Main {
 public static void main(String[] args) {
 int x = y + 10;
 System.out.println(x);
 }
} 

error: cannot find symbol
 int x = y + 10;
         ^
  symbol:   variable y
  location: class Main

"We must Decleare the variable"














//Snippet 7:
public class Main {
 public static void main(String[] args) {
 int x = "Hello";
 System.out.println(x);
 }
} 
 
error: incompatible types: String cannot be converted to int
 int x = "Hello";


"We are assigning the String literate to the Ineger identifier"
        








//Snippet 8:
public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!"
 }
} 

 error: ')' expected
 System.out.println("Hello, World!"
                                   ^

"We must close the Parentheses"







//Snippet 9:
public class Main {
 public static void main(String[] args) {
 int class = 10;
 System.out.println(class);
 }
} 

"We can not take the Keywords as Identifiers, due to these words have predefined meanings in the Java programming language"








//Snippet 10:
public class Main {
 public void display() {
 System.out.println("No parameters");
 }
 public void display(int num) {
 System.out.println("With parameter: " + num);
 }
 public static void main(String[] args) {
 display();
 display(5);
 }
} 

 error: non-static method display() cannot be referenced from a static context
 display();
 ^
Main.java:201: error: non-static method display(int) cannot be referenced from a static context
 display(5);
 ^
2 errors



"Yes, we can overload the main() method in Java"









//Snippet 11:
public class Main {
 public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 System.out.println(arr[5]);
 }
} 

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main.main(Main.java:222)



"Here we are trying to access the number on index 5, but our arrys length is 3".






//Snippet 12:
public class Main {
 public static void main(String[] args) {
 while (true) {
 System.out.println("Infinite Loop");
 }
 }
}


Infinite Loop
Infinite Loop


"Here insted of True we need to give the condition to terminate the loop".





//Snippet 13:
public class Main {
 public static void main(String[] args) {
 String str = null;
 System.out.println(str.length());
 }
} 



Exception in thread "main" java.lang.NullPointerException
        at Main.main(Main.java:262)



"It is giving us an exception because we want to print the length of the string which does not have any values (Null)".








//Snippet 14:
public class Main {
 public static void main(String[] args) {
 double num = "Hello";
 System.out.println(num);
 }
} 




error: incompatible types: String cannot be converted to double
 double num = "Hello";
              ^

Insted of define it as double we must define it as String.
"To ensures optimal memory usage and program performance while leveraging Java's strong typing system to catch errors early in the development process".




//Snippet 15:
public class Main {
 public static void main(String[] args) {
 int num1 = 10;
 double num2 = 5.5;
 int result = num1 + num2;
 System.out.println(result);
 }
} 


error: incompatible types: possible lossy conversion from double to int
 int result = num1 + num2;
                   ^
"Just put the datatype of result as double"





//Snippet 16:
public class Main {
 public static void main(String[] args) {
 int num = 10;
 double result = num / 4;
 System.out.println(result);
 }
}





output = 2.0
"We are Performing the operation on Two Integer values and store it in the datatype of double  so it trims the values after the decimal point and returns only the integer/whole number part".









//Snippet 17:
public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = a ** b;
 System.out.println(result);
 }
} 





error: illegal start of expression
 int result = a ** b;
                 ^
"the ** operator not valid in Java".





//Snippet 18:
public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = a + b * 2;
 System.out.println(result);
 }
} 




20

"Think BODMAS rule apply in Java." 






//Snippet 19:
public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 0;
 int result = a / b;
 System.out.println(result);
 }
}


Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main.main(Main.java:374)

"Divison by zero by any number the the answer can not be define".





//Snippet 20:
public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World")
 }
} 



error: ';' expected
 System.out.println("Hello, World")
                                   ^

"After every line of code ; is important"






//Snippet 21:
public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 // Missing closing brace here
}




error: reached end of file while parsing
}
 ^
"Error occurse because the braces are not closed"






//Snippet 22:
public class Main {
 public static void main(String[] args) {
 static void displayMessage() {
 System.out.println("Message");
 }
 }
} 


error: illegal start of expression
 static void displayMessage() {
 ^
Main.java:437: error: class, interface, or enum expected
}
^
"Yes we can declared method inside another method in java"






//Snippet 23:
public class Main {				//Confusion ----> Main
 public static void main(String[] args) {
 int value = 2;
 switch(value) {
 case 1:
 System.out.println("Value is 1");
 case 2:
 System.out.println("Value is 2");
 case 3:
 System.out.println("Value is 3");	break;
 default:
 System.out.println("Default case");
 }
 }
} 



Value is 2
Value is 3
Default case

"We Need to add Break in case 3 to not print after it."





//Snippet 24:
public class Main {				//MissingBreakCase --------> Main
 public static void main(String[] args) {
 int level = 1;
 switch(level) {
 case 1:
 System.out.println("Level 1");
 case 2:
 System.out.println("Level 2");
 case 3:
 System.out.println("Level 3");
 default:
 System.out.println("Unknown level");
 }
 }
} 



Level 1
Level 2
Level 3
Unknown level


"We Must add the break after every case(Optional) to not print the values after the initiating the case"





//Snippet 25:
public class Main {				//Switch --------> Main
 public static void main(String[] args) {
 double score = 85.0;
 switch(score) {
 case 100:
 System.out.println("Perfect score!");
 break;
 case 85:
 System.out.println("Great job!");
 break;
 default:
 System.out.println("Keep trying!");
 }
 }
} 







Main.java:511: error: incompatible types: possible lossy conversion from double to int
 switch(score) {
       ^

"we cant pass long, float, boolean and double in switch
Insted of declaring score datatype as double we can put it as int and correct the value"





//Snippet 26:
public class Main {				//Switch --------> Main
 public static void main(String[] args) {
 int number = 5;
 switch(number) {
 case 5:
 System.out.println("Number is 5");
 break;
 case 5:
 System.out.println("This is another case 5");
 break;
 default:
 System.out.println("This is the default case");
 }
 }
} 





Main.java:546: error: duplicate case label
 case 5:
 ^

"because of the duplicate label in the switch case secound case will never be execute"



*/












