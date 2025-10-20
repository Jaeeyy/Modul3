Program Java Sederhana – Hello and Loop
======================================

Deskripsi
----------
Program ini adalah contoh dasar dari bahasa pemrograman Java.
Kode ini menampilkan pesan sambutan di konsol dan kemudian mencetak urutan angka dari 1 hingga 5 menggunakan perulangan for.

Fitur Utama
------------
- Menampilkan teks ke layar menggunakan System.out.printf() dan System.out.println().
- Menggunakan struktur perulangan for untuk mencetak nilai variabel i dari 1 sampai 5.

Kode Program
-------------
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        System.out.println("DAUS HALLO");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}

Penjelasan Kode
----------------
1. System.out.printf("Hello and welcome!");
   → Mencetak teks tanpa berpindah ke baris baru.

2. System.out.println("DAUS HALLO");
   → Mencetak teks dan pindah ke baris baru.

3. for (int i = 1; i <= 5; i++)
   → Melakukan pengulangan sebanyak 5 kali, dari i = 1 sampai i = 5.

4. System.out.println("i = " + i);
   → Menampilkan nilai i pada setiap iterasi.

Output Program
---------------
Hello and welcome!DAUS HALLO
i = 1
i = 2
i = 3
i = 4
i = 5

Cara Menjalankan
-----------------
1. Simpan kode dengan nama Main.java
2. Buka terminal atau command prompt, lalu jalankan perintah berikut:
   javac Main.java
   java Main
3. Lihat hasil output di layar konsol.
