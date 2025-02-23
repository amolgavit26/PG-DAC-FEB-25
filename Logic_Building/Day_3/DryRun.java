//Section II of Third Assignment of Day_3

/*

		//Q1

public class DryRun {				//NestedLoopOutput------>DryRun
 public static void main(String[] args) {
 for (int i = 1; i <= 3; i++) {
 for (int j = 1; j <= 2; j++) {
 System.out.print(i + " " + j + " ");
 }
 System.out.println();
 }
 }
}


	i	j	SOP
	1	1
		2	1 1 1 2
	2	1
		2	2 1 2 2
	3	1	
		2	3132



	
		//Q2

public class DryRun {				//DecrementingLoop------>DryRun
 public static void main(String[] args) {
 int total = 0;
 for (int i = 5; i > 0; i--) {
 total += i;
 if (i == 3) continue;
 total -= 1;
 }
 System.out.println(total);
 }
}




	i	Total	SOP
	5	5	5
	4	4	9
	3	3	11






		//Q3

public class DryRun {				//WhileLoopBreak------>DryRun
 public static void main(String[] args) {
 int count = 0;
 while (count < 5) {
 System.out.print(count + " ");
 count++;
 if (count == 3) break;
 }
 System.out.println(count);
 }
}



	count	SOP		SOP
	0	
	1	
	2	
	3	0 1 2 3
				3




		//Q4

public class DryRun {				//DoWhileLoop------>DryRun
 public static void main(String[] args) {
 int i = 1;
 do {
 System.out.print(i + " ");
 i++;
 } while (i < 5);
 System.out.println(i);
 }
} 



	i	SOP		SOP
	1	
	2	
	3
	4	1 2 3 4 5
				5







		//Q5

public class DryRun {				//ConditionalLoopOutput------>DryRun

 public static void main(String[] args) {
 int num = 1;
 for (int i = 1; i <= 4; i++) {
 if (i % 2 == 0) {
 num += i;
 } else {
 num -= i;
 }
 }
 System.out.println(num);
 }
}




	num	i	SOP		
	1	1
	0	2
	2	3
	1	4	5



		//Q6



public class DryRun {				//IncrementDecrement------>DryRun
 public static void main(String[] args) {
 int x = 5;
 int y = ++x - x-- + --x + x++;
 System.out.println(y);
 }
} 

	
//	5--->6---->5--->4--->5
//	6	-6  +  4  +  4	====== 8






		//Q7


public class DryRun {				//NestedIncrement------>DryRun
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = ++a * b-- - --a + b++;
 System.out.println(result);
 }
}


//	a-->10-->11 --------->10
//	b-->5--------->5---------->4-->5
//	         ++a * b-- - --a + b++
//		   11* 5  -  10 + 4		49






		//Q8

public class DryRun {				//LoopIncrement------>DryRun

 public static void main(String[] args) {
 int count = 0;
 for (int i = 0; i < 4; i++) {
 count += i++ - ++i;
 }
 System.out.println(count);
 }
}

	count	i		
	0	0	----->0+0-2===-2
	-2	3	------>-2+3-5===-4



*/


public class DryRun {				//NestedLoopOutput------>DryRun
 public static void main(String[] args) {
 for (int i = 1; i <= 3; i++) {
 for (int j = 1; j <= 2; j++) {
 System.out.print(i + " " + j + " ");
 }
 System.out.println();
 }
 }
}

