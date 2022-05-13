package HesapMakinasi;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("switch-case ile hesap makinası yapımı Hesap Makinası Yapımı");
        int n1,n2,select;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        n1=scanner.nextInt();
        System.out.println("Enter the second number :");
        n2=scanner.nextInt();


        System.out.println("1-addition\n2-subtraction \n3-multiplication\n4-division ");
        System.out.println("Enter a value");
        select=scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("addition.: "+(n1+n2));
                break;
            case 2:
                System.out.println("subtraction : "+(n1-n2));
                break;
            case 3:
                System.out.println("multiplication :"+(n1*n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("divide by zero error");
                        break;
                }
            default:
                System.out.println("please enter a correct value");

        }





    }
}
