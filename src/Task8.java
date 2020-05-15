import static java.lang.Math.*;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(nextEdge(8,10));
        System.out.println(nextEdge(5,7));
        System.out.println(nextEdge(9,2));
    }

    static double nextEdge(int a, int b) {
        return sqrt(a * a + b * b - 2 * a * b * cos(160));
    }
}
