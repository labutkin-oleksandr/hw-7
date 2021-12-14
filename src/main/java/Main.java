public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        circle.printShapeName(circle);
        circle.printColor();
        circle.addColor("blue");
        circle.printColor();
        System.out.println(circle.getArea());
        circle.printName();

        Quad quad = new Quad(10);
        quad.printShapeName(quad);
        quad.printColor();
        quad.replaceColor("orange");
        quad.printColor();
        System.out.println(quad.getArea());
        quad.printName();
    }
}
