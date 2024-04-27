package SecondTask;

// Задание (III)
public class CountTwo {
    public static int countTwosInRange(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            count += countTwosInNumber(i);
        }
        return count;
    }

    private static int countTwosInNumber(int number) {
        int count = 0;
        while (number > 0) {
            if (number % 10 == 2) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 22;
        int result = countTwosInRange(n);
        System.out.println("Количество цифр '2' от 0 до " + n + ": " + result);
    }
}
