package P4.Yanuar.relasiclass.percobaan2;

public class Mobil{
 private String merk;
 private int biaya;
 public Mobil(){
 this.merk="";
 this.biaya=0;
 }
 public String getMerk(){
 return merk;
 }
 public void setMerk(Stringmerk) {
 this.merk=merk;
 }
 public int getBiaya(){
 return biaya;
 }
 public void setBiaya(intbiaya){
 this.biaya=biaya;
 }
 public int hitungBiayaMobil(inthari) {
 return biaya*hari;
 }
 }