package rikkei.acdemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap so bat dau: ");
        int number = sc.nextInt();
        int count = 0;
        // Xử lý ngoại lệ nếu người dùng nhập số 1
        if (number < 2) {
            System.out.println("hay nhap so lon hon 1");
        } else {
            while (count <= 20) {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(number + " ");
                    count++;
                }
                number++;
            }
        }
    }
}