package com.company;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
    static long fac(int n){
        return fac(n,1);
    }
    static long fac(int n,int result){
        if(n==0){
            return result;
        }else{
            return fac(n-1,n*result);
        }
    }

}
