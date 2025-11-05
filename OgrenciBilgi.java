/*
 * Ad Soyad: Nursena Karaduman
 * Ogrenci No: 250541046
 * Tarih: 03.11.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        Scanner input = new Scanner(System.in);
        
        // Degisken tanimlamalari
         String ad, soyad;
        int ogrenciNo, yas;
        double gpa;


         // Sabit tanımlama (başarı sınırı)
        final double BASARI_SINIRI = 2.5;
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        System.out.print("Adınızı girin: ");
           ad = input.nextLine();
        
        // Soyad
        System.out.print("soyadınızı girin:");
        soyad = input.nextLine();
        
        // Ogrenci No
        System.out.print("Ögrenci no girin:");
        ogrenciNo = input.nextInt();
        
        // Yas
        System.out.print("yaşınızı girin:");
        yas = input.nextInt();
        
        // GPA
         System.out.print("GPA (0.00 - 4.00 arası) girin: ");
        gpa = input.nextDouble();
        
         String durum;
        if (gpa >= BASARI_SINIRI) {
            durum = "Başarılı Öğrenci";
        } else {
            durum = "Daha Çok Çalışmalı";
        }

        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s\n", ad, soyad);
        System.out.printf("Ogrenci No: %d\n", ogrenciNo);
        System.out.printf("Yas: %d\n", yas);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.printf("Durum: %s\n", durum);

         // Kaynaklari kapat
        input.close();
        
        
        
    }
}
