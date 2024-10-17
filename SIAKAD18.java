import java.util.Scanner;

public class SIAKAD18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        int nim = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Masukkan kelas: ");
        String kelas = scanner.nextLine();

        System.out.print("Masukkan nomor absen: ");
        int absen = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Masukkan nilai tugas: ");
        int nilaiTugas = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Masukkan nilai ujian: ");
        int nilaiUjian = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        double nilaiAkhir = (nilaiKuis * 0.25) + (nilaiTugas * 0.25) + (nilaiUjian * 0.5);
        char nilaiHuruf = hitungNilaiHuruf(nilaiAkhir);
        String kualifikasi = hitungKualifikasi(nilaiAkhir);

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }

    private static char hitungNilaiHuruf(double nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            return 'A';
        } else if (nilaiAkhir >= 73) {
            return 'B+';
        } else if (nilaiAkhir >= 65) {
            return 'B';
        } else if (nilaiAkhir >= 60) {
            return 'C+';
        }
    }
}
