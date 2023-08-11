package day_04;

import java.util.Scanner;

public class P02_TernaryOperators {
    public static void main(String[] args) {
        // Kenar degerleri verilen ücgenin ikiz kenar ucgen olup olmadıgını kontrol edip,
        // dönüs veren kod dizisini yazınız


        Scanner scanner=new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz üçgenin kenar degerlerini giriniz");

        System.out.print("Kenar -1 :");
        double kenar1=scanner.nextDouble();

        System.out.print("Kenar-2 :");
        double kenar2=scanner.nextDouble();

        System.out.print("Kenar-3 : ");
        double kenar3=scanner.nextDouble();


        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 ? (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3?
                "Girdiğiniz değerler bir ikizkenar üçgene aittir": "girdiğiniz değer ikiz kenar ücgen değildir" ) :
                "yanlış değer girdiniz");
    }
}
