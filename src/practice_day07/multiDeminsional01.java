package practice_day07;

public class multiDeminsional01 {
    /*
    Bir okulun öğrencilerinin matematik sınav notlarını saklamak icin
    bir program yapmanız gerekmektedir. Her öğrenci için
    iki dönemlik (örneğin, ilk ve ikinci dönem) sınav notlarını saklamak icin
    kullanmanız gerekmektedir. Öğrencilere ait notları ve yıl ortalamasını hesaplayan
    Java programini yaziniz:

     */

    // MultiDimensional Array : İç içe array arr={{5.sınıf Öğrencileri},{6.sınıf öğrencileri}}
    // arr={{{5A}, {5B}, {5C}}{{6A}, {6B}}}
    // [][] : çoklu array tanımlamasıdır. her array için bir [] kullanılır.
    public static void main(String[] args) {
        // Sınav notlari icin her bir öğrenci için her bir dönem notunu ekleyeceğimiz iç içe 2'li
        // array olusturalim

        int [][] sinavNotlari={
                {80,100}, // Birinci öğrencinin dönem notları
                {75,90}, // İkinci öğrencinin dönem notlari
                {100,100}, // Üçüncü öğrencinin dönem notlari
                {60,60}, // Dördüncü öğrencinin dönem notlari
                {30,90} // Beşinci öğrencinin dönem notlari
        };
        for (int i = 0; i < sinavNotlari.length ; i++) {
            int ilkDonemNotu=sinavNotlari[i][0];
            int ikinciDonemNotu=sinavNotlari[i][1];
            System.out.println((i+1) + " . Öğrencinin notlari");
            //index 0 'dan başladığı için index'i sıfır olan öğrenci 1.öğrencidir.
            // 28. satırda iç içe array'lari çağırıyoruz

            // {{0,1,2,3,4} , {0,1,2,3}, {0,1}}

            System.out.println("Birinci Dönem Notu:" + ilkDonemNotu);
            System.out.println("İkinci Dönem Notu:" + ikinciDonemNotu);

            // Yılsonu notunu hesaplamak için iki notun ortalamasi alinir.
            double yilSonuNotu=(ikinciDonemNotu+ilkDonemNotu)/2.0;
            System.out.println("Yıl Sonu Ortalaması:" + yilSonuNotu);
            System.out.println("------------------------------------------");

        }
    }
}
