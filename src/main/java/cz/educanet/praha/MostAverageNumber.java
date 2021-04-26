package cz.educanet.praha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MostAverageNumber {

    static int findMostAverageNumber(Scanner sc) {
        double total = 0;
        int count = 0;
        int average = 0;
        int closesest = 0;
        List<Integer> nums = new ArrayList<>();
        while (sc.hasNext()){
            int cislo = sc.nextInt();
            total = total + cislo;
            nums.add(cislo);
            count++;
            if(count > 0){
                average = (int) total/count;
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            if (Math.abs(nums.get(i) - average) <= Math.abs(closesest - average)) {
                closesest = nums.get(i);

            }
        }

        return closesest;
    }
}
