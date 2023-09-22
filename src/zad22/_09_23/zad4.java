package zad22._09_23;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double zloty;
        double wyplata = 1;
        int iloscDni;

        System.out.println("podaj dni ile robiłes na czarno");
        iloscDni = scanner.nextInt();

        double[] wyplaty = new double[iloscDni];

        for(int grosz = 1; grosz < iloscDni; grosz++){
             wyplata *= grosz;
             wyplaty[grosz] = wyplata;
            System.out.println(wyplaty[grosz]);
        }
        zloty = wyplata /  60;
        System.out.printf("twoja kasa to: %.2f ", zloty);
    }
}
