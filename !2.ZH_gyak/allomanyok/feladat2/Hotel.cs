using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace feladat2
{
    internal class Hotel
    {
        public string hotelName { get; set; }
        public int rooms { get; set; }
        public int availableRooms { get; set; }

        public int bookedRooms { get; set; }

        public List<string> guests { get; set; }

        public Hotel(string hotelName, int rooms)
        {
            this.hotelName = hotelName;
            this.rooms = rooms;
            availableRooms = rooms;
            bookedRooms = 0;
            guests = new List<string>();
        }

        public void bookRoom(string name)
        {
            if(availableRooms > 0)
            {
                availableRooms--;
                bookedRooms++;
                guests.Add(name);
            }
            else
            {
                Console.WriteLine("Hiba: Nem lehet lefoglalni szobát!");
            }
        }

        public void checkoutRoom(string name)
        {
            if(guests.Contains(name))
            {
                availableRooms++;
                bookedRooms--;
                guests.Remove(name);
            }
            else
            {
                Console.WriteLine("Hiba: Nem lehet kiléptetni!");
            }
        }

        public bool isRoomAvailable()
        {
            return availableRooms > 0;
        }

        public bool IsEmpty(List<string> guests)
        {
            return guests.Count == 0;
        }

        public override string ToString()
        {
            //string s = "";
            //if (IsEmpty(guests))
            //{
            //    s = "Nincsenek vendégek!";
            //}
            //else
            //{
            //    s = String.Join(", ", guests);
            //}

            guests.Sort();

            return String.Format($"""
                Szálloda neve: {hotelName}
                Összes szoba: {rooms}
                Elérhető szobák: {availableRooms}
                Foglalva: {bookedRooms}
                Vendégek: {(IsEmpty(guests) ? "Nincsenek vendégek" : String.Join(", ", guests))}
                """);
        }
    }
}
