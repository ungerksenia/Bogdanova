package lesson2;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String country;
    private int price;
    private boolean bookedByBuyer;

    public Product(String name, String productionDate, String manufacturer, String country, int price, boolean bookedByBuyer) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.bookedByBuyer = bookedByBuyer;
    }
    public void printInfo() {
        System.out.println(
                "name: " + name +
                        ", productionDate: " + productionDate +
                        ", manufacturer: " + manufacturer +
                        ", country: " + country +
                        ", price: " + price +
                        ", booked: " + bookedByBuyer
        );
    }
    public static void main(String[] args) {
        Product product1 = new Product(
                "Samsung S25 Ultra",
                "01.02.2025",
                "Samsung Corp.",
                "Korea",
                5599,
                true
        );

        product1.printInfo();
    }

}


