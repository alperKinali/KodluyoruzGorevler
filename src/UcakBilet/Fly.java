package UcakBilet;

import java.util.Scanner;

public class Fly {
    public static void main(String[] args) {
        System.out.println("Uçak Bileti Fiyatı Hesaplayan Program\n");
        int mesafe,yas,select;
        double perKm=0.10;
        double biletFiyat=0.0;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Mesafei giriniz");
        mesafe=scanner.nextInt();

        System.out.println("yas giriniz");
        yas=scanner.nextInt();

        System.out.println("yolcu tipini  giriniz");
        select=scanner.nextInt();

        if (mesafe<0 ||yas<0 ){
            System.out.println("Değerler yanlış");
        }
        else {
            biletFiyat=mesafe*perKm;
           if (yas<12){
               biletFiyat=biletFiyat-(biletFiyat*0.5);

           }else if (yas>12 && yas<24){
               biletFiyat=biletFiyat-(biletFiyat*0.1);

           }
           else if (yas>65){
               biletFiyat=biletFiyat-(biletFiyat*0.3);

           }
           if (select==1){
               System.out.println("bilet fiyat :"+biletFiyat);


           }
           else  if (select==2){
               biletFiyat=biletFiyat-(biletFiyat*0.2);
               biletFiyat=biletFiyat*2;
               System.out.println("biet iayt :"+biletFiyat);
           }

        }
       // System.out.println("Toplam tutar  :"+biletFiyat);




    }
}
