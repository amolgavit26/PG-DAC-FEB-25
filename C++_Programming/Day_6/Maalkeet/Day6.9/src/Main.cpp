#include <iostream>
#include <string.h>
using namespace std;
class A
{

public:

	int Num2;
	int Num1;

	A()
	{
		this->Num1=10;
	}

	int getNum1() const {
		return Num1;
	}

	void setNum1(int num1) {
		Num1 = num1;
	}
};
class B:public A
{
public:
	int Num1;

	B()		//User-Defined default Constructor
	{
		this->Num1=20;
	}

	void GetData()
	{
		this->setNum1(100);
		this->Num2=200;
	}
};
int main()
{
	B b1;

	cout<<"The Value Num1 in b1 is: "<<b1.Num1<<endl;
	cout<<"The Value Num1 in b1 is: "<<b1.A::Num1<<endl;
	return 0;
}
