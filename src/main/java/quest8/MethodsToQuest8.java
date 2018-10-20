package quest8;

public class MethodsToQuest8 {
    private static int[] arrInt;

    public static void main(String[] args) {
        arrInt = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arrInt[i] = Integer.parseInt(args[i]);
        }
        sout();
        reverseSout();
        evenSout();
        dividedByThree();
        sum();
        sumOfFirstFour();
        sumOfLastFive();
        sumFirstHigherThanTen();



    }
    private static void sumFirstHigherThanTen() {
        int args = arrInt.length;
        int counter=0;
        for (int i=0;i <args;i++){
            counter+=arrInt[i];
            if (counter >=10){args =i;}
        }
        System.out.println(counter);

    }

    private static void sumOfLastFive() {
        int args = arrInt.length;
        int counter = 0;
        int back = 5;
        for (int i =args-1;i>=args-back;i--){
            if (arrInt[i]<2){
                back++;
                counter-=arrInt[i];}
            counter +=arrInt[i];
        }
        System.out.println(counter);
    }

    private static int sumOfFirstFour() {
        int args = 4;
        int counter=0;
        for (int i = 0; i < args; i++) {
            counter+=arrInt[i];

        }
        System.out.println(counter);
        return counter;
    }

    private static int sum() {
        int args = arrInt.length;
        int counter=0;
        for (int i = 0; i < args; i++) {
            counter+=arrInt[i];

        }
        System.out.println(counter);
        return counter;
    }

    private static void dividedByThree() {
        int args = arrInt.length;
        for (int i = 0; i < args; i++) {
            if(arrInt[i] == 0){System.out.print("");}
            else if (arrInt[i]%3 ==0){
                System.out.print(arrInt[i] + " ");
            }
        }
        System.out.println();
    }

    private static void evenSout() {
        int args = arrInt.length;
        for (int i = 0; i < args; i++) {
            if(i%2==1){
            System.out.print(arrInt[i] + " ");
            }
        }
        System.out.println();
    }

    private static void reverseSout() {
        int args = arrInt.length-1;
        for (int i = args;i>=0;i--){
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();
    }

    private static void sout() {
        int args = arrInt.length;
        for (int i = 0; i < args; i++) {
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();
    }

}

/*8. Napisz program który jako argument wejściowy przyjmie liczby oddzielone spacjami:
     >>   8.1. wszystkie liczby w kolejności w jakiej zostały podane
     >>   8.2. wszystkie liczby od tyłu
     >>   8.3. wszystkie na nieparzystych pozycjach
     >>   8.4. wszystkie podzielne przez 3
     >>   8.5. sumę wszystkich
     >>   8.6. sumę pierwszych 4
     >>   8.7. sumę ostatnich 5 liczb które są większe niż 2
     >>   8.8. wypisz sumę liczb od początku tablicy która przekracza 10 (in: "1 2 3 5 6 7 10 100 123" out: "11")
        8.9. (zadanie domowe) wybierz liczby z tablicy tak by ich suma była jak najbliższa 10, wypisz te liczby
        8.10. (zadanie domowe) wybierz liczby z tablicy tak by ich suma była jak najbliższa N, wypisz te liczby
        wejście będzie podane w formie: "N 1 2 13 100 4 10..."*/
