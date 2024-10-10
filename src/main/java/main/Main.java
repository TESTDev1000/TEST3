package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //MONTH
            System.out.print("Write month: ");
            int month = scanner.nextInt();

            //YEAR
            System.out.print("Write year: ");
            int year = scanner.nextInt();

            if (month < 1 || month > 12) {
                System.out.println("Invalid month!");
            }
            else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12: {
                        System.out.println("31");
                        break;
                    }
                    case 2: {
                        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                            System.out.println("29");
                        }
                        else {
                            System.out.println("28");
                        }
                        break;
                    }
                    default: {
                        System.out.println("30");
                        break;
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println("Invalid input! Please enter integers.");
        }
    }
}