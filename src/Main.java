import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение, например: 8 + 1. Или для выхода введите: \"exit\".");
        String str;

        do {
            str = scanner.nextLine();
            if (Pattern.matches("(([1-9]|(10?))\\s+([+\\-*/])\\s+([1-9]|(10?)))|exit", str)){
                String[] strings = str.split("\\s+");
                if (strings.length < 3) continue;
                switch (strings[1]) {
                    case ("+") -> System.out.println(Integer.parseInt(strings[0]) + Integer.parseInt(strings[2]));
                    case ("-") -> System.out.println(Integer.parseInt(strings[0]) - Integer.parseInt(strings[2]));
                    case ("*") -> System.out.println(Integer.parseInt(strings[0]) * Integer.parseInt(strings[2]));
                    case ("/") -> System.out.println(Integer.parseInt(strings[0]) / Integer.parseInt(strings[2]));
                }
            }else{
                throw  new IllegalAccessException("Не корректно введено выражение!" );
            }
        } while (!str.equals("exit"));
        System.out.println("До скорых встреч!");
        scanner.close();
    }
}
