import java.util.Scanner;

public class KafeDoWhile11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (atau ketik 'batal' untuk menghentikan): ");
            namaPelanggan = sc.nextLine();
            
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                break;
            }
            
            System.out.print("Masukkan jumlah kopi yang dibeli  : ");
            kopi = sc.nextInt();

            System.out.print("Masukkan jumlah teh yang dibeli   : ");
            teh = sc.nextInt();

            System.out.print("Masukkan jumlah roti yang dibeli  : ");
            roti = sc.nextInt();    
            
            sc.nextLine();
            
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga pembelian: Rp " + totalHarga);
        } while (true);
        
        System.out.println("Transaksi di batalkan.");
        System.out.println("Semua transaksi selesai.");

    }
}
