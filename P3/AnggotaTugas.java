package P3;

public class AnggotaTugas {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public AnggotaTugas(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; 
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int uang) {
        if (jumlahPinjaman + uang > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
        } else {
            jumlahPinjaman += uang;
        }
    }

    public void angsur(int uang) {
        if (uang < (jumlahPinjaman * 0.1)) { 
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= uang;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0; 
            }
        }
    }
}
