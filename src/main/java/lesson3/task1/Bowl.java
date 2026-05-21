package lesson3.task1;

public class Bowl {
    public int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void addFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.println("В миске: " + food);
    }

}
