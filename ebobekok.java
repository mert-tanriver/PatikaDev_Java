import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {

        int max,i,n1,n2;
        Scanner input= new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();

        int nn1 = n1;
        int nn2 = n2;

        max = n1;
        i = n1;

        if(n2 > max) {
            max = n2;
            i = n2;
        }

        int ekok=1, ebob=1;

        while(i <= max && i > 0){
            if(n1 % i == 0 && n2 % i == 0){
                n1 /= i;
                n2 /= i;
                ebob *= i;
            }
        i--;
        }

        ekok *= nn1 / ebob;
        ekok *= nn2 / ebob;
        ekok *= ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
