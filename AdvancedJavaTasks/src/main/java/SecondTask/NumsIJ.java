package SecondTask;

// Задание (X)
public class NumsIJ {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 3, 4, 4};
        nums(array);
    }

    public static void nums(int[] ar) {
        int start = 0;
        int count = 0;
        for (int arg : ar) {
            start++;
            for (int i = start; i < ar.length; i++) {
                if (arg == ar[i]) {
                    count++;
                }
            }
        }
        System.out.println("Количество идентичный пар " + count);
    }
}
