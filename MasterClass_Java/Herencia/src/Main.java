//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");
        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog dog2 = new Dog("Yorki", 15);
        doAnimalStuff(dog2, "Fast");

        Dog labradorRetriver = new Dog("Labrador", 25, "Floppy", "Swimmer");
        doAnimalStuff(labradorRetriver, "slow");

        Fish salmon = new Fish("Salmon", 0.25, 2,3);
        doAnimalStuff(salmon, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("___________");
    }
}