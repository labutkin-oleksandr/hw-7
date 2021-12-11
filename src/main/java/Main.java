public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        circle.getName();
        circle.printColor();
        circle.addColor("blue");
        circle.printColor();
        System.out.println(circle.getArea());

        Quad quad = new Quad(10);
        quad.getName();
        quad.printColor();
        quad.replaceColor("orange");
        quad.printColor();
        System.out.println(quad.getArea());
    }
}
