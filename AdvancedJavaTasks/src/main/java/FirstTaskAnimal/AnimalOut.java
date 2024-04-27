package FirstTaskAnimal;

//Main
public class AnimalOut {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Случайное животное", 5);
        Dog myDog = new Dog("Пушок", 3);
        Cat myCat = new Cat("Барсик", 2);
        genericAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}