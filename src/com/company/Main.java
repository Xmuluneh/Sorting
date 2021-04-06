package com.company;

public class Main {
    public static int count=0;

    public static void main(String[] args) {
        System.out.println(fab(11));
        System.out.println(count);

    }

    public static int fab(int n) {
        count++;
        if (n == 0) {
            return n;
        } else {
            return fab(n - 2) + fab(n - 1);
        }
    }
}

