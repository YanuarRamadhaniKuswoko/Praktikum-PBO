package P1.Tugas;

public class PraktikumMain {

    public static void main(String[] args) {
        System.out.println("=== Laptop ===");
        Laptop laptop = new Laptop();
        laptop.chargeBaterai(10);
        laptop.cetakStatus();
        laptop.ubahPower();
        laptop.cetakStatus();

        System.out.println("\n=== Drone ===");
        Drone drone = new Drone();
        drone.chargeBaterai(15);
        drone.cetakStatus();
        drone.ubahPower();
        drone.cetakStatus();

        System.out.println("\n=== Magicom ===");
        Magicom magicom = new Magicom();
        magicom.chargeBaterai(5);
        magicom.cetakStatus();
        magicom.ubahPower();
        magicom.cetakStatus();

        System.out.println("\n=== Setrika ===");
        Setrika setrika = new Setrika();
        setrika.chargeBaterai(8);
        setrika.cetakStatus();
        setrika.ubahPower();
        setrika.cetakStatus();
    }
}
