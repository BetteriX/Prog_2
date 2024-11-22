public class Main {
    public static void main(String[] args) {
        Hotel h = new Hotel("????", 3);
        h.bookedRooms("Józsi");
        System.out.println(h.getGuests());
        h.bookedRooms("Nem Józsi");
        // h.bookedRooms("Utálom Józsit");
        // h.bookedRooms("Nemtom");
        System.out.println(h);
    }
}
