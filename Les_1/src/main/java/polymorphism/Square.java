package polymorphism;

public class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double countArea() {
        return Math.pow(side, 2);
    }
}
