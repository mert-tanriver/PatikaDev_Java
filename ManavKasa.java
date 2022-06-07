import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? : ");
        float armut = input.nextFloat();

        System.out.println("Elma Kaç Kilo");
        float elma = input.nextFloat();

        System.out.println("DomatesKaç Kilo");
        float domates = input.nextFloat();

        System.out.println("Muz Kaç Kilo");
        float muz = input.nextFloat();

        System.out.println("Patlıcan Kaç Kilo");
        float patlıcan = input.nextFloat();

        float toplam = (armut * 2.14f) + (elma * 3.67f) + (domates * 1.11f) + (muz * 0.95f) + (patlıcan * 5.0f);

        System.out.println("Toplam Tutar : " + toplam);


    }
}
