namespace Assignment4
{
    internal class Program
    {
        static void Main1()
        {
            Console.Write("Enter number of batches: ");
            int batch = Convert.ToInt32 (Console.ReadLine());

            int[][] marks = new int[batch][];

            for (int i = 0; i < batch; i++)
            {
                Console.Write($"Enter number of students in batch {i + 1} : ");
                int student = Convert.ToInt32 (Console.ReadLine());
                marks[i] = new int[student];

                for (int j = 0; j < student; j++)
                {
                    Console.Write($"Enter marks for student {j + 1} in batch {i + 1}: ");
                    marks[i][j] = Convert.ToInt32 (Console.ReadLine());
                }
            }

            Console.WriteLine("\n--- Displaying Marks ---");
            for (int i = 0; i < batch; i++)
            {
                Console.WriteLine($"Batch {i + 1} Marks:");
                for (int j = 0; j < marks[i].Length; j++)
                {
                    Console.WriteLine($"Student {j + 1}: {marks[i][j]}");
                }
            }

        }

        static void Main()
        {
            Console.Write("Enter number of Employees: ");
            int count = Convert.ToInt32(Console.ReadLine());

            Employee[] employees = new Employee[count];

            // Accept details
            for (int i = 0; i < count; i++)
            {
                employees[i] = new Employee();

                Console.Write($"Enter EmpNo for Employee {i + 1}: ");
                employees[i].EmpNo = Convert.ToInt32(Console.ReadLine());

                Console.Write($"Enter Name for Employee {i + 1}: ");
                employees[i].Name = Console.ReadLine();

                Console.Write($"Enter Salary for Employee {i + 1}: ");
                employees[i].Salary = Convert.ToDecimal(Console.ReadLine());
            }

            // Display Employee with highest salary
            Employee highestPaid = employees[0];
            for (int i = 1; i < count; i++)
            {
                if (employees[i].Salary > highestPaid.Salary)
                    highestPaid = employees[i];
            }

            Console.WriteLine("\n--- Employee with Highest Salary ---");
            highestPaid.Display();

            // Search Employee by EmpNo
            Console.Write("\nEnter EmpNo to search: ");
            int searchEmpNo = Convert.ToInt32(Console.ReadLine());
            bool found = false;

            foreach (var emp in employees)
            {
                if (emp.EmpNo == searchEmpNo)
                {
                    Console.WriteLine("Employee Found:");
                    emp.Display();
                    found = true;
                    break;
                }
            }

            if (!found)
                Console.WriteLine("Employee not found.");
        }
    }

    }


    class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Salary { get; set; }

        public void Display()
        {
            Console.WriteLine($"EmpNo: {EmpNo}, Name: {Name}, Salary: {Salary}");
        }
    }

