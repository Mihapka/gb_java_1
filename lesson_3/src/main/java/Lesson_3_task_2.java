import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson_3_task_2 {

    //    2. * Создать массив из слов
//    String[] words =
//            {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
//                    "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
//                    "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin",
//                    "potato"}.
//            При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//    сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
//    Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//    apple – загаданное
//    apricot - ответ игрока
//    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//    Для сравнения двух слов посимвольно можно пользоваться:
//    String str = "apple";
//    char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
//    Играем до тех пор, пока игрок не отгадает слово.
//    Используем только маленькие буквы.

    private static String[] words = {"apple", "orange", "lemon", "banana", "apricot",
            "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
            "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
            "pineapple", "pumpkin", "potato"};
    private String userWordSum = "";

    public static void main(String[] args) {

        repearGame();
    }

    public static void repearGame() {
        int magicWordIndex = (int) (Math.random() * words.length);
        System.out.println(words[magicWordIndex] + "\n");
        String magicWord = words[magicWordIndex].toLowerCase().trim();
//        System.out.println("Угадай слово из списака: " + "\n");
        char[] magicWordArray = words[magicWordIndex].toCharArray();
        char[] result = {'#', '#', '#', '#', '#', '#', '#',
                '#', '#', '#', '#', '#', '#', '#', '#',};
        for (String a : words) {
            System.out.print(a + " ");
        }
        startGame(magicWord, magicWordIndex, magicWordArray, result);
    }

    public static void startGame(String magicWord,
                                 int magicWordIndex, char[] magicWordArray, char[] result) {
        String userWorSumm = "";

        System.out.println(" ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userWord = " ";
        try {
            userWord = reader.readLine().toLowerCase();
//            System.out.println("полученное слово: " + userWord);
        } catch (IOException e) {
            e.printStackTrace();
        }

        char[] userWordArray = userWord.toCharArray();
        if (userWord.equals(magicWord)) {
            System.out.println("Вы угадали!!! " + magicWord);
            starNewGame();
        } else {
            for (int i = 0; i < userWordArray.length; i++) {
                if (magicWordArray[i] == (userWordArray[i])) {
                    result[i] = magicWordArray[i];
                }
            }
            System.out.println("\n" + " Вы угадали следующие буквы: ");
            for (char a : result) {
                System.out.print(a);
            }
            System.out.println("");
            for (int i = 0; i < magicWord.length(); i++) {
                userWorSumm += String.valueOf(result[i]);
            }
//            System.out.print("\n" + userWorSumm.equals(magicWord));
            if (userWorSumm.equals(magicWord)) {
                System.out.println("\n" + "Вы угадали!!! " + magicWord);
                starNewGame();
            } else {
                startGame(magicWord, magicWordIndex, magicWordArray, result);
            }
        }
    }

    public static void starNewGame() {

        System.out.println("\n" + "Повторить игру еще раз? " + 1 + " – да " + 0 + " – нет");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int userChuise = Integer.parseInt(reader.readLine());
            if (userChuise == 1) {
                repearGame();
            } else {
                System.out.println("bay");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
