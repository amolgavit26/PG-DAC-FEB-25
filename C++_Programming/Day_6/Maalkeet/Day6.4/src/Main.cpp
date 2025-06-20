#include <iostream>
#include <string.h>
using namespace std;
class ArithmaticException
{
private:
	string Message;
	int LineNumber;
	string FunctionName;
	string FileName;

public:
	ArithmaticException(string Message, int LineNumber, string FunctionName, string FileName): Message(Message), LineNumber(LineNumber), FunctionName(FunctionName), FileName(FileName)
	{

	}

	void PrintStackTrace()
	{
		cout<<this->Message<<" in "<<this->FileName<<" in "<<this->FunctionName<<" at line no: "<<this->LineNumber<<endl;
	}
	string GetMessage()
	{
		return this->Message;
	}
};
int main()
{
	int Num1=10;
	int Num2=0;
	int Res;
	try		//Exception Generator Block
	{
		if(Num2==0)
		{
			//throw 100;
			throw ArithmaticException("Divide by Zero- exception", __LINE__, __FUNCTION__, __FILE__);
		}
		Res=Num1/Num2;		//This kind of bad logic give rise to the runtime errors, this is know Exception Generator Code
		cout<<"Res: "<<Res<<endl;
	}
	catch(ArithmaticException &ex)	//Exception Handler Block
	{
		cout<<"Exception Occurred: "<<ex.GetMessage()<<endl;
		ex.PrintStackTrace();
	}


	cout<<"Rest of the Program"<<endl;
	return 0;
}

