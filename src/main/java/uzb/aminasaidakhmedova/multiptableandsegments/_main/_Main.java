package uzb.aminasaidakhmedova.multiptableandsegments._main;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        //printing multiplication table from 2 to 5
        for (int i = 2; i < 6; i++) {
            for (int j = 2; j < 11; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }

        //finding distance between 2 points
        Scanner inputInt = new Scanner(System.in);
        int coordinateA1 = inputInt.nextInt();
        int coordinateB1 = inputInt.nextInt();
        int coordinateA2 = inputInt.nextInt();
        int coordinateB2 = inputInt.nextInt();

        System.out.println("Point 1 is (" + coordinateA1 + ", " + coordinateB1 +
                "); Point 2 is (" + coordinateA2 + ", " + coordinateB2 + ")");

        float distance = 0f;
        distance = (float) Math.sqrt(Math.pow((coordinateA2 - coordinateA1), 2) + Math.pow((coordinateB2 - coordinateB1), 2));
        System.out.println("Distance between to point is " + distance);
    }
}
