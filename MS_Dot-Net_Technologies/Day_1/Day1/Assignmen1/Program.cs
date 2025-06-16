namespace Assignmen1
{
    internal class Program
    {
        static void Main()
        {
            Employee o1 = new Employee(1, "Amol", 123465, 10);
            Employee o2 = new Employee(1, "Amol", 123465);
            Employee o3 = new Employee(1, "Amol");
            Employee o4 = new Employee(1);
            Employee o5 = new Employee();

            Console.WriteLine(o1.GetNetSalary());
            Console.WriteLine(o2.GetNetSalary());
            Console.WriteLine(o3.GetNetSalary());
            Console.WriteLine(o4.GetNetSalary());
            Console.WriteLine(o5.GetNetSalary());
        }
    }

    public class Employee
    {
        string name;        //no blank names should be allowed
        int empNo;          // must be greater than 0
        decimal basic;      //must be between some range
        short deptNo;       // must be > 0


        public string Name
        {
            get
            {
                return name;
            }
            set
            {
                if (!string.IsNullOrEmpty(value))
                {
                    name = value;
                }
                else
                {
                    Console.WriteLine("Invalid Input");
                }
            }


        }

        public int EmpNo
        {
            get
            {
                return empNo;
            }
            set
            {
                if (value > 0)
                {
                    empNo = value;
                }
                else
                {
                    Console.WriteLine("Invalid Input");
                }
            }
        }

        public decimal Basic
        {
            get
            {
                return basic;
            }
            set
            {
                if (value > 10000 && value < 200000)
                {
                    basic = value;
                }
                else
                {
                    Console.WriteLine("Invalid Input");
                }
            }
        }

        public short DeptNo
        {
            get
            {
                return deptNo;
            }
            set
            {
                if (value > 0)
                {
                    deptNo = value;
                }
                else
                {
                    Console.WriteLine("Invalid Input");
                }
            }
        }

    public decimal GetNetSalary()
        {
            return Basic * 2;
        }

        public Employee(int EmpNo=1, string Name="Default", decimal Basic=15000, short DeptNo=1)
        {
            this.EmpNo = EmpNo;
            this.Name = Name;
            this.Basic = Basic;
            this.DeptNo = DeptNo;
        }
    }
}
