import java.util.ArrayList;
import java.util.List;

public class Hotel {
    // A private az nagyon fontos!
    // A get függvények nagyon fontosak ilyenkor!
    private String hotelName;
    private int rooms;
    private int avaliableRooms;
    private int bookedRooms;
    private List<String> guests;

    public Hotel(String hotelName, int rooms) {
        this.hotelName = hotelName;
        this.rooms = rooms;
        this.avaliableRooms = rooms;
        this.bookedRooms = 0;
        this.guests = new ArrayList<>();
    }

    public void bookedRooms(String guestName) {
        if (this.avaliableRooms > 0) {
            this.guests.add(guestName);
            this.avaliableRooms--;
            this.bookedRooms++;
        } else {
            System.out.println("Hiba: Nincs elérhető szoba.");
        }
    }

    public void checkoutRoom(String guestName) {
        if (this.guests.contains(guestName)) {
            this.guests.remove(guestName);
            this.avaliableRooms++;
            this.bookedRooms--;
        } else {
            System.out.println("Hiba: A vendég nem található.");
        }
    }

    public boolean isRoomAvaliable() {
        return this.avaliableRooms > 0;
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public int getRooms() {
        return this.rooms;
    }

    public int getAvaliableRooms() {
        return this.avaliableRooms;
    }

    public int getBookedRooms() {
        return this.bookedRooms;
    }

    public List<String> getGuests() {
        return this.guests;
    }

    @Override
    public String toString() {
        return String.format("""
                Hotel adatai:
                - Hotel neve: %s
                - Szobák száma: %d
                - Szabad szábák száma: %d
                - Lefoglalt szobák száma: %d
                - Vendéglista: %s""",
                this.hotelName,
                this.rooms,
                this.avaliableRooms,
                this.bookedRooms,
                this.guests.isEmpty() ? "Jelengleg nincsenek vendégek a szállodában." : String.join(", ", this.guests));
    }
}
