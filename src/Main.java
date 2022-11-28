public class Main {
    public static void main(String[] args) {
        // В (0;0) с fuel = 100
        Tank justTank = new Tank();
        // В (10;20) с fuel = 100
        Tank anywareTank = new Tank(10, 10);
        // В (20;30) с fuel = 200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
        customTank.printPosition();
        System.out.println("All bug fixed");
    }
}

/*import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*public class Main {
    public static void main(String[] args) {
        String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for " +
                "searching, manipulating and editing a text. It is widely used to define a constraint on strings " +
                "such as a password. Regular Expressions are provided under java.util.regex package.";
        //Pattern pattern = Pattern.compile("a..a");
        Pattern pattern = Pattern.compile("\\bs[a-z]*?s\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }
    }
}*/
