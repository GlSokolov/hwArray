import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // ______________Задание 1___________________
        System.out.println("______________Задание 1___________________");
        // 1.1
        int[] weight0 = new int [3];
        weight0[0] = 1;
        weight0[1] = 2;
        weight0[2] = 3;
        System.out.println(weight0[0]);
        // 1.2
        double[] weight1 = {-1.57, 7.654, 9.986};
        System.out.println(weight1[2]);
        // 1.3
        byte[] weight2 = {1,2,27,54,0,0,23};
        System.out.println(weight2[5]);

        System.out.println("______________Задание 2___________________");
        // ______________Задание 2___________________
        for (byte i=0; weight0.length > i; i++) {
            System.out.print(weight0[i]);
            if (i != weight0.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (byte i=0; weight1.length > i; i++) {
            System.out.print(weight1[i]);
            if (i != weight1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (byte i=0; weight2.length > i; i++) {
            System.out.print(weight2[i]);
            if (i != weight2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("______________Задание 3___________________");
        // ______________Задание 3___________________
        for (int i = weight0.length -1; i >= 0; i--) {
            System.out.print(weight0[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = weight1.length -1; i >= 0; i--) {
            System.out.print(weight1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = weight2.length -1; i >= 0; i--) {
            System.out.print(weight2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("______________Задание 4___________________");
        // ______________Задание 4___________________
        for (int i = 0; weight0.length > i; i++) {
            if (weight0[i] % 2 != 0) {
                weight0[i]++;
            }
        }
        System.out.println(Arrays.toString(weight0));
    }
}