package Averrage;

public class Averrage {
    public static void main(String[] args) {
        double[] arrDouble = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            arrDouble[i] = Double.parseDouble(args[i]);
        }

        System.out.println(averrage(arrDouble[0],arrDouble[1]));


    }

    public static double averrage(double a, double... b) {
        double countVar=a;
        for (double i : b){
            countVar += i;
        }
        double wynik = countVar / (b.length+1);

        return wynik;
    }
}