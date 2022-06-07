import java.util.Scanner;


public class Hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double u = (a+b+c)/2;
        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Cevap: " + alan);
    }
}
