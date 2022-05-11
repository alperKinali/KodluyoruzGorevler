package DikUcgenHipoBulma;

import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k1,k2,k3;
        double u;
        double aln;
        // Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        System.out.println("Birinci kenar uzunluğunu giriniz");
        k1=scanner.nextInt();
        System.out.println("ikinci kenar uzunluğunu giriniz");
        k2=scanner.nextInt();
        System.out.println("ucuncu kenar uzunluğunu giriniz");
        k3=scanner.nextInt();
        u=(k1+k2+k3)/2;
        aln  = Math.sqrt((u*(u-k1)*(u-k2)*(u-k3)));
        System.out.println("Alan :"+aln);








    }
}
