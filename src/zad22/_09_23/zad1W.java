package zad22._09_23;

import java.util.Scanner;

public class zad1W {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;

        System.out.println("podaj liczbe z przedziału 10 do 24");
        liczba = scanner.nextInt();


        while(!(liczba >= 10 && liczba <= 24)){

            System.out.println("podana liczba jest z poza przedziału, podaj nową");
            liczba = scanner.nextInt();
        }
        System.out.println(liczba);
    }

}
