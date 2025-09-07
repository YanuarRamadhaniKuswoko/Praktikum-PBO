package P2.Praktikum;

public class Peminjaman {
    int id;
    String namaMember;
    String namaGame;
    double harga;
    int lamaSewa;

    double hitungBayar() {
        return harga * lamaSewa;
    }

    void tampilData() {
        System.out.println("ID Member   : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga Sewa  : " + harga);
        System.out.println("Lama Sewa   : " + lamaSewa + " hari");
        System.out.println("Total Bayar : " + hitungBayar());
    }
}

