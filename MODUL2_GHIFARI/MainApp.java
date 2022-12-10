public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir trans = new TransportasiAir(4, 20000);
        trans.informasi();
        trans.berlayar();
        trans.berlabuh();
        System.out.println("");

        Sampan sampan = new Sampan(20, 50000, 2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);
        System.out.println("");

        Kapal layar = new Kapal(50, 100000, "Diesel");
        layar.informasi();
        layar.berlayar();
        layar.berlayar(20);
        layar.berlabuh();
        System.out.println("");
    }
}
