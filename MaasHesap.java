/*
 * Ad Soyad: Nursena Karaduman
 * Ogrenci No: 250541046
 * Tarih: 05.11.2025
 * Aciklama: Gorev 3 - Maas Hesaplama Sistemi
 *
 * Bu program calisanin maas bilgilerini hesaplar.
 * Kullanıcıdan ad-soyad, brut maas, haftalik saat ve mesai saati alinir.
 * Toplam gelir, kesintiler ve net maas duzenli bir bordro formatinda yazdirilir.
 */

import java.util.Scanner;
import java.time.LocalDate; // Tarih icin (sistemin bugunku tarihi)

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sabit oranlar
        final double SGK_ORAN = 0.14;
        final double GELIR_VERGISI_ORAN = 0.15;
        final double DAMGA_VERGISI_ORAN = 0.00759;
        final int AYLIK_SAAT = 160; // 1 ayda ortalama 160 saat
        final double MESAİ_KATSAYISI = 1.5;

        // Bilgi alma
        System.out.println("=== MAAS HESAPLAMA SISTEMI ===");
        System.out.println();

        System.out.print("Calisan adi soyadi: ");
        String adSoyad = input.nextLine();

        System.out.print("Brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaati = input.nextInt();

        // === Hesaplamalar ===

        // Mesai ücreti 
        double mesaiUcreti = (brutMaas / AYLIK_SAAT) * mesaiSaati * MESAİ_KATSAYISI;

        // Toplam gelir
        double toplamGelir = brutMaas + mesaiUcreti;

        // Kesintiler
        double sgkKesintisi = toplamGelir * SGK_ORAN;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORAN;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORAN;
        double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;

        // Net maaş
        double netMaas = toplamGelir - toplamKesinti;

        // Istatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100; // yüzde olarak
        double saatlikNetKazanc = netMaas / (AYLIK_SAAT + mesaiSaati);
        double gunlukNetKazanc = netMaas / 22.0; // 22 iş günü

        // Bugunun tarihi
        LocalDate tarih = LocalDate.now();

        // === Cıktı ===
        System.out.println();
        System.out.println("====================================");
        System.out.println("         MAAS BORDROSU");
        System.out.println("====================================");
        System.out.printf("Calisan: %s%n", adSoyad);
        System.out.printf("Tarih  : %s%n", tarih);
        System.out.println();

        System.out.println("GELIRLER:");
        System.out.printf(" Brut Maas              : %10.2f TL%n", brutMaas);
        System.out.printf(" Mesai Ucreti (%d saat) : %10.2f TL%n", mesaiSaati, mesaiUcreti);
        System.out.println("  ------------------------");
        System.out.printf("TOPLAM GELIR           : %10.2f TL%n", toplamGelir);
        System.out.println();

        System.out.println("KESINTILER:");
        System.out.printf("  SGK Kesintisi (%.1f%%)  : %10.2f TL%n", SGK_ORAN * 100, sgkKesintisi);
        System.out.printf("  Gelir Vergisi (%.1f%%)  : %10.2f TL%n", GELIR_VERGISI_ORAN * 100, gelirVergisi);
        System.out.printf("  Damga Vergisi (%.1f%%)  : %10.2f TL%n", DAMGA_VERGISI_ORAN * 100, damgaVergisi);
        System.out.println("  ------------------------");
        System.out.printf("TOPLAM KESINTI         : %10.2f TL%n", toplamKesinti);
        System.out.println();

        System.out.printf("NET MAAS                 : %10.2f TL%n", netMaas);
        System.out.println();

        System.out.println("ISTATISTIKLER:");
        System.out.printf("  Kesinti Orani          : %4.1f%%%n", kesintiOrani);
        System.out.printf("  Saatlik Net Kazanc     : %10.2f TL/saat%n", saatlikNetKazanc);
        System.out.printf("  Gunluk Net Kazanc      : %10.2f TL/gun%n", gunlukNetKazanc);
        System.out.println("====================================");

        input.close();
    }
}

