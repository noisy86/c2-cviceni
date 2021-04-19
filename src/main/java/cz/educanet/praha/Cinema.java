package cz.educanet.praha;

import java.util.Scanner;

public class Cinema {

    public static int freeSpaces(String[] namesOnSeat, Scanner sc) {
        boolean ticket = true;
        while (ticket == true) {
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Select space: ");
            int space = sc.nextInt();

            if (namesOnSeat[space - 1] == null) {
                namesOnSeat[space - 1] = name;

            }
            else {
                while(namesOnSeat[space - 1] != null){
                    space++;
                    if(namesOnSeat[space - 1] == null) {
                        namesOnSeat[space - 1] = name;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int freeSpaces = freeSpaces(new String[]{null, null, "2bad2furious", null, null, "monarezio"}, new Scanner(System.in));
        System.out.println("Free spaces: " + freeSpaces);
    }
}
