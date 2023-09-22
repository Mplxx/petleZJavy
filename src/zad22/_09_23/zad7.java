package zad22._09_23;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczbaPokoi, liczbaPieter, liczbaPokoiZ, liczbaWszystkichPokoi, liczbaWszystkichPokoiZ;
        liczbaWszystkichPokoi = liczbaWszystkichPokoiZ = 0;
        System.out.println("Podaj liczbę pięter:");
        liczbaPieter = scanner.nextInt();
        if(liczbaPieter < 1) {
            System.out.println("error");
            System.exit(0);
        }
        for (int i = 0; i<liczbaPieter; i++){
            System.out.printf("Podaj liczbe wszystkich pokoi na piętrze %d\n", i);
            liczbaPokoi = scanner.nextInt();
            if(liczbaPokoi < 10) {
                System.out.println("error");
                System.exit(0);
            }
            liczbaWszystkichPokoi += liczbaPokoi;
            System.out.printf("Podaj liczbe zajętych pokoi na piętrze %d\n", i);
            liczbaPokoiZ = scanner.nextInt();
            liczbaWszystkichPokoiZ += liczbaPokoiZ;
            if(liczbaPokoiZ > liczbaPokoi){
                System.out.println("error");
                System.exit(0);
            }
        }
        double oblozenie;
        oblozenie = liczbaWszystkichPokoi/liczbaWszystkichPokoiZ;
        System.out.printf("Liczba wszystkich pokoi: %d, Liczba wszystkich pokoi zajętych: %d, obłożenie: %.2f",liczbaWszystkichPokoi, liczbaWszystkichPokoiZ, oblozenie);
    }

}
