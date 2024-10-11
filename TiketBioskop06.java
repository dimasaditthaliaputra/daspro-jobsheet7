import java.util.Scanner;

public class TiketBioskop06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlTiket, hargaTiket = 50000, totalTiket = 0, i = 0;
        double totalHarga = 0, totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli untuk pelanggan ke-" + ( i + 1 ) + " (ketik 0 untuk keluar) : ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Input tidak valid. Masukkan lagi input yang valid!");
                continue;
            }

            if (jmlTiket == 0) {
                System.out.println("Program Selesai");
                break;
            }

            totalHarga = jmlTiket * hargaTiket;

            if (jmlTiket > 10) {
                totalHarga *= 0.85;
            } else if ( jmlTiket > 4 ) {
                totalHarga *= 0.90;
            }

            totalTiket += jmlTiket;
            totalPenjualan += totalHarga;

            System.out.println("Total harga untuk " + jmlTiket + " tiket: Rp " + totalHarga);
            sc.nextLine();
            i++;
        } while (true);
        System.out.println("============================================");
        System.out.println("Total Tiket terjual: " + totalTiket);
        System.out.println("Total penjualan tiket: Rp " + totalPenjualan);
        System.out.println("============================================");
    }
}