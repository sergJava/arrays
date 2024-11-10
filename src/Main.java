import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1

        int[] array1 = new int[]{1, 2, 3};
        float[] array2 = {1.57f, 7.654f, 9.986f};
        int[] array3 = new int[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = i + 1;
        }
        System.out.println();


        System.out.println("Task 2");

        for (int i = 0; i < array1.length; i++) {
            if (i == (array1.length - 1)) {
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }

        for (int i = 0; i < array2.length; i++) {
            if (i == (array2.length - 1)) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }

        for (int i = 0; i < array3.length; i++) {
            if (i == (array3.length - 1)) {
                System.out.println(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }
        System.out.println();


        System.out.println("Task 3");

        for (int i = (array1.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }

        for (int i = (array2.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }

        for (int i = (array3.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.println(array3[i] + "\n");
                break;
            }
            System.out.print(array3[i] + ", ");
        }


        System.out.println("Task 4");

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}