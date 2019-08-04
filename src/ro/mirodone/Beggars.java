package ro.mirodone;

public class Beggars {

    public int[] beggars(int[] values, int n) {
        int array[] = new int[n];

        for (int i = 1; i <= n; i++) {
            array[i - 1] = 0;
            for (int j = i - 1; j < values.length; ) {
                array[i - 1] += values[j];
                j = j + n;
            }
        }

        return array;
    }

}
