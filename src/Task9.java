public class Task9 {
    public static void main(String[] args) {
        System.out.println(sumOfCubes(new int[]{1,5,9}));
        System.out.println(sumOfCubes(new int[]{3,4,5}));
        System.out.println(sumOfCubes(new int[]{2}));
        System.out.println(sumOfCubes(new int[]{}));
    }

    static int sumOfCubes(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] * array[i] * array[i];
        }
        return sum;
    }
}
