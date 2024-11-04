package Oct.ex_30102024_Array2;

import java.util.Scanner;

public class Lab099_2D_Right_Triangle {
    public static void main(String[] args) {
        //*
        //**
        //***
        //****
        //*****

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
