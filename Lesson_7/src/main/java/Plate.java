import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plate {

    static boolean hungryCat = false;
    int volume;

    public Plate() {
        this.volume = 20;
    }

    public static int refreshood() {
        
        int vol = 0;

        System.out.println("Наполнить тарелку? да - любое число, нет - 0");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int answer = Integer.parseInt(reader.readLine());
            if (answer != 0) {
                vol = 20;
            } else {
                System.out.println("жмот");
                hungryCat = true;
            }
        } catch (Exception e) {
            System.out.println("Это не похоже на ответ");
            refreshood();
        }
        return vol;
    }

//    public static int randomFood() {
//
//        int max = 20;
//        int min = 10;
//        return  (int) (Math.random()*++max)-min;
//    }
    
}

