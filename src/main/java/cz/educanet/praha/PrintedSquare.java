package cz.educanet.praha;

import java.util.Scanner;

public class PrintedSquare {
    public static String printSquare(int side) {
        String sleep = "";
        for(int i = 1; i <= side; i++)
        {
            for(int j = 1; j <= side; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        return "It's OK)";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the square's side");
        String result = printSquare(sc.nextInt());
        System.out.println(result);
    }
}
