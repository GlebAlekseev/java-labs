public class Main {
    public static void main(String[] args) {
        // Задание 1. Дан массив из целых чисел A(n), где n=1,25.
        // Необходимо поменять местами его максимальный и минимальный элемент.

        int[] array1 = getRandomArray(25);
        System.out.print("1.1) ");
        printlnArray(array1, ", ");
        task1(array1);
        System.out.print("1.2) ");
        printlnArray(array1, ", ");

        // Задание 2. Дан массив из целых чисел B(n), где n=1,25.
        // Необходимо упорядочить массив по возрастанию.

        int[] array2 = getRandomArray(25);
        System.out.print("2.1) ");
        printlnArray(array2, ", ");
        sort(array2);
        System.out.print("2.2) ");
        printlnArray(array2, ", ");


        // Задание 3. Дан массив из целых чисел С(n), где n=1,20.
        // Необходимо найти среднее значение и вывести его на консоль.

        int[] array3 = getRandomArray(20);
        System.out.print("3.1) ");
        printlnArray(array3, ", ");
        double average = getAverage(array3);
        System.out.println("3.2) Среднее значение: " + average);

        // Задание 4. Дан массив из целых чисел D(n), где n=1,30.
        // Посчитайте сумму четных и нечетных элементов массива.

        int[] array4 = getRandomArray(30);
        System.out.print("4.1) ");
        printlnArray(array4, ", ");
        long sumEven = getEvenSum(array4);
        long sumOdd = getOddSum(array4);
        System.out.println("4.2)\tСумма четных (even): " + sumEven + "\n\t\tСумма нечетных (odd): " + sumOdd);

        // Задание 5. Напишите программу,
        // выводящую на консоль таблицу 3х5 случайных элементов (a(i,j)< 10).

        System.out.println("5.1) Таблица 3х5 случайных элементов (a(i,j)< 10).");
        int[][] matrix = getMatrix(5, 3);
        printlnMatrix(matrix);

        // Задание 6. Измените программу 1 так, чтобы она выводила на консоль еще
        // и максимальный элемент (с помощью описания нового метода, например maxX()).

        int maxIndex6 = getMaxIndex(array1);
        System.out.print("6.1) ");
        printlnArray(array1, ", ");
        System.out.println("6.2) Максимальный элемент: " + array1[maxIndex6]);

        // Задание 7. Даны 5 строк s1, s2, s3, s4 и s5, на основе условия:
        // если строка s4 равна строке s5, нужно сложить строки s1 и s2,
        // иначе нужно сложить строки s1 и s3.

        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s3";
        String s4 = "s4";
        String s5 = "s5";

        String result7 = "";
        if (s4 == s5) {
            result7 = s1 + s2;
        }else{
            result7 = s1 + s3;
        }
        System.out.println("7.1) Результат сложения: " + result7);
    }

    public static int[] getRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(size * Math.random());
        }
        return array;
    }

    public static void printlnArray(int[] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + separator);
            }
        }
    }

    // task 1
    public static int getMinIndex(int[] array) {
        int minIndex = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getMaxIndex(int[] array) {
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void changeElements(int[] array, int elementIndex1, int elementIndex2) {
        int tmp = array[elementIndex2];
        array[elementIndex2] = array[elementIndex1];
        array[elementIndex1] = tmp;
    }

    public static void task1(int[] array) {
        int minIndex = getMinIndex(array);
        int maxIndex = getMaxIndex(array);
        changeElements(array, minIndex, maxIndex);
    }

    // task 2
    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }


    // Функция разбивает исходный диапазон на три множества
    // {pivot} {elements<=pivot} {elements>pivot}
    // Для каждого диапазона size>1 будет рекурсивно вызван quickSort
    public static void quickSort(int[] array, int low, int high) {
        // Условие выхода: high - low == 1
        if (low < high) {
            int mid = partition(array, low, high);
            quickSort(array, low, mid - 1);
            quickSort(array, mid + 1, high);
        }
    }

    // Функция partition получает на вход массив и диапазон
    // Выбирает опорную точку pivot (последний элемент в диапазоне)
    // Относительно нее размещает свопами элементы так, чтобы слева были те что меньше,
    // а справа те, что больше
    // На последнем шаге pivot перемещается на свое место - между меньшими и большими элементами
    // Вернется индекс pivot
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                changeElements(array, i, j);
            }
        }
        changeElements(array, i + 1, high);
        return i + 1;
    }

    // task 3
    public static double getAverage(int[] array) {
        double sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum / array.length;
    }

    // task 4
    public static long getEvenSum(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static long getOddSum(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int[][] getMatrix(int sizeI, int sizeJ) {
        int[][] result = new int[sizeI][sizeJ];
        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                result[i][j] = (int) Math.round(10 * Math.random());
                ;
            }
        }
        return result;
    }

    public static void printlnMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            printlnArray(ints, "\t");
        }
    }


}
