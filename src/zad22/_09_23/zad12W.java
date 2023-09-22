package zad22._09_23;

public class zad12W {
    public static void main(String[] args) {
        int liczbaMiejsc = 30;
        double suma = 0;
        for(int i = 0; i < 30; i++ ){
            suma += (i+1)/(30-i);

        }
        System.out.println(suma);
    }
}
