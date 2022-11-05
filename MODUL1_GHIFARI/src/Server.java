import java.util.Scanner;

public class Server {

    public static void main(String[] args){
        String nama;
        int nim,pilihan;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Selamat datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("==============================");        
        System.out.print("Name: ");
        nama = sc.nextLine();
        System.out.print("Phone Number: ");
        nim = sc.nextInt();

        System.out.println("\nRegister Success\nName : "+nama+"\nNo. Handphone : "+nim);
        System.out.println("==============================");   

        System.out.println("1. Menu\n2. Pilih Menu\n3. Keluar");
        System.out.println("==============================");

        System.out.print("Masukkan pilihan : ");
        pilihan = sc.nextInt();
       
        sc.close();
    }
}