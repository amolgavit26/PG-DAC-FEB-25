using System;

namespace Assignment3
{
    internal class Program
    {
        static void Main()
        {
            Manager m = new Manager("Amol", 100, 1, "HR");
            Console.WriteLine($"Manager: {m.Name}, EmpNo: {m.EmpNo}, Basic: {m.Basic}, NetSalary: {m.CalcNetSalary()}");

            GeneralManager gm = new GeneralManager("Shreya", 200, 2, "Sales", "Car, House");
            Console.WriteLine($"GeneralManager: {gm.Name}, EmpNo: {gm.EmpNo}, Basic: {gm.Basic}, Perks: {gm.Perks}, NetSalary: {gm.CalcNetSalary()}");

            CEO ceo = new CEO("Raj", 500, 3);
            Console.WriteLine($"CEO: {ceo.Name}, EmpNo: {ceo.EmpNo}, Basic: {ceo.Basic}, NetSalary: {ceo.CalcNetSalary()}");
        }
    }

    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
    }

    public abstract class Employee : IDbFunctions
    {
        private string name;
        private readonly int empNo;
        private short deptNo;
        private static int empCounter = 0;

        public string Name
        {
            get { return name; }
            set
            {
                if (!string.IsNullOrWhiteSpace(value))
                    name = value;
                else
                    Console.WriteLine("Invalid Name");
            }
        }

        public int EmpNo
        {
            get { return empNo; }
        }

        public short DeptNo
        {
            get { return deptNo; }
            set
            {
                if (value > 0)
                    deptNo = value;
                else
                    Console.WriteLine("Invalid DeptNo");
            }
        }

        public abstract decimal Basic { get; set; }

        public abstract decimal CalcNetSalary();

        public Employee(string name = "Default", short deptNo = 1)
        {
            empCounter++;
            this.empNo = empCounter;
            this.Name = name;
            this.DeptNo = deptNo;
        }

        public void Insert() => Console.WriteLine("Insert() called");
        public void Update() => Console.WriteLine("Update() called");
        public void Delete() => Console.WriteLine("Delete() called");
    }

    public class Manager : Employee
    {
        private string designation;
        private decimal basic;

        public string Designation
        {
            get { return designation; }
            set
            {
                if (!string.IsNullOrWhiteSpace(value))
                    designation = value;
                else
                    Console.WriteLine("Invalid Designation");
            }
        }

        public override decimal Basic
        {
            get { return basic; }
            set
            {
                if (value >= 20000 && value <= 80000)
                    basic = value;
                else
                    Console.WriteLine("Invalid Basic for Manager");
            }
        }

        public override decimal CalcNetSalary()
        {
            return Basic + 5000; 
        }

        public Manager(string name, decimal basic, short deptNo, string designation) : base(name, deptNo)
        {
            this.Basic = basic;
            this.Designation = designation;
        }
    }

    public class GeneralManager : Manager
    {
        private string perks;

        public string Perks
        {
            get { return perks; }
            set { perks = value; } 
        }

        public override decimal Basic
        {
            get { return base.Basic; }
            set
            {
                if (value >= 50000 && value <= 150000)
                    base.Basic = value;
                else
                    Console.WriteLine("Invalid Basic for GeneralManager");
            }
        }

        public override decimal CalcNetSalary()
        {
            return Basic + 10000;
        }

        public GeneralManager(string name, decimal basic, short deptNo, string designation, string perks)
            : base(name, basic, deptNo, designation)
        {
            this.Perks = perks;
        }
    }

    public class CEO : Employee
    {
        private decimal basic;

        public override decimal Basic
        {
            get { return basic; }
            set
            {
                if (value >= 100000 && value <= 500000)
                    basic = value;
                else
                    Console.WriteLine("Invalid Basic for CEO");
            }
        }

        public sealed override decimal CalcNetSalary()
        {
            return Basic + 20000;
        }

        public CEO(string name, decimal basic, short deptNo) : base(name, deptNo)
        {
            this.Basic = basic;
        }
    }
}
