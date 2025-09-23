package P4.Yanuar.relasiclass.tugas;
     importjava.util.ArrayList;
public class Perpustakaan {
 private ArrayList<Buku> daftarBuku;
 private ArrayList<Anggota> daftarAnggota;
 private ArrayList<Peminjaman> daftarPeminjaman;
 public Perpustakaan(){
 daftarBuku=new ArrayList<>();
 daftarAnggota=new ArrayList<>();
 daftarPeminjaman=new ArrayList<>();
 }
 public void tambahBuku(Buku buku) {
 daftarBuku.add(buku);
 }
 public void tambahAnggota(Anggota anggota) {
 daftarAnggota.add(anggota);
 }
 public void pinjamBuku(Buku buku, Anggota anggota, String tglPinjam, String
 tglKembali){
 Peminjaman peminjaman=new Peminjaman(buku, anggota, tglPinjam,
 tglKembali);
 daftar Peminjaman.add(peminjaman);
 }
 public void tampilkanInfoPeminjaman() {
 System.out.println("===DAFTAR PEMINJAMAN ===");
 for(Peminjamanp:daftarPeminjaman) {
 System.out.println(p.info());
 }
 }
 public void tampilkanDaftarBuku(){
 System.out.println("===DAFTAR BUKU ===");
 for(Buku b:daftarBuku){
 System.out.println(b.info());
 }
 }
 public void tampilkanDaftarAnggota() {
 System.out.println("===DAFTAR ANGGOTA ===");
 for(Anggota a:daftarAnggota) {
 System.out.println(a.info());
 }
 }

}
