package lesson3.task1;

public class Dog extends Animal {
    public static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не пробежал");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {System.out.println(name + " проплыл " + distance + " метров");
        } else {
            System.out.println(name + " не проплыл");
        }
    }
}
