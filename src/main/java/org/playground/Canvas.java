package org.playground;
import java.util.Scanner;
import java.util.Arrays;

class Canvas {
    // implement me
    private static void rotate(int[] arr, int steps) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < steps; i++) {
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[j]);
            }
        }

    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}