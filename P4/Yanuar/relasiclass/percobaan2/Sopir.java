package P4.Yanuar.relasiclass.percobaan2;

public classSopir{
 private Stringnama;
 private intbiaya;
 public Sopir(){
 this.nama="";
 this.biaya=0;
 }
 public String getNama(){
 return nama;
 }
 public void setNama(Stringnama){
 this.nama=nama;
 }
 public int getBiaya(){
 return biaya;
 }
 public void setBiaya(intbiaya){
 this.biaya=biaya;
 }
 public int hitungBiayaSopir(inthari) {
 return biaya*hari;
 }
 }