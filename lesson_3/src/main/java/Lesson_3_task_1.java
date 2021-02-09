import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson_3_task_1 {

    //1. Написать программу, которая загадывает случайное число от 0 до 9     и пользователю дается
//    3 попытки угадать это число.
//    При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
//    чем загаданное, или меньше.
//    После победы или проигрыша выводится запрос – «Повторить игру еще раз?
//        1 – да / 0 – нет»(1 – повторить, 0 – нет).


    public static void main(String[] args) {

        playGame();
    }

    public static void playGame() {

        int magicNum;
        int count = 0;
        int userNumber = 0;
        magicNum = (int) (Math.random() * 10);
        System.out.println("\n" + "Волшебное число ЗАГАДАНО!" + "\n");
        System.out.println("Введите число от 0 до 9:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            for (int i = count; i < 3; i++) {
                userNumber = Integer.parseInt(reader.readLine());
                if (userNumber < 0 || userNumber > 9) {
                    System.out.println("Ваше число не входит в диапозон от 0 до 9");
                } else {
                    if (userNumber == magicNum) {
                        System.out.println("Вы угадали!" + "\n");
                        break;
                    } else {
                        if (userNumber > magicNum) {
                            System.out.println("Ваше число больше ВОЛШЕБНОГО");
                        } else {
                            System.out.println("Ваше число меньше ВОЛШЕБНОГО");
                        }
                    }
                }
                count++;
            }
        } catch (Exception e) {
            System.out.println("Какая-то не правильная цЫфира! Игра закончена"+ "\n");
        }

        if (count == 3) {
            System.out.println("\n" + "Попытки закончились! " +
                    "вы так и не угадали ВОЛШЕБНОЕ число " + magicNum + "\n");
        }
        gameContinuation();
    }

    public static void gameContinuation() {

        System.out.println("Повторить игру еще раз? " + 1 + " – да " + 0 + " – нет");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int userChuise = Integer.parseInt(reader.readLine());
            if (userChuise == 1) {
                playGame();
            } else {
                System.out.println("bay");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
