public class Cat {

    public int satiety = 0;                         /* текущая сытость*/
    public int maxSatiety = randomMaxSatiety();     /* максимальная сытость*/
    public String name;
    public boolean wellFed = false;

    public Cat(String name) {
        this.name = name;
    }

    public static int randomMaxSatiety(){
        int max = 15;
        int min = 5;
        int maxSatiety = (int) (Math.random() * ++max) + min;
        return maxSatiety;
    }
}
