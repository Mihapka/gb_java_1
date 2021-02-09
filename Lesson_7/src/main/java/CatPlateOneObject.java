public class CatPlateOneObject {

    public static void main(String[] args) {

        Plate plate = new Plate();
        Cat cat = new Cat("qwqw");
        showTheCat(cat);
        feeding(plate, cat);
        showTheCat(cat);

    }

    public static void feeding(Plate plate, Cat cat) {

        while (true) {
            if (plate.volume - cat.maxSatiety < 0) {
                cat.satiety = plate.volume;
                cat.maxSatiety -= plate.volume;
                plate.volume = 0;
                System.out.println("\n" + "Еда закончилась, а котик "
                        + " " + cat.name + " " + " еще голодный" + "\n");
                plate.volume = Plate.refreshood();
                if (Plate.hungryCat){
                    break;
                }
            } else if (plate.volume - cat.maxSatiety >= 0) {
                cat.satiety = plate.volume;
                System.out.println("Котик" + " " + cat.name + " сыт");
                cat.wellFed = true;
                cat.satiety = cat.maxSatiety;
                plate.volume -= cat.satiety;
                break;
            }
        }
    }

    public static void showTheCat(Cat cat) {
        System.out.println("\n" + "Имя кота: " + cat.name + "\n" +
                "Насыщенность кота: " + cat.satiety + "\n" +
                "Максимальный голод кота: " + cat.maxSatiety + "\n" +
                "Кот сытый? " + cat.wellFed);
    }

}

