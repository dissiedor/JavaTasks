package SecondTask;

// Задание (V)
public class StringCompression {
    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);
        String compressedString = compressed.toString();
        return compressedString;
    }

    public static void main(String[] args) {
        String original = "aca";
        String compressed = compressString(original);
        if (compressed.length() > original.length()) {
            System.out.println("Полученная строка " + original);
        } else
            System.out.println("Сжатая строка " + compressed);
    }
}