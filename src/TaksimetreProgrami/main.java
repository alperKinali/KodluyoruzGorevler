package TaksimetreProgrami;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int km;
        double per_km = 2.20;
        double odencek_trt;
        double baslangıc_trt;
        Scanner scanner = new Scanner(System.in);
        km=scanner.nextInt();

        odencek_trt=(km*per_km);
        odencek_trt+=10;
        if (odencek_trt<20){
            odencek_trt=20;
        }

        System.out.println("Odenecek Toplam Tutar :"+odencek_trt);




    }
}
