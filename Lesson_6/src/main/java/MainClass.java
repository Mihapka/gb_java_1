public class MainClass {

    public static void main(String[] args) {

        Animal animal = new Animal("Gromozeka");
        animal.animalInfo();
        animal.run(10);
        animal.sweem(1);
        System.out.println(" ");
        Cat cat = new Cat("Vasia");
        Dog dog0 = new Dog("Petia");
        cat.animalInfo();
        dog0.animalInfo();
        System.out.println(" ");
        cat.catInfo();
        cat.run(12);
        cat.sweem(2);
        System.out.println(" ");
        dog0.dogInfo();
        dog0.run(100);
        dog0.sweem(5);
        Dog dog1 = new Dog("do1");
        Dog dog2 = new Dog("dog2");
        System.out.println(" ");
        Animal dog3 = new Dog("dog3");

        dog3.animalInfo();
        System.out.println("\n" + "Всего животных: " + Animal.globalObjectCount );
    }
}
