package Zajecia.Gra;

import Zajecia.Gra.Czlowiek;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Czlowiek czlowiek = new Czlowiek(100, 100, 100);

        System.out.println("Wybierz opcję od 1-4");
        System.out.println("1 = Wyjście z programu");
        System.out.println("2 = Walka");
        System.out.println("3 = Statystyka");
        System.out.println("4 = Leczenie postaci");
        int wpisanaWartosc = scanner.nextInt();
        while (wpisanaWartosc == 1) {
            System.out.println("Do widzenia");
            break;
        }
        if (wpisanaWartosc == 2) {

           czlowiek.walka();
        }
        if (wpisanaWartosc == 3) {
            czlowiek.statystyka();
        }
        if (wpisanaWartosc == 4) {
            System.out.println(czlowiek.lecznie(100));

        }
    }
}

