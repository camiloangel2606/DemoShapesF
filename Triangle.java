public class Triangle extends Shape {
    private int side1 = 0, side2 = 0, side3 = 0;

    public Triangle(int newSide1, int newSide2, int newSide3) {
        setSide1(newSide1);
        setSide2(newSide2);
        setSide3(newSide3);
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0; // Utiliza 2.0 para obtener un resultado de punto flotante
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public void setSide1(int newSide1) {
        if (newSide1 > 0)
            side1 = newSide1;
    }

    public void setSide2(int newSide2) {
        if (newSide2 > 0)
            side2 = newSide2;
    }

    public void setSide3(int newSide3) {
        if (newSide3 > 0)
            side3 = newSide3;
    }
}
