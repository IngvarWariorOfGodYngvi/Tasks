package quest4;

import java.util.Scanner;

public class Gnirst {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój tekst");
        String userString = scanner.nextLine();
        String reverse = reverseString(userString.toLowerCase());

        System.out.println("Podałeś :" + userString + " Więc odwrotnie to będzie: " + reverse);
    }

    public static String reverseString(String s){
        String stringOut = "";
        for (int i=s.length()-1;i>=0;i--){
        stringOut = stringOut+s.charAt(i);
        }
        return stringOut;
    }

}
