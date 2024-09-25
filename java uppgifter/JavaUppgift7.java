

public class JavaUppgift7 {

    
    public static void main(String args[]) {
        int num[] = {10, 20, 30, 40, 50};
        
        for (int num1 : num) {
            System.out.println(num1);
            
        }
        System.out.println(num[0]);
        System.out.println(num[4]);
        
        int sum = 0;
        int i;
        int sum2 = 2;
        for (i = 0;i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("the sum is: " + sum);
        System.out.println(sum / sum2);
    }
}
