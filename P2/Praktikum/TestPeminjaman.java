package P2.Praktikum;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pinjam1 = new Peminjaman();
        pinjam1.id = 1;
        pinjam1.namaMember = "Budi";
        pinjam1.namaGame = "FIFA 23";
        pinjam1.harga = 15000;
        pinjam1.lamaSewa = 3;

        pinjam1.tampilData();
    }
}


