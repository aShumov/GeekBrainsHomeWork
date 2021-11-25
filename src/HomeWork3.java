import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 0, 0 , 1, 0, 1, 1, 0, 0 };
        invertArray(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[100];
        fillArray(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        changeArray(arr3);
        System.out.println(Arrays.toString(arr3));

        int[][] arr4 = new int[4][4];
        fillDiagonal(arr4);
        System.out.println(Arrays.toString(arr4));


    }

/*
*
* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
* Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
*/
public static void invertArray(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 1) {
            arr[i] = 0;
        } else {
            arr[i] = 1;
        }
    }
}
/*
* 2. Задать пустой целочисленный массив длиной 100.
* С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
*/
public static void fillArray(int[] arr2) {

    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = (i+1);
    }
}

/*
* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
* и числа меньшие 6 умножить на 2
*/
public static void changeArray(int[] arr3) {

    for (int i = 0; i < arr3.length; i++) {
        if (arr3[i] < 6) {
            arr3[i] *= 2;
        }
    }
}

/*
* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
* и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
* если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
* индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n]
*/
public static void fillDiagonal(int[][] arr4) {

    for (int i = 0; i < arr4.length; i++) {
        arr4[i][i] = 1;
    }
}

/*
* 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
* и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
* */

//public static void lenInitialValue(int[] initialValue, int[] Len) {



}
