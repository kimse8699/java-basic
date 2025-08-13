package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static double average(int[] array) {
        double n = array.length;
        return sum(array) / n;
    }

    public static int min(int[] array) {
        int n = array[0];
        for (int i : array) {
            if (n > i) {
                n = i;
            }
        }
        return n;
    }

    public static int max(int[] array) {
        int n = array[0];
        for (int i : array) {
            if (n < i) {
                n = i;
            }
        }
        return n;
    }
}
