package cz.educanet.praha;

import java.util.Scanner;

public class Average {

    public static double average(Scanner scanner) {

        double sum = 0;
        boolean turn = true;
        int turncount = 0;

        while (turn == true){
            System.out.println("Enter a number:");
            double num = scanner.nextDouble();
            sum += num;
            turncount++;
            System.out.println(sum/turncount);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(average(new Scanner(System.in)));
    }
}
