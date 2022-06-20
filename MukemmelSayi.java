import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz : ");
        int sayi = input.nextInt();
        int i = 1;
        int sum = 0;


        while(i < sayi){
            if(sayi%i == 0){
                sum += i;
            }
            i++;
        }

        if(sum == sayi){
            System.out.println(sayi + " Mükemmel sayıdır");
        }
        else{
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}
