package com.company;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Enter the number of the disk");
        int n=scanner.nextInt();
        System.out.println("The moves are");
        moveDisk(n,'A','B','C');

    }
    public static void moveDisk(int n,char fromTower,char toTower,char auxTower){
        if(n==1){
            System.out.println("Move disk"+n+" from "+fromTower+"to"+toTower);
        }else{
            moveDisk(n-1,fromTower,toTower,auxTower);
            System.out.println("Move disk"+n+" from "+fromTower+"to"+toTower);
            moveDisk(n-1,auxTower,toTower,fromTower);
        }

    }
}
