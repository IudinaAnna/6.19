package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    static void Func(int count, char s) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(s);
            }
            System.out.println("");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Количество символов: ");
        int count=input.nextInt();
        System.out.print("Символ: ");
        char fill = input.next().charAt(0);
        Func(count,fill);
    }
}
