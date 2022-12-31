import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static boolean repeat = true;
    private static boolean report = false;
    
    public static void main(String[] args) throws InterruptedException{
        Scanner scan = new Scanner(System.in);
        Calculation calcu = new Calculation();
        Thread thread = new Thread(calcu);

        do {
            try {
                System.out.println("\n===Calculation Program===\n"
                        + "1. Square\n"
                        + "2. Circle\n"
                        + "3. Trapezoid\n"
                        + "0. Exit\n");
                System.out.print("Choose number: ");
                int option = scan.nextInt();
                
                switch (option) {
                    case 1:
                        System.out.print("Enter side length: ");
                        calcu.setSide(scan.nextDouble());
                        
                        calcu.setSquare();
                        thread.start();
                        thread.join();
                        report = true;
                        break;
                        
                    case 2:
                        System.out.print("Enter the radius: ");
                        calcu.setRadius(scan.nextDouble());
                        
                        calcu.setCircle();
                        thread.start();
                        thread.join();
                        report = true;
                        break;
                        
                    case 3:
                        System.out.print("Insert side base: ");
                        double a = scan.nextDouble();
                        System.out.print("Insert upper side: ");
                        double b = scan.nextDouble();
                        System.out.print("Insert height: ");
                        double t = scan.nextDouble();
                        
                        calcu.setTrapezoid(a, b, t);
                        thread.start();
                        thread.join();
                        report = true;
                        break;
                        
                    case 0:
                        System.out.println("===Program stopped===");
                        repeat = false;
                        break;
                        
                    default:
                        System.out.println("\n===Option not Available===\n");
                        continue;
                }
                
                if (report) {
                    System.out.println("\nArea of your shape: " + calcu.getArea());
                }
                
            } catch (InputMismatchException e) {
                System.out.println("\n===Error: Input must be a number===\n");
                scan.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("\n===Error: Illegal Argument===\n");
            }
        } while (repeat);
        
        scan.close();
    }
}