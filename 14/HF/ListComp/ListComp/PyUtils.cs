using System.Collections.Generic;

namespace ListComp
{
    public class PyUtils
    {
        private PyUtils(){
            
        }

        public static List<int> Range(int hi)
        {
            return Range(0, hi, 1);
        }

        public static List<int> Range(int lo, int hi)
        {
            return Range(lo, hi, 1);
        }

        public static List<int> Range(int lo, int hi, int step)
        {
            List<int> list = new List<int>();

            for (int i = lo; i < hi; i += step)
            {
                list.Add(i);
            }

            return list;
        }
    }
}