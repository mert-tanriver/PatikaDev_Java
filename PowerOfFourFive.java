import java.util.Scanner;

public class PowerOfFourFive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz : ");
        int sayi = input.nextInt();

        for(int i = 0; i<=sayi; i++) {
            for(int j=0; j<= sayi; j++){
                if(Math.pow(4,j) == i){
                    System.out.println("4'un kati: " + i);
                }
                else if(Math.pow(5,j) == i){
                    System.out.println("5'in kati: " + i);
                }
            }
        }
    }
}
