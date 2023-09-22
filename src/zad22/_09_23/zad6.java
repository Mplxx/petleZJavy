package zad22._09_23;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class zad6 {
    public static void main(String[] args)  throws IOException{

        Scanner scanner = new Scanner(System.in);

        String znak;
        int liczbaZnakow = 0;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku do odczytania: ");
        String nazwaPliku = klawiatura.nextLine();


        System.out.println("podaj znak");
        znak = scanner.nextLine();


        File mojPlik = new File(nazwaPliku);

        if (!mojPlik.exists()) {
            System.out.println(" Plik nie istnieje");
            System.exit(0);
        }

        Scanner czytelnikPlik = new Scanner(nazwaPliku);

        while (czytelnikPlik.hasNext()) {
            String linia =  czytelnikPlik.nextLine();


            for(int i = 0; i < linia.length(); i++){
                i = linia.indexOf(znak, i);
                liczbaZnakow++;


            }
        }
        System.out.println(liczbaZnakow);

        czytelnikPlik.close();
    }
}
