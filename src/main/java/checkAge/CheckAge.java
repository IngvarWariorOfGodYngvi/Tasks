package checkAge;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój dzień urodzenia");
        int bDay = scanner.nextInt();
        System.out.println("Podaj swój miesiąc urodzenia");
        int bMonth = scanner.nextInt();
        System.out.println("Podaj swój rok urodzenia");
        int bYear = scanner.nextInt();

        GregorianCalendar birth = new GregorianCalendar(bDay,bMonth,bYear);

        System.out.println(birth);
//        System.out.println("podaj");


        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");






    }
}
