package P1.Tugas;

public class Drone {
    private int baterai;
    private boolean power;

    public void chargeBaterai(int menit) {
        this.baterai += (5 * menit);
    }

    public void ubahPower() {
        this.power = !this.power;
        this.baterai -= 5;
    }

    public void cetakStatus() {
        System.out.println("Kondisi Drone: " + (this.power ? "Terbang" : "Mati"));
        System.out.println("Sisa Baterai: " + this.baterai);
    }
}
