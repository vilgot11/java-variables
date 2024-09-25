
public class JavaForLoop {

    public static void main(String args[]) {
        /*
        //foor loop basic sample 1
        for (int i =0; 1 < 10; i++){
            System.out.println(i);
        }
        */
        /*
        // For loop basic sample 2 colla mellan 2
        for (int i = 0; i < 10; i = i +2){
            System.out.println(i);
        }
        */
        /*
        // foor loop basic sample 3  ungefär samma som en lista
        // Array
        String[] name ={"Bob", "Jacob", "Steve", "Joe"};
        for (String i : name){
            System.out.println(i);
        }
        */
        /*
        // For loop basic sample 4 "Nested"
        for(int i = 1; i <= 2; i++){
            System.out.println("Outside" + i); //run 2 times loop inne i en loop
            
            for(int j = 1; j <= 3; j++){
            System.out.println("Inside" + j); // runs six times "2*3"
            }
        }
        */
        // for loop basic sample 5
        int number = 3;
        for(int i = 1; i <= 10; i++){
            System.out.println( number + " x " + i + " = " + (number * i));
        }
    }
}
