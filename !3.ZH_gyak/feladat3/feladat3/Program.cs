using System;
using System.IO;

namespace feladat3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int vizszintes = 0;
            int melyseg = 0;

            try
            {
                using (StreamReader r = new StreamReader("input.txt"))
                {
                    string sor;
                    while ((sor = r.ReadLine()) != null)
                    {
                        string direction = sor.Split(' ')[0];
                        int ertek = int.Parse(sor.Split(' ')[1]);

                        if (direction.Equals("forward"))
                        {
                            vizszintes += ertek;
                        }
                        else if (direction.Equals("down"))
                        {
                            melyseg += ertek;
                        }
                        else // up
                        {
                            melyseg -= ertek;
                        }
                    }
                }
            }
            catch (FileNotFoundException e)
            {
                Console.WriteLine($"Az input.txt nem találja!");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }

            Console.WriteLine($"vizszintes pozíció: {vizszintes}\nmélység: {melyseg}\n---\nvégeredmány: {vizszintes*melyseg}");
        }
    }
}
