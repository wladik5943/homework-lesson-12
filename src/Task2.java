import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void task(String str){
        String doc = "\\d{4}-\\d{4}-\\d{2}";
        String phone = "\\+\\(\\d{2}\\)\\d{7}";
        String email = "([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}";
        Pattern patDoc = Pattern.compile(doc);
        Pattern patPhone = Pattern.compile(phone);
        Pattern patEmail = Pattern.compile(email);
        Matcher matchPhone = patPhone.matcher(str);
        Matcher matchDoc = patDoc.matcher(str);
        Matcher matchEm = patEmail.matcher(str);
        String dc ="";
            if(matchDoc.find()) {
                 dc = matchDoc.group();
            }
        System.out.print("document number: ");
        System.out.println(dc);
            String ph = "";
            if(matchPhone.find()){
                ph = matchPhone.group();
            }
        System.out.print("phone number: ");
        System.out.println(ph);
            String em = "";
            if(matchEm.find()){
                em = matchEm.group();
            }
        System.out.print("Email: ");
        System.out.println(em);
    }
}
