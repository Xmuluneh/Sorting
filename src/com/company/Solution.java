package com.company;

public class Solution {
    public static boolean validatePin(String pin) {
        int count=0;
        char Char;
        for(int i=0;i<pin.length();i++){
            Char=pin.charAt(i);
            if (!Char.isDigit(Char)) {
                continue;
            }
            count++;

        }




        return true;
    }

    public static void main(String[] args) {

    }
}
