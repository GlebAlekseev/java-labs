package lab6;

public class Lab6 {
    public static void execute(){
        CustomFunctionalInterface customFunctionalInterface = (a, b, c) -> b * b - 4 * a * c;
        double result = customFunctionalInterface.method(2, 4, 1);
        System.out.println("Discriminant: " + result);
    }
}


// Написать функциональный интерфейс с методом, который принимает три дробных числа:
// a, b, c и возвращает тоже дробное число.
// Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает дискриминант.