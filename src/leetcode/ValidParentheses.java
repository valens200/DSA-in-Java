import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(isValid(inputString));
    }

    static boolean isValid(String input) {
        Map<String, String> symbols = new HashMap<>();
        symbols.put("{", "}");
        symbols.put("[", "]");
        symbols.put("(", ")");

        String[] inputs = input.split("");

        Queue<String> myQueue = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            String targetKey = inputs[i];
            if (symbols.containsKey(targetKey)) {
                myQueue.add(targetKey);
            } else if (symbols.containsValue(targetKey)) {
                String last = ((Deque<String>) myQueue).pollLast();
                if (!targetKey.equals(symbols.get(last))) {
                    return false;
                }
            }

        }
        return myQueue.isEmpty();
    }

}
// {[()]}
// {()}
