/*
 * Ad Soyad: Nursena Karaduman
 * Ogrenci No: 250541046
 * Tarih: 03.11.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 *
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diger java dosyalarinin basinda da bu ornek formattaki gibi kisa bilgi giriniz.
 */

import java.util.Scanner;
// import java.util.Locale; // (GPA'da virgül kullanmak istersen aşağıdaki notu oku)

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        Scanner input = new Scanner(System.in);
        // input.useLocale(Locale.US); // 2.75 gibi nokta ile ondalık girisi icin (bkz. not)

        // Degisken tanimlamalari
        String ad, soyad;
        int ogrenciNo, yas;
        double gpa;

        // Sabit tanimlama (basari siniri)
        final double BASARI_SINIRI = 2.5;

        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();

        // Ad
        System.out.print("Adinizi girin: ");
        ad = input.nextLine();

        // Soyad
        System.out.print("Soyadinizi girin: ");
        soyad = input.nextLine();

        // Ogrenci No
        System.out.print("Ogrenci numaranizi girin: ");
        ogrenciNo = input.nextInt();

        // Yas
        System.out.print("Yasinizi girin: ");
        yas = input.nextInt();

        // GPA
        System.out.print("GPA (0.00 - 4.00 arasi) girin: ");
        gpa = input.nextDouble();

        String durum;
        if (gpa >= BASARI_SINIRI) {
            durum = "Basarili Ogrenci";
        } else {
            durum = "Daha Cok Calismali";
        }

        // Bilgileri ekrana yazdirin
        System.out.println();
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", ogrenciNo);
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.printf("Durum: %s%n", durum);

        // Kaynaklari kapat
        input.close();
    }
}