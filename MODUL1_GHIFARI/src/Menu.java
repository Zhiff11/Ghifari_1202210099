import java.util.*;
 
    
    public class Menu {
        public static void function(String args[])
        {
            
            ArrayList<String> al = new ArrayList<>();
            al.add("Bakso");
            al.add("(Makanan)");
            al.add("Rp. 10000");

            al.add("\nEs Teh");
            al.add("(Minuman)");
            al.add("Rp. 5000");
            

            al.add("\nBrownies");
            al.add("(Dessert)");
            al.add("Rp. 15000");
     
            System.out.println();
            for (String str : al)
                System.out.print(str + " ");
        }
    }


