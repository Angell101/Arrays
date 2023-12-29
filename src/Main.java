import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();// задача 1
        task2();// задача 2
        task3();// задача 3
        task4();// задача 4

    }

    public static void task1() {
        System.out.println("Задание 1");

        int[] numbers = new int [] {1, 2, 3};
        double[] numbers1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length -1);
            {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i]);
            if ( i != numbers.length -1);
            {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Задание 2");

        int [] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double [] arr2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("задание 3");

        int [] arr1 = new int[3];
        arr1[0] = 3;
        arr1[1] = 2;
        arr1[2] = 1;

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double [] arr2 = {9.986, 7.654, 1.57};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задание 4");

        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (arr1[i] % 2 != 0) {
                System.out.println(Arrays.toString(arr1));
            }
        }
    }
    // Если честно, не очень понял суть 4 задания, надеюсь, я правильно селал.
}