package DaireAlanCevre;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        System.out.println("Yarıçapı r, merkez açısısının ölçüsü " +
                " olan daire diliminin alanı bulan programı yazınız.");
        double pi =3.14;
        int a ;
        int r;
        Scanner scanner= new Scanner(System.in);
        System.out.println("merkez açı olcusu girin");
        a= scanner.nextInt();
        System.out.println("yarıcapı girin");
        r= scanner.nextInt();

        double daire_dlm_alan;
        daire_dlm_alan=(pi*(r*r)*a)/360;
        System.out.println("daire dilim alanı: "+daire_dlm_alan);




    }
}
