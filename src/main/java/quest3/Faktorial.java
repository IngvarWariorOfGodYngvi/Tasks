package quest3;

import java.util.Scanner;

public class Faktorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę z czego chcesz policzyć silnie za pomocą for");
        int a = scanner.nextInt();
        int wynik = silnia(a);
        System.out.println("Podaj liczbę z czego chcesz policzyć silnie za pomocą rekurencji");
        int b = scanner.nextInt();
        int wynik2 = silnia_rekurencyjna(b);
        System.out.println("Silnia z for: " + wynik +"\n");
        System.out.println("Silnia rekurencyjna: " + wynik2);


    }


    public static int silnia(int n) {
        int wynik  = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static int silnia_rekurencyjna (int n) {
        if (n==0)
            return 1;
        else
            return (n*silnia_rekurencyjna(n-1));
    }
}

