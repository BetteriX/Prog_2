namespace ToInt
{
    public static class Extension
    {
        public static int ToInt(this string input)
        {
            return int.Parse(input);
        } 
    }
    
    internal class Program
    {
        
        
        public static void Main(string[] args)
        {
            string s = "42";

            int i = s.ToInt();
        }
    }
}