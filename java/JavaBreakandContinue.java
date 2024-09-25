
public class JavaBreakandContinue {

    
    public static void main(String args[]) {
        /*
        for(int i = 0; i < 10; i++){
            if(i == 7){
                break;
            }
            System.out.println(i); 
        }*/
        //cintinue Loop
        /*
           for(int i = 0; i < 10; i++){
            if(i == 7){
                continue;
            }
            System.out.println(i);
        }
        */
        // Break sample
        int i = 0;
        while(i < 10){
            System.out.println(i);
           i++;
           if(i == 5){
               break;
           }
        }
    }
}
