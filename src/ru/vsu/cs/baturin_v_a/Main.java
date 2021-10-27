package ru.vsu.cs.baturin_v_a;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.print("Введите x = ");
        double x = readDouble();

        if (testX(x)){
            System.out.print("Введите n = ");
            int n = readInt();

            System.out.print("Введите e = ");
            double e = readDouble();

            System.out.println("1) " + calcSum1(n, x));
            System.out.println("2) " + calcSum2And3(n, x, e));
            System.out.println("3) " + calcSum2And3(n, x, e /10));
            System.out.println("4) " + calcSum4(x));
            }
    }

    private static boolean testX(double x) {
        boolean m = !(x <= -1) && !(x >= 1);
        return m;
    }

    private static double readDouble() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    private static int readInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static double returnABS(double k) {
        if (k >= 0){
            return k;
        } else {
            return -k;
        }
    }

    private static double calcSum1(int n, double x) {
        double sum = 1;
        double tmp = 1;

        for (int i = 1; i < n; i++) {
            tmp *= - (3 * x);
            sum += tmp;
        }
        return sum;
    }

    private static double calcSum2And3(int n, double x, double e) {
        double sum = 0;
        double tmp = 1;

        if (1 > e) {
            sum++;
        }

        for (int i = 1; i < n; i++) {
            tmp *= -(3 * x);

            if (returnABS(tmp) > e) {
                sum += tmp;
            }
        }
        return sum;
    }

    private static double calcSum4(double x) {
        return 1 / (1 + 3 * x);
    }
}
