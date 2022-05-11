package ManavKasa;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        System.out.println("Manav Kasa Programı");

         double armut_fyt=2.14;
         double elma_fyt =3.67;
         double domates_fyt=1.11;
         double muz_fyt=0.95;
         double patlican_fyt=5.00;

         double armut_kg,elma_kg,domates_kg, muz_kg,patlican_kg;

         double total;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Armuttan Kaç Kilo alındı ");
        armut_kg=scanner.nextDouble();

        System.out.println("Elmadan Kaç Kilo alındı ");
        elma_kg=scanner.nextDouble();

        System.out.println("Domatesden  Kaç Kilo alındı ");
        domates_kg=scanner.nextDouble();

        System.out.println("muzdan  Kaç Kilo alındı ");
        muz_kg=scanner.nextDouble();

        System.out.println("patlican  Kaç Kilo alındı ");
        patlican_kg=scanner.nextDouble();

        total=(armut_fyt*armut_kg)+(elma_fyt*elma_kg)+(domates_fyt*domates_kg)+(muz_fyt*muz_kg)+(patlican_fyt*patlican_kg);
        System.out.println("Toplam fiyat : "+total);





    }
}
