﻿using System;

namespace Ezernel_kisebb_pozitiv_egesz
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            int sum = 0;
            for (int i = 1; i < 1000; i++)
            {
                if (i % 3 == 0 || i % 5 == 0)
                {
                    sum += i;
                }
            }
            
            Console.WriteLine(sum);
        }
    }
}