package P4.Yanuar.relasiclass.percobaan2;

 public class Pelanggan{
 private String nama;
 private Mobil mobil;
 private Sopir sopir;
 private int hari;
 public Pelanggan(){
 this.nama="";
 this.mobil=null;
 this.sopir=null;
 this.hari=0;
 }
 public String getNama(){
 return nama;
 }
 public void setNama(Stringnama) {
 this.nama=nama;
 }
 public Mobil getMobil(){
 return mobil;
 }
 public void setMobil(Mobilmobil) {
 this.mobil=mobil;
 }
 public Sopir getSopir(){
 return sopir;
 }
 public void setSopir(Sopirsopir) {
 this.sopir=sopir;
 }
 public int getHari(){
 return hari;
 }
 public void setHari(inthari){
 this.hari=hari;
 }
 public int hitungBiayaTotal(){
 returnmobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
 }
 }