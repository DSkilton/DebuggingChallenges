package debuggingchallenges.DoNotEdit;
import java.text.DecimalFormat;

public class Initialisers {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    protected static String answer = "Nice work! You realised this method was being referenced "
                         + "from a static location";
    
    public static double df2(double d1, double d2){
        return Double.valueOf(df2.format(d1 + d2));
    }
    
    public static String getAnswer(){
        return answer;
    }
}
