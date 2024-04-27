package SecondTask;

// Задание (VII)
public class ValidateBrackets {
    public static boolean isValid(String input) {
        int roundCount = 0;
        int squareCount = 0;
        int curlyCount = 0;
        for (char c : input.toCharArray()) {
            if (c == '(') {
                roundCount++;
            } else if (c == ')') {
                roundCount--;
            } else if (c == '[') {
                squareCount++;
            } else if (c == ']') {
                squareCount--;
            } else if (c == '{') {
                curlyCount++;
            } else if (c == '}') {
                curlyCount--;
            }
            if (roundCount < 0 || squareCount < 0 || curlyCount < 0) {
                break;
            }
        }
        return roundCount == 0 && squareCount == 0 && curlyCount == 0;
    }

    public static void main(String[] args) {
        String inputString = ")([[{{}}]])(";
        boolean result = isValid(inputString);
        System.out.println(result ? "Строка содержит правильные скобки." : "Строка содержит неправильные скобки.");
    }
}