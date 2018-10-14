package quest9;

import java.util.Scanner;

public class Quest9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak długi ma być bok kwadratu?");
        int border = scanner.nextInt();
        for (int x=0;x<border;x++){
            for(int y=0;y<border;y++){
                if((y>0 &&y<border-1)&&(x>0 &&x<border-1)) {System.out.print(" \t");}
                else System.out.print("*\t");}
        System.out.println();


        }
    }


}

/*9. Napisz program który wyświetli kwadrat z znaków * o boku 3

        * * *
        *   *
        * * *

        9.1. Zmodyfikuj program tak by długość boku była wczytywana z wejścia*/
