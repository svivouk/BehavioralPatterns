package visitor;

public class PerimeterVisitor implements ShapeVisitor{
    @Override
    public void visitCircle(Circle circle) {
        double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("Perimeter of Circle: " + perimeter);    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        double perimeter = 2 * (rectangle.getHeight() + rectangle.getWidth());
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}
