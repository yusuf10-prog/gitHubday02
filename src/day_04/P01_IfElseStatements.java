package day_04;

import java.util.Scanner;

public class P01_IfElseStatements {
    public static void main(String[] args) {
        /*
        soru = Kenar degerleri girilen bir ucgenin dik ucgen olup olmadığını kontrol edip dönüt veren
        kod dizinisini yazinizi.
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Kontrol edilecek ücgenin kenarlarının uzunluklarini giriniz: ");

        System.out.print("Birinci kenarin uzunluğu: ");
        int a=scan.nextInt();

        System.out.println("ikinci kenar uzunluğu : ");
        int b = scan.nextInt();

        System.out.print("Ücüncü kenar uzunluğu: ");
        int c = scan.nextInt();

        System.out.println("========================== 1.Çözüm=============================");

        if ((a*a) + (b*b)==(c*c)){
            System.out.println("Girdiğiniz degerlere sahip ücgen dik ücgendir");
        }else if ((a*a) + (c*c)==(b*b)){
            System.out.println("Girdiğiniz degerere sahip ücgen dik ücgendir");
        }else if ((b*b) + (c*c)==(a*a)){
            System.out.println("Girdiğiniz degerlere sahip ücgen dik ücgendir");
        }else {
            System.out.println("Girdiğiniz degerelere sahip ücgen bir dik ücgen deildir. ");
        }

        System.out.println("============================ 2.Cözüm =========================");

        if ((a*a)+(b*b)==(c*c) || (a*a)+(c*c)==(b*b) || (b*b) + (c*c)==(a*a)){
            // || : OR (VEYA) işareti ile yazılanlardan sadece birinin doğrulanması yeterlidir .

            // && : AND (VE) işareti ile yazılanların tamamı doğru olması gerekir.

            System.out.println("Girdiğiniz degerelere sahip ücgen dik ücgendir.");
        }else {
            System.out.println("Girdiğiniz degerlere sahip ücgen dik ücgen değildir. ");
        }

        // CI - CD : Contunie Integration

    }
}
