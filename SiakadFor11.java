import java.util.Scanner;


public class SiakadFor11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1 ; i <= 10 ; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+ i + " : ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println(String.format("Nilai tertinggi : %.2f", tertinggi));
        System.out.println(String.format("Nilai terendah  : %.2f", terendah));
    }
}