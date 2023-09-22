package zad22._09_23;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczbaLiczb;
        int suma = 0;
        System.out.println("podaj ilosc liczb" );
        liczbaLiczb = scanner.nextInt();

        for(int i = 0; i <= liczbaLiczb; i++ ){
            suma +=i;
        }
        System.out.println(suma);
    }
}
