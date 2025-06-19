using System;

namespace ToDo
{
    internal class Program
    {
        static void Main()
        {
            Action o1 = delegate ()
            {
                Console.WriteLine("Anon method with no params");
            };
            o1();

            Action<string> o2 = delegate (string str)
            {
                Console.WriteLine(str);
            };
            o2("Anon method with one in params 'string'");

            Action<string, int> o3 = delegate (string str, int num)
            {
                Console.WriteLine(str + num);
            };
            o3("Anon method with two in params 1 : 'string', 2 : 'int'", 10);

            Func<string> o4 = delegate ()
            {
                return "Anon method with one out params 'string'";
            };
            Console.WriteLine(o4());

            Func<int, bool> o5 = delegate (int a)
            {
                if (a == 1)
                {
                    return true;
                }
                else
                {
                   return false;
                }
            };
            Console.WriteLine(o5(5));

            Func<int, int, bool> o6 = delegate (int a, int b)
            {
                if (a + b > 10)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            };
            Console.WriteLine(o6(4,3));

            Func<Employee, bool> o7 = delegate (Employee emp)
                {
                if (emp.Id == 1)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            };
            Employee emp = new Employee { Id = 2, Name = "Amol" };
            Console.WriteLine(o7(emp));
        }
    }

    public class Employee
    {
        public int Id { get; set; }
        public string Name { get; set; }
    }
}
