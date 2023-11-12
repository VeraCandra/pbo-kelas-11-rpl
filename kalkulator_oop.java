import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih operasi (1: Penjumlahan, 2: Pengurangan, 3: Perkalian, 4: Pembagian, 5: Modulus, 0: Y/T): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih sudah mencoba!");
                break;
            }

            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            switch (pilihan) {
                case 1:
                    System.out.println("Hasil penjumlahan: " + penjumlahan(angka1, angka2));
                    break;
                case 2:
                    System.out.println("Hasil pengurangan: " + pengurangan(angka1, angka2));
                    break;
                case 3:
                    System.out.println("Hasil perkalian: " + perkalian(angka1, angka2));
                    break;
                case 4:
                    System.out.println("Hasil pembagian: " + pembagian(angka1, angka2));
                    break;
                case 5:
                    System.out.println("Modulus: " + sisaHasilBagi(angka1, angka2));
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        scanner.close();
    }

    public static double penjumlahan(double a, double b) {
        return a + b;
    }

    public static double pengurangan(double a, double b) {
        return a - b;
    }

    public static double perkalian(double a, double b) {
        return a * b;
    }

    public static double pembagian(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Pembagian oleh nol tidak valid.");
            return Double.NaN; // Mengembalikan Not a Number (NaN) jika pembagian oleh nol
        }
    }

    public static double sisaHasilBagi(double a, double b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Pembagian oleh nol tidak valid.");
            return Double.NaN; // Mengembalikan Not a Number (NaN) jika pembagian oleh nol
        }
    }
}