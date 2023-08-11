package practice_day5;

public class UcgenHarfTablosu {
    /*
    A
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F

    şeklini yazdiriniz. 65=A 'nin asci değeri
     */
    public static void main(String[] args) {
        int harf=97;


        for (int satir = 0; satir <10 ; satir++) { // Satir sayisini belirledik 0-10
            for (int sutun = 0; sutun <=satir ; sutun++) { // satir sayisinca sütun olmasını belirledik
                System.out.print((char)(harf+sutun) + " ");
            }
            System.out.println();
        }
    }
}
