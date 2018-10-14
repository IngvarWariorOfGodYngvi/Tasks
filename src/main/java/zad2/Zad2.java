package zad2;

import java.util.Scanner;

public class Zad2 {
    static double N;

    public static void main(String[] args) {

        System.out.println("Podaj jakąś liczbę");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i<=N; i++){
            if (i%3 ==0){sum+=i;}
            if (i%5 ==0){sum2+=i;}
        }

        System.out.println(sum);
        System.out.println(sum2);




    }
}
