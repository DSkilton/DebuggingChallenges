package debuggingchallenges.DoNotEdit;
import java.text.DecimalFormat;

public class Initialisers {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
    public static double df2(double d1, double d2){
        return Double.valueOf(df2.format(d1 + d2));
    }
    
}
