package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Source array:");
        System.out.println(Arrays.toString(array));


        ShiftRight(array);

        System.out.println("Array after cyclic shift to the right:");
        System.out.println(Arrays.toString(array));

        scanner.close();
    }

    public static void ShiftRight(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int lastElement = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastElement;
    }

}



