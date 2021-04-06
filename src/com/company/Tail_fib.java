package com.company;

public class Tail_fib {
    public static void main(String[] args) {
        System.out.println(fab(8));
    }
    public static long fab(int index){
        return  fab(index,1,0);
    }
    private static  int fab(int index,int next,int result){
        if(index==0){
            return result;

        }else{
            return fab(index-1,next+result,next);
        }
    }
}
