package practice_day5;

public class PalindromicSayi {
    public static void main(String[] args) {
        /*
        Polindromik sayi her iki tarafından da okunduğunda aynı değeri ifade eden sayıdır.
        ÖRN= 9009, 12321,  121

         */

        // 3 Basamaklı sayıların çarpımıyla olusan en büyük palindromik sayiyi bulan kodu yaziniz.

        int bas1=1;
        int bas2=1;
        int bas3=1;

        for (int i = 1000; i >100 ; i--) {
            for (int j = 1000; j >i ; j--) {

            }

        }
    }
    public static boolean checkpalindromic(int i){
        boolean result=false;
        int sayi=i;
        int digit1=sayi%10;
        sayi/=10;
        int digit2=sayi%10;
        sayi/=10;
        int digit3=sayi%10;
        sayi/=10;
        int digit4=sayi%10;
        sayi/=10;
        int digit5=sayi%10;
        sayi/=10;
        int digit6=sayi%10;
        sayi/=10;
        int digit7=sayi;

        if (i<=100000){
            if (digit1==digit6 && digit2==digit5 && digit3==digit4){
                result = true;

            }else {
               if (digit1==digit6 && digit2==digit5 && digit3==digit5){
                   result=true;

               }
            }
        }
        return result;
    }
}
