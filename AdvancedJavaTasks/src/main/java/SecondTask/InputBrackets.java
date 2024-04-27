package SecondTask;

import javax.swing.*;

// Задание (VIII)
public class InputBrackets {


    public static String addBrackets(String input) {
        StringBuilder result = new StringBuilder();
        int depth = 0;
        result.append("(");
        for (char c : input.toCharArray()) {
            if (depth < input.length() / 2) {
                result.append(c).append("(");
            } else if ((input.length() % 2 != 0) && (depth == input.length() / 2)) {
                result.append(c);
            } else {
                result.append(")").append(c);
            }
            depth++;
        }
        result.append(")");
        return result.toString();
    }

    public static void main(String[] args) {
        String inputString = "exmmnm";
        String result = addBrackets(inputString);
        System.out.println(result);
    }
}