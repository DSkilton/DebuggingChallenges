package debuggingchallenges;

/**
 * @author MC03353
 * This program is riddled with errors. You need to find the errors and fix them.
 * They start relatively easy and become progressively more challenging.
 * Read the comments as they will give you some clues
 * You can discuss in pairs or groups but must have your own individual work. 
 * Good luck! 
 */
public class DebuggingChallenges {
    
    public static void main(String[] args) {
    /**
     * There are lots of methods written in the main. They are commented out until you are 
     * ready to test them. Uncomment them, fix them and comment them again so you are 
     * not running them all each time you want to test.
     * 
     */
        
//        sout();
//        printString();
    }
    
    public static void sOut(){
        System.out.println("Well done, first test passed);
    }//end of sOut method
    
    public static void printString(){
        String s1 = "Display this string in the console";
        
        System.out.println();//put your code here 
        
        if(s1.contains("Display this string in the console")){
            System.out.println("Well done");
        } else {
            System.out.println("Try again. Check things like spaces and capitals");
        }//end of if statement
    }//end of printStringmethod 
    
}//end of class
