package P3;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AnggotaTugas donny = new AnggotaTugas("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.print("\nMasukkan jumlah pinjaman: ");
        int pinjaman = sc.nextInt();
        donny.pinjam(pinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah angsuran: ");
        int angsuran = sc.nextInt();
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman setelah angsuran: " + donny.getJumlahPinjaman());

    }
}
