package quest11;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int fibonacciNumber = 0;
        while (fibonacciNumber != -1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Którą w kolejności liczbę ciągu Fibonacciego chcesz wyświetlić");
            fibonacciNumber = scanner.nextInt();
            fibonacciLong(fibonacciNumber);
        }


    }

    private static long fibonacciLong(int number) {
        long equalFibonacci = number;
        if (number <= 1) {
            System.out.println(equalFibonacci);
        }
        if (number > 2) {
            long[] fibonaTab = new long[number + 1];
            int x = 0;
            long fibonacciDifference = 0;
            for (int i = 0; i <= number; i++) {
                if (i == 0) {
                    fibonaTab[i] = i;

                }
                if (i == 1) {
                    fibonaTab[i] = i;
                    x++;
                } else if (i > 1) {
                    fibonaTab[i] = (fibonaTab[i - 1]) + (fibonaTab[i - 2]);
                    x = i;
                }
                if (x > 0) {
                    fibonacciDifference = fibonaTab[x] - fibonaTab[x - 1];
                }
                if (fibonaTab[i] < 0) {
                    System.out.println("Liczba nr :" + x + " wychodzi poza zakres");
                } else
                    System.out.println("Liczba nr :" + x + " wynosi : " + fibonaTab[x] + " różnica wynosi : " + fibonacciDifference);
            }
        }
        return equalFibonacci;
    }
}
