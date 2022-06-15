import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sene giriniz");
        int sene = input.nextInt();

        if(sene % 100 != 0){
            if(sene % 4 == 0){
                System.out.println(sene + " bir artik yildir !");
            }
            else{
                System.out.println(sene + " bir artik yil degildir !");
            }
        }
        else{
            if(sene % 400 == 0){
                System.out.println(sene + " bir artik yildir !");
            }
            else {
                System.out.println(sene + " bir artik yil degildir !");
            }
        }
    }
}
