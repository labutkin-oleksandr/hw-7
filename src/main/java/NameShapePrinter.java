class NameShapePrinter {
    private Shape shape;

    public NameShapePrinter(Shape shape) {
        this.shape = shape;
    }

    public void printName() {
        System.out.println("Shape name is " + shape.getName());
    }
}
