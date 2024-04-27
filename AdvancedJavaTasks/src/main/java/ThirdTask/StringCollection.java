package ThirdTask;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Задание (II)
public class StringCollection {
    static List<String> inputArray = List.of("a1", "a4", "a3", "a2", "a1", "a4");

    public static void main(String[] args) {
        changeList(inputArray);
    }

    public static void changeList(List<String> arr) {
        System.out.println("Отсортированный по алфавиту");
        List<String> sortedList = arr.stream()
                .sorted()
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        System.out.println("Измененный список");
        List<String> modifiedList = arr.stream()
                .map(s -> s + "_1")
                .collect(Collectors.toList());
        modifiedList.forEach(System.out::println);
        System.out.println("Измененный тип списка");
        List<Integer> intList = arr.stream()
                .mapToInt(s -> Integer.parseInt(s.substring(1)))
                .boxed()
                .collect(Collectors.toList());
        intList.forEach(System.out::println);
        System.out.println("Отсортированный без дубликатов список");
        List<String> sortedListnew = arr.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        sortedListnew.forEach(System.out::println);
    }
}
