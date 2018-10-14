package sum;

import java.util.Scanner;

public class Sum {
    static double a=0,b=0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Będzie teraz robiona suma");
        double sum = sum();
        System.out.println("Suma argumentów domyślnych " + sum);
        System.out.println("Podaj pierwszą liczbę");
        a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        b = scanner.nextInt();
        double sum2 = sum();
        System.out.println("Suma wynosi: " + sum2);


    }

    static double sum(){
        return a+b;
    }
}
