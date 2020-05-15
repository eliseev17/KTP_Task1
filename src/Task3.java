public class Task3 {
    static final int CHICKEN_LEGS = 2;
    static final int COW_LEGS = 4;
    static final int PIG_LEGS = 4;

    public static void main(String[] args) {
        System.out.println(animals(2,3,5));
        System.out.println(animals(1,2,3));
        System.out.println(animals(5,2,8));
    }

    static int animals(int amountOfChickens, int amountOfCows, int amountOfPigs) {
        return amountOfChickens * CHICKEN_LEGS + amountOfCows * COW_LEGS + amountOfPigs * PIG_LEGS;
    }
}
