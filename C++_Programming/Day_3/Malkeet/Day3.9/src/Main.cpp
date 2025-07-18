#include <iostream>
using namespace std;


struct Employee			//Declaration of the structure Employee
{
	int EmpId;			//Data Member of the structure Employee
	char Name[50];		//Data Member of the structure Employee
	float Salary;		//Data Member of the structure Employee
	int Age;			//Data Member of the structure Employee

	void ScanData()
	{
			printf("Enter Name: ");
			fflush(stdout);
			scanf("%s", Name);
			printf("\nEnter EmpId: ");
			fflush(stdout);
			scanf("%d", &EmpId);
			printf("\nEnter Age: ");
			fflush(stdout);
			scanf("%d", &Age);
			printf("\nEnter Salary: ");
			fflush(stdout);
			scanf("%f", &Salary);
	}

	void PrintData()		//Member Function of struct Employee
	{
		printf("\n The Values of Employee:");
		printf("\n Name: %s",Name);
		printf("\n Age: %d", Age);
		printf("\n Salary: %f", Salary);
		printf("\n EmpId: %d",EmpId);
	}
};


int main()
{
	struct Employee emp1; 	//emp1 is a variable of type Employee
	
	typedef struct Employee Malkeet;
	
	Malkeet m1;		//

	emp1.ScanData();		//Calling structure method with the help of structure object using member selection operator (.)

	emp1.PrintData();		//Message Passing

	return 0;
}


