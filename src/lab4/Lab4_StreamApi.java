package lab4;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Lab4_StreamApi {
    public static void execute(){
        String fileName = "rfc1.txt";
        ArrayList<String> list = new ArrayList<>();
        try {
            readFile(fileName, list);
            AtomicInteger index = new AtomicInteger(0);
            list.parallelStream()
                    .sorted()
                    .forEachOrdered((item)->{
                System.out.println("Line" + index.incrementAndGet() +": \t" + item);
            });
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    private static void readFile(String fileName, Collection<String> collection) throws IOException {
        Scanner scanner = new Scanner(new File(fileName), StandardCharsets.UTF_8);
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            collection.add(line);
        }
    }
}

// Цели:
//    • закрепить знания основных интерфейсов коллекций;
//    • Получить навыки работы со стандартными структурами данных в Java.

// Ввести строки из файла, записать в список ArrayList.
// Выполнить сортировку строк, используя метод sort() из класса Collections.