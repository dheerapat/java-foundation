package Classes;

public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8,17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        // findArea() is called instance method (must create instance before use)
        // unlike Math.pow(), which called class method
        double areaA = triangleA.findArea();
        double areaB = triangleB.findArea();

        System.out.println(areaA);
        System.out.println(triangleA.base);

        System.out.println(areaB);
        System.out.println(triangleB.base);

        System.out.println(Triangle.numSide);
    }
}
