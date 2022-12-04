
public class MainApp {
    public static void main(String[] args) {
        perangkat p = new perangkat("Gdrive", 8, 4.0f);
        p.informasi();
        System.out.println();

        laptop l = new laptop("Seagate", 4, 2.3f, false);
        l.informasi();
        l.bukagame("RIDE 4");
        l.kirimemail("ride4@gmail.com");
        l.kirimemail("co2ride4@gmail.com", "ownride4@gmail.com");
        System.out.println();

        handphone h = new handphone ("MediaFire",6,4.0f,false);
        h.informasi();
        h.telfon(628886661);
        h.kirimsms(62866688);
        h.sms(628777666,628266666);
        System.out.println();
    }
    
}
