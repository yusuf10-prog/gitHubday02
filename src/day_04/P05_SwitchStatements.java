package day_04;

import java.util.Scanner;

public class P05_SwitchStatements {
    public static void main(String[] args) {
        // Kullanıcıdan o günün hangi gün olduğunu girmesini isteyip,
        //Haftanın kaçıncı günü olduğunu yazdırın.

        System.out.println("Bugün günlerden hangi gün ");
        Scanner scanner=new Scanner(System.in);

        String gun=scanner.next();
        gun=gun.toLowerCase();

        switch (gun){
            case "pazartesi" :  // switch case durumunda eger case sayi ise direk yazılır.
                // case metin ise " " arasında yazılır
                System.out.println(gun + " Haftanın 1.günüdür");
                break;
            case "sali":
                System.out.println(gun + " Haftanın 2.günüdür");
                break;
            case "çarşamba":
                System.out.println(gun + " Haftanın 3.günüdür");
                break;
            case "perşembe":
                System.out.println(gun + " Haftanın 4.günüdür");
                break;
            case "cuma":
                System.out.println(gun + " Haftanın 5.günüdür");
                break;
            case "cumartesi":
                System.out.println(gun + " Haftanın 6.günüdür");
                break;
            case "pazar":
                    System.out.println(gun+ " Haftanın 7.günüdür");
                    break;

        }
    }
}
