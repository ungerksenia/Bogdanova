package lesson3.task1;

public class AnimalsApp {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Агат");
        Cat cat2 = new Cat("Лаванда");

        Dog dog1 = new Dog("Глазурь");

        cat1.run(150);
        cat1.run(200);
        cat1.run(300);

        cat1.swim(1);

        dog1.run(350);
        dog1.swim(9);

        System.out.println("Животных: " + Animal.animalCount);
        System.out.println("Котов: " + Cat.catCount);
        System.out.println("Собак: " + Dog.dogCount);

        Bowl bowl = new Bowl(20);

        bowl.info();

        Cat[] cats = {cat1, cat2};
        for (Cat cat : cats) {
            cat.eat(bowl, 15);
        }

        bowl.info();

        for (Cat cat : cats) {
            cat.catInfo();
        }

        bowl.addFood(15);

        bowl.info();
    }
}

