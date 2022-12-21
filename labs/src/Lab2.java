import java.util.Random;

public class Lab2 {
    private static Random random = new Random();

    static void execute(){
        int N = 20;
        Trapezoid[] list =  new Trapezoid[N];

        for (int i = 0; i < N;i++){
            int j = -1;
            while (true){
                j++;
                System.out.println("j = " + j);
                Trapezoid tmp = new Trapezoid(
                        new Trapezoid.Point(getRandomInt(),getRandomInt()),
                        new Trapezoid.Point(getRandomInt(),getRandomInt()),
                        new Trapezoid.Point(getRandomInt(),getRandomInt()),
                        new Trapezoid.Point(getRandomInt(),getRandomInt())
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

class Trapezoid {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    private static final double EPSILON = 0.001;
    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    public Point getP3(){
        return p3;
    }

    public Point getP4(){
        return p4;
    }

    public double getA(){
        return p1.distance(p2);
    }

    public double getB(){
        return p2.distance(p3);
    }

    public double getC(){
        return p3.distance(p4);
    }

    public double getD(){
        return p1.distance(p4);
    }

    public double getPerimeter(){
        return getA() + getB() + getC() + getD();
    }
    public double getSquare(){
        return 0.5 * (getB() + getD())/ getH();
    }
    private double getH() {
        if (!isEquilateral()) throw new RuntimeException("Ищем высоту не у равнобедренной трапеции");
        return Math.sqrt(
                Math.pow(getA(), 2)
                        -
                        Math.pow(
                                (Math.pow(getD() - getB(), 2) + Math.pow(getA(), 2) - Math.pow(getC(), 2))
                                        / (2 * getD() - getB()), 2
                        )
        );
    }

    Trapezoid(Point p1, Point p2, Point p3, Point p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public boolean isEquilateral(){
        return Math.abs(getA() - getC()) < EPSILON;
    }

    static class Point{
        private int x;
        private int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        double distance(Point other){
            return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
        }
    }
}

// 3. Сделайте класс Равнобочная трапеция, члены класса: координаты 4-х точек.
// Предусмотреть в классе конструктор и методы: проверка, является ли фигура равнобочной трапецией;
// вычисления и вывода сведений о фигуре: длины сторон, периметр, площадь.
// В функции main продемонстрировать работу с классом: дано N трапеций, найти количество трапеций, у которых площадь больше средней площади.