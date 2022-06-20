import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,user,min,max,i=0;

        System.out.println("N sayisini giriniz");
        n = input.nextInt();

        System.out.println("Sayi giriniz : ");
        user = input.nextInt();
        min = user;
        max = user;

        while(i<n-1){
            System.out.println("Sayi giriniz : ");
            user = input.nextInt();

            if(user < min){min = user;}
            else if(user > max){max = user;}
            i++;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
