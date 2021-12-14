public class Rectangle extends Shape  {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public String getName() {
        return "Rectangle";
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
}
