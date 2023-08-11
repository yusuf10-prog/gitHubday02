package practice_day5;

import java.util.Scanner;

public class EkokEbob {
    // Kullanıcıdan 2 tamsayi alin ve EBOB (En Büyük Ortak Bölen) ve (En küçük Ortak Kat) degerlerini bulun

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen pozitif iki tamsayi giriniz ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();


        int flag = 0;

        System.out.println("Girdiğiniz sayilar sırasiya : " + num1 + " - " + num2);

        // onca EBOB hesaplaması yapalım.
        // ilk olarak küçük sayıyı ebob değişkenine atıyoruz.
        // 30 ve 40 iin ebob'u ilk olarak 30 atadık

        int limitEbob = 0;

        if (num1 < num2) {
            limitEbob = num1;
        } else {
            limitEbob = num2;
        }

        // Atanan LimitEbob degerini birer azaltarak en büyük ortak böleni buluyoruz.
        // 30 degerinden baslayip 1'er azaltarak ikisini de bölebilecek en büyük sayiyi ariyoruz.


        for (int i = limitEbob; i >= 2; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("Bu sayiların EBOB degeri :" + i);
                flag++;
                break;
            }
        }

        // flag degerinin hiç artmaması ortak bölen bulamadığı anlamına gelir.


        if (flag == 0) {
            System.out.println("Bu iki sayının ortak boleni yoktur");
        }

        // Girilen sayiların Ekok degerini bulalım
        flag=0;
        // for loop yazarken 1'den başlayip bir limit koyarak i degerini 1 'er arttirarak ilerleyeceğiz.

        System.out.println("Lütfen Ekok degeri olabilecek maksimum limiti giriniz ");
        //int limit=scan.nextInt();

        for (int i = 1; i <(num1*num2) ; i++) {
            if (i%num1==0 && i%num2==0){
                System.out.println("Girdiğiniz sayıların Ekok değeri : " + i);
                flag++;
                break;
            }

        }
        if (flag==0){
            System.out.println("Girdiğiniz sayıların belirttiğiniz limit degerinden 10000'den küçük bir ekok değeri yoktur");
        }

    }
}
