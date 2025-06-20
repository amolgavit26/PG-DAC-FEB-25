namespace Assignment2
{
    internal class Program
    {
        static void Main()
        {
            Employee o1 = new Employee("Amol", 123465, 10);
            Employee o2 = new Employee("Amol", 123465);
            Employee o3 = new Employee("Amol");
            Employee o4 = new Employee();

            Console.WriteLine(o1.GetNetSalary());
            Console.WriteLine(o2.GetNetSalary());
            Console.WriteLine(o3.GetNetSalary());
            Console.WriteLine(o4.GetNetSalary());


            Console.WriteLine(o1.EmpNo);
            Console.WriteLine(o2.EmpNo);
            Console.WriteLine(o3.EmpNo);
            Console.WriteLine(o4.EmpNo);


            Console.WriteLine(o4.EmpNo);
            Console.WriteLine(o3.EmpNo);
            Console.WriteLine(o2.EmpNo);
            Console.WriteLine(o1.EmpNo);
        }
    }

    public class Employee
    {
        string name;
        int empNo;
        decimal basic;
        short deptNo;
        static int empCounter = 0;


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

        public Employee(string Name = "Default", decimal Basic = 15000, short DeptNo = 1)
        {
            empCounter++;
            empNo = empCounter;
            this.Name = Name;
            this.Basic = Basic;
            this.DeptNo = DeptNo;
        }
    }
}
