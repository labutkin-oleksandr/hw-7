public abstract class Shape {
    public void printName() {
        ShapeName name = new ShapeName(this);
        name.printName();
    }

    public void printShapeName(Shape shape) {
        System.out.println(shape.getName());
    }

    public abstract String getName();
    public abstract int getArea();
}
