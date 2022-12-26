package lab3;

public class Lab3 {
    public static void execute(){
       DecimalHexadecimalConverter converter = new DecimalHexadecimalConverter();
       Decimal decimal = Decimal.parse("453456334");
       Hexadecimal hexadecimal = converter.convertToB(decimal);
       Decimal decimalFromHexadecimal = converter.convertToA(hexadecimal);
       System.out.println("decimal: " + decimal + "\nhexadecimal: " + hexadecimal + "\ndecimalFromHexadecimal: " + decimalFromHexadecimal);
    }
}

// Цели:
//    • закрепить знания проектирования и реализации интерфейсов java;
//    • научиться использовать интерфейсы при разработке приложений на java.
// Разработать объектно-ориентированную программу для конвертации чисел в шестнадцатиричной системе счисления в десятичную и обратно.
// Преобразование систем счисления  16 реализовать самостоятельно.
// Реализовать механизм наследования классов.