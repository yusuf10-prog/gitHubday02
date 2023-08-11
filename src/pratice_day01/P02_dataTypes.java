package pratice_day01;

public class P02_dataTypes {
    public static void main(String[] args) {
        /*
        byte: Sadece tam sayı değer ifade eder. - hafızada 8 bit yer kaplar
        short: Sadece tam sayi değer ifade eder. - hafızada 16 bit yer kaplar
        int : Sadece tam sayi deger ifade eder. - hafızada 32 bit yer kaplar (en çok kullanılan)
        long: Sadece tam sayi değer ifade eder. - hafızada 64 bit yer kaplar

        float: Ondalıklı sayıları ifade eder. (Sonunda f yazmak zorunludur)
        double: Ondulaklı sayıları ifade eder. (sonunda d yazmak zorunlu değil)

        byte<short<int<long<float<double

        boolean : true ya da false
        char : tek tırnak içinde yazılır tek karakter alır - ascii tırnak içine yazılmaz.

         */

        byte b1=Byte.MAX_VALUE;
        byte b2=Byte.MIN_VALUE;

        System.out.println("Byte Max. Değer =" + b1);
        System.out.println("Byte Min Değer = " + b2);

        short s1=Short.MAX_VALUE;
        short s2=Short.MIN_VALUE;

        System.out.println("Short Max. Değer =" + s1);
        System.out.println("Short Min. Değer = " + s2);

        int i1= Integer.MAX_VALUE;
        int i2= Integer.MIN_VALUE;

        System.out.println("i1 : " +i1);
        System.out.println("i2 : " + i2);

        long l1=Integer.MAX_VALUE;
        long l2=Integer.MIN_VALUE;

        System.out.println("L1 = " + l1);
        System.out.println("l2 = " + l2);

        float f1=Float.MAX_VALUE;
        float f2=Float.MIN_VALUE;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        double d1= Double.MAX_VALUE;
        double d2= Double.MIN_VALUE;

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);



        /*
        nonPrimitive data turleri çok fazladır.
        String şu an sadece bilgidiğimiz
        Özellikleri Karakter sınırı yoktur.

         */

        String isim= "Kaan Yakuphanoğullarından";
        char giris='m';
        System.out.println("isim = " + isim);
        System.out.println("giris ="+ giris);

        System.out.println(isim.charAt(3));



    }
}
