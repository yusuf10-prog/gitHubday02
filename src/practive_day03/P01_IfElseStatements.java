package practive_day03;

import java.util.Scanner;

public class P01_IfElseStatements {
    public static void main(String[] args) {
        /*
         Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
         istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
      "istediginiz birim sisteme kayitli degil" yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        /*

        System.out.print("Lütfen mesafeyi kilemtre cinsinden yazınız");

        double km=scanner.nextDouble();

        System.out.print("Dönüştürmek istediğiniz birim cinsini yazınız :");

        char birim=scanner.next().charAt(0);
        // kullanıcıdan ilk harfi alıyoruz

        if (birim=='m' || birim=='M'){
            System.out.println("Km olaark yazdığınız değerin karşılığı :" + km*1000+ " m'dir");

        }else if (birim=='s' || birim=='S' || birim=='C' || birim=='c'){
            System.out.println("Km olarak yazdığınız değerin karşılığı " + km*100000+"cm'dir");
        }else if (birim =='d' || birim=='D') {
            System.out.println("Km olarak yazdığınız değerin karşılığı " + km * 10000 + " dm'dir");
        }

        else {
            System.out.println("Girdiğiniz birim sistemimizde bulunmamaktadır.");
        }

        /*
        Not: Birden fazla if, else if, else durumlarında en son adıma bakılır.
        else ile bitiriyorsa if else bloğu tüm ihtimalleri kapsamalıdır.

        else ile bitiyorsa kapsanmayan ihtimaller de vardır

         */


        /*
        1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
    85-100 -----> AA
    80-85 ------> BA
    75-80 ------> BB
    65-75 ------> CB
    50-65 ------> CC
    50 Altı ise  ------> FF
     */
        System.out.println("Lütfen sayisal olarak notunuzu giriniz :");
        double not=scanner.nextDouble();

        if (not>100){
            System.out.println("Notunuz 100' den fazla olamaz. Bu nedenle harf karşılığı yoktur");
        }

        if (not >= 85.0 && not<=100.0){
            System.out.println("Girdiğiniz " + not+ " un harf karşılığı AA 'dır");
        }else if (not >=80.0 && not<85.0){
            System.out.println("Girdiğiniz " + not+ " un harf karşılığı BA 'dır");
        }else if (not>=75 && not<80){
            System.out.println("Girdiğiniz " + not+ " un harf karşılığı BB 'dır");
        }else if (not >=65 && not<75){
            System.out.println("Girdiğiniz " + not+ " un harf karşılığı CB 'dır");
        }else if (not >=50 && not<65){
            System.out.println("Girdiğiniz " + not+ " un harf karşılığı CC 'dır");
        }else{
            System.out.println("Girdiğiniz " + not+ " un harf karşılığı FF 'dır");
        }
    }
}
