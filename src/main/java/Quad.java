public class Quad extends Shape implements ColorFigure {
    private int side;
    private String color = "red";

    public Quad(int side) {
        this.side = side;
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
        return (int) Math.pow(getSide(),2);
    }

    public String getName() {
        return "Quad";
    }

    public int getSide() {
        return side;
    }
}
