import java.util.*;
import java.util.regex.Pattern;

class RegexMatching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String regex = input.next();
        String str = input.next();
        Pattern pattern = Pattern.compile(regex);
        java.util.regex.Matcher m = pattern.matcher(str);
        Boolean found = false;
        while (m.find()) {
            found = true;
            break;
        }
        if (found) {
            System.out.println("Pattern matched!!");
        } else {
            System.out.println("Pattern did not match!!");
        }
    }
}