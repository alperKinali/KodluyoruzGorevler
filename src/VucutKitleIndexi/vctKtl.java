package VucutKitleIndexi;

import java.util.Scanner;

public class vctKtl {
    public static void main(String[] args) {
        System.out.println("Vücut Kitle İndeksi Hesaplama");
        double boy;
        double kilo;
        double vct_ktl_indx;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz");
        boy= scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz ");
        kilo= scanner.nextDouble();

        vct_ktl_indx= kilo /(boy*boy);
        System.out.println("Vücut Kitle İndexi : "+vct_ktl_indx);

    }
}
