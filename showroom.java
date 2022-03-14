package com.Japneet;
import java.util.Scanner;
class show{
    Scanner input = new Scanner(System.in);
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;
    String mobileNumber;
    show(){
        name = " ";
        mobno = 0;
        cost = 0;
        dis = 0;
        amount = 0;
    }
    void input(){
        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your mobile number: ");
        mobno = input.nextLong();
        mobileNumber = String.valueOf(mobno);
        while(mobileNumber.length() != 10){
            System.out.println("Please enter a valid number: ");
            mobileNumber = input.nextLine();
        }
        System.out.print("Cost: ");
        cost = input.nextDouble();
    }
    void calculate(){
        if(cost >= 10000){
            dis = cost*5/100; // 5%
            amount = cost - dis;
        }
        else if ( cost >= 10000 && cost <= 20000){
            dis = cost*10/100;
            amount = cost - dis;
        }
        else if ( cost >= 20000 && cost <= 35000){
            dis = cost*15/100;
            amount = cost - dis;
        }
        else if ( cost >= 35000 ){
            dis = cost*20/100;
            amount = cost - dis;
        }
    }
    void display(){
        System.out.println("Your name is : "+name);
        System.out.println("Your mobile number is : "+mobileNumber);
        System.out.println("Your cost is : "+cost);
        System.out.println("Your discount is : "+dis);
        System.out.println("Your amount to be paid is : "+amount);
    }
}
public class showroom {
    public static void main(String[] args){
        show object = new show();
        object.input();
        object.calculate();
        object.display();
    }
}

