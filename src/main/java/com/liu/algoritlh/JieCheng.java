package com.liu.algoritlh;

/**
 * Created by Administrator on 2018/10/13/013.
 */
public class JieCheng {
    public static void main(String[] args) {
        System.out.println(method(0));
        System.out.println(method(1));
        System.out.println(method(2));
        System.out.println(method(3));
        System.out.println(method(4));
        System.out.println(method(5));
        System.out.println(method(6));

    }
    public static int method(int n){
        if(n>=0){
           if(n==0){
              return 1;
           }else{
               return n*method(n-1);
           }
        }
        return -1;
    }
}
