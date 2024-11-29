using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Eloadas_2024
{
   

    class Program2
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Adj meg egy nevet az ember osztály és öröklés bemutatásához:");
            string name = Console.ReadLine();

            //Human basicHuman = new Human(name);
            Human worker = new Worker(name, "Programozó");
            Human student = new Student(name, "Informatika");

            //basicHuman.Introduce();
            worker.Introduce();
            student.Introduce();
        }
    }

    abstract class Human
    {
        public string Name { get; private set; }

        public Human(string name)
        {
            Name = name;
        }

        public abstract void Introduce();
    }

    class Worker : Human
    {
        public string Job { get; private set; }

        public Worker(string name, string job) : base(name)
        {
            Job = job;
        }

        public override void Introduce()
        {
            Console.WriteLine($"Sziasztok, {Name} vagyok, a foglalkozásom: {Job}.");
        }
    }

    class Student : Human
    {
        public string Major { get; private set; }

        public Student(string name, string major) : base(name)
        {
            Major = major;
        }

        public override void Introduce()
        {
            Console.WriteLine($"Helló, {Name} vagyok, {Major} szakon tanulok.");
        }
    }

}
