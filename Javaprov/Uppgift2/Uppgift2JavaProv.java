
public class Uppgift2JavaProv {

    public static void main(String args[]) {
        int[] numbers = {5, 10, 25, 75, 125};
        int sum = 0;
        for (int i=0; i < numbers.length ; i++){
            sum = sum + numbers[i];
        }
        System.out.println("sum value of array elements is : " + sum);
        
        int[] numbers1 = {50, 100, 250, 750, 25} ;
        for (int i=0; i < numbers1.length ; i++){
            sum = sum + numbers1[i];
        }
        System.out.println("sum value of array elements is : " + sum);
        
        System.out.println(240/1415);
        System.out.println(1415/240);
    }
}
