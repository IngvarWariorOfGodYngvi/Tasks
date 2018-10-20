package quest13;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciToBinnary {
    public static void main(String[] args) {
        int fibonacciNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Którą w kolejności liczbę ciągu Fibonacciego chcesz wyświetlić");
        fibonacciNumber = scanner.nextInt();

        BigInteger current = BigInteger.ONE;
        BigInteger previous;
        int length = 1000;
        for (int i = 0; i < fibonacciNumber + 1; i++) {
            previous = current;
            current = fibonacci_iterative(i);
            String format = String.format("|%4d|%50d|%" + length + "s|", i, current, toBinary(current, length));
            System.out.println(format);
        }

        // using int I can print 44 fibonacci numbers
        // using long I can print 90 fibonacci numbers
        // using BigInteger I printed 10000 fibonacci numbers and could probably print many more

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

    public static BigInteger fibonacci_iterative(int i) {
        if (i == 0) {
            return BigInteger.ONE;
        } else if (i == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger a = BigInteger.ONE;
            BigInteger b = BigInteger.ONE;
            BigInteger temp;
            for (int j = 0; j < i; j++) {
                temp = a.add(b);
                a = b;
                b = temp;
            }
            return b;
        }
    }

    public static String toBinary(BigInteger number, int feedZerosCount) {
        String result = "";
        for (int i = 0; i < feedZerosCount; i++) {
            if (number.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
                result = "1" + result;
            } else {
                result = "0" + result;
            }
            number = number.divide(BigInteger.valueOf(2));
        }

        return result;
    }

}