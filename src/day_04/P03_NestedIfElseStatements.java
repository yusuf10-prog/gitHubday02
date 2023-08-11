package day_04;

import java.util.Scanner;

public class P03_NestedIfElseStatements {
    public static void main(String[] args) {
        // Kenar degerleri verilen ücgenin ikiz kenar ucgen olup olmadıgını kontrol edip,
        // dönüs veren kod dizisini yazınız


        Scanner scanner=new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz üçgenin kenar degerlerini giriniz");

        System.out.println("Kenar -1 :");
        double kenar1=scanner.nextDouble();

        System.out.println("Kenar-2 :");
        double kenar2=scanner.nextDouble();

        System.out.println("Kenar-3 : ");
        double kenar3=scanner.nextDouble();

        if (kenar1 >0 && kenar2 >0 && kenar3 >0){
            if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){
                System.out.println("Girdiğiniz değerler bir ikizkenar ücgene aittir");
            }else {
                System.out.println("Girdiğiniz degerelere sahip ücgen bir ikizkenar üçgen değildir");
            }
        }else {
            System.out.println("Yanlış değer giridiniz");
        }

    }
}
