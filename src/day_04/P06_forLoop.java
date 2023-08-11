package day_04;

import java.util.Scanner;

public class P06_forLoop {
    /*
    Kullanıcıdan sıfırdan farklı pozitif bin tam sayi alalim ve 1'den o sayiya kadar olan
     sayilardan 4 ile bölünebilenleri yazdirin
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi giriniz");

        int girilenSayi=scanner.nextInt();

        if (girilenSayi<=0){
            System.out.print("Yanliş giriş yaptınız. Lütfen pozitif bir tam sayi giriniz");
        }else{
            for (int i = 1; i <=girilenSayi ; i++) {
                if (girilenSayi%4==0){
                    System.out.print(i +"-");
                }

            }
        }
    }
}
