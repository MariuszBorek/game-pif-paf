package pl.sda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dodatnią liczbę naturalną");
        int koncowyZakres = 0;
        try {
            koncowyZakres = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("miałą byc liczba naturalna");
            return;
        }
        try {
            betterPifPafer(koncowyZakres);
        } catch (NumberBelowOneException e) {
            System.out.println("liczba musi być dodatnia");
        }
    }

    static void pifPafer(int koncowyZakres) throws NumberBelowOneException {
        if (koncowyZakres < 1) {
            throw new NumberBelowOneException();
        }
        for (int i = 0; i < koncowyZakres; i++) {
            if (i % 3 == 0) {
                System.out.print("Pif ");
            }
            if (i % 7 == 0) {
                System.out.print("Paf");
            }
            if (i % 7 != 0 && i % 3 != 0) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void betterPifPafer(int koncowyZakres) throws NumberBelowOneException {
        if (koncowyZakres < 1) {
            throw new NumberBelowOneException();
        }
        for (int i = 0; i < koncowyZakres; i++) {
            if (i % 7 == 0 && i % 3 == 0) {
                System.out.print("Pifa paf");
            } else if (i % 3 == 0) {
                System.out.print("Pif");
            } else if (i % 7 == 0) {
                System.out.print("Paf");
            } else {
                System.out.print(i);
            }
            System.out.println();

        }
    }


}
