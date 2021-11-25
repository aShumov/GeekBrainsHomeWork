import java.util.Random;
import java.util.Scanner;

// Пока очень сложно. Без подглядываний никак. Нужно больше практиковаться.
// Мозг закипел из-за опечатки System.out.println вместо ...print
// час не мог понять, почему всё в одну вертикальную строчку идёт((
public class HomeWork4 {
    public static char[][] map;
    public static char DOT_EMPTY = '.';
    public static char DOT_X = 'X';
    public static char DOT_O = 'O';
    public static int SIZE = 3;

    public static void main(String[] args) {
        // 1. Взять поле
        // 2. инициализация
        initMap();
        showMap();
        // цикл (неопр)
        while (true) {
            humanTurn();
            showMap();
            if (isWinner(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }

            aiTurn();
            showMap();
            if (isWinner(DOT_O)) {
                System.out.println("Победил ИИ");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничьяк");
                break;
            }
        }

        // 6. Ничья

    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void showMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();
        for (int i = 0; i < SIZE; i++) {
           System.out.print((i + 1));
            System.out.print((" "));
            for (int j = 0; j < SIZE; j++) {    //вложенный цикл
                System.out.print(map[i][j]);    //печатаем вторую строку 1 . . .
                System.out.print((" "));
            }
            System.out.println();               //печать следующей строки
        }
    }
        // ход человека
        public static void humanTurn() {
            int x;
            int y;
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Введите координаты X и Y");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            } while (!isCellValid(x, y));

            map[y][x] = DOT_X;

        }

        // ход ИИ

        public static void aiTurn() {
            int x;
            int y;
            Random  myRandom = new Random();

            do {

                x = myRandom.nextInt(SIZE); // В данном варианте ИИ модет повторять координаты
                y = myRandom.nextInt(SIZE); // Надо дописывать исключения
            } while (!isCellValid(x, y));

            System.out.println("Компьютер сходил в точки: ");
            System.out.println("X-" + (x + 1)); //+1 так как компьютер ходит по массиву
            System.out.println("Y-" + (y + 1));

            map[y][x] = DOT_O;

        }
        // Проверка ввода на корректность
        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                return false;
            }
            if (map[x][y] == DOT_EMPTY) {
                return true;
            }
            return false;
            }

    // Условия победы
    public static boolean isWinner(char symb) {
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) {
            return true;
        }
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) {
            return true;
        }
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) {
            return true;
        }
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) {
            return true;
        }
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) {
            return true;
        }
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) {
            return true;
        }
        //диагональ
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) {
            return true;
        }
        if (map[0][2] == symb && map[1][1] == symb && map[2][0] == symb) {
            return true;
        }
        return false;
    }

    //Ничья
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}
