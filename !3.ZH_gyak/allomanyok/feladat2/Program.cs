namespace feladat2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Hotel h = new Hotel("Sunny Hotel", 5);

            h.bookRoom("Kovács Béla");
            h.bookRoom("Nagy Anna");
            h.bookRoom("Szabó Péter");

            Console.WriteLine(h);
        }
    }
}
