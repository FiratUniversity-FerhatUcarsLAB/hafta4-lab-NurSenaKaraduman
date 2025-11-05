/*
 * Ad Soyad: Nursena Karaduman
 * Ogrenci No: 250541046
 * Tarih: 05.11.2025
 * Aciklama: Gorev 2 - Geometrik Hesaplayici
  */
  import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sabit PI degeri 
        final double PI = 3.14159;

        // 1) Yarıçapı al (double ile). 
        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");

        // . , sorunu için
        String rStr = input.next().replace(',', '.');
        double r = Double.parseDouble(rStr);


        // 2) Hesaplamalar
        double daireAlani      = PI * r * r;               // π r^2
        double daireCevresi    = 2 * PI * r;               // 2 π r
        double daireCapi       = 2 * r;                    // 2 r
        double kureHacmi       = (4.0 / 3.0) * PI * Math.pow(r, 3); // (4/3) π r^3
        double kureYuzeyAlani  = 4 * PI * r * r;           // 4 π r^2

        // 3) Cikti – 2 ondalik basamak ve duzenli hizalama
        System.out.println();
        System.out.println("SONUCLAR:");
        System.out.println("----------");
        // %-20s => soldan hizali 20 karakterlik metin alanı
        // %.2f   => sayıyı 2 ondalıkla yaz
        System.out.printf("%-20s: %.2f cm\u00B2%n", "Daire Alani",       daireAlani);
        System.out.printf("%-20s: %.2f cm%n",     "Daire Cevresi",     daireCevresi);
        System.out.printf("%-20s: %.2f cm%n",     "Daire Capi",        daireCapi);
        System.out.printf("%-20s: %.2f cm\u00B3%n", "Kure Hacmi",        kureHacmi);
        System.out.printf("%-20s: %.2f cm\u00B2%n", "Kure Yuzey Alani",  kureYuzeyAlani);

        input.close();
    }
}
