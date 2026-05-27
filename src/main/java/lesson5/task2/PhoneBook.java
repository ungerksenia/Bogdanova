package lesson5.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PhoneBook {
    private final Map<String, List<String>> contacts = new HashMap<>();

    public void add(String name, String phone) {
        if (contacts.containsKey(name)) {
            contacts.get(name).add(phone);
        } else  {
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            contacts.put(name, phones);
        }
    }

    public void get(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(contacts.get(name));
        } else {
            System.out.println("Контакт не найден");
        }
    }
}
