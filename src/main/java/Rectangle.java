public class Rectangle extends Shape  {
    static final String shapeName = "Rectangle";
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void getName() {
        this.printName(getShapeName());
    }

    public int getArea() {
        return getSideA() * getSideB();
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public String getShapeName() {
        return shapeName;
    }
}
