import java.util.Scanner;
public class TiketBioskop29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket;
        int hargaTiket = 50000;
        int tiketTerjual = 0;
        int totalPendapatan = 0;
    
        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (Ketik -99 untuk selesai): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == -99) {
                System.out.println("Penjualan selesai");
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid.");
            }
            int hargaDasar = jumlahTiket * hargaTiket;
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.1;
            }
            int totalHargaTransaksi = (int) (hargaDasar * (1 - diskon));
            System.out.println("Diskon yang didapatkan: " + (diskon*100));
            System.out.println("Total bayar: " + totalHargaTransaksi);
            tiketTerjual += jumlahTiket;
            totalPendapatan += totalHargaTransaksi;
        } while (true);
        System.out.println("Total tiket terjual: " + tiketTerjual);
        System.out.println("Total harga penjualan: Rp" + totalPendapatan);
    }
}
