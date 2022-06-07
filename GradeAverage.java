import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik;
        matematik = input.nextInt();
        fizik = input.nextInt();
        kimya = input.nextInt();
        turkce = input.nextInt();
        tarih = input.nextInt();
        muzik = input.nextInt();

        double ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6.0;

        System.out.println("Ortalama: " + ortalama);

        String sonuc = (ortalama > 60) ? "Sinifi Gecti" : "Sinifta Kaldi";

        System.out.println("Sonuc: " + sonuc);

    }
}
