package practice_day7;

import java.util.Scanner;

public class P01_ATM {
    /*
    ATM
    Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
    Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
    Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,


    Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme,
    sifre değiştirme ve cikis islemleri olacaktır.


    Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

    Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
    eger değilse menü ekranina geri donsun.

    Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */
    static String kartNo="123456";
    static String sifre="1234";

    static Scanner scan=new Scanner(System.in);
    static double bakiye=5000;


    public static void main(String[] args) {
        giris();
        menu();


    }
    public static void giris(){
        /*
         Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
    Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
    Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
         */

        System.out.println("Kart Numarasi Giriniz: ");

        String kKartNo=scan.nextLine().replace(" ", "");
        System.out.println("Sifrenizi Giriniz: ");

        String kSifre= scan.next();

        if (kKartNo.equals(kartNo) && kSifre.equals(sifre)){
            menu();
        }else {
            System.out.println("Hatali giriş yaptınız... ");
            giris();
        }

        // kullanıcı 3 defadan fazla giriş yaparsa sistemden çıkış yapılsın.
    }
    public static void menu(){
        /*
            Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme,
    sifre değiştirme ve cikis islemleri olacaktır.
         */
        System.out.println("************* NUTELLA ************\n"+
                "1.Bakiye Sorgulama\n" +
                "2. Para Yatırma\n"+
                "3. Para Cekme\n" +
                "4.Para Gönderme\n" +
                "5. Şifre Değiştirme\n" +
                "6. Çıkış\n" +
                "SEÇİM : ");
        int secim= scan.nextInt();
        switch (secim){
            case 1:{
                bakiyeSorgula();
        } case 2:{
                System.out.println("Yatırmak isteirğiniz miktarı giriniz");
                double miktar= scan.nextDouble();

                paraYatirma(miktar);

            }
            case 3:{
                System.out.println("Çekmek istediğiniz miktarı giriniz");
               // double miktar= scan.nextDouble();
                paraCekme(scan.nextDouble());
            }
            case 4: {
                paraGonderme();
            }
            case 5:{
                sifreDegistirme();
            }
            case 6:{
                System.out.println("Bizi Seçtiğiiniz için Teşekkürler...");
                System.exit(0);
            }
            default:
                System.out.println("Yanlış giriş yaptınız...");
                menu();

            }

    }

    public static void sifreDegistirme() {
        // Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
        System.out.println("Mevcut Şifreyi giriniz : ");
        String kSifre= scan.next();
        if (kSifre.equals(sifre)){
            System.out.print("Yeni şifre giriniz: ");
            sifre=scan.next();
            giris();
        }else {
            System.out.println("Sende Kimsin !!!!!");
            sifreDegistirme();
        }

    }

    // kullanıciya 3 hak verelim. doğru şifre girimezse sistemden çıkış yapsın.

    public static void paraGonderme() {
        // Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali,
        //    eger değilse menü ekranina geri donsun.

        System.out.println("Para gönderilecek IBANI giriniz : ");
        String iban= scan.nextLine().toUpperCase().replace(" ", "");
        if (iban.startsWith("TR") && iban.length()==26){
            System.out.print("Gönderilecek miktar giriniz: ");
            double miktar= scan.nextDouble();
            if (miktar<=bakiye){
                bakiye-=miktar;
                bakiyeSorgula();
            }else {
                System.out.println("Bakeyiniz yetersiz...");
                menu();

            }

        }else {
            System.out.println("Hatalı IBAN girdiniz");
            menu();
        }
    }

    private static void paraCekme(double miktar) {
        //Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        if (miktar<=bakiye){
            bakiye-=miktar; // bakiye=bakiye - miktar;
            bakiyeSorgula();
        }else {
            System.out.println("Bakiyeden büyük miktar çekemezsiniz...\n" +
                    "Miktar Giriniz :");
            double yeniMiktar= scan.nextDouble();
            paraYatirma(yeniMiktar);
        }
    }

    public static void paraYatirma(double miktar){
        bakiye+=miktar;  // bakiye = bakiye + miktar;
       bakiyeSorgula();

    }

    public static void bakiyeSorgula() {
        System.out.println("Bakiye : " + bakiye+ " $");
        menu();
    }
}
