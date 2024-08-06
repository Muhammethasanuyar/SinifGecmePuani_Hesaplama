
import java.util.Scanner;

public class SinifGecmePuani_Hesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matNotu;
        int turkceNotu;
        int fizikNotu;
        int kimyaNotu;
        int muzikNotu;
        System.out.print("lütfen matematik notunu giriniz : ");
        matNotu = scanner.nextInt();

        if ((matNotu <= 0) || (matNotu >= 100)) {
            while (true) {
                System.out.print("HATALI GİRİŞ! \nlütfen geçerli bir not giriniz (100/0) : ");
                matNotu = scanner.nextInt();
                if(matNotu>=0 && matNotu<=100){
                   break;
                }
            }
        }
        System.out.print("lütfen türkçe notunu giriniz : ");
        turkceNotu = scanner.nextInt();       
        if ((turkceNotu <= 0) || (turkceNotu >= 100)) {
            while (true) {
                System.out.print("HATALI GİRİŞ! \nlütfen geçerli bir not giriniz (100/0) : ");
                turkceNotu = scanner.nextInt();
                if(turkceNotu>=0 && turkceNotu<=100){
                   break;
                }
            }
        }
        System.out.print("lütfen fizik notunu giriniz : ");
        fizikNotu = scanner.nextInt();
        if ((fizikNotu <= 0) || (fizikNotu >= 100)) {
            while (true) {
                System.out.print("HATALI GİRİŞ! \nlütfen geçerli bir not giriniz (100/0) : ");
                fizikNotu = scanner.nextInt();
                if(fizikNotu>=0 && fizikNotu<=100){
                   break;
                }
            }
        }
        System.out.print("lütfen kimya notunu giriniz : ");
        kimyaNotu = scanner.nextInt();
        if ((kimyaNotu <= 0) || (kimyaNotu >= 100)) {
            while (true) {
                System.out.print("HATALI GİRİŞ! \nlütfen geçerli bir not giriniz (100/0) : ");
                kimyaNotu = scanner.nextInt();
                if(kimyaNotu>=0 && kimyaNotu<=100){
                   break;
                }
            }
        }
        System.out.print("lütfen müzik notunu giriniz : ");
        muzikNotu = scanner.nextInt();
        if ((muzikNotu <= 0) || (muzikNotu >= 100)) {
            while (true) {
                System.out.print("HATALI GİRİŞ! \nlütfen geçerli bir not giriniz (100/0) : ");
                muzikNotu = scanner.nextInt();
                if(muzikNotu>=0 && muzikNotu<=100){
                   break;
                }
            }
        }
        double ortalama=(matNotu+muzikNotu+kimyaNotu+fizikNotu+turkceNotu)/5;
        System.out.print("ortalamanız : "+(int)ortalama);
        if(ortalama>=55){
            System.out.println("GEÇTİNİZ!");
        }
        else{
            System.out.println("\ngeçer not alamadınız \nSınıf tekrarı yapmalısınız...");
        }
        scanner.close();
    }
}