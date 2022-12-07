package Zajecia.calc;

import java.util.Scanner;

public class EasyCalc {
    public static void main(String[] args) {

        int number1;
        int number2;
        int wynik;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rodzaj działania: +,-, *,/ , % , lub x, aby wyjśc z programu");
        char operator = scanner.nextLine().charAt(0);


        while (true){

            if (operator == 'x') {
                System.out.println("Do widzenia");
                break;
            }

        System.out.println("Podaj pierwszą liczbę :");
    number1 =scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
    number2 =scanner.nextInt();

        if(operator =='+')

    {
        wynik = number1 + number2;
        System.out.println("Twój wynik to dodawania to :" + wynik);
    }
        if(operator =='-')

    {
        wynik = number1 - number2;
        System.out.println("Twój wynik odejmowania to: " + wynik);
    }
        if(operator =='*')

    {
        wynik = number1 * number2;
        System.out.println("Twój wynik mnożenia to: " + wynik);
    }
        if(operator =='/')

    {
        wynik = number1 / number2;
        System.out.println("Twoj wynik dzielenia to: " + wynik);
    }
        if(operator =='%')

    {
        wynik = number1 % number2;
        System.out.println("Twoj wynik dzielenia z resztą to: " + wynik);
    }


        scanner.close();
    }

}    }

