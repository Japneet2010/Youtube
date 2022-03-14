package com.Japneet;
import java.util.Scanner;
public class parkinglot{
    int vno;
    int hours;
    double bill;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicle no. : ");
        vno = sc.nextInt();
        System.out.println("Enter no. of hours: ");
        hours = sc.nextInt();
    }
    void calculate(){
        if (hours == 1){
            bill = 10;
        }
        else{
            bill = hours*10;
        }
    }
    void display(){
        System.out.println("Your vehicle no. is : "+vno);
        System.out.println("No. of hours: "+hours);
        System.out.println("Total bill: "+bill);
    }
    public static void main(String[] args){
        parkinglot obj = new parkinglot();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
