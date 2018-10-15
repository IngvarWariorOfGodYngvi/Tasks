package quest10;

import java.util.Scanner;

public class Palindroms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój tekst");
        String userString = scanner.nextLine();
        String reverse = reverseString(userString.toLowerCase());
        String reverse2 = reverse.replace(" ","");
        if (userString.replace(" ","").toLowerCase().equals(reverse2)) {
            System.out.println("Podałeś : " + userString + " Więc odwrotnie to będzie: " + reverse + "\t --->  jest to paindromem");
        }else{System.out.println("Podałeś : " + userString + " Więc odwrotnie to będzie: " + reverse);}

    }

    public static String reverseString(String s) {
        String stringOut = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            stringOut = stringOut + s.charAt(i);
        }
        return stringOut;
    }
/*        for (int i = 0; i <= 2; i++) {
            long fibonacciEquals = fibonacciLong(fibonacciNumber);
            i=0;
            if (fibonacciEquals<0){i=2;}
            fibonacciNumber++;
            System.out.println(fibonacciEquals);
        }*/
}
