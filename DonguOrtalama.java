import java.util.Scanner;

public class DonguOrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Rakam Giriniz: ");
        int rakam = input.nextInt();
        int sum = 0, counter = 0;
        for(int i = 0; i<=rakam; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                sum += i;
                counter += 1;
            }
        }

        double average = sum / (counter);
        System.out.println("Average :" + average);
    }
}
