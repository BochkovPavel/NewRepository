import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ââåäèòå âûðàæåíèå, íàïðèìåð: 8 + 1 èëè äëÿ çàâåðøåíèÿ ïðîãðàììû ââåäèòå \"exit\".");
        String str = "";

        do {
            str = scanner.nextLine();
            if (Pattern.matches("(([1-9]|(10?))\\s+(\\+|-|\\*|/)\\s+([1-9]|(10?)))|exit", str)){
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
                throw  new IllegalAccessException("Íå êîððåêòíî ââåäåíî âûðàæåíèå! Ââîäèòå âûðàæåíèå â ôîðìàòå:  ÷èñëî " +
                        "- ïðîáåë - ñèìâîë äåéñòâèÿ (+, -, *, /) - ïðîáåë - ÷èñëî. Íàïðèìåð : 8 + 1.");
            }
        } while (!str.equals("exit"));
        System.out.println("Äî ñêîðûõ âñòðå÷ü!");
        scanner.close();
    }
}
