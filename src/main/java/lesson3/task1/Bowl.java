package lesson3.task1;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.println("В миске: " + food);
    }

}
