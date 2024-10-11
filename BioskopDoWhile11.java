import java.util.Scanner;

public class BioskopDoWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        double hargaTiket = 50000;
        
    do{
        System.err.println("-----------------------------------------------------------------------");
        System.err.println("------------------------PENJUALAN TIKET BIOSKOP------------------------");
        System.err.println("-----------------------------------------------------------------------");
        
            System.out.print("Masukkan jumlah tiket yang terjual (atau masukkan 0 untuk keluar): ");
            int jumlahTiket = sc.nextInt();
            
            if (jumlahTiket == 0) {
                break;
            }
            
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi jumlah yang valid.");
                continue;
            }
            
            double hargaTotal = jumlahTiket * hargaTiket;
            
            if (jumlahTiket > 10) {
                hargaTotal *= 0.85; 
            } else if (jumlahTiket > 4) {
                hargaTotal *= 0.90; 
            }
            
            totalTiketTerjual = totalTiketTerjual + jumlahTiket;
            totalPenjualan = totalPenjualan + hargaTotal;
            
            System.out.println("Harga total pembelian : Rp " + hargaTotal);
            System.out.println("Terimakasih, pembelian tiket sudah berhasil");
            System.out.println("-----------------------------------------------------------------------");
            } while (true);
        
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);

        }
    }