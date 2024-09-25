
public class JavaIfElse2 {

    
    public static void main(String args[]) {
    
       int time =20;
       //option 1
       if(time < 18){
           System.out.println("Good day");
       }else{
           System.out.println("Good evening");
       }
       
       //option 2
       String result = (time< 18)? "good day" : "Good evening";
       System.out.println(result);
       
       // example on Else if
       int Num = -10;
       if (Num > 0) {
           System.out.println("The Value is a positive number");
       }else if (Num < 0){
           System.out.println("The value is a negative number");
       }else{
           System.out.println("The value is 0");
       }
    }
}
