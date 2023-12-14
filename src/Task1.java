import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
public static void abr(String str){
    String exp = "[\\^\s][A-Z]{2,6}\s";

    Pattern pattern = Pattern.compile(exp);

    Matcher matcher = pattern.matcher(str);

    while(matcher.find()){
        System.out.println(matcher.group());
    }
}
}
