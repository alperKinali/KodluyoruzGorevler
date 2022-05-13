package KullaniciGirisi;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        System.out.println("Kullanıcı Giris Uygulaması");

        String userName, password, answ,nPasword;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the user Name");
        userName=scanner.nextLine();

        System.out.println("Enter the Pasword");
        password=scanner.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız");

        }
        else {
            System.out.println("Şifreyi Yanlış ");
            System.out.println("Şifreyi Sıfırlamak ister misiniz ?");
            answ=scanner.nextLine();
            if (answ.equals("yes")){
                System.out.println("Yeni bir şifre girin ");
                nPasword=scanner.nextLine();
                if (nPasword.equals(password) || nPasword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı");
                }
                else {
                    System.out.println("Şifre Oluşturuldu");
                    password=nPasword;
                }
            }

        }

    }
}
