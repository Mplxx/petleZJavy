package zad22._09_23;

public class zad14W {
    public static void main(String[] args) {
        int iloscSpacji = 6;


        for(int i = 0; i <= iloscSpacji; i++){
            String space = "";

            for(int j = 0; j < i; j++){
                space += " ";
            }
            System.out.println("#"+space+"#");
        }

    }
}
