namespace ObjectInitializers
{
    internal class Program
    {
        static void Main()
        {
            Class1 o1 = new Class1();
            o1.Prop1 = 10;
            o1.Prop2 = 20;
            o1.Prop3 = 30;

            //object initializer - use it when there is no constructor
            Class1 o2 = new Class1() { Prop1 = 40, Prop2 = 50, Prop3 = 60 };
            Class1 o3 = new Class1 { Prop2 = 70, Prop3 = 80, Prop1 = 90 };

            Console.WriteLine(o1.Prop1);
            Console.WriteLine(o2.Prop1);
            Console.WriteLine(o3.Prop1);

        }
    }
    public class Class1
    {
        public int Prop1 { get; set; }
        public int Prop2 { get; set; }
        public int Prop3 { get; set; }
    }
}
