import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        double result = 0;
        int i;
        double x;

        for(i=1; i<=sayi;i++){
            result += 1.0/i;
        }

        System.out.println("Result: " + result);

    }
}
