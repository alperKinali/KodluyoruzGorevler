package SinifGecmeDurumu;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        System.out.println("Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.");
        int mat,fizik,turkce,kimya,muzik,
                tplm=0;
        double avarage;


        Scanner scanner= new Scanner(System.in);

        System.out.println("Mat Notunuzu giriniz");
        mat=scanner.nextInt();
        if (mat>0 && mat<100){
            tplm=tplm+mat;
        }

        System.out.println("fizik Notunuzu giriniz");
        fizik=scanner.nextInt();
        if (fizik>0 && fizik<100){
            tplm=tplm+fizik;
        }

        System.out.println("turkce Notunuzu giriniz");
        turkce=scanner.nextInt();
        if (turkce>0 && turkce<100){
            tplm=tplm+turkce;
        }

        System.out.println("kimya Notunuzu giriniz");
        kimya=scanner.nextInt();
        if (kimya>0 && kimya<100){
            tplm=tplm+kimya;
        }

        System.out.println("muzik Notunuzu giriniz");
        muzik=scanner.nextInt();
        if (muzik>0 && muzik<101){
            tplm=tplm+muzik;
        }

        avarage=(tplm)/5;
        if (avarage<=55){
            System.out.println("Sınıfta Kaldınız ");
            System.out.println("Ortalamanız  :"+avarage);
        }
        else {
            System.out.println("Sınıfı Geçtiniz");
            System.out.println("Otalamanız :"+avarage);

        }





    }
}
