import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ussu hesaplanacak sayi giriniz");
        int sayi = input.nextInt();

        System.out.println("Ust sayisini giriniz: ");
        int ust = input.nextInt();

        int result = 1;

        for(int i=1;i<=ust;i++){
            result *= sayi;
        }

        System.out.println("result: " + result);
    }
}
