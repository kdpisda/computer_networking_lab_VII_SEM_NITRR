import java.util.*;
import java.util.regex.Pattern;

class RegexReplace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String regex = input.next();
        String str = input.next();
        String replace = input.next();
        Pattern pattern = Pattern.compile(regex);
        java.util.regex.Matcher m = pattern.matcher(str);
        while (m.find()) {
            str = str.substring(0, m.start() - 1) + replace + str.substring(m.end() - 1);
        }
        System.out.print(str);
    }
}