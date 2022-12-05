public class Main {
    public static void main(String[] args){
        // Задание 1. С помощью цикла вычислите значение выражения 2^n.
        float result1 = pow2(0);
        System.out.println(result1);

        // Задание 2. Составьте программу расчета факториала для произвольного числа n<10.
        long result2 = factorial(0);
        System.out.println(result2);

        // Задание 3. Даны два действительных числа. Необходимо получить их
        // сумму, разность и произведение. Результат вывести на консоль.
        task3(22.3,46.8);

        // Задание 4. Определить время свободного падения материального тела с
        // заданной высоты h. Результат вывести в консоль.
        double result4 = task4(14640);
        System.out.println("t =" + result4);

        // Задание 5. Составьте программу для нахождения длины катета прямо-
        // угольного треугольника (b), если известны длины гипотенузы (c) и
        // катета (a). Результат вывести на консоль.
        double result5 = task5(10,5);
        System.out.println("Длина катета: " + result5);
    }

    public static float pow2(int n){
        float result = 1;
        if (n >= 0){
            for (int i = 0; i < n;i++){
                result *= 2;
            }
        }else{
            for (int i = 0; i < -n;i++){
                result *= 1.0 /2;
            }
        }
        return result;
    }
    public static long factorial(int n){
        long result = 1;
        for (int i = 1; i <= n;i++){
            result *= i;
        }
        return result;
    }
    public static void task3(double digit1, double digit2){
        System.out.println("Сумма двух чисел: " + digit1 + digit2);
        System.out.println("Разность двух чисел: " + (digit1 - digit2));
        System.out.println("Произведение двух чисел: " + digit1 * digit2);
    }
    public static double task4(double h){
        double g=9.8;
        return Math.sqrt(2*h/g);
    }
    public static double task5(double c, double a){
        return Math.sqrt(c*c - a*a);
    }
}
