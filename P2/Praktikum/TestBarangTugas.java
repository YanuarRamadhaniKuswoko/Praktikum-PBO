package P2.Praktikum;

public class TestBarangTugas {
    public static void main(String[] args) {
        BarangTugas brg1 = new BarangTugas();
        brg1.kode = "BRG001";
        brg1.namaBarang = "Keyboard Gaming";
        brg1.hargaDasar = 500000;
        brg1.diskon = 0.1f; // 10%

        brg1.tampilData();
    }
}

