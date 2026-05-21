package lesson3.task1;

public class Cat extends Animal {
    public static int catCount = 0;
    public boolean satiety =  false;

    public Cat(String name) {
        super(name);
        catCount++;
    }
    public void catInfo() {
        if  (satiety) {
            System.out.println("Кот: " + name + " покушал и довольно спит");
        }  else {
            System.out.println("Кот: " + name + " не покушал");
        }
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.food >= foodAmount) {
            bowl.food -= foodAmount;
            satiety = true;
            System.out.println(name + " покушал");
        } else {
            System.out.println(name + " не хватило еды");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не пробежал");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
}

