package com.Japneet;

public class palindrome {
    public static void main(String args[]){
        int res = 0;
        int a = 123099032;
        int copy = a;
        while(a>0){
            int digit = a%10;
            res = res*10+digit;
            a = a/10;
        }
        if (res == copy){
            System.out.println("The value of res: "+res);
            System.out.println("The number you gave: "+copy);
            System.out.println("It is a palindrome number.");
        }
        else{
            System.out.println("The value of res: "+res);
            System.out.println("The number you gave: "+copy);
            System.out.println("It is not a palindrome number.");
        }
    }
}
