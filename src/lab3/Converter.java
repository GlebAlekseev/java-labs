package lab3;

public interface Converter<A, B> {
    public A convertToA(B value);

    public B convertToB(A value);
}
