import java.util.Scanner;

public class KutleIndexi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz: ");
        double kg = input.nextDouble();

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        double m = input.nextDouble();

        double index= kg/(m*m);
        System.out.println("Vücüt kütle indeksiniz: "+index);


    }
}
