//Section I of Third Assignment of Day_3




/*

//Snippet 1:

public class LoopError {			//LoopError------->InfiniteForLoop
 public static void main(String[] args) {
 for (int i = 0; i < 10; i--) {
 System.out.println(i);
 }
 }
} 


 Infinte loop

Correct:-

public class LoopError {			//LoopError------->InfiniteForLoop
 public static void main(String[] args) {
 for (int i = 0; i < 10; i++) {
 System.out.println(i);
 }
 }
}






//Snippet 2:

public class LoopError {			//LoopError------->IncorrectWhileCondition
 public static void main(String[] args) {
 int count = 5;
 while (count = 0) {
 System.out.println(count);
 count--;
 }
 }
} 




LoopError.java:29: error: incompatible types: int cannot be converted to boolean
 while (count = 0) {
              ^
1 error

We are expected to give boolean value in condition of while loop.

Correct:-

public class LoopError {			//LoopError------->IncorrectWhileCondition
 public static void main(String[] args) {
 int count = 5;
 while (count >= 0) {
 System.out.println(count);
 count--;
 }
 }
} 






//Snippet 3:

public class LoopError {		//LoopError------->DoWhileIncorrectCondition
 public static void main(String[] args) {
 int num = 0;
 do {
 System.out.println(num);
 num++;
 } while (num > 0);
 }
}

 Infinte loop

By changing the operator to "<" we get noly one value insted of infine loop.

Correct:-

 public class LoopError {		//LoopError------->DoWhileIncorrectCondition
 public static void main(String[] args) {
 int num = 0;
 do {
 System.out.println(num);
 num++;
 } while (num < 0);
 }
}






//Snippet 4:

public class LoopError {			//LoopError------->OffByOneErrorForLoop
 public static void main(String[] args) {
 for (int i = 1; i <= 10; i++) {
 System.out.println(i);
 }
 // Expected: 10 iterations with numbers 1 to 10
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
 }
}


Insted of assigning the value of i=1 we want to initiate the loop at 0, also correct the condition to i<10.


public class LoopError {			//LoopError------->OffByOneErrorForLoop
 public static void main(String[] args) {
 for (int i = 0; i < 10; i++) {
 System.out.println(i);
 }
 // Expected: 10 iterations with numbers 1 to 10
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
 }
}




//Snippet 5:
public class LoopError {		//LoopError------->WrongInitializationForLoop
 public static void main(String[] args) {
 for (int i = 10; i >= 0; i++) {
 System.out.println(i);
 }
 }
} 


 Infinte loop

Correct:- 

public class LoopError {		//LoopError------->WrongInitializationForLoop
 public static void main(String[] args) {
 for (int i = 10; i >= 0; i--) {
 System.out.println(i);
 }
 }
}


We must decrement the value of i with every iteration.








//Snippet 6:

public class LoopError {		//LoopError------->MisplacedForLoopBody
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++)
 System.out.println(i);
 System.out.println("Done");
 }
}


0
1
2
3
4
Done

to print Done after every iteration just close all the statements in {}.

Correct:-

public class LoopError {		//LoopError------->MisplacedForLoopBody
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++){
 System.out.println(i);
 System.out.println("Done");}
 }
}








//Snippet 7:


public class LoopError {			//LoopError------->UninitializedWhileLoop
 public static void main(String[] args) {
 int count;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }
} 




LoopError.java:147: error: variable count might not have been initialized
 while (count < 10) {
        ^
1 error


We need to assign the value to the variable first to initialized the loop

Correct:-

public class LoopError {			//LoopError------->UninitializedWhileLoop
 public static void main(String[] args) {
 int count = 0;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }
} 







//Snippet 8:

public class LoopError {			//LoopError------->OffByOneDoWhileLoop
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 num--;
 } while (num > 0);
 }
} 


1

We must need to give the condition accordingly run the do loop till the condition not meet.

Correct:-

public class LoopError {			//LoopError------->OffByOneDoWhileLoop
 public static void main(String[] args) {
 int num = 1;
 do {
 System.out.println(num);
 num++;
 } while (num != 6);
 }
} 










//Snippet 9:

public class LoopError {			//LoopError------->InfiniteForLoopUpdate
 public static void main(String[] args) {
 for (int i = 0; i < 5; i += 2) {
 System.out.println(i);
 }
 }
} 

0
2
4

In this the increment of is 2 with every iterataion, If we want to put the sequeance of number we need to increment the i by 1.

Correct:-

public class LoopError {			//LoopError------->InfiniteForLoopUpdate
 public static void main(String[] args) {
 for (int i = 0; i < 5; i += 1) {
 System.out.println(i);
 }
 }
} 











//Snippet 10:

public class LoopError {		//LoopError------->IncorrectWhileLoopControl
 public static void main(String[] args) {
 int num = 10;
 while (num = 10) {
 System.out.println(num);
 num--;
 }
 }
}



LoopError.java:232: error: incompatible types: int cannot be converted to boolean
 while (num = 10) {
            ^
1 error


We neet to change the condition to boolean type and also change the value till we want to print the values of num.

Correct:-

public class LoopError {		//LoopError------->IncorrectWhileLoopControl
 public static void main(String[] args) {
 int num = 10;
 while (num > 0) {
 System.out.println(num); 
 num--;

 }
 }
}







//Snippet 11:
public class LoopError {			//LoopError------->IncorrectLoopUpdate
 public static void main(String[] args) {
 int i = 0;
 while (i < 5) {
 System.out.println(i);
 i += 2; // Error: This may cause unexpected results in output
 }
 }
}

0
2
4


Change the i increment  to 1

Correct:-

public class LoopError {			//LoopError------->IncorrectLoopUpdate
 public static void main(String[] args) {
 int i = 0;
 while (i < 5) {
 System.out.println(i);
 i += 1; // Error: This may cause unexpected results in output
 }
 }
}







//Snippet 12:

public class LoopError {			//LoopError------->LoopVariableScope
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 }
 System.out.println(x); // Error: 'x' is not accessible here
 }
}





LoopError.java:290: error: cannot find symbol
 System.out.println(x); // Error: 'x' is not accessible here
                    ^
  symbol:   variable x
  location: class LoopError
1 error


We are defining the x inside of the loop but our SOP is outside the loop.
If we put it inside the loop we will get expected output.

Correct:-

public class LoopError {			//LoopError------->LoopVariableScope
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 System.out.println(x);
 }
 }
}
s


*/









