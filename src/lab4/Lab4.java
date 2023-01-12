package lab4;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Lab4 {
    public static void execute(){
        String fileName = "rfc1.txt";
        ArrayList<String> list = new ArrayList<>();
        try {
            readFile(fileName, list);
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++){
                System.out.println("Line" + i + 1 +": \t" + list.get(i));
            }
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