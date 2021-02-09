public class Animal {

    static final String METR = "m";
    static int globalObjectCount = 0;
    String name;


    public Animal() {
    }

    public Animal(String name) {
        setName(name);
        globalObjectCount++;
    }


    void run(int distanseRun) {
        System.out.println("Животинка " + getName() + " бежит " + distanseRun + METR);
    }

    void sweem(int distanseSweem) {
        System.out.println("Животинка " + getName() + " плывет " + distanseSweem + METR);
    }

    public void animalInfo() {
        System.out.println("Животинка по имени: " + getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
