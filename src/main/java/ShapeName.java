class ShapeName {
    private Shape shape;

    public ShapeName(Shape shape) {
        this.shape = shape;
    }

    public void printName() {
        System.out.println("Shape name is " + shape.getName());
    }
}
