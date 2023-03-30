import java.util.Arrays;

public class Dz1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false
        System.out.println();

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
        System.out.println();

        printString("abcd", 5); // abcdabcdabcdabcdabcd
        System.out.println();

        System.out.println(isLeapYear(2000)); //true
        System.out.println(isLeapYear(2011)); //false
        System.out.println();

        System.out.println(Arrays.toString(createArray(4, 15)));
        System.out.println();

        int [] Arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(Arr)); 
        wholeArray(Arr);
        System.out.println(Arrays.toString(Arr));
        System.out.println();

        int[] sixArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(sixArr));
        arrayDel6(sixArr);
        System.out.println(Arrays.toString(sixArr));
        System.out.println();


        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        printArray(array);
        System.out.println();           
        twoDimArr(array); 
        printArray(array);         
        System.out.println(); 
        
    }

/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
private static boolean isSumBetween10And20(int a, int b) {
    int sum = a + b;
    return sum >= 10 && sum <= 20;
}

private static boolean isPositive(int x) {
    // проверить, что х положительное
    return x > 0;
}

private static void printString(String source, int repeat) {
    // напечатать строку source repeat раз
    String temp = "";
    for (int i = 0; i < repeat; i++) {
        temp += source;
    }   
    System.out.println(temp);
}

private static boolean isLeapYear(int year) {
    // проверить, является ли год високосным. если да - return true
    // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
    if (year % 4 == 0) return true;
    else return false;
}

private static int[] createArray(int len, int initialValue) {
    int[] array = new int[len];
    for (int x = 0; x < array.length; x++) array[x] = initialValue;
        return array;
    // должен вернуть массив длины len, каждое значение которого равно initialValue
}
public static void wholeArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        switch (arr[i]) {
            case 0:
                arr[i] = 1;
                break;
            case 1:
                arr[i] = 0;
                break;
        }
    }
}
public static void arrayDel6(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 6) arr[i] *= 2; 
    }
}
public static void printArray(int[][] arr) {
    for (int[] item : arr) {
        System.out.println(Arrays.toString(item));
    }
}

public static void twoDimArr(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
        arr[i][i] = 1;
        arr[i][arr[i].length - i - 1] = 1;
    }
}
}
