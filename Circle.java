public class Circle extends Shape {
    public int radius = 0;

    public Circle(int newradius) {
        setRadius(newradius);
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        return (Math.PI * ((radius) * (radius)));
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(int newradius) {
        if (newradius > 0)
            radius = newradius;
    }

}
