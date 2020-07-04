package Hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4.Exit");
        while (true){
            System.out.println("Enter your choice: ");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    for (int i = 0; i < 5; i++){
                        System.out.println("* * * * * * *");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++){
                        for (int j = 1; j <= i; j ++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 5; i++){
                        for (int j = 5; j >= i; j--){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
