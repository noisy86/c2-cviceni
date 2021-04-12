package cz.educanet.praha;

import java.util.Scanner;

public class SumFromZeroTill {
    public static int sumFromZeroTill(int max){
        int sum = 0;
        for (int i = 0; i <= max; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        System.out.println(sumFromZeroTill(sc.nextInt()));
    }
}
