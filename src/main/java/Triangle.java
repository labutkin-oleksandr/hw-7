public class Triangle extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String  getName() {
        return "Triangle";
    }

    public int getArea() {
        double s = (double) (getSideA() + getSideB() + getSideC()) / 2;
        return (int) Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }
}
