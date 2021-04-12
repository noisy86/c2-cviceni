package cz.educanet.praha;

import java.util.Scanner;

public class SumAllNumbers {

    public static int calculate(Scanner scanner) {
        int sum = 0;

        boolean turn = true;
        while (turn == true){
            int num = scanner.nextInt();
            System.out.println("Enter a number:");
            sum += num;
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculate(new Scanner(System.in)));
    }
}
