package practice_day06;

import java.util.Scanner;

public class stringManipulation {
    public static void main(String[] args) {
        /*
    Kullanicidan bir cumle alin
    - cumlede ev geciyorsa, "home home sweet home" yazdirin
    - cumlede is geciyorsa, "calismak guzeldir"
    - ikisini de iceriyorsa "Hem ev lazim hem is"
    - hicbirini icermiyorsa "cok calisman lazim" yazdirin.
 */
        Scanner scn=new Scanner(System.in);

        System.out.println("Lütfen bir cümle giriniz :");
        String cumle= scn.nextLine();
        String kucukCumle=cumle.toLowerCase();

        if (kucukCumle.contains("ev") && kucukCumle.contains("is")){
            System.out.println("Hem Ev hem İş lazım");
        } else if (kucukCumle.contains("ev")) {
            System.out.println("home home sweet home");

        }else if (kucukCumle.contains("iş")){
            System.out.println("çalışmak güzeldir");
        }else {
            System.out.println("Çok calşman lazım");
        }

    }
}
