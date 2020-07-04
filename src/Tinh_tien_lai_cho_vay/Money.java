package Tinh_tien_lai_cho_vay;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double money = input.nextDouble();
        System.out.println("Enter number of months: ");
        double month = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage: ");
        double interest_rate = input.nextDouble();

        double total_interest = money;
        for(int i = 1; i <= month; i ++){
            total_interest += total_interest * (interest_rate / 100 / 12) ;
        }
        System.out.println("Total interest: " + total_interest);
    }
}
