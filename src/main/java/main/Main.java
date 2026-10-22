package main;
import java.util.ArrayList;

public class Main {
    public static int[] compressNumbers(int[] a) {
        ArrayList<Integer> resultNumbers = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                resultNumbers.add(a[i]);
            }
        }
        int[] result = new int[resultNumbers.size()];
        for (int i = 0; i < resultNumbers.size(); i++)
        {
            result[i] = resultNumbers.get(i);
        }
        return result;
    }
}
