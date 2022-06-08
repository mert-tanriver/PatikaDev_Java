import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 0;
        String newPass;

        String username = "Username";
        String password = "Patika";

        System.out.println("Please enter your username: ");
        String inUsername = input.nextLine();
        System.out.println(inUsername);

        System.out.println("Please enter your password");
        String inPass = input.nextLine();
        System.out.println(inPass);

        if(inPass.equals(password)){
            System.out.println("Kullanıcı Şifresi doğrulandı.");
        }
        else if(!(inPass.equals(password))){
            System.out.println("Şifre Hatalı!\nŞifrenizi sıfırlamak ister misin Evet: 1 / Hayır: 2?");
            choice = input.nextInt();

            if(choice == 1){
                System.out.println("Yeni şifreyi giriniz: ");
                input.nextLine();
                newPass = input.nextLine();
                if(newPass.equals(password)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    newPass = input.nextLine();
                }

                else{
                    password = newPass;
                    System.out.println("Şifre oluşturuldu");
                }

            }

            else if (choice == 2) {
                System.out.println("Sisteme giriş başarısızlıkla sonuçlandı.");
            }
        }
    }
}
