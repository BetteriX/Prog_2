using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        // Ellenőrizzük, hogy van-e parancssori argumentum
        if (args.Length == 0)
        {
            Console.WriteLine("Kérlek, add meg a keresett mesefigurát parancssori argumentumként!");
            return;
        }

        string keresettSzereplo = args[0]; // Keresett szereplő neve
        List<Mese> mesek = new List<Mese>();

        // Fájl beolvasása - Alternatíva 1: File.ReadAllLines
        try
        {
            foreach (var sor in File.ReadAllLines("input.txt"))
            {
                var split = sor.Split(':');
                string cim = split[0];
                string[] szereplok = split[1].Split(',');

                mesek.Add(new Mese(cim, szereplok));
            }
        }
        catch (FileNotFoundException)
        {
            Console.WriteLine("Hiba: Az 'input.txt' fájl nem található!");
            return;
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Hiba történt a fájl beolvasása közben: {ex.Message}");
            return;
        }

        // --- Alternatíva 2: Stream-alapú fájlbeolvasás ---
        /*
            FileStream és StreamReader használata esetén nagyobb rugalmasságot kapunk,
            különösen, ha nagy fájlokat akarunk soronként feldolgozni.
        */
        try
        {
            using (FileStream fs = new FileStream("input.txt", FileMode.Open, FileAccess.Read))
            using (StreamReader reader = new StreamReader(fs))
            {
                string sor;
                while ((sor = reader.ReadLine()) != null)
                {
                    var split = sor.Split(':');
                    string cim = split[0];
                    string[] szereplok = split[1].Split(',');

                    mesek.Add(new Mese(cim, szereplok));
                }
            }
        }
        catch (FileNotFoundException)
        {
            Console.WriteLine("Hiba: Az 'input.txt' fájl nem található!");
            return;
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Hiba történt a fájl beolvasása közben: {ex.Message}");
            return;
        }

        // Kiválasztjuk azokat a meséket, amelyekben szerepel a keresett szereplő
        List<Mese> szurtMesek = mesek
            .Where(m => m.Szereplok.Contains(keresettSzereplo))
            .ToList();

        // 1. Rendezés CompareTo-val
        Console.WriteLine("Rendezés CompareTo-val:");
        szurtMesek.Sort(); // Ez a `Mese` osztály `CompareTo` metódusát használja
        foreach (var mese in szurtMesek)
        {
            Console.WriteLine($"{mese.Cim}: {mese.SzereplokSzama}");
        }

        // 2. Rendezés LINQ-val
        Console.WriteLine("\nRendezés LINQ-val:");
        var rendezettMesek = szurtMesek
            .OrderByDescending(m => m.SzereplokSzama)
            .ThenBy(m => m.Cim)
            .ToList();
        foreach (var mese in rendezettMesek)
        {
            Console.WriteLine($"{mese.Cim}: {mese.SzereplokSzama}");
        }

        // --- Eredmények kiírása fájlba StreamWriter-rel ---
        try
        {
            using (FileStream fs = new FileStream("output.txt", FileMode.Create, FileAccess.Write))
            using (StreamWriter writer = new StreamWriter(fs))
            {
                writer.WriteLine("Rendezés CompareTo-val:");
                foreach (var mese in szurtMesek)
                {
                    writer.WriteLine($"{mese.Cim}: {mese.SzereplokSzama}");
                }

                writer.WriteLine("\nRendezés LINQ-val:");
                foreach (var mese in rendezettMesek)
                {
                    writer.WriteLine($"{mese.Cim}: {mese.SzereplokSzama}");
                }
            }
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Hiba történt az eredmények fájlba írása közben: {ex.Message}");
        }
    }
}

// Mese osztály
class Mese : IComparable<Mese>
{
    public string Cim { get; private set; } // A mese címe
    public List<string> Szereplok { get; private set; } // A mese szereplőinek listája

    // Ez a tulajdonság a szereplők számát adja vissza
    public int SzereplokSzama => Szereplok.Count;

    /*
        Magyarázat a fenti tulajdonsághoz:
        - Ez egy "kifejezés-alapú tulajdonság" (expression-bodied property), amely rövidíti a hagyományos getter-t.
        - A `Szereplok.Count` értékét számolja ki, ami a `Szereplok` lista elemeinek számát adja vissza.
        - Hagyományos formában így nézne ki:
            public int SzereplokSzama
            {
                get { return Szereplok.Count; }
            }
        - Előnye, hogy tömörebb és olvashatóbb.
    */

    public Mese(string cim, string[] szereplok)
    {
        Cim = cim;
        Szereplok = new List<string>(szereplok);
    }

    // CompareTo metódus az IComparable interfész megvalósításához
    public int CompareTo(Mese other)
    {
        
        // Rendezés szereplők száma szerint csökkenő sorrendben
        int szereploKulonbseg = other.SzereplokSzama.CompareTo(this.SzereplokSzama);
        if (szereploKulonbseg != 0)
        {
            return szereploKulonbseg;
        }

        // Ha egyenlő a szereplők száma, cím szerint növekvő sorrendben
        return this.Cim.CompareTo(other.Cim);
    }
}
