public class Example1 {
    // 1. Создайте приложение, в котором имеются три класса:
    // fclass1, fclass2, fclass3. В классе fclass1 содержится метод
    // main(). Класс fclass3 наследуется от fclass1, а fclass2 — от
    // fclass3.

    class fclass1 {
        public static void main(String[] args) {

        }
    }
    class fclass3 extends fclass1 {

    }
    class fclass2 extends fclass3 {

    }
}

