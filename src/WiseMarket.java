import java.time.LocalDateTime;
import java.util.Scanner;

public class WiseMarket {
    /*
    Bir market yazilimi yazdığınızı düşünerek aşağıdaki menü ile giriş yapıp, ilgili bölüme yönlendiren
    alışveriş yaptıran ve sepet tutarını hesaplayarak hafızada tutan,
    kasaya gidince fiş yazdıran bir program hazırlayin


  ==================== WISE MARKET KASA PROGRAMI ===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
  1 ŞARKÜTERİ ÜRÜNLERİ
  2 MANAV ÜRÜNLERİ
  3 MARKET
  secime gore ,
  4-urunleri listele ve
  5-fiyatlari gelsin

  Variable'ları belirleyelim.
  urunAdi, urunFiyati, urunMiktari,urunKodu,sepet, toplam
    */
    static Scanner scan = new Scanner(System.in);

    static String urunAdi;
    static double urunFiyati;  // double : ondalıklı sayı için kullanılır.
    static double urunMiktari;
    static int urunKodu;   // int : tam sayi degerleri için kullanılır.
    static String sepet = "";
    static double toplam;
    static boolean ekUrun = false;

    public static void main(String[] args) {
        girisEkrani();


    }

    public static void girisEkrani() {


        System.out.println("===================T120 - WISE MARKET =======================");
        System.out.println("======================== Hoşgeldiniz  =======================");
        System.out.println("==========================  Menü   ==========================");
        System.out.println("    Lütfen Alışveriş Yapmak İstediğiniz Reyonu Seçiniz        ");
        System.out.println(" 1 - Şarküteri \n2 - Manav\n3 - Market\n4 - Fiş Yazdır\n5 - Çıkış");

        int secim = scan.nextInt();
        if (!(secim >= 1 && secim <= 5)) {
            //(secim>=1 && secim<=5)
            System.out.println("Uyarı : Gecersiz bir tuşa bastınız. Tekrar giriniz");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    sakuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisyazdir();
                    break;
                case 5:
                    cikis();
                    break;
            }
        }
    }

    public static void sakuteri() {
        System.out.println("Şarküteri Reyonuna Hoşgeldiniz");
        System.out.println("Lütfen almak istediğiniz ürün numarasını giriniz.\n6-Kaşar Peyniri 130₺\n7-Zeytin 120₺\n8-Sucuk 200₺\n9-Kıyma 350₺\n");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 6 && urunKodu <= 9) {
                System.out.println("Kaç kg alacaksınız?");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 6:
                        urunAdi = "Kaşar Peyniri";
                        urunFiyati = 130;
                        System.out.println(urunMiktari + " kg" + urunAdi + " :" + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 7:
                        urunAdi = "Zeytin";
                        urunFiyati = 120;
                        System.out.println(urunMiktari + " kg" + urunAdi + " :" + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 8:
                        urunAdi = "Sucuk";
                        urunFiyati = 200;
                        System.out.println(urunMiktari + " kg" + urunAdi + " :" + (urunFiyati * urunMiktari) + " ₺");
                        break;
                    case 9:
                        urunAdi = "Kıyma";
                        urunFiyati = 350;
                        System.out.println(urunMiktari + " kg" + urunAdi + " :" + (urunFiyati * urunMiktari) + " ₺");
                        break;
                }
                urunFiyati = urunMiktari * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Oluşan Sepet Tutarı : " + toplam);
                sepet += urunAdi + " :" + urunFiyati + " ₺";
                System.out.println("Başka bir ürün eklemek isterseniz urun kodunu girin.\n Ana Menüye dönmek icin 0 tuşuna basiniz. ");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }

        public static void manav () {
            System.out.println("Manav Reyonuna Hoşgeldiniz");
            System.out.println("Lütfen alacağınız ürün kodunu giriniz:\n71-muz - 60\n72- patates - 25\n73-elma - 49 \n74-soğan -20\n75-domates - 39\n76-Ananans -59 ");
            while (!ekUrun){
                urunKodu=scan.nextInt();
               if (urunKodu>=71 && urunKodu<=76 ){
                   System.out.println("kac kg alacaksiniz?");
                   urunMiktari= scan.nextInt();
                   switch (urunKodu){
                       case 71:
                           urunAdi="Muz";
                           urunFiyati=60;
                           System.out.println(urunMiktari + " kg " + urunAdi + " fiyati :" + urunFiyati*urunMiktari + " TL 'Dir");
                           break;
                       case 72:
                           urunAdi="Patates";
                           urunFiyati=25;
                           System.out.println(urunMiktari + " kg " + urunAdi + " fiyati :" + urunFiyati*urunMiktari + " TL 'Dir");
                           break;
                       case 73:
                           urunAdi="elme";
                           urunFiyati=49;
                           System.out.println(urunMiktari + " kg " + urunAdi + " fiyati :" + urunFiyati*urunMiktari + " TL 'Dir");
                           break;
                       case 74:
                           urunAdi="sogan";
                           urunFiyati=20;
                           System.out.println(urunMiktari + " kg " + urunAdi + " fiyati :" + urunFiyati*urunMiktari + " TL 'Dir");
                       case 75:
                           urunAdi="domates";
                           urunFiyati=39;
                           System.out.println(urunMiktari + " kg " + urunAdi + " fiyati :" + urunFiyati*urunMiktari + " TL 'Dir");
                           break;
                       case 76:
                           urunAdi="Ananas";
                           urunFiyati=59;
                           System.out.println(urunMiktari + " kg " + urunAdi + " fiyati :" + urunFiyati*urunMiktari + " TL 'Dir");
                           break;

                   }
                   urunFiyati=urunFiyati*urunMiktari;
                   toplam+=urunFiyati;
                   System.out.println("Olusan sepet tutari : " + toplam);
                   sepet+=urunAdi + " :" + urunFiyati + " TL \n";
                   System.out.println("Başka ürün almak isterseniz kodunu girniiz .. Ana menüye dönmek için 0 tuşuna basiniz.");
               } else if (urunKodu==0) {
                   girisEkrani();

               }
            }
            girisEkrani();
        }

        public static void market () {
            System.out.println("Market Reyonuna Hoşgeldiniz");
            System.out.println("Lütfen almak istediğiniz ürün kodunu giriniz :\n81- nutella - 103 \n82- ekmek - 8 \n83- Yumurta - 76\n84-yoğurt - 29");
            while (!ekUrun){
                urunKodu=scan.nextInt();
                if (urunKodu>=81 && urunKodu<=84){
                    System.out.println("kac kg/paket alacaksiniz?");
                    urunMiktari= scan.nextInt();
                    switch (urunKodu){
                        case 11:
                            urunAdi="Nutella";
                            urunFiyati=103;
                            System.out.println(urunMiktari + " kg " + urunAdi + " fiyati :" + urunFiyati*urunMiktari + " TL 'Dir");
                            break;
                        case 82:
                            urunAdi="Ekmek";
                            urunFiyati=8;
                            System.out.println(urunMiktari + " kg " + urunAdi + " fiyati :" + urunFiyati*urunMiktari + " TL 'Dir");
                            break;
                        case 83:
                            urunAdi="yumurta";
                            urunFiyati=76;
                            System.out.println(urunMiktari + " kg " + urunAdi + " fiyati :" + urunFiyati*urunMiktari + " TL 'Dir");
                            break;
                        case 84:
                            urunAdi="yoğurt";
                            urunFiyati=29;
                            System.out.println(urunMiktari + " kg " + urunAdi + " fiyati :" + urunFiyati*urunMiktari + " TL 'Dir");
                            break;
                    }
                    urunFiyati=urunMiktari*urunFiyati;
                    toplam+=urunFiyati;
                    System.out.println("Olusan sepet tutarı :" + toplam);
                    sepet+=urunAdi+ " : " + urunFiyati + " TL dir.";
                    System.out.println("Başka ürün almak isterseniz kodunu giriniz . Ana menüye dönmek için 0 tuşuna basiniz.");
                }else if (urunKodu==0){
                    cikis();
                }
            }
            girisEkrani();
        }
        public static void fisyazdir () {

        /*
        Müşteriden ödediği miktari alip sisteme giren ve verdiği para yeterli ise para üstünü yazdiran,
        yeterli değilse verdiğiniz miktar yeterli değildir diye uyararak kodu ekleyiniz. 
         */
            System.out.println("===================T120 - WISE MARKET =======================");
            System.out.println("======================== Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz  =======================");
            System.out.println("----------------     Alışveriş Bilgileriniz    ----------------------");
            System.out.println(" \n \n");
            System.out.println("Alişveriş Listeniz\n" + sepet);
            System.out.println("");
            System.out.println("Toplam Tutar: " +toplam);
            System.out.println(" \n \n");
            System.out.println("----------------     İyi Günler Dileriz   ----------------------");
            LocalDateTime saat=LocalDateTime.now();
            System.out.println(saat);
            System.out.println("Ana menüye dönmek icin 0 tuşuna basınız. Çıkış yapmak icin 5 tuşuna basiniz.");
            if (urunKodu==0){
                girisEkrani();
            }else if (urunKodu==5){
                cikis();
            }
           // cikis();

        }

        public static void cikis () {
            System.out.println("Çıkış Ekrani");
           // scan.close();
           // girisEkrani();

        }
    }



