package practive_day02;

import java.util.Scanner;

public class P03_IfStatements {
    public static void main(String[] args) {
         /*
       1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       Ornek:  gun=Pazar output = “Hafta sonu”  gun=Sali output = “Hafta ici”
       *** String icin equals method’unusalı kullanin
        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bugün günlerden hangi gün :");
        String gunAdi=scanner.next().toLowerCase();

        if (gunAdi.equals("Cumartesi") || gunAdi.equals("Pazar")){
            System.out.println("Bu gün Hafta Sonu");

        }
    }
}
