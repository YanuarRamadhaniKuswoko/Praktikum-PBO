package P1.Tugas;

public class Magicom {
    private int baterai;
    private boolean power;

    public void chargeBaterai(int menit) {
        this.baterai += (5 * menit);
    }

    public void ubahPower() {
        this.power = !this.power;
        this.baterai -= 3;
    }

    public void cetakStatus() {
        System.out.println("Kondisi Magicom: " + (this.power ? "Memasak" : "Mati"));
        System.out.println("Sisa Baterai: " + this.baterai);
    }
}
