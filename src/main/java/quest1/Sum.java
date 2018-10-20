package quest1;

import java.util.Scanner;

public class Sum {
    static double a=0,b=0;

    public static void main(String[] args) {
        for (int i = 0;i<args.length;i++){
            System.out.println(args[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Będzie teraz robiona suma");
        double sum = sum();
        System.out.println("Suma argumentów domyślnych " + sum);
        System.out.println("Podaj pierwszą liczbę");
        a = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        b = scanner.nextDouble();
        double sum2 = sum();
        System.out.println("Suma wynosi: " + sum2);


    }

    public static double sum(){
        return a+b;
    }
}
