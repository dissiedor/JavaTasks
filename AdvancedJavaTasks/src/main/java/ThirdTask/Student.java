package ThirdTask;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private Sex sex;

    public enum Sex {
        MAN, WOMAN
    }
}