package com.company;

public class NewNumber {
    public static void main(String[] args) {
        System.out.println(max(9));
    }
    static long max(int n){
        int count=1;
        if(n==0){
            return 0;
        }
        int f0=0;
        int f1=1;
        for(int i=1;i<=n;i++){
            int sum=f0+f1;
            f0=f1;
            f1=sum;
        }
        return f0;
    }

}
