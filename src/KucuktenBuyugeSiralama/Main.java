package KucuktenBuyugeSiralama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Girilen 3 sayıyı \"küçükten büyüğe\" sıralayan programı yazınız.");

        Scanner scanner= new Scanner(System.in);
        int a,b,c;
        System.out.println("1. sayı giriniz ");
        a=scanner.nextInt();

        System.out.println("2. sayı giriniz ");
        b=scanner.nextInt();

        System.out.println("3. sayı giriniz ");
        c=scanner.nextInt();

        if((a<b)&& a<c){
            if (b<c){
                System.out.println("a<b<c");
            }
            else {
                System.out.println("a<c<b");
            }
        }else if ((b<a)&&(b<c)){
            if (a<c){
                System.out.println("b<a<c");
            }
            else {
                System.out.println("b<c<a");
            }
        }else if ((c<a)&& (c<b)){
            if (a<b){
                System.out.println("c<a<b");
            }else {
                System.out.println("c<b<a");
            }
        }




    }
}
