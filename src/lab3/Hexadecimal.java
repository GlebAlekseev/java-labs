package lab3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hexadecimal extends NumberSystem {
    private Hexadecimal(String value) {
        super(value);
    }

    public static Hexadecimal parse(String inputValue) throws HexadecimalFormatException {
        Pattern pattern = Pattern.compile("[0-9A-F]*");
        Matcher matcher = pattern.matcher(inputValue.toUpperCase());
        if (!matcher.matches() ||
                inputValue.length() > 16 ||
                inputValue.length() == 16 && inputValue.charAt(0) - '0' > 7
        ) throw new HexadecimalFormatException("Значение задано в неверном формате");
        return new Hexadecimal(inputValue);
    }
}
