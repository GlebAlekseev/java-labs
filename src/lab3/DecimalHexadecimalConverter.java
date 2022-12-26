package lab3;

import java.util.ArrayList;

public class DecimalHexadecimalConverter implements Converter<Decimal, Hexadecimal> {
    public DecimalHexadecimalConverter() {
    }

    // 16->10
    @Override
    public Decimal convertToA(Hexadecimal value) {
        ArrayList<Integer> list = parseFromHexadecimal(value);
        long result = 0;
        int base = 16;
        for (int i = 0; i < list.size(); i++) {
            result += (long)Math.pow(base, i) * list.get(i);
        }
        return Decimal.parse(Long.toString(result));
    }

    // 10->16
    @Override
    public Hexadecimal convertToB(Decimal value) {
        long decimalValue = Long.parseLong(value.toString());
        int base = 16;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            long left = decimalValue / base;
            int right = (int) (decimalValue % base);
            decimalValue = left;
            list.add(right);
            if (left == 0) break;
        }
        return parseHexadecimal(list);
    }

    private Hexadecimal parseHexadecimal(ArrayList<Integer> list) {
        StringBuilder stringBuilder = new StringBuilder();
        list.forEach(integer -> {
            CharSequence charSequence = integer.toString();
            switch (integer) {
                case 10:
                    charSequence = "A";
                    break;
                case 11:
                    charSequence = "B";
                    break;
                case 12:
                    charSequence = "C";
                    break;
                case 13:
                    charSequence = "D";
                    break;
                case 14:
                    charSequence = "E";
                    break;
                case 15:
                    charSequence = "F";
                    break;
            }
            stringBuilder.append(charSequence);
        });
        return Hexadecimal.parse(stringBuilder.reverse().toString());
    }

    private ArrayList<Integer> parseFromHexadecimal(Hexadecimal hexadecimal) {
        String value = new StringBuilder(hexadecimal.toString()).reverse().toString();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < value.length(); i++) {
            int element = value.charAt(i) - '0';
            switch (value.charAt(i)) {
                case 'A':
                    element = 10;
                    break;
                case 'B':
                    element = 11;
                    break;
                case 'C':
                    element = 12;
                    break;
                case 'D':
                    element = 13;
                    break;
                case 'E':
                    element = 14;
                    break;
                case 'F':
                    element = 15;
                    break;
            }
            list.add(element);
        }
        return list;
    }
}
