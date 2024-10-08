import java.util.Scanner;

public class TugasTiketBioskop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket;
        String namaPelanggan;
        int hargaTiketPerUnit = 50000;  
        int totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (atau ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah tiket: ");
            tiket = sc.nextInt();

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah yang valid.");
                sc.nextLine(); 
                continue;
            }

            totalHarga = tiket * hargaTiketPerUnit;
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);

            sc.nextLine();

        } while (true);

        System.out.println("Semua transaksi selesai.");
        sc.close(); 
    }
}
