import java.util.Scanner;

public class SicaklikEtkinlik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hava sicakligini giriniz: ");
        double heat = input.nextDouble();

        String kayak = (heat < 5) ? "Kayak etkinligi önerildi" : "";
        System.out.println(kayak);

        String sinema = (heat >= 5 && heat < 15) ? "Sinema etkinligi önerildi" : "";
        System.out.println(sinema);

        String piknik = (heat >= 15 && heat < 25) ? "Piknik etkinligi önerildi" : "";
        System.out.println(piknik);

        String yuzme = (heat >= 25) ? "Yüzme etkinligi önerildi" : "";
        System.out.println(yuzme);
    }
}
