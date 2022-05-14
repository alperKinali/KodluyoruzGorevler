package CinZodyagi;

import java.util.Scanner;

public class Zodyac {
    public static void main(String[] args) {
        System.out.println("Çin Zodyağı Hesaplayan Program\n");

        int Dyil;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz");
        Dyil = scanner.nextInt();

        if (Dyil%12==0){
            System.out.println("Maymun");
        }
        else if (Dyil%12==1){
            System.out.println("Horoz");
        }
        else  if (Dyil%12==2){
            System.out.println("Köpek");
        }
        else if (Dyil%12==3){
            System.out.println("Domuz");
        }
        else if (Dyil%12==4){
            System.out.println("Fare");
        }
        else if (Dyil%12==5){
            System.out.println("Öküz");
        }
        else if (Dyil%12==6){
            System.out.println("Kaplan");
        }
        else if (Dyil%12==7){
            System.out.println("Tavşan");
        }
        else if (Dyil%12==8){
            System.out.println("Ejderha");
        }
        else if (Dyil%12==9){
            System.out.println("Yılan");
        }
        else if (Dyil%12==10){
            System.out.println("At");
        }
        else if (Dyil%12==11){
            System.out.println("Koyun");
        }



    }
}
