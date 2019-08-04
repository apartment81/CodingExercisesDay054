package ro.mirodone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Beggars beggars = new Beggars();

        System.out.println(Arrays.toString(beggars.beggars(new int[]{1, 2, 3, 4, 5} , 4)));
        
        System.out.println(Arrays.toString(beggars.beggars(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, 3)));

    }
}
