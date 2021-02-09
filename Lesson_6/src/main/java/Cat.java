public class Cat extends Animal {

    private int catWeight = (int) (Math.random() * 2 + 1);

    public Cat() {
        super();
    }

    public Cat(String name) {
        setName(name);
        globalObjectCount++;
    }

    @Override
    void run(int distanseRun) {
        if (distanseRun <= 500) {
            System.out.println("Котик " + getName() + " пробежал " + distanseRun + METR);
        } else {
            System.out.println("Котики столько не бегают((");
        }
    }

    @Override
    void sweem(int distanseSweem) {
        System.out.println("Котики не плавают((");
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
    }


    public void catInfo() {
        System.out.println("Котик по имени " + getName() + " весит " + getCatWeight());
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getCatWeight() {
        return catWeight;
    }

    public void setCatWeight(int catWeight) {
        this.catWeight = catWeight;
    }
}
