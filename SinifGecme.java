import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik, counter = 0;
        double average = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();
        if(mat >= 0 & mat <= 100){
            counter++;
            average += mat;
        }


        System.out.println("Turkce notunuz: ");
        turkce = input.nextInt();
        if(turkce >= 0 & turkce <= 100){
            counter++;
            average += turkce;
        }


        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();
        if(fizik >= 0 & fizik <= 100){
            counter++;
            average += fizik;
        }


        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();
        if(kimya >= 0 & kimya <= 100){
            counter++;
            average += kimya;
        }


        System.out.println("Muzik notunuz: ");
        muzik = input.nextInt();
        if(muzik >= 0 & muzik <= 100){
            counter++;
            average += muzik;
        }

        if (counter != 0) {}
            average /= counter;

        System.out.println("Ort: " + average);

        if(average >= 55){
            System.out.println("Geçtiniz");
        }
        else{
            System.out.println("Kaldınız");
        }
    }
}
