package com.company;
import java.util.ArrayList;
//Exercise_11_18
public class ArrayListCharacter {
    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList list=new ArrayList();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(toCharacterArray("muluneh"));

    }

}
