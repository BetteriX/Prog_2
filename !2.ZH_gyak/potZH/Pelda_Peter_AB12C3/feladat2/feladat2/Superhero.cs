using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace feladat2
{
    internal class Superhero : IComparable<Superhero>
    {
        public string Nev { get; private set; }
        public List<string> Kepesegek { get; private set; }

        public Superhero(string nev, List<string> kepesegek)
        {
            Nev = nev;
            Kepesegek = kepesegek;
        }

        public int CompareTo(Superhero other)
        {
            return Nev.CompareTo(other.Nev);
        }
    }
}
