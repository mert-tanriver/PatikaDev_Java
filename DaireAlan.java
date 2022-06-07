import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14;
        double r = input.nextDouble();
        double aci = input.nextDouble();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);

        double alanliaci = pi * r * r * aci / 360;
        System.out.println("Alanlı : " + alanliaci);

    }
}
