package P2.Praktikum;

public class BarangTugas {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon; 

    int hitungHargaJual() {
        return (int)(hargaDasar - (diskon * hargaDasar));
    }

    void tampilData() {
        System.out.println("Kode Barang  : " + kode);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Dasar  : " + hargaDasar);
        System.out.println("Diskon       : " + (diskon * 100) + "%");
        System.out.println("Harga Jual   : " + hitungHargaJual());
    }
}


