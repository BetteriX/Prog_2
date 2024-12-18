using System;
using System.IO;

namespace feladat4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<double> in1 = new List<double>();
            List<double> in2 = new List<double>();

            try
            {
                using (StreamReader r = new StreamReader("in1.txt"))
                {
                    string sor = "";
                    while ((sor = r.ReadLine()) != null)
                    {
                        double num = double.Parse(sor.Replace(".",","));
                        in1.Add(num);
                    }
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

            try
            {
                using (StreamReader r = new StreamReader("in2.txt"))
                {
                    string sor = "";
                    while ((sor = r.ReadLine()) != null)
                    {
                        double num = double.Parse(sor.Replace(".",","));
                        in2.Add(num);
                    }
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

            int count = 0;
            try
            {
                using (StreamWriter sw = new StreamWriter("out.txt"))
                {
                    for (int i = 0; i < in1.Count; i++)
                    {
                        if (in1[i] + in2[i] > 1.0)
                        {
                            //Console.WriteLine(in1[i] + in2[i]);
                            count++;
                            sw.WriteLine(i + 1);
                        }
                    }
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

            Console.WriteLine("-> out.txt létrehozva");
            Console.WriteLine($"-> sikeres kísérletek száma: {count}");
        }
    }
}
