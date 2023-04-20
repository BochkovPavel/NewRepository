import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение, например: 8 + 1 или для завершения программы введите \"exit\".");
        String str = "";

        do {
            str = scanner.nextLine();
            if (Pattern.matches("(\\d+\\s+(\\+|-|\\*|/)\\s+\\d+)|exit", str)){
                String[] strings = str.split("\\s+");
                if (strings.length < 3) continue;
                switch (strings[1]){
                    case("+"):
                        System.out.println(Integer.parseInt(strings[0]) + Integer.parseInt(strings[2]));
                        break;
                    case("-"):
                        System.out.println(Integer.parseInt(strings[0]) - Integer.parseInt(strings[2]));
                        break;
                    case("*"):
                        System.out.println(Integer.parseInt(strings[0]) * Integer.parseInt(strings[2]));
                        break;
                    case("/"):
                        System.out.println(Integer.parseInt(strings[0]) / Integer.parseInt(strings[2]));
                        break;
                }
            }else{
                throw  new IllegalAccessException("Не корректно введено выражение! Вводите выражение в формате:  число " +
                        "- пробел - символ действия (+, -, *, /) - пробел - число. Например : 8 + 1.");
            }
        } while (!str.equals("exit"));
        System.out.println("До скорых встречь!");
        scanner.close();
    }
}
