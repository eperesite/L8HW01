import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine();

        Pattern pattern = Pattern.compile("^abc");
        Matcher matcher = pattern.matcher(inputString);

        if (matcher.find()) {
            String modifiedString = matcher.replaceFirst("www");
            System.out.println("Результат: " + modifiedString);
        } else {
            String modifiedString = inputString + "zzz";
            System.out.println("Результат: " + modifiedString);
        }

        scanner.close();
    }

}