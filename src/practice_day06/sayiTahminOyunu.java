package practice_day06;

import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {
    /*
     /*
    Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
    Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
    bilince de tebrik edip durduran bir kod yazalim
 */
    public static void main(String[] args) {
        // int sayi=138;

        Random random=new Random();
        int sayi=(int) Math.random();

        System.out.println("Aklimdan bir sayi tutum. Hadi tahmin Et!");

        Scanner scanner=new Scanner(System.in);

        boolean dogruMu=false;

        while (!dogruMu){
            int tahmin=scanner.nextInt();

            if (tahmin>sayi){
                System.out.println("Çok söyledin. Düşür");
            } else if (tahmin<sayi) {
                System.out.println("Az söyledin. Arttir");

            }else if (tahmin==sayi){
                System.out.println("Tebrikler Bildiniz");
                dogruMu=true;
            }else {
                dogruMu=false;

            }
        }
    }
}
