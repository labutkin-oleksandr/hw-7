public class Circle extends Shape implements ColorFigure {
    static final String shapeName = "Circle";
    private int radius;
    private String color = "No color";

    public Circle(int radius) {
        this.radius = radius;
    }

    public void addColor(String color) { setColor(color); }
    public void removeColor() { setColor("No color"); }
    public void replaceColor(String color) { setColor(color); }
    public void printColor() { System.out.println(getColor()); }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public int getArea() {
        return (int) Math.PI * (getRadius() * getRadius());
    }

    public void getName() {
        this.printName(getShapeName());
    }

    public int getRadius() {
        return radius;
    }

    public String getShapeName() {
        return shapeName;
    }

}
