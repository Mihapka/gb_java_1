public class CatPlateArray {

    static int numberAnimals = 5;

    public static void main(String[] args) {

        Plate plate = new Plate();
        Cat[] catArray = new Cat[numberAnimals];
        createTheCats(catArray);
//        showTheCats(catArray);
        massFeeding(plate, catArray);

    }

    public static void createTheCats(Cat[] catArray) {

        for (int i = 0; i < numberAnimals; i++) {
            Cat cat = new Cat("Киса № " + i);
            catArray[i] = cat;
        }
    }

    public static void showTheCats(Cat[] catArray) {

        for (Cat a : catArray) {
            CatPlateOneObject.showTheCat(a);
        }
    }

    public static void massFeeding(Plate plate, Cat[] catArray) {
        for (Cat a : catArray) {
            CatPlateOneObject.feeding(plate, a);
        }
    }
}
