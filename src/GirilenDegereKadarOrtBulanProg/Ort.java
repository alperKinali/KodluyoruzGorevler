package GirilenDegereKadarOrtBulanProg;

import java.util.Scanner;

public class Ort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k;
        int ort=0;
        System.out.println("Bir değer girin");
        k=scanner.nextInt();
        for (int i =0;i<=k; i++){
            if ((i%3==0) && (i%4==0) ){
                ort+=i;
            }
        }
        System.out.println("Girilen Sayıya kadar olan seçili sayıalrın ortalaması");

    }
}
