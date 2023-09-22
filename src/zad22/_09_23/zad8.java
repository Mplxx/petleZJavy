package zad22._09_23;

import java.util.Random;
import java.util.Scanner;

public class zad8 {
    public static void gra(){
        Scanner scanner = new Scanner(System.in);
        Random losowanie = new Random();

        int rodzajKostki;
        int wynikUzytkownika, wynikKomputera;
        int iloscRund;
        int punktyUzytkownika, punktyKomputera;
        int roznica;
        String enter;
        punktyUzytkownika = punktyKomputera = 0;

        System.out.println("podaj ilosc rund");
        iloscRund = scanner.nextInt();
        boolean kosc;

        if (iloscRund <= 0) {
            System.out.println("nie moze byc ujemnych ani zerowych rund");
            System.exit(0);
        }

        for (int i = 0; i < iloscRund; i++) {
            System.out.println("podaj rodzaj kostki");
            rodzajKostki = scanner.nextInt();
            kosc = true;
            while (kosc == true) {
                switch (rodzajKostki) {
                    case 4:
                        kosc = false;
                        break;
                    case 6:
                        kosc = false;
                        break;
                    case 8:
                        kosc = false;
                        break;
                    case 10:
                        kosc = false;
                        break;
                    case 12:
                        kosc = false;
                        break;
                    case 20:
                        kosc = false;
                        break;
                    case 100:
                        kosc = false;
                        break;
                    default:
                        System.out.println("nie wybrano kostki, podaj ponownie poprawny rodzaj");
                        rodzajKostki = scanner.nextInt();


                }
            }
            wynikUzytkownika = losowanie.nextInt(rodzajKostki + 1);
            System.out.printf("Twój rzut to: %d\n", wynikUzytkownika);

            wynikKomputera = losowanie.nextInt(rodzajKostki + 1);
            System.out.printf("Rzut komputera to: %d\n", wynikKomputera);

            if (wynikKomputera > wynikUzytkownika) {
                roznica = wynikKomputera - wynikUzytkownika;
                System.out.printf("Tę rundę zwycięża komputer. róznicą %d punktów\n", roznica);
                punktyKomputera++;
            } else if (wynikKomputera == wynikUzytkownika) {
                System.out.println("Remis! Runda bez punktow");
            } else {
                roznica = wynikUzytkownika - wynikKomputera;
                System.out.printf("Tę rundę zwyciężasz!. róznicą %d punktów\n", roznica);
                punktyUzytkownika++;
            }

            System.out.printf("Komputer: %d | Ty: %d\n", punktyKomputera, punktyUzytkownika);


        }

        if (punktyKomputera > punktyUzytkownika) {
            System.out.printf("Wygtywa komputer %d : %d, spróbuj ponownie\n", punktyKomputera, punktyUzytkownika);
        } else if (punktyUzytkownika > punktyKomputera) {
            System.out.printf("Wygrywasz! %d : %d \n", punktyUzytkownika, punktyKomputera);
        } else {
            System.out.printf("Remis %d : %d, sprobój ponownie\n", punktyKomputera, punktyUzytkownika);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kilkni 1 aby zagrać, zaś 0 aby wyłaczyc gre");
        int ponownaGra = scanner.nextInt();
        while (true){
            if(ponownaGra == 1){
                gra();
                System.out.println("kliknij 1 aby zagrać ponownie, zaś 0 aby wyłączyć");
                ponownaGra = scanner.nextInt();

            }else{
                break;
            }

        }

    }
}