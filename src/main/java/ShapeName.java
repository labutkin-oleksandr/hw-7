class ShapeName {
    private String shapeName;

    public ShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return this.shapeName;
    }
    public void printName() {
        System.out.println("Shape name is " + getShapeName());
    }
}
