
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);


        System.out.print("Kullanıcı Adınız : ");
        username = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();
        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");

            System.out.println("Sıfırlamak ister misiniz ?");
            String answer = input.nextLine();
            if (answer.equals("Yes")) {
                System.out.print("Yeni Şifre Giriniz : ");
                String newPassword = input.nextLine();
                if (password.equals(newPassword))
                {

                    System.out.println("Şifre Oluşturulamadı , lütfen başka şifre giriniz : ");

                }else if(newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı , lütfen başka şifre giriniz... ");


                } else{
                    System.out.println("Şifre oluşturuldu ");
                }
            }

        }
    }
}
