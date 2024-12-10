using System;
using System.Linq;
using System.Collections.Generic;

namespace Ezerelnel_kisebb
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            var nums = Enumerable.Range(1, 999)
                .Where(i => i % 3 == 0 || i % 5 == 0)
                .Sum();
            Console.WriteLine(nums);
        }
    }
}