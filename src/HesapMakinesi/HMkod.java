package HesapMakinesi;
import java.util.Scanner;
public class HMkod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2, select, bKural;

        System.out.print("Lütfen 1. sayıyı giriniz : ");
        n1 = sc.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz : ");
        n2 = sc.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = sc.nextInt();

        System.out.println("Seçilen işlem : " + select);

        switch (select){
            case 1:
                System.out.println("İşleminizin sonucu = " + (n1 + n2 ));
                break;
            case 2:
                System.out.println("İşleminizin sonucu = " + (n1 - n2));
                break;
            case 3:
                System.out.println("İşleminizin sonucu = " + (n1 * n2));
                break;
            case 4:
                bKural = n1 * n2;
                if (bKural == 0){
                    System.out.println("Sayılar 0 a bölünemez");
                }else {
                    System.out.println("İşleminizin sonucu = " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınız. Tekrar deneyin.");
                break;
        }

    }
}
