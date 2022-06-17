import java.util.Scanner;

public class BasamaklarToplami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int usernumber = input.nextInt();

        int divider = 1;
        int result = 0;
        
        while(divider <= usernumber){

            result += (usernumber / divider) % 10;
            divider *= 10;

        }

        System.out.println("Result: " + result);
    }
}
