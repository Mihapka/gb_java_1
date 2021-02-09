public class Dog extends Animal {

    private int dogWeight = (int) (Math.random() * 20 + 1);

    public Dog() {
        super();
    }

    public Dog(String name) {
        setName(name);
        globalObjectCount++;
    }

    @Override
    void run(int distanseRun) {
        if (distanseRun <= 500) {
            System.out.println("Пёсик " + getName() + " пробежал " + distanseRun + METR);
        } else {
            System.out.println("Пёсики столько не бегают((");
        }
    }

    @Override
    void sweem(int distanseSweem) {
        if (distanseSweem <= 10) {
            System.out.println("Пёсик " + getName() + " плывет " + distanseSweem + METR);
        } else {
            System.out.println("Пёсики столько не плавают((");
        }
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
    }

    public void dogInfo() {
        System.out.println("Пёсик по имени " + getName() + " весит " + getDogWeight());
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getDogWeight() {
        return dogWeight;
    }

    public void setDogWeight(int dogWeight) {
        this.dogWeight = dogWeight;
    }
}
