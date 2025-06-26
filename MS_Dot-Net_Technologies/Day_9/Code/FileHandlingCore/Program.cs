namespace FileHandingInCore
{
    internal class Program
    {
        static void Main(string[] args)
        {
            WriteToFile();
            ReadFromFile();
        }

        private static void WriteToFile()
        {
            StreamWriter writer = File.CreateText("C:\\aaaa\\a.txt");
            writer.WriteLine("Hello World");
            writer.WriteLine("Line 2");
            writer.WriteLine("Done for the day");

            writer.Close();
        }
        private static void ReadFromFile()
        {
            string s;
            StreamReader reader = File.OpenText("C:\\aaaa\\a.txt");
            while ((s = reader.ReadLine()) != null)
            {
                Console.WriteLine(s);
            }
            reader.Close();
        }
    }
}



// TODO
/*
1)
Create an employee object and persist it
Read from the file and recreate the employee object

2)
Create a list of employees and persist it
Read from that file and recreate the object.
 */
