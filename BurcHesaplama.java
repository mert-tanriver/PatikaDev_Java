import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dogdunuz ayi giriniz: ");
        int ay = input.nextInt();

        System.out.println("Dogdugunuz gunu giriniz: ");
        int gun = input.nextInt();

        if(ay == 1){
            if(gun >= 22 && gun <= 31){
                System.out.println("Kova");
            }
            else if(gun >= 1 && gun <= 21) {
                System.out.println("Oglak");
            }
        }

        if(ay == 2){
            if(gun >= 20 && gun <= 28){
                System.out.println("Balik");
            }
            else if(gun >= 1 && gun <= 19) {
                System.out.println("Kova");
            }
        }

        if(ay == 3){
            if(gun >= 21 && gun <= 31){
                System.out.println("Koç");
            }
            else if(gun >= 1 && gun <= 20) {
                System.out.println("Balik");
            }
        }

        if(ay == 4){
            if(gun >= 21 && gun <= 30){
                System.out.println("Boga");
            }
            else if(gun >= 1 && gun <= 20) {
                System.out.println("Koc");
            }
        }

        if(ay == 5){
            if(gun >= 22 && gun <= 31){
                System.out.println("İkizler");
            }
            else if(gun >= 1 && gun <= 21) {
                System.out.println("Boga");
            }
        }

        if(ay == 6){
            if(gun >= 23 && gun <= 30){
                System.out.println("Yengec");
            }
            else if(gun >= 1 && gun <= 22) {
                System.out.println("İkizler");
            }
        }

        if(ay == 7){
            if(gun >= 23 && gun <= 31){
                System.out.println("Aslan");
            }
            else if(gun >= 1 && gun <= 22) {
                System.out.println("Yengec");
            }
        }

        if(ay == 8){
            if(gun >= 23 && gun <= 30){
                System.out.println("Basak");
            }
            else if(gun >= 1 && gun <= 20) {
                System.out.println("Aslan");
            }
        }

        if(ay == 9){
            if(gun >= 23 && gun <= 31){
                System.out.println("Terazi");
            }
            else if(gun >= 1 && gun <= 22) {
                System.out.println("Basak");
            }
        }

        if(ay == 10){
            if(gun >= 23 && gun <= 31){
                System.out.println("Akrep");
            }
            else if(gun >= 1 && gun <= 22) {
                System.out.println("Terazi");
            }
        }

        if(ay == 11){
            if(gun >= 22 && gun <= 30){
                System.out.println("Yay");
            }
            else if(gun >= 1 && gun <= 21) {
                System.out.println("Akrep");
            }
        }

        if(ay == 12){
            if(gun >= 22 && gun <= 31){
                System.out.println("Oglak");
            }
            else if(gun >= 1 && gun <= 22) {
                System.out.println("Yay");
            }
        }
    }
}
