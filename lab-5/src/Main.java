public class Main {
    public static void main(String[] args){
        // Задание 1. Для произвольной цифры от 0 до 9 вывести на консоль ее
        //  значение прописью. Например, для цифры 9 на консоли должна
        //  быть напечатана строка «Девять».
        int digit = 4;
        String text = null;
        switch (digit){
            case 0:
                text = "Ноль";
                break;
            case 1:
                text = "Один";
                break;
            case 2:
                text = "Два";
                break;
            case 3:
                text = "Три";
                break;
            case 4:
                text = "Четыре";
                break;
            case 5:
                text = "Пять";
                break;
            case 6:
                text = "Шесть";
                break;
            case 7:
                text = "Семь";
                break;
            case 8:
                text = "Восемь";
                break;
            case 9:
                text = "Девять";
                break;
        }
        System.out.println(text);
    }
}
