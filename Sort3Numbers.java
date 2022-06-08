import java.util.Scanner;

public class MiniSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp;

        System.out.println("3 sayı giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();


        if(a>b && a>c){
            if(b>c){
                System.out.println(c + "<" + b + "<" + a);
            }
            if(c>b){
                System.out.println(b + "<" + c + "<" + a);
            }
        }
        else if (b > a && b > c) {
            if(a>c){
                System.out.println(c + "<" + a + "<" + b);
            }
            if(c>a){
                System.out.println(a + "<" + c + "<" + b);
            }

        }
        else if (c > a && c > b) {
            if(a>b){
                System.out.println(b + "<" + a + "<" + c);
            }
            if(b>a){
                System.out.println(a + "<" + b + "<" + c);
            }

        }

    }
}
