package com.Japneet;
import java.util.Scanner;
public class EvenAndOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        System.out.println("The number you gave is: "+num);
        if(num%2==0){
            System.out.println("It is an even number");
        }
        else {
            System.out.println("It is an odd number");
        }
    }
}
