package ArtikYilHesaplama;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        System.out.println("Artik Yil Hesaplama");
        Scanner scanner = new Scanner(System.in);

        int year;
        System.out.println("Bir Yıl Giriniz ");
        year=scanner.nextInt();

        if (year%4==0 && year%100!=0){
            System.out.println(year+" bir Artık yıldır.");
        }
        else if (year%100==0){
            if (year%400==0){
                System.out.println("Artık yıldır ");
            }
            else {
                System.out.println("Artık yıl değildir");
            }
        }
        else {
            System.out.println("Artık yıl değildir. ");
        }




    }
}
