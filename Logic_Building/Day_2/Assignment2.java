//Section II of Second Assignment of Day_2


import java.util.Scanner;

class Assignment2{

	public static void main(String args[]){



/*

	//Q1

	Scanner x = new Scanner(System.in);
	System.out.println("Enter your Grades");
	int Grades = x.nextInt();

	if (Grades >= 90){
	System.out.println("A");
			}
	else if (Grades >= 80 && Grades <= 89){
	System.out.println("B");
				}

	else if (Grades >= 70 && Grades <= 79){
	System.out.println("C");
				}

	else if (Grades >= 60 && Grades <= 69){
	System.out.println("D");
				}

	else {
	System.out.println("F");
		}





	//Q2



	Scanner x = new Scanner(System.in);
	System.out.println("Enter the number of the day between 1 to 7");
	int Day = x.nextInt();


	switch (Day){

	case 1:
	System.out.println("Monday it's a weekday.");
                break;	


	case 2:
	System.out.println("Tuesday it's a weekday.");
                break;	

	case 3:
	System.out.println("Wednesday it's a weekday.");
                break;	

	case 4:
	System.out.println("Thursday it's a weekday.");
                break;	

	case 5:
	System.out.println("Friday it's a weekday.");
                break;	

	case 6:
	System.out.println("Saturday it's a weekend.");
                break;	

	case 7:
	System.out.println("Sunday it's a weekend.");
                break;	
}







	//Q3



	Scanner x = new Scanner(System.in);
	System.out.println("Enter the first number");
	int First = x.nextInt();
	
	System.out.println("Enter the operator");
	char operator = x.next().charAt(0);

	System.out.println("Enter the second number");
	int Second = x.nextInt();




	int Result = 0;

        switch (operator) {

	case '+':
	Result = First + Second;
		break;

	case '-':
	Result = First - Second;
		break;

	case '*':
	Result = First * Second;
		break;

	case '/':
		if (Second == 0){
			System.out.println("Arithmetic Error Can't Devide by Zero");
				}
		else{
		Result = First / Second;
		}
	
		
	
	default:
	System.out.println("You have select illegal operator.");




}


	System.out.println("Result "+Result);









	//Q4

	Scanner x = new Scanner(System.in);
	System.out.println("Enter Total Purchase Amount");
	int Amount = x.nextInt();

	System.out.println("Enter 1 if you have Membership Card");
	int Member = x.nextInt();

		
	if (Member == 1){


	if (Amount >= 1000){
	System.out.println("Congratulation on your Purchase!! You will get additional 20% Discount. So the final amount you'll have to pay is "+(Amount - (Amount*0.25)));
			}


	else if (Amount >= 500 && Amount <= 999){
	System.out.println("Congratulation on your Purchase!! You will get additional 10% Discount. So the final amount you'll have to pay is "+(Amount - (Amount*0.15)));
			}


	else {
	System.out.println("Congratulation on your Purchase!! You will get additional 5% Discount. So the final amount you'll have to pay is "+(Amount - (Amount*0.1)));
			}



						}	


else {
	if (Amount >= 1000){
	System.out.println("Congratulation on your Purchase!! You will get additional 20% Discount. So the final amount you'll have to pay is "+(Amount - (Amount*0.2)));
			}


	else if (Amount >= 500 && Amount <= 999){
	System.out.println("Congratulation on your Purchase!! You will get additional 10% Discount. So the final amount you'll have to pay is "+(Amount - (Amount*0.1)));
			}


	else {
	System.out.println("Congratulation on your Purchase!! You will get additional 5% Discount. So the final amount you'll have to pay is "+(Amount - (Amount*0.05)));
			}

		}




	//Q5

	Scanner x = new Scanner(System.in);
	System.out.println("Enter the marks obtained in first subject");
	int First = x.nextInt();
	
	System.out.println("Enter the marks obtained in second subject");
	int Second = x.nextInt();

	System.out.println("Enter the marks obtained in third subject");
	int Third = x.nextInt();



	if (First >= 40 && Second >= 40 && Third >= 40){
	System.out.println("Congrats on Clearing All the Subjects");
		}

	else if (First < 40 && Second >= 40 && Third >= 40){
	System.out.println("Unfortunatly You Failed in First Subjects");
		}

	else if (First >= 40 && Second < 40 && Third >= 40){
	System.out.println("Unfortunatly You Failed in Second Subjects");
		}

	else if (First >= 40 && Second >= 40 && Third < 40){
	System.out.println("Unfortunatly You Failed in Third Subjects");
		}

	else{
	System.out.println("Unfortunatly You Failed in All Subjects");
		}





*/









}




}