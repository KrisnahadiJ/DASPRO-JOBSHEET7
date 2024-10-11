import java.util.Scanner;

public class SistemParkirDoWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pilihan;
        int totalBiaya;
        int jam;
        
        do {
            System.out.println("------------------------------------------------------");
            System.out.println("-------Pilih jenis kendaraan yang akan diparkir-------");
            System.out.println("------------------------------------------------------");
            System.out.println("0. Keluar");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.print("Masukkan pilihan Anda (0/1/2)     : ");
            pilihan = sc.nextInt();

            if (pilihan == 0) {
                break;
            } else if (pilihan == 1 || pilihan == 2) {
                System.out.print("Berapa jam Anda parkir            : ");
                jam = sc.nextInt();
                
                if (pilihan == 1) {
                    if (jam > 5) {
                        totalBiaya = 12500;
                    } else {
                        totalBiaya = jam * 3000;
                    }
                    System.out.println("Kendaraan Anda                    : Mobil");
                } else {
                    if (jam > 5) {
                        totalBiaya = 12500;
                    } else {
                        totalBiaya = jam * 2000;
                    }
                    System.out.println("Kendaraan Anda                    : Motor");
                }

            System.out.println("Total biaya parkir                : Rp " + totalBiaya);
            System.out.println("Terima kasih telah menggunakan layanan parkir kami.");
            System.out.println("------------------------------------------------------");
            } else {
                System.out.println("Jenis kendaraan tidak valid");
            }

        } while (true);

    }
}