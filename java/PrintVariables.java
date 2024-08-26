/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author admin
 */
public class PrintVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String firstName = "bob";
        String lastName = "Longson";
        
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        
        String Name = "bob";
        System.out.println("hello" + Name);
        
        // two int variables "37" "3"
        int x = 37;
        int y = 3;
        //additoin
        System.out.println(x - y);
        System.out.println(x + y);
        System.out.println(x * y);
        System.out.println(x / y);
        
        int z = 10;
        System.out.println(x + z * y);
        
        boolean isCoadingFun = true;
        boolean funOutDoorDay = false;
        System.out.println("is Coading Fun?");
        System.out.println(isCoadingFun);
        System.out.println("funOutDoorDay?");
        System.out.println(funOutDoorDay);
        
        
        int items = 50;
        float costPerItem = 7.99f;
        float totalCost = items * costPerItem;
        char currency = '$';
        
        //print Variables
        System.out.println("Number of items: " +items);
        System.out.println("cost per item: " + costPerItem + currency);
        System.out.println("Total coas = " +totalCost + currency);
    }
}
