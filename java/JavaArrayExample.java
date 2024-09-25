
 
public class JavaArrayExample {

    public static void main(String args[]) {
       int ages[] = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
               //float är en variable med desimaler
               float avg, sum = 0;
               
               int length = ages.length;
               //Lopp the ages and sum them up
               for(int age: ages){
                   sum += age;
               }
               
               //calculate average
               avg = sum / length;
               
               System.out.println("The average is: " + avg);
    }
}
