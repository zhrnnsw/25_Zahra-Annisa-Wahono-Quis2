package Kuis;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("=========== Quiz 2 PRAKTIKUM ASD TI - IF =============");
        System.out.println("dibuat oleh : Zahra Annisa Wahono");
        System.out.println("NIM : 2141720016");
        System.out.println("Absen : 25");
        System.out.println("=======================================================");
        System.out.println("Sistem Antrian Resto Royal Delish");

        Scanner zh = new Scanner(System.in); //angka
        Scanner sc = new Scanner(System.in); //teks
        Queue antriBeli= new Queue();
        Queue antriPesan= new Queue();
        boolean ulang = true;

        do {
            System.out.println("Menu");
            System.out.println("1.Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");

            int pilih = zh.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("--------------------------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("--------------------------------------");
                    System.out.print("Nomor Antrian : ");
                    int noA = zh.nextInt();
                    System.out.print("Nama Customer : ");
                    String namaPembeli = sc.nextLine();
                    System.out.print("Nomor Hp : ");
                    String noHP = sc.nextLine();
                    Pembeli p = new Pembeli(namaPembeli, noHP);
                    antriBeli.enqueue(noA,p);
                    break;
                
                case 2:
                    antriBeli.print();
                    break;
                case 3:
                    antriBeli.dequeue();
                    System.out.println("----------------------------------");
                    System.out.println("Transaksi input pesanan");
                    System.out.println("----------------------------------");
                    System.out.print("Nomor Pesanan : ");
                    int noP = zh.nextInt();
                    System.out.println("Pesanan : ");
                    String pesanan = sc.nextLine();
                    System.out.println("Harga: ");
                    int harga = zh.nextInt();
                    Pesanan s = new Pesanan(noP, pesanan, harga);
                    antriPesan.addPesanan(s);
                    antriPesan.daftarPesan();
                    break;

                case 4:
                default:
                    break;
            }
        } while (ulang);
    }
}
