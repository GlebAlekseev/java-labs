package lab5;

import java.util.ArrayList;

public class Lab5 {
    public static void execute() {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(5);
        list.remove(0);
        list.remove(0);
        list.remove((Integer) 5);
        System.out.println("Длина списка: " + list.size());
        list.forEach((integer -> {
            System.out.print(integer + ", ");
        }));
        System.out.println();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        list.addAll(arrayList);
        SingleLinkedList<Integer> result = SingleLinkedList.getEvenIndexList(list);
        System.out.println("Список значений под четными индексами.");
        result.forEach((item) -> {
            System.out.print(item + ", ");
        });

    }
}

// ПРАКТИЧЕСКОЕ ЗАДАНИЕ
//    1. разработать Generic-класс, позволяющий работать с группами объектов по варианту (добавлять, удалять и т.д.);
//    2. разработать метод Generic-класса позволяющий добавить в структуру коллекцию объектов.
//    Протестируйте метод на коллекциях разных видов и посмотрите за ошибками компиляции, которые возникают при неправильном использовании generics;
//    3. разработать статический generic-метод, который работает с разработанным Generic-классом.
//    Действие, которое должен выполнять метод, задается индивидуальным вариантом.

// Вариант 3
// Структура данных generic-класса односвязный список.
// Generic-метод возвращает группу, в которой содержатся четные элементы из входной группы.