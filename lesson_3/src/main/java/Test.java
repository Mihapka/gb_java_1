public class Test {

    private static char[][] gameMap;
    private static final int DOTS_TO_WIN = 3;
    private static final int EMTY_DOT = '*';
    private static final int X_DOT = 'X';
    private static final int Y_DOT = 'O';

    public static void main(String[] args) {

        fiilGameMap();
        paintGameMap();

    }

    private static void paintGameMap() {
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[i].length ; j++) {
                System.out.print(gameMap[i][j]+ "   ");
            }
            System.out.println(" ");
        }
    }

    private static void fiilGameMap() {
        gameMap = new char[3][3];
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap.length ; j++) {
                gameMap[i][j] = EMTY_DOT;
            }
        }
    }
}
