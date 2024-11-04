package Task.task_30102024;

import java.util.Scanner;

public class Task1_2D_Left_Triangle_Star_Pattern {
    public static void main(String[] args) {
        //*****
        //****
        //***
        //**
        //*

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i = n-1; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
