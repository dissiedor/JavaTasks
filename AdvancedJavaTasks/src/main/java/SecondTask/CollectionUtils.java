package SecondTask;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Задание (I)
public class CollectionUtils {
    public static <T> Set<T> withoutDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static void main(String[] args) {
        List<String> inputList = List.of("apple", "orange", "banana", "apple", "grape", "banana");
        System.out.println("Оригинальный " + inputList);
        withoutDuplicates(inputList);
    }
}
