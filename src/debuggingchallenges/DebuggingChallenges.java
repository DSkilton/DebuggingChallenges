package debuggingchallenges;
import debuggingchallenges.DoNotEdit.*;

/**
 * @author MC03353
 * This program is riddled with errors. You need to find the errors and fix them.
 * They start relatively easy and become progressively more challenging.
 * Read the comments as they will give you some clues
 * You can discuss in pairs or groups but must have your own individual work. 
 * Good luck! 
 */

public class DebuggingChallenges {//this is the start of the class
    
    public static void main(String[] args) {
    /**
     * There are lots of methods written in the main. They are commented out until you are 
     * ready to debug and test them. Uncomment them, fix them and comment them again so you are 
     * not running them all each time you want to test.
     * 
     */
        
//        sOut();
//        nextSOut();
//        printString();
//        trickyDataTypes();
//        brokenPoliceSpeedGun();
//        milesPerGallon(); //This method starts on line 82
        //arrayIssue();
    }
    
    public static void sOut(){//start of method
        System.out.println("Well done, first test passed);
    }//end of sOut method
    
    public void nextSOut(){//start of method
        System.out.println(Initialisers.getAnswer();
    }//end of nextSOut method
    
    public static void printString(){//start of method
        String s1 = "Display this string in the console";
        
        System.out.println();//put your code here 
        
        if(s1.contains("Display This String In The Console")){
            System.out.println("Well done");
        } else {
            System.out.println("Try again. Check things like spaces and capitals");
        }//end of if statement
    }//end of printStringmethod 
    
    public static void trickyDataTypes(){
        double d1 = 6.9, d2 = 3.2;
        int answer = debuggingchallenges.DoNotEdit.Initialisers.df2(d1, d2);
    
//      add the two doubles together and store the answer in variable answer. 
//      hint, check the data types! 

        if(answer == 10.1){
            System.out.println("Well done! ");
        } else {
            System.out.println("Answer should be " + Initialisers.df2(d1, d2));
        }//end of if
    }// end of method
    
    public static void brokenPoliceSpeedGun(){
//the police speed gun we wrote a few lessons ago, has broken! People are 
//speeding all over. Its like Need for Speed! It needs fixing ASAP!
//if the speed is less than or equal to 70, no ticket needs to be issued
//if the speed is more than 70 but less than 75 issue a warning 
//if the speed is more than 75 and less than 99 then issue fine, put points on 
//licence and book in for driving safety awareness
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
    
    public static void milePerGallon(){//start of method
       double miles, gallons, mpg;
       miles = 341.00; gallons = 15.50;
       mpg = miles / gallons; 
       
        System.out.print(miles + " mi/");
        System.out.print(gallons + "gal");
        System.out.println(" = " + mpg + " mpg");
    }//end of method
    
    public static void arrayIssue(){//start of method
//    This is a bit more tricky. Research the error online and then look at the 
//    conditional operators use in the for loop
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for(int i = 0; i<=array.length; i++){//start of for loop
            System.out.println(array[i]);
        }//end of for loop
    }//end of methof
    
}//end of class
