package practive_day02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
        *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen aşağıdaki bilgileri giriniz!");
        System.out.print("Adınız : ");

        String name=scan.nextLine();
        // nextLine() yazılan satırdaki bütün yazıyı alır.
        System.out.println(" ");

        System.out.print("Soyadınız :");
        String surname=scan.nextLine();
        System.out.println();

        System.out.print("Yaşınız :");
        int yas=scan.nextInt();
        System.out.println();  // bir alt satıra geçiriyor

        System.out.print("Mail Adresiniz :");
        String mail=scan.next();
        System.out.println();


        System.out.print("Şifreniz :");
        String pass=scan.next();
        System.out.println();
        System.out.println("*****       KAYIT BAŞARILI      *****");

        System.out.println("Adınız :" + name);
        System.out.println("Soyadınız :" +surname);
        System.out.println("Yaşiniz :" +yas);
        System.out.println("Mail adresiniz :" +mail);
        System.out.println("Şifreniz :" +pass);
        System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");




        2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
        üçgenin alanını hesaplayıp yazdırın



        System.out.println("Lütfen alanı hesaplanacak olan üçgenin ilgili ayrıt değerlerini giriniz");
        System.out.println("Üçgenin bir kenarının uzunluğunu giriniz");
        double kenar=scan.nextDouble();
        System.out.println("O kenara ait yüksekliği giriniz : ");
        double yukseklik= scan.nextDouble();
        System.out.println("=============Bilgileri Girilen Üçgenin Alan Hesabı Sonucu ================");
        System.out.println("Ücgenin alanı :" + (kenar*yukseklik)/2);

         3 - Kullanıcıdan iki sayi alıp ücüncü bir değişken kullanmadan sayı değerlerini
         değiştirin (Swap)
         */

        System.out.println("Lütfen iki adet sayı giriniz");
        System.out.println("Birinci sayi:");
        double sayi1=scan.nextDouble();

        System.out.println("İkinci sayi");
        double sayi2=scan.nextDouble();

        System.out.println("Girdiğiniz 1.sayi: " + sayi1+" dir\n" + "Girdiğiniz 2.sayi: " + sayi2 + " dir");
        System.out.println("--------- Hokus Pokus ------------");

        // sayi1 =5 sayi2=3

        sayi1=sayi1+sayi2;  //sayi1=8;
        sayi2=sayi1-sayi2;  //sayi2=5;

        sayi1= sayi1-sayi2;  //  sayi1=3

        System.out.println("Girdiğiğiniz değerler yer değiştirdi\n"+"1.Sayı: " + sayi1+" oldu\n"
                    + "2. Sayi: " + sayi2 + " oldu");
    }
}
