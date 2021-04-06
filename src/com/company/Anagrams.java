package com.company;
import java.util.Arrays;
public class Anagrams {
    public static void main(String[] args) {
        System.out.println(checkAnagram("lisent","silent"));
    }
    public static boolean checkAnagram(String s,String d){
        int a=s.length();
        int b=d.length();
        s.replaceAll("","");
        d.replaceAll("","");
        if(a!=b){
            return false;
        }else{
            s.toLowerCase();
            d.toLowerCase();
            char[]arry1=s.toCharArray();
            char[]arry2=d.toCharArray();
            Arrays.sort(arry1);
            Arrays.sort(arry2);
            return (Arrays.equals(arry1,arry2));

        }
    }
}
