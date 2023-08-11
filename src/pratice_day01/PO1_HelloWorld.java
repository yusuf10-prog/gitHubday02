package pratice_day01;

public class PO1_HelloWorld {
    public static void main(String[] args) {

        System.out.println("Merhaba Java");

        System.out.println("Hello World"); // print foksiyonu verilen string ifadeyi yazdırıp bir alt satıra geçer
        System.out.print("Yazdırma foksiyonu-"); // print fonksiyonu verilen string ifadeyi yazdırır ve alt satıra geçmez.
        System.out.println("merhaba");


        //  Bu işaret tek satırlık yorum için kullanılır.

        /*
            Birde fazla satırlık yorum yazmak gerekirse
            bu şekilde kullanım yapılmalıdır
         */

        // soru -1: Konsola "Hello Java Ben Geldim" yazdırınız.


        System.out.println("\" Hello Java Ben Geldim\"");

        /*
        \"          : Çift tırnak işareti yazdırır.
        \'          : Tek tırnak işareti yazdırır.
        \n          : Kendinden sonra gelen metni bir alt satırdan başlatır.
        \t          : Kendinden sonra bir TAB boşluk bırakır.

         */

        System.out.println("\'Hello Wise\'");
        System.out.println();
        System.out.println("Hello Wise\nHave a nice day!");
        System.out.println("Hello Java\rSen neymişsin be abi!");
        System.out.println();
        System.out.println("Hello Wise\t\t\t\tHello Future");

        System.err.println("Babayiğit hoca");

        /*Soru -2 : Konosala
        Değer atayarak
        Ramazan TANHAN - Software Development Enginer İn TEST
         */

        /*
        Javada variable dediğimiz değişkenlerler kullanılır.
        Primive - Non Primitive
         */

        String name = "Ömer";
        String surname="Yiğit";

        String job =" Software Development Enginer in Test";
        System.out.println(name +" " +surname+ " - " +job);

        /*
        ÖDEV SORUSU : Aşağıdaki gibi bir ATM Karşılama Ekranı Hazırlayıp yazdırınız.
        **********  WISE BANK   **********
    WISE ATM'YE HOŞGELDİNİZ
    1 – Bakiye Sorgulama
    2 – Para Yatırma
    3 – Para Çekme
    4 – Bilgi Güncelleme
    5 – Kart İade
**********  WISE BANK   **********
         */

        // SDLC - Software Development Life Cycle (Yazılım Geliştirme Yaşam Döngüsü)
        // STLC - Software Test Life Cycle (Yazılım Test Yaşam Döngüsü)

        // Ekranda bir bölümün fotosunu almak
        // Windos : Win+shift+S
        // Mac    : Cmd+Shift+4

        System.out.println("**********  WISE BANK   **********");
        System.out.println("1 – Bakiye Sorgulama");
        System.out.println("2 – Para Yatırma");
        System.out.println("3 – Para Çekme");
        System.out.println("4 – Bilgi Güncelleme");
        System.out.println("5 – Kart İade");
        System.out.println("**********  WISE BANK   **********");
    }
}
