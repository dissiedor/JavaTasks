package FirstTaskAnimal;
//Класс животного

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("Создает звук животного");
    }
}