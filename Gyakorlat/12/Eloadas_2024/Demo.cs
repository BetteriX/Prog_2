using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Eloadas_2024
{
    internal class Demo
    {

        public static void string_demo()
        {

            // Standard input/output - Olvasás és írás különböző módszerekkel
            Console.WriteLine("Add meg a neved:");
            string name = Console.ReadLine(); // Felhasználó neve bekérése
            Console.WriteLine($"Üdvözöllek, {name}!"); // Üdvözlés a megadott névvel

            // Stringek kezelése
            Console.WriteLine("Adj meg egy szöveget a string műveletekhez:");
            string input = Console.ReadLine(); // Felhasználó által megadott szöveg

            // String darabolása
            string[] words = input.Split(' '); // Szavakra bontás szóköz mentén
            Console.WriteLine("A szöveg szavai:");
            foreach (var word in words)
            {
                Console.WriteLine(word); // Szavak kiírása
            }

            // String cseréje
            string replaced = input.Replace("a", "@"); // 'a' karakterek cseréje '@'-ra
            Console.WriteLine($"Csere eredménye: {replaced}");

            // Kis- és nagybetűssé alakítás
            Console.WriteLine($"Nagybetűs: {input.ToUpper()}"); // Nagybetűs szöveg
            Console.WriteLine($"Kisbetűs: {input.ToLower()}"); // Kisbetűs szöveg

            // String visszafelé fordítása
            char[] charArray = input.ToCharArray(); // Szöveg karaktertömbbé alakítása
            Array.Reverse(charArray); // Karakterek sorrendjének megfordítása
            Console.WriteLine($"Visszafelé: {new string(charArray)}");

            // Részszöveg keresése
            Console.WriteLine("Adj meg egy keresett szöveget:");
            string search = Console.ReadLine(); // Keresett szöveg bekérése
            bool contains = input.Contains(search); // Ellenőrzés, hogy a szöveg tartalmazza-e
            Console.WriteLine(contains ? "A szöveg tartalmazza a keresett kifejezést." : "A szöveg nem tartalmazza a keresett kifejezést.");

            // String összehasonlítása
            Console.WriteLine("Adj meg egy másik szöveget összehasonlításhoz:");
            string compareInput = Console.ReadLine();
            Console.WriteLine($"A két szöveg egyenlő: {input.Equals(compareInput)}"); // Equals metódus
            Console.WriteLine($"Lexikografikus összehasonlítás eredménye: {input.CompareTo(compareInput)}"); // CompareTo metódus

            // Sztring hosszának lekérése
            Console.WriteLine($"A szöveg hossza: {input.Length}");

            // Sztring vágása
            string substring = input.Substring(7, 4); // Kivágás a 7. karaktertől, 4 karakter hosszban
            Console.WriteLine($"Részszöveg: {substring}");

            

            // Sztring elején és végén lévő szóközök eltávolítása
            string trimmedInput = input.Trim();
            Console.WriteLine($"Trimmed szöveg: '{trimmedInput}'");

            // Sztring helyettesítése reguláris kifejezéssel
            string replacedRegex = input.Replace("a", "A");
            Console.WriteLine($"Regex csere eredménye: {replacedRegex}");

            Console.WriteLine("\nAdjon meg sorokat- (írja be 'exit' a befejezéshez)):");
            List<string> lines = new List<string>();

            string line;
            while ((line = Console.ReadLine()) != "exit")
            {
                lines.Add(line); // Hozzáadjuk a sorokat a listához
            }

            // Feltétel alapján feldolgozzuk a sorokat (pl. ha a sor tartalmazza a 'hello' szót, akkor nagybetűsre alakítjuk)
            Console.WriteLine("\nFeldolgozott sorok:");
            foreach (var l in lines)
            {
                if (l.ToLower().Contains("hello"))
                {
                    Console.WriteLine(l.ToUpper()); // Ha tartalmazza a 'hello'-t, akkor nagybetűssé alakítjuk
                }
                else
                {
                    Console.WriteLine(l); // Ha nem tartalmazza a 'hello'-t, akkor változatlanul kiírjuk
                }
            }


            Console.ReadKey();


        }


        public static void math_demo()
        {

            // Math osztály használata
            Console.WriteLine("Adj meg egy számot a matematikai műveletekhez:");
            double number = double.Parse(Console.ReadLine()); // Szám bekérése

            Console.WriteLine($"Kerekítés felfelé: {Math.Ceiling(number)}"); // Kerekítés felfelé
            Console.WriteLine($"Kerekítés lefelé: {Math.Floor(number)}"); // Kerekítés lefelé
            Console.WriteLine($"Négyzetgyök: {Math.Sqrt(number)}"); // Négyzetgyök számítása
            Console.WriteLine($"Színusz: {Math.Sin(number)}"); // Szinusz számítása

            // Új matematikai műveletek
            Console.WriteLine($"Koszinusz: {Math.Cos(number)}"); // Koszinusz számítása
            Console.WriteLine($"Tangens: {Math.Tan(number)}"); // Tangens számítása
            Console.WriteLine($"Logaritmus (alap e): {Math.Log(number)}"); // Természetes logaritmus
            Console.WriteLine($"Logaritmus (alap 10): {Math.Log10(number)}"); // Logaritmus 10-es alapú
            Console.WriteLine($"Hatványozás (szám a négyzeten): {Math.Pow(number, 2)}"); // Hatványozás

            Console.ReadLine();
        }


        public static void lista_demo()
        {
            // Listák kezelése
            List<int> numbers = new List<int> { 7, 3,2, 4, 5 }; // Eredeti lista
            Console.WriteLine("Eredeti lista:");
            foreach (var num in numbers)
            {
                Console.Write(num + " "); // Lista elemek kiírása
            }
            Console.WriteLine();

            // Elem hozzáadása a listához
            numbers.Add(6); // Új elem hozzáadása
            Console.WriteLine("Lista elem hozzáadása után:");
            foreach (var num in numbers)
            {
                Console.Write(num + " "); // Lista elemek kiírása
            }
            Console.WriteLine();

            // Lista elemek törlése
            numbers.Remove(3); // Elem törlése
            Console.WriteLine("Lista elem törlése után:");
            foreach (var num in numbers)
            {
                Console.Write(num + " "); // Lista elemek kiírása
            }
            Console.WriteLine();

            // Lista rendezése
            numbers.Sort(); // Lista rendezése növekvő sorrendben
            Console.WriteLine("Rendezett lista:");
            foreach (var num in numbers)
            {
                Console.Write(num + " "); // Lista elemek kiírása
            }
            Console.WriteLine();

            // Lista keresése
            bool containsNumber = numbers.Contains(4); // Ellenőrzés, hogy tartalmaz-e egy elemet
            Console.WriteLine($"A lista tartalmazza a 4-es számot: {containsNumber}");

            // Lista fordított sorrendben
            numbers.Reverse(); // Lista sorrendjének megfordítása
            Console.WriteLine("Fordított sorrendű lista:");
            foreach (var num in numbers)
            {
                Console.Write(num + " ");
            }
            Console.ReadLine();

        }

        public static void halmaz_demo()
        {

            // Halmazok kezelése (HashSet)
            HashSet<string> fruits = new HashSet<string> { "alma", "banán", "cseresznye" }; // Halmaz inicializálása
            Console.WriteLine("Eredeti halmaz:");
            foreach (var fruit in fruits)
            {
                Console.WriteLine(fruit); // Halmaz elemeinek kiírása
            }
            Console.WriteLine();
  

            fruits.Add("szőlő"); // Új elem hozzáadása
            Console.WriteLine("Elem hozzáadása után:");
            foreach (var fruit in fruits)
            {
                Console.WriteLine(fruit); // Halmaz elemeinek kiírása
            }

            Console.WriteLine();

            bool isFruitPresent = fruits.Contains("alma"); // Ellenőrzés, hogy tartalmazza-e
            Console.WriteLine($"A halmaz tartalmazza az 'alma' elemet: {isFruitPresent}");
            
            Console.WriteLine();

            fruits.Remove("banán"); // Elem törlése a halmazból
            Console.WriteLine("Elem törlése után:");
           
            foreach (var fruit in fruits)
            {
                Console.WriteLine(fruit);
            }

            Console.WriteLine();
           

            // Halmazműveletek (metszet, unió, különbség)
            HashSet<int> setA = new HashSet<int> { 1, 2, 3, 4 };
            HashSet<int> setB = new HashSet<int> { 3, 4, 5, 6 };

            // Unió (összes elem mindkét halmazból)
            HashSet<int> union = new HashSet<int>(setA);
            union.UnionWith(setB); // Unió végrehajtása
            Console.WriteLine("Unió:");
            foreach (var item in union)
            {
                Console.Write(item + " "); // 1 2 3 4 5 6
            }
            Console.WriteLine();
            Console.WriteLine();


            // Metszet (csak a közös elemek)
            HashSet<int> intersection = new HashSet<int>(setA);
            intersection.IntersectWith(setB); // Metszet végrehajtása
            Console.WriteLine("Metszet:");
            foreach (var item in intersection)
            {
                Console.Write(item + " "); // 3 4
            }

            Console.WriteLine();
            Console.WriteLine();


            // Különbség (az A halmazból hiányzó elemek B-ben)
            HashSet<int> difference = new HashSet<int>(setA);
            difference.ExceptWith(setB); // Különbség végrehajtása
            Console.WriteLine("Különbség (A \\ B):");
            foreach (var item in difference)
            {
                Console.Write(item + " "); // 1 2
            }
            Console.ReadLine();


        }

        public static void map_demo()
        {

            // Map példák (Dictionary)
            Dictionary<string, int> ages = new Dictionary<string, int>(); // Szótár inicializálása
            ages["Anna"] = 25; // Új kulcs-érték pár hozzáadása
            ages["Béla"] = 30;
            ages["Cecília"] = 28; // Új kulcs-érték pár hozzáadása
            ages["Dénes"] = 35;

            // Szótár tartalmának kiírása
            Console.WriteLine("Szótár tartalma:");
            foreach (var pair in ages)
            {
                Console.WriteLine($"{pair.Key}: {pair.Value}"); // Kulcs és érték kiírása
            }

            // Elem elérése kulcs alapján
            if (ages.ContainsKey("Anna"))
            {
                Console.WriteLine($"Anna életkora: {ages["Anna"]}"); // Kulcs alapján érték lekérése
            }

            Console.WriteLine();
            // Szótár elemének módosítása
            ages["Béla"] = 31; // Béla életkorának frissítése
            Console.WriteLine("Béla frissített életkora:");
            Console.WriteLine($"Béla: {ages["Béla"]}");

            Console.WriteLine();

            // Elem törlése a szótárból
            ages.Remove("Cecília"); // Kulcs-érték pár törlése
            Console.WriteLine("Cecília törlése után:");
            foreach (var pair in ages)
            {
                Console.WriteLine($"{pair.Key}: {pair.Value}");
            }

            // Szótár méretének lekérdezése
            Console.WriteLine($"A szótár mérete: {ages.Count}");

            Console.WriteLine();

            // Szótár kulcsainak és értékeinek külön lekérése
            Console.WriteLine("Szótár kulcsai:");
            foreach (var key in ages.Keys)
            {
                Console.WriteLine(key); // Kulcsok kiírása
            }

            Console.WriteLine();

            Console.WriteLine("Szótár értékei:");
            foreach (var value in ages.Values)
            {
                Console.WriteLine(value); // Értékek kiírása
            }

            Console.WriteLine();
            // Szótár keresés érték alapján
            Console.WriteLine("Keresés érték alapján (30):");
            bool containsValue = ages.ContainsValue(30); // Érték keresése
            Console.WriteLine(containsValue ? "Van olyan elem, aminek az értéke 30." : "Nincs olyan elem, aminek az értéke 30.");

            Console.ReadKey();

        }
    }
}
