package lab2;

import java.util.Random;

public class Lab2 {
    private static Random random = new Random();

    public static void execute(){
        int N = 20;
        Trapezoid[] list =  new Trapezoid[N];

        for (int i = 0; i < N;i++){
            int j = -1;
            while (true){
                j++;
                Trapezoid tmp = new Trapezoid(
                        new Point(getRandomInt(),getRandomInt()),
                        new Point(getRandomInt(),getRandomInt()),
                        new Point(getRandomInt(),getRandomInt()),
                        new Point(getRandomInt(),getRandomInt())
                );
                if (tmp.isEquilateral()) {
                    list[i] = tmp;
                    break;
                }
            }
        }
        int result = getCountWhereSquareLargerThanAverage(list);
        System.out.println("Количество трапеций, у которых площадь больше средней площади: " + result);
    }
    private static int getRandomInt(){
        return random.nextInt(10);
    }

    // найти количество трапеций, у которых площадь больше средней площади.
    private static int getCountWhereSquareLargerThanAverage(Trapezoid[] list){
        double averageSquare = 0.0;
        int counter = 0;
        for (Trapezoid item : list) {
            averageSquare += item.getSquare();
        }
        averageSquare = averageSquare/ list.length;

        for (Trapezoid item : list) {
            if (item.getSquare() > averageSquare){
                counter++;
            }
        }
        return counter;
    }
}



// Вариант 3
// Сделайте класс Равнобочная трапеция, члены класса: координаты 4-х точек.
// Предусмотреть в классе конструктор и методы: проверка, является ли фигура равнобочной трапецией;
// вычисления и вывода сведений о фигуре: длины сторон, периметр, площадь.
// В функции main продемонстрировать работу с классом: дано N трапеций, найти количество трапеций, у которых площадь больше средней площади.