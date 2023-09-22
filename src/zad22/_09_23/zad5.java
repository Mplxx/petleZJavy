package zad22._09_23;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ciagZnakow, znak;
        int liczbaZnakow = 0;

        System.out.println("podaj zdanie");
        ciagZnakow = scanner.nextLine();
        System.out.println("podaj znak");
        znak = scanner.nextLine();
        char znakChar = (char) znak.indexOf(1);

        for(int i = 0; i< ciagZnakow.length(); i++){

           if(ciagZnakow.indexOf(znakChar) < 0   ){
               System.exit(0);
           }
            i = ciagZnakow.indexOf(znak, i);
            liczbaZnakow++;


            }

        System.out.println(liczbaZnakow);

    }
}
