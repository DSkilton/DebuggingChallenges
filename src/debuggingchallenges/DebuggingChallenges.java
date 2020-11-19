package debuggingchallenges;
import java.text.DecimalFormat;


/**
 * @author MC03353
 * This program is riddled with errors. You need to find the errors and fix them.
 * They start relatively easy and become progressively more challenging.
 * Read the comments as they will give you some clues
 * You can discuss in pairs or groups but must have your own individual work. 
 * Good luck! 
 */

public class DebuggingChallenges {
    public static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {
    /**
     * There are lots of methods written in the main. They are commented out until you are 
     * ready to test them. Uncomment them, fix them and comment them again so you are 
     * not running them all each time you want to test.
     * 
     */
        
//        sout();
//        printString();
//        trickyDataTypes();
            brokenPoliceSpeedGun();
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
    
    public static void trickyDataTypes(){
        double d1 = 6.9, d2 = 3.2;
        int answer = Double.valueOf(df2.format((d1 + d2)));
    
//      add the two doubles together and store the answer in variable answer. 
//      hint, check the data types! 

        if(answer == 10.1){
            System.out.println("Well done! ");
        } else {
            System.out.println("Answer should be " + df2.format((d1 + d2)));
        }//end of if
    }// end of method
    
    public static void brokenPoliceSpeedGun(){
//the police speed gun we wrote a few lessons ago, has broken! People are 
//speeding all over. Its like Need for Speed! It needs fixing ASAP!
//if the speed is less than or equal to 70, no ticket needs to be issued
//if the speed is more than 70 but less than 74 issue a warning 
//if the speed is between 75 and 99 then issue fine, put points on licence 
//and book in for driving safety awareness
//if the speed is 100 or more, arrest driver and confiscate licence 
        int speed = 70;// you can change the speed to test the logic 
        
        if(speed <= 71){
            System.out.println("No ticket issued");
        } else if ((speed > 70) && (speed < 74)){
            System.out.println("Issue warning");
        } else if ((speed > 75) && (speed <= 100)){
            System.out.println("Issue Fine, Points on License and Attend Driving Course");
        } else {
            System.out.println("Your nicked sunshine and you have lost your license! ");
        }//end of if 
    }//end of method
    
}//end of class
