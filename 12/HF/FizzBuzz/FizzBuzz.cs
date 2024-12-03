using System;
using System.Text;

namespace FizzBuzz
{
    public class FizzBuzz
    {
        public int num;
        
        public FizzBuzz(int num)
        {
            this.num = num;
        }

        public void Start()
        {
            for (int i = 1; i <= num; i++)
            {
                StringBuilder sb = new StringBuilder();

                if (i % 3 == 0)
                {
                    sb.Append("fizz");
                }
                
                if (i % 5 == 0)
                { 
                    sb.Append("buzz");
                }

                if (sb.ToString().Equals(""))
                {
                    sb.Append(i);
                }
                
                Console.WriteLine(sb.ToString());
            }
        }
    }
}