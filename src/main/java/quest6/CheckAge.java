package quest6;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój dzień urodzenia");
        int bDay = scanner.nextInt();
        System.out.println("Podaj swój miesiąc urodzenia");
        int bMonth = scanner.nextInt();
        System.out.println("Podaj swój rok urodzenia");
        int bYear = scanner.nextInt();

        GregorianCalendar birth = new GregorianCalendar(bDay, bMonth, bYear);

        System.out.println(birth);
//        System.out.println("podaj");


        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
    }
}
/*

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

        public class Exercise6_AreYouAnAdult {
            public static void main(String[] args) {
                System.out.println("Please enter your birth day in the format: yyyy.MM.dd (ex. 1999.12.15)");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
                try {
                    Date date = format.parse(input);
                    LocalDate birthDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    // computing age taken from https://stackoverflow.com/questions/1116123/how-do-i-calculate-someones-age-in-java
                    int years = Period.between(birthDate, LocalDate.now()).getYears();
                    System.out.println("You are " + years + " old");
                    if (years >= 18) {
                        System.out.println("You're an adult");
                    } else {
                        System.out.println("You're not an adult");
                    }
                } catch (ParseException e) {
                    System.out.println("I could not understand that, you sure \"" + input + "\" is in valid date?");
                    System.out.println("I'll let you try again");
                    main(args); // we can call main recursive
                }
            }
        }




    }
}
*/
