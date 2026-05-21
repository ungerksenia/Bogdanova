package lesson2;

public class ParkApp {
    public static void main(String[] args) {
        Park park = new Park();

        for (Park.Attraction a : park.getAttractions()) {
            a.printInfo();
        }
    }
}
