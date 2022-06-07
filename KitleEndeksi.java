import java.util.Scanner;

public class KitleEndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");

        float boy = input.nextFloat();

        System.out.println("Lütfen kilonuzu giriniz: ");

        float kilo = input.nextFloat();

        float endeks = kilo / (boy * boy);

        System.out.println("Vücut Kitle Endeksiniz : " + endeks);



    }
}
