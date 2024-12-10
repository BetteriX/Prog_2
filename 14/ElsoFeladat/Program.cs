using System;
using System.IO;
using System.Collections.Generic;
using System.Data;

namespace ElsoFeladat
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            string[] sorok = File.ReadAllLines("input.txt");

            // Key:Value
            // Varosok:Evek -> string:List<string>
            Dictionary<string, List<string>> map = new Dictionary<string, List<string>>();
            foreach (string sor in sorok)
            {
                string[] adatok = sor.Split(':');
                string ev = adatok[0];
                // string[] varos = adatok[1].split(',') fix!
                string varos = adatok[1];

                if (varos.Contains(","))
                {
                    string[] varosok = varos.Split(',');
                    if (!map.ContainsKey(varosok[0]))
                    {
                        map.Add(varosok[0], new List<string>());
                    }
                    
                    if (!map.ContainsKey(varosok[1]))
                    {
                        map.Add(varosok[1], new List<string>());
                    }
                    
                    map[varosok[0]].Add(ev);
                    map[varosok[1]].Add(ev);

                    continue;
                }

                if (!map.ContainsKey(varos))
                {
                    map.Add(varos, new List<string>());
                }
                map[varos].Add(ev);
            }

            foreach (string key in map.Keys)
            {
                Console.WriteLine(key + ":" + string.Join(",", map[key]));
            }
        }

    }
}