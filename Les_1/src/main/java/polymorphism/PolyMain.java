package polymorphism;

public class PolyMain {
    public static void main(String[] args) {
        Shape circle = new Circle(3d);
        Shape square = new Square(2d);
        Shape triangle = new EquilateralTriangle(5d);

        System.out.println(circle.countArea());
        System.out.println(square.countArea());
        System.out.println(triangle.countArea());
    }
}
