using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Kivételkezelés bemutatása:");

        // 1. Nullával osztás kivétel
        try
        {
            int a = 10;
            int b = 0;
            Console.WriteLine(a / b); // Nullával osztás
        }
        catch (DivideByZeroException ex)
        {
            Console.WriteLine($"Nullával osztás hiba: {ex.Message}");
        }

        // 2. Tömb túlindexelése
        try
        {
            int[] tomb = { 1, 2, 3 };
            Console.WriteLine(tomb[5]); // Túlindexelés
        }
        catch (IndexOutOfRangeException ex)
        {
            Console.WriteLine($"Tömb túlindexelés hiba: {ex.Message}");
        }

        // 3. Szöveg számmá konvertálása
        try
        {
            string szoveg = "nem_szam";
            int szam = int.Parse(szoveg); // Hibás konverzió
        }
        catch (FormatException ex)
        {
            Console.WriteLine($"Formátum hiba: {ex.Message}");
        }

        // 4. Saját kivételosztály használata
        try
{
    EllenorizdANegativSzamot(-5);
}
catch (NegativSzamException ex)
{
    Console.WriteLine($"Saját kivétel elkapva: {ex.Message}");
}


        // 5. Általános kivétel
        try
        {
            object obj = null;
            Console.WriteLine(obj.ToString()); // NullReferenceException
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Általános kivétel: {ex.Message}");
        }

        Console.WriteLine("A program folytatódik...");
    }

    // Saját kivétel eldobása
   static void EllenorizdANegativSzamot(int szam)
{
    if (szam < 0)
    {
        throw new NegativSzamException("A szám negatív volt!");
    }

    Console.WriteLine($"A szám pozitív: {szam}");
}


// Saját kivételosztály
public class NegativSzamException : Exception
{
    public NegativSzamException() : base() { }

    public NegativSzamException(string message) : base(message) { }

    public NegativSzamException(string message, Exception innerException) : base(message, innerException) { }
}
