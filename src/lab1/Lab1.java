package lab1;
import java.util.Scanner;

public class Lab1 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int comissionStep = 7;
            // -100 0 1 99 100 101 199 200 201 250...
            int sumTransfer = scanner.nextInt();
            if (sumTransfer <= 0) {
                System.out.println("Значение <= 0");
                continue;
            }
            if (sumTransfer <= comissionStep){
                System.out.println("Значение не превышает минимальной комиссии");
                continue;
            }
            int countComission = (sumTransfer - 1)/100 + 1;
            int comission = comissionStep * countComission;

            System.out.println("Максимальная сумма: " + (sumTransfer-comission));
            System.out.println("Комиссия: " + comission);
        }
    }
}


//Вариант 3
//Банк берет комиссию за перевод по принципу - с каждой сотни рублей изымается комиссия - 7 рублей.
//За неполную сотню также изымается 7 рублей. К примеру, за перевод одного рубля придется выложить 1 + 7 = 8 рублей.
//За перевод 101 рубля придется выложить уже 100 + 7 + 1 + 7 = 115 рублей
//
//Пользователь вводит сумму, которую хочет перевести, а программа должна определить:
//1. Максимально возможную сумму перевода (с учетом, что комиссия за перевод будет браться из переводимой суммы).
//2. Комиссию за данный перевод.
//
//Тест 1.
//Сумма к переводу: 10 рублей
//Ответ
//Максимальная сумма: 3 рубля
//Комиссия: 7 рублей