public class Ellipse extends Circle {
    private int radius2 = 0;

    public Ellipse(int newRadius, int newRadius2) {
        super(newRadius);
        setRadius2(newRadius2);
    }

    public int getRadius2() {
        return radius2;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius2;
    }

    @Override
    public double getPerimeter() {
        // Aproximación del perímetro de una elipse utilizando la fórmula de Ramanujan
        return Math.PI * (3 * (radius + radius2) - Math.sqrt((3 * radius + radius2) * (radius + 3 * radius2)));
    }

    public void setRadius2(int newRadius2) {
        if (newRadius2 > 0)
            radius2 = newRadius2;
    }
}
