package HavaSicaklikEtkinlik;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        System.out.println("Hava Sıcaklığına Göre Etkinlik Önerme");

        //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        //Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        int heat;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Sıcaklık Değrini giriniz ");
        heat=scanner.nextInt();
        if (heat<5){
            System.out.println("Kayak Yapabilirsin");
        }
        else  if (heat>=5 && heat<15){
            System.out.println("Sinamay gidebilirsin");
        }
        else if (heat>10 && heat<25){
            System.out.println("Piknike gidebilris");
        }
        else{
            System.out.println("Yüzme Yapabilirsin");
        }

    }
}
