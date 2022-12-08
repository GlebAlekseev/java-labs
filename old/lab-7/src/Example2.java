public class Example2 {
    // 2. Создайте приложение, в котором имеются два класса:
    // fclass1, fclass2. В классе fclass1 содержится метод main().
    // Создайте методы в fclass2 для доступа к закрытым переменным класса fclass1.
    public static void main(String[] args) {

    }
    class fclass1 {
        protected String name = "name";

    }
    class fclass2 extends fclass1{
        public String getName(){
            return this.name;
        }
    }
}


