package lab3;

public class Decimal extends NumberSystem {
    private Decimal(String value){
        super(value);
    }

    public static Decimal parse(String inputValue) throws DecimalFormatException {
        long value;
        try{
            value = Long.parseLong(inputValue);
        }catch (NumberFormatException e){
            throw new DecimalFormatException("Значение задано в неверном формате", e);
        }
        if (value < 0) throw new DecimalFormatException("Значение задано в неверном формате");
        return new Decimal(Long.toString(value));
    }
}
