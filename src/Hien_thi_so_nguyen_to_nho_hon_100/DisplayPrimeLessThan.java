package Hien_thi_so_nguyen_to_nho_hon_100;

import Hien_thi_20_so_nguyen_to_dau_tien.DisplayPrime;

import java.util.Scanner;

public class DisplayPrimeLessThan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        showPrimeLessThan(100);

    }
    public static void showPrimeLessThan(int number){
        for (int i = 0; i < number;i ++){
            if (DisplayPrime.isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
