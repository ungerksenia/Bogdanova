package lesson2;

public class ProductArray {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);

        productsArray[1] = new Product("iPhone 15", "10.09.2024",
                "Apple", "USA", 6500, false);

        productsArray[2] = new Product("Xiaomi 14", "15.11.2024",
                "Xiaomi", "China", 4000, false);

        productsArray[3] = new Product("Sony Xperia", "20.08.2023",
                "Sony", "Japan", 5000, true);

        productsArray[4] = new Product("Nokia 3310", "01.01.2005",
                "Nokia", "Finland", 100, false);
    }
}
