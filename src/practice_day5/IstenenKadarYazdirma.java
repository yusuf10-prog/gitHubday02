package practice_day5;

import java.util.Scanner;

public class IstenenKadarYazdirma {
    /*

    Kullanicidan 3 harften uzun bir kelime ve 10'dan kucuk bir sayi alin,
    Kelimenin son 2 harfini girilen sayi kadar yan yana yazdirin

     */

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lütfen bir kelime giriniz");
        String kelime = scan.next();
        System.out.print("Bir rakam giriiz : ");

        int rakam = scan.nextInt();


        String sonIkiHarf = kelime.substring(kelime.length() - 2);
        // son iki harfe kadar olanı böl at

        if (rakam < 9) {
            for (int i = 0; i < rakam; i++) {
                // rakama kadar git rakamdan büyük olduğu sürece gitme
                System.out.print(sonIkiHarf);

            }
        } else {
            System.out.println("Girdiğniz bir rakam degil sayidir. Rakamlar 0,1,2,3,4,5,6,7,8,9 ile sınırlıdır");
        }
    }
}
