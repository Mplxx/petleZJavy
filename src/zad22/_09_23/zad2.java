package zad22._09_23;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        int predkosc, odleglosc, czas;
        Scanner scanner = new Scanner(System.in);

        predkosc = scanner.nextInt();
        czas = scanner.nextInt();
        odleglosc = 0;
        for(int i = 0; i < czas; i++){
            odleglosc += predkosc;
            System.out.println(odleglosc);
        }

    }
}
