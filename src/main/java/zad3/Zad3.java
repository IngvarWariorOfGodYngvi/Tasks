package zad3;

import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę z czego chcesz policzyć silnie");
        int a = scanner.nextInt();
        int wynik = silnia(a);

        System.out.println(wynik);


    }


    public static int silnia(int n) {
        int wynik  = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }
}

