package visitor;

public interface Shape {
    void accept(ShapeVisitor shapeVisitor);
}
