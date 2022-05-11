package KDVTutarıHesaplayanKod;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        System.out.println("Kdv Hesabı");
        double  tutar, kdv_orn1=0.18, kdv_orn2=0.8;
        System.out.println("KDV hesaplanacak tutarı giriniz");
        Scanner scanner = new Scanner(System.in);
        tutar=scanner.nextDouble();
        if (tutar>0&& tutar<=1000){
            System.out.println("KDV Tutarı :"+(tutar*kdv_orn1));
            System.out.println("KDV'siz fiyat : "+tutar);
             double y_tutar=(tutar*kdv_orn1)+tutar;
            System.out.println("Kdv'li fiyat : "+y_tutar);
        }
        else if (tutar>1000){
            System.out.println("KDV Tutarı :"+(tutar*kdv_orn2));
            System.out.println("KDV'siz fiyat : "+tutar);
            double y_tutar=(tutar*kdv_orn2)+tutar;
            System.out.println("Kdv'li fiyat : "+y_tutar);
        }
        System.out.println("Program bitti");
    }
}
