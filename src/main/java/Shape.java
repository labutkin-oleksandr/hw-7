public abstract class Shape {
    public void printName(String shapeName) {
        ShapeName name = new ShapeName(shapeName);
        name.printName();
    }

    public abstract void getName();
    public abstract int getArea();
}
