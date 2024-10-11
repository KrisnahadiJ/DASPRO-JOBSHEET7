import java.util.Scanner;

public class SiakadWhile11Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int jml = 5; 
        double nilai;
        
        while (i <= jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
        
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }
        
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah A");
                System.out.println("Bagus, pertahankan nilainya!");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah E");
            }
            i++;
        }
    }
}
