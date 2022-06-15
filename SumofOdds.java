import java.util.Scanner;

public class SumOfOdds {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sayi girin");
        int number = input.nextInt();
        int sum = 0;
        
        while(number % 2 == 0){

            if(number % 4 == 0){
                sum += number;
            }
            System.out.println("Sayi girin");
            number = input.nextInt();
        }

        System.out.println("Toplam : " + sum);

    }
}
