
public class JavaArrays {

   
    public static void main(String args[]) {
        // String arrays
       String[] names = {"Bob", "Steve", "Jacob"};
       //int arrey
       int[] Numbers ={1, 2, 3, 4, 5, 6};
       //starts from zero "0"
       System.out.println(names [0]);
        System.out.println(Numbers [0]);
        //Lenght of Array
         System.out.println(names.length);
         System.out.println(Numbers.length);
         // Name Loop "print names"
         
         for(int i = 0; i< names.length; i++){
             System.out.println(names [i]);
         }
         // int Loop "print numbers"
             for(int i = 0; i< names.length; i++){
             System.out.println(Numbers [i]);
             
         }
    }
}
