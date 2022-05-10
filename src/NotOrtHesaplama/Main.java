package NotOrtHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("deneme son hal ");
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuzu giriniz");
        mat=inp.nextInt();

        System.out.println("Fizik Notunuzu giriniz");
        fizik=inp.nextInt();

        System.out.println("Kimya notunuzu giriniz");
        kimya=inp.nextInt();

        System.out.println("turkce Notunuzu giriniz");
        turkce=inp.nextInt();

        System.out.println("Tarih Notunuzu giriniz");
        tarih =inp.nextInt();

        System.out.println("Muzik Notunuzu giriniz");
        muzik=inp.nextInt();

        double tplm=(mat+fizik+kimya+turkce+tarih+muzik);
        double ort=tplm/6.0;

        if (ort>=60){
            System.out.println("Sınıfı Geçti");
        }
        else{
            System.out.println("Sınıfta kaldı.");
        }


    }
}
