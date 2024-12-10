﻿using System;
using System.Collections.Generic;
using System.Linq;

namespace HarmadikFeladat
{
    class Felhasznalo
    {
        public int Id { get; set; }
        public string Nev { get; set; }
        public DateTime RegisztracioDatuma { get; set; }
    }
    class Konyv
    {
        public int Id { get; set; }
        public string Cim { get; set; }
        public string Szerzo { get; set; }
        public int KiadasEve { get; set; }
    }
    class Kolcsonzes
    {
        public int FelhasznaloId { get; set; }
        public int KonyvId { get; set; }
        public DateTime KolcsonzesDatuma { get; set; }
        public DateTime? VisszahozatalDatuma { get; set; } // null, ha még nincs visszahozva
    }
    internal class Program
    {
        public static void Main(string[] args)
        {
                        // Felhasznalok lista
            List<Felhasznalo> felhasznalok = new List<Felhasznalo>
            {
                new Felhasznalo { Id = 1, Nev = "Kiss Péter", RegisztracioDatuma = new DateTime(2015, 6, 1) },
                new Felhasznalo { Id = 2, Nev = "Nagy Anna", RegisztracioDatuma = new DateTime(2018, 3, 15) },
                new Felhasznalo { Id = 3, Nev = "Szabó Márton", RegisztracioDatuma = new DateTime(2020, 9, 23) },
                new Felhasznalo { Id = 4, Nev = "Tóth Éva", RegisztracioDatuma = new DateTime(2021, 11, 5) }
            };

            // Konyvek lista
            List<Konyv> konyvek = new List<Konyv>
            {
                new Konyv { Id = 1, Cim = "A kőszivű ember fiai", Szerzo = "Jókai Mór", KiadasEve = 1869 },
                new Konyv { Id = 2, Cim = "Pál utcai fiúk", Szerzo = "Molnár Ferenc", KiadasEve = 1906 },
                new Konyv { Id = 3, Cim = "Egri csillagok", Szerzo = "Gárdonyi Géza", KiadasEve = 1899 },
                new Konyv { Id = 4, Cim = "Harry Potter és a Bölcsek köve", Szerzo = "J.K. Rowling", KiadasEve = 1997 },
                new Konyv { Id = 5, Cim = "1984", Szerzo = "George Orwell", KiadasEve = 1949 }
            };

            // Kolcsonzesek lista
            List<Kolcsonzes> kolcsonzesek = new List<Kolcsonzes>
            {
                new Kolcsonzes { FelhasznaloId = 1, KonyvId = 1, KolcsonzesDatuma = new DateTime(2023, 1, 10), VisszahozatalDatuma = new DateTime(2023, 2, 1) },
                new Kolcsonzes { FelhasznaloId = 1, KonyvId = 3, KolcsonzesDatuma = new DateTime(2023, 5, 15), VisszahozatalDatuma = null },
                new Kolcsonzes { FelhasznaloId = 2, KonyvId = 4, KolcsonzesDatuma = new DateTime(2023, 6, 1), VisszahozatalDatuma = new DateTime(2023, 6, 25) },
                new Kolcsonzes { FelhasznaloId = 3, KonyvId = 2, KolcsonzesDatuma = new DateTime(2023, 4, 20), VisszahozatalDatuma = null },
                new Kolcsonzes { FelhasznaloId = 3, KonyvId = 5, KolcsonzesDatuma = new DateTime(2023, 7, 15), VisszahozatalDatuma = new DateTime(2023, 8, 1) },
                new Kolcsonzes { FelhasznaloId = 4, KonyvId = 3, KolcsonzesDatuma = new DateTime(2023, 2, 1), VisszahozatalDatuma = new DateTime(2023, 2, 20) },
                new Kolcsonzes { FelhasznaloId = 4, KonyvId = 1, KolcsonzesDatuma = new DateTime(2023, 9, 10), VisszahozatalDatuma = null }
            };

            foreach (Kolcsonzes kolcson in kolcsonzesek)
            {
                if (kolcson.VisszahozatalDatuma == null)
                {
                    Console.Write("Ezt a könyvet még nem hozták vissza: ");
                    var konyvAdatok = konyvek.Where(word => word.Id == kolcson.KonyvId).ToList();
                    konyvAdatok.ForEach(word => Console.WriteLine(word.Cim + " " + word.Szerzo));
                }
            }
            
            // Legtöbb kölcsönzés
            
            // Új könyvek
            var ujKonyvek = kolcsonzesek
                .Where(k => k.VisszahozatalDatuma != null)
                .Select(k => k.KonyvId)
        }
    }
}