package _07_abstract_class_n_interface.animal_edible_interface;

public class MainTest {
    public static void main(String[] args) {
        Animal[] animals =  new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        System.out.println(animals[0].makeSound());
        for (Animal a: animals) {
            System.out.println(a.makeSound());
            if (a instanceof Chicken) {
                Edible edibler = (Chicken) a;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
