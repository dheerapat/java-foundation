package Classes;

public class Triangle {
    // static class variable
    static int numSide = 3;

    // non-static class variable, attribute
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // constructor
    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    // method
    public double findArea() {
        return (this.base * this.height) / 2;
    }
}
