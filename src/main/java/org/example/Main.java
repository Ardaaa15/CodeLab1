package org.example;
import java.time.LocalDate; //digunakan untuk mewakili tanggal
import java.time.Period; //menghitung perbedaan antara dua tanggal
import java.util.Scanner; //membaca input dari pengguna

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : "); //perintah menampilkan teks nama ke konsol
        String nama = scanner.nextLine();
        /*perintah untuk membaca input dari pengguna
        membaca input sbg 1 baris teks, hasil inputan disimpan di variabel
        nama dgn tipe data string
         */

        System.out.print("Jenis Kelamin (L/P) : ");
        String JenisKelamin = scanner.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String birthDateInput = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(birthDateInput);

        System.out.println("Nama: " + nama);
        /*menampilkan teks nama, menggunakan println krn akan
        memulihkan baris baru,
        +menggabungkan bbrp string ke dlm 1 string*/

        if (JenisKelamin.equalsIgnoreCase("P")) {
            System.out.println("Jenis Kelamin Perempuan");
        } else if (JenisKelamin.equalsIgnoreCase("L")) {
            System.out.println("Jenis Kelamin Laki-laki");
        } else {
            System.out.println("Jenis Kelamin Tidak Valid");
        }

        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(tanggalLahir, currentDate);

        System.out.println("Umur Anda " + period.getYears() + " tahun " + period.getMonths() + " bulan");
    }
}