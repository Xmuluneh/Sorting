package com.company;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        double[] a = {1.2, 3, 4, 7, 8, 5, 4, 9};
        Sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(rec_search(a, 4));

    }

    public static void Sort(double[] list) {
        boolean flag = true;
        double temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    private static int rec_search(double[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return rec_search(list, key, low, high);
    }

    private static int rec_search(double[] list, int key, int low, int high) {
        if (low > high) {
            return -low - 1;
        }
        int mid = (low + high) / 2;
        if (key < list[mid]) {
            return rec_search(list, key, low, mid - 1);
        } else if (key == list[mid]) {
                return   mid;
        }else {
            return rec_search(list, key, mid + 1, high);
        }
        //return rec_search(list, key, mid + 1, high);
    }
}
