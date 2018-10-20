package quest7;

import java.util.Scanner;

public class StringToUpperCase {

    public static void main(String[] args) {
        stringToUpperCase();
    }

    public static void stringToUpperCase() {
        String userString ="";

        while (!userString.equals("q!"))
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz swój tekst");
            userString = scanner.nextLine();
            System.out.println(userString.toUpperCase());
        }
        System.out.println("NARA!");
    }

}





