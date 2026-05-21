package lesson2;

public class ProductApp {
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
