package lesson5.task2;


public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "111111");
        phoneBook.add("Сидоров", "222222");
        phoneBook.add("Потапов", "333333");
        phoneBook.add("Варламов", "444444");
        phoneBook.add("Шарапов", "555555");
        phoneBook.add("Агафонов", "777777");
        phoneBook.add("Потапов", "888888");

        phoneBook.get("Потапов");
    }
}
