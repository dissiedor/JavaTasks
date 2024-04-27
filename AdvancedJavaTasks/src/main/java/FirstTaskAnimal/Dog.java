package FirstTaskAnimal;

//Собака
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Собака лает");
    }
}
