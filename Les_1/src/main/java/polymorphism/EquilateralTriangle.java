package polymorphism;

public class EquilateralTriangle extends Triangle{
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double countArea() {
        double triangleHeight = side * Math.sqrt(3) / 2;
        return 0.5 * side * triangleHeight;
    }
}
