
public class testt {

    
    public static void main(String args[]) {
      int[] numbers = {5, 10, 25, 75, 125};
      int[] numbers2 = {50, 100, 250, 750, 25};
      int sum = 0;
      int sum2 = 0;
        for (int i=0; i < numbers.length ; i++){
            sum = sum + numbers[i];
        }
        System.out.println("sum value of array elements is : " + sum);
        
        for (int i=0; i < numbers2.length ; i++){
            sum2 = sum2 + numbers2[i];
        }
        System.out.println("sum value of array elements is : " + sum2);
        double mySum = sum;
        double mySum2 = sum2;
        double sum3 = mySum2 / mySum;
        System.out.println(sum3);
        
    }
}
