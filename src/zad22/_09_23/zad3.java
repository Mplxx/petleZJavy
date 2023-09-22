package zad22._09_23;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) throws IOException {
        int predkosc, odleglosc, czas;
        Scanner scanner = new Scanner(System.in);

        FileWriter fw = new FileWriter("aka.txt",true);
        PrintWriter pw = new PrintWriter(fw);

        predkosc = scanner.nextInt();
        czas = scanner.nextInt();
        odleglosc = 0;
        for(int i = 0; i < czas; i++) {
            odleglosc += predkosc ;

            pw.println(odleglosc);


        }
        pw.close();
    }
}
