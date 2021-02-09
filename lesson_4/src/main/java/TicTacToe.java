import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TicTacToe {

    public static char[][] map;
    public static final int DOT_TO_WIN = 3;
    public static final int SIZE = 3;

    public static char DOT_X = 'X';
    public static char DOT_0 = '0';
    public static char DOT_EMPTY = '*';

    public static void main(String[] args) {

        startGame();

    }

    public static void initializationMap() {

        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {

        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanStep() {

        System.out.println("Введите координаты (строка - столбец) в формате XY");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            int turnX = Integer.parseInt(line.substring(0, 1)) - 1;
            int turnY = Integer.parseInt(line.substring(1, 2)) - 1;
            if (map[turnX][turnY] == DOT_EMPTY) {
                map[turnX][turnY] = DOT_X;
            } else {
                System.out.println("Занято!");
                humanStep();
            }
//            System.out.printf(String.valueOf(map[turnX][turnY]) + "\n");
        } catch (Exception e) {
            System.out.println("Ввод не распознан" + "\n");
            humanStep();
        }
    }

    public static void aiStep() {

        System.out.println("Ход компуктера: ");
        int coorX = (int) (Math.random() * 3);
        int coorY = (int) (Math.random() * 3);
        if (map[coorX][coorY] == DOT_EMPTY) {
            map[coorX][coorY] = DOT_0;
        } else {
            System.out.println("Занято!");
            aiStep();
        }
    }

    public static boolean checkHumanWin() {

        int indexOfWin = 0;
        // роверка строк

        for (int i = 0; i < SIZE; i++) {
            indexOfWin = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_X) {
                    indexOfWin++;
                }
                if (indexOfWin == SIZE) {
                    return true;
                }
            }
        }
        //      проверка столбцов

        for (int i = 0; i < SIZE; i++) {
            indexOfWin = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == DOT_X) {
                    indexOfWin++;
                }
                if (indexOfWin == SIZE) {
                    return true;
                }
            }
        }

        indexOfWin = 0;
        //        проверка диагонили слева направо

        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == DOT_X) {
                indexOfWin++;
            }
            if (indexOfWin == SIZE) {
                return true;
            }
        }

        indexOfWin = 0;
        //        проверка диагонали справа налево

        int stringValue = SIZE - 1;
        for (int i = 0; i <= SIZE - 1; i++) {
            if (map[stringValue][i] == DOT_X) {
                indexOfWin++;
                stringValue--;
            }
            if (indexOfWin == SIZE) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkAiWin() {

        int indexOfWin = 0;
        // роверка строк
        for (int i = 0; i < SIZE; i++) {
            indexOfWin = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_0) {
                    indexOfWin++;
                }
                if (indexOfWin == SIZE) {
                    return true;
                }
            }
        }
//      проверка столбцов
        for (int i = 0; i < SIZE; i++) {
            indexOfWin = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == DOT_0) {
                    indexOfWin++;
                }
                if (indexOfWin == SIZE) {
                    return true;
                }
            }
        }

        indexOfWin = 0;
//        проверка диагонили слева направо
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == DOT_0) {
                indexOfWin++;
            }
            if (indexOfWin == SIZE) {
                return true;
            }
        }

        indexOfWin = 0;
        int stringValue = SIZE - 1;
//        проверка диагонали справа налево
        for (int i = 0; i <= SIZE - 1; i++) {
            if (map[stringValue][i] == DOT_0) {
                indexOfWin++;
                stringValue--;
            }
            if (indexOfWin == SIZE) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkFullMap() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkStatus() {

        if (checkHumanWin()) {
            System.out.println("Ты победил!");
            return false;
        }
        if (checkAiWin()) {
            System.out.println("Победил компуктер!");
            return false;

        }
        if (checkFullMap()) {
            System.out.println("Победила дружба!");
            return false;
        }
        return true;
    }

    public static void restartGame() {

        System.out.println("Игра окончена, хочешь сыграть ещё? ДА - 1, НЕТ - 0" + "\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int userChuise = Integer.parseInt(reader.readLine());
            if (userChuise == 1) {
                startGame();
            } else {
                System.out.println("bay");
            }
        } catch (Exception e) {
            System.out.println(" 1 - сыграть ещё раз, 0 - заверщить игру");
            restartGame();
        }
    }

    public static void startGame() {

        initializationMap();
        printMap();
        while (true) {
            humanStep();
            printMap();
            if (!checkStatus()) {
                break;
            }
            aiStep();
            printMap();
            if (!checkStatus()) {
                break;
            }
        }
        restartGame();

    }
}
