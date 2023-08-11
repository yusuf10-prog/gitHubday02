package practive_day02;

import java.util.Scanner;

public class nextLineAtlamaSorunuCozumu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adınızı Soyadınızı :");
        String name=scanner.nextLine();

        System.out.println("Yaşınız :");
        int age=scanner.nextInt();

        // scanner.nextInt() ile değer aldıktan sonra scanner.nextLine(); ile deger istenirse sorun çıkıyor.
        // Atlama prolemi oluşuyorsa
        // Sorunu çözmek için aşağıdaki scanner.nextLine(); satir ekleniyor. Bu satirsonu arabellekte kalan karakteri kullanalım
        // alttaki satiri yorumu alarak çalıştırıp sorunu görebilirsiniz.

        scanner.nextLine();

        System.out.println("Mesleğiniz Nedir :");
        String job=scanner.nextLine();
        System.out.println("Güzel bir meslek :" + job);
    }
}
