import java.util.Scanner;

public class KDVCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("KDV'siz fiyatı giriniz");
        float KDVsiz;
        KDVsiz = input.nextFloat();
        boolean kdvOran = (KDVsiz < 1000);
        System.out.println("KDVOran: " + kdvOran);
        float KDVOran2 = (KDVsiz < 1000) ? 0.18f * KDVsiz + KDVsiz : 0.08f * KDVsiz + KDVsiz;
        System.out.println("KDV2Oran : " + KDVOran2);
        float KDVli = KDVOran2 * KDVsiz + KDVsiz;
        System.out.println("KDV'li fiyat: " + KDVOran2);
        System.out.println("KDV tutarı: " + (KDVsiz * 0.18f));

    }

}
