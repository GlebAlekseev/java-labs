package lab2;

public class Trapezoid {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    private static final double EPSILON = 0.001;
    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    public Point getP3(){
        return p3;
    }

    public Point getP4(){
        return p4;
    }

    public void setP1(Point value){
        p1 = value;
    }

    public void setP2(Point value){
        p2 = value;
    }

    public void setP3(Point value){
        p3 = value;
    }

    public void setP4(Point value){
        p4 = value;
    }

    public double getA(){
        return p1.distance(p2);
    }

    public double getB(){
        return p2.distance(p3);
    }

    public double getC(){
        return p3.distance(p4);
    }

    public double getD(){
        return p1.distance(p4);
    }

    public double getPerimeter(){
        return getA() + getB() + getC() + getD();
    }
    public double getSquare(){
        return 0.5 * (getB() + getD())/ getH();
    }
    private double getH() {
        if (!isEquilateral()) throw new RuntimeException("Ищем высоту не у равнобедренной трапеции");
        return Math.sqrt(
                Math.pow(getA(), 2)
                        -
                        Math.pow(
                                (Math.pow(getD() - getB(), 2) + Math.pow(getA(), 2) - Math.pow(getC(), 2))
                                        / (2 * getD() - getB()), 2
                        )
        );
    }

    public Trapezoid(Point p1, Point p2, Point p3, Point p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public boolean isEquilateral(){
        return Math.abs(getA() - getC()) < EPSILON;
    }
}