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
}


