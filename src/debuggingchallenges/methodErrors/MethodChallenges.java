package debuggingchallenges.methodErrors;
import java.util.Scanner;

class MethodChallenges {
    Scanner SC = new Scanner(System.in);
    /* These methods are all broken and I need your help to fix them! I have put some 
    comments with the methods so explain what I have tried. I am confident you can
    succeed where I have failed!! */
    
    private int age = 17;
    private String name; 
    
    public void birthday(){
        System.out.print("Are you over 20? ");        
        System.out.println("Oh, sorry! How old are you?");
        age = SC.nextInt();
    }
}
