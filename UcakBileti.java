import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double result = 0;

        System.out.println("Mesafeyi km türünden giriniz : ");
        double km = input.nextDouble();

        System.out.println("Yasinizi giriniz");
        int yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int tip = input.nextInt();

        if(km < 0 || (tip != 1 && tip != 2) || yas < 0){
            System.out.println("Hatalı Veri Girdiniz !");
        }
        else {
            result = km * 0.1;

            if (tip == 1) {
                if (yas < 12) {
                    result = result / 2;
                } else if (yas > 12 && yas < 24) {
                    result = result * 0.9;
                } else if (yas > 65) {
                    result = result * 0.7;
                }
            }

            else if (tip == 2) {
                result = result * 0.8;
                if (yas < 12) {
                    result = (result / 2)  * 2;
                } else if (yas > 12 && yas < 24) {
                    result = (result * 0.9)  * 2;
                } else if (yas > 65) {
                    result = (result * 0.7) * 2;
                }
            }
            System.out.println("Result : " + result);
        }
        
    }
}
