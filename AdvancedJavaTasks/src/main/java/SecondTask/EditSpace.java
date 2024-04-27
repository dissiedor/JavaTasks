package SecondTask;

// Задание (IX)
public class EditSpace {

    public static String editSpaces(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String inputString = "    kedr     and     pihta     ";
        String result = editSpaces(inputString);
        System.out.println("пробелы исправлены\n" + result);
        System.out.println(result);

    }
}
