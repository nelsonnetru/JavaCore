package lesson02;

import java.util.Arrays;

public class HomeWork02 {

    public static void main(String[] args) {
        System.out.println("количество чётных элементов массива " +
                countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println("разница между самым большим и самым маленьким элементами " +
                diffMaxMin(new int[]{2, 1, 2, 3, 4}));
        System.out.println("есть два соседних элемента, с нулевым значением " +
                doubleNullElements(new int[]{2, 0, 2, 0, 0}));

    }

    /*
    Написать метод, возвращающий количество чётных элементов массива.
    countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    */
    private static int countEvens(int[] arr) {
        int result = 0;
        for (int i : arr) {
            if (i % 2 == 0) result++;
        }
        return result;
    }

    /*
    Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
    */
    private static int diffMaxMin(int[] arr) {
        return Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();
    }

/*
Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */
    private static boolean doubleNullElements (int[] arr) {
        boolean flag = false;
        for (int j : arr) {
            if (j == 0) {
                if (!flag) flag = true;
                else return true;
            } else {
                flag = false;
            }
        }
        return false;
    }
}
