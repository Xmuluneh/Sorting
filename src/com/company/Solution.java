package com.company;

public class Solution {
    public static boolean validatePin(String pin) {
        int count=0;
       
        for(int i=0;i<pin.length();i++){
           
            if (Character.isDigit(pin.charAt(i)) {
               count++
            }
           

        }
       if(count==4||count==6){
          return true;
       }else{

        return false;
    }

    public static void main(String[] args) {
         System.out.println(validatePin("12345"));
        System.out.println(validatePin("q123"));
        System.out.println(validatePin("123456"));
        System.out.println(validatePin("a12345"));

    }
}

    }
}
