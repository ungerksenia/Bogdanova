package lesson2;

public class Park {
    private Attraction[] attractions;

    public  Park() {
        this.attractions = new Attraction[3];
        attractions[0] = new Attraction("Батут", "10-20", 300);
        attractions[1] = new Attraction("Карусель", "14-19", 400);
        attractions[2] = new Attraction("Колесо обозрения", "9-23", 500);
    }

    public Attraction[] getAttractions() {
        return attractions;
    }

    public class Attraction {
        private String name;
        private String time;
        private double price;

        public Attraction(String name, String time, double price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }
        public void printInfo() {
            System.out.println(
                    "name: " + name +
                            ", time: " + time +
                            ", price: " + price
            );
        }
    }
    public static void main(String[] args) {
        Park park = new Park();

        for (Attraction a : park.getAttractions()) {
            a.printInfo();
        }
    }
}