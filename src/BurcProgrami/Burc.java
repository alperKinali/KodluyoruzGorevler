package BurcProgrami;

import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        System.out.println("Burç Bulan Program");

        Scanner scanner= new Scanner(System.in);
        int month,day;
        String burc="";
        boolean isEror=false;

        System.out.println("Doğduğunuz ayı girin ");
        month=scanner.nextInt();

        System.out.println("Doğdunuz günü girin");
        day=scanner.nextInt();

        if (month==1){
            if (day>=1 && day<=31){
                if (day<22){
                    burc="oğlak";
                }else {
                    burc="kova";
                }
            }
            else if (day>=1 && day<=28){
                if (day<20){
                    burc="Kova";
                }
                else {
                    burc="Balık";
                }
            }
           // bu şekilde gider
            else {
                isEror=true;
            }


        }





    }
}
