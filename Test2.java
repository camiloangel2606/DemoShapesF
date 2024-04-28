public class Test2 extends Terminal {
    public static void main(String[] args) {

        Double areaTotal = 0.0, perimTotal = 0.0;
        Shape[] shapes = new Shape[] { // Creamos una lista para almacenar los datos de las figuras.
                new Square(5),
                new Square(7),
                new Square(10),
                new Rectangle(6, 4),
                new Rectangle(8, 2),
                new Rectangle(9, 3),
                new Circle(3),
                new Circle(4),
                new Circle(5),
                new Ellipse(5, 3),
                new Ellipse(6, 2),
                new Ellipse(7, 4),
                new Triangle(3, 4, 5),
                new Triangle(7, 8, 10),
                new Triangle(6, 7, 8),
        };
        for (Shape shape : shapes) {
            areaTotal += shape.getArea();
            perimTotal += shape.getPerimeter();
            Console.writeLine("Area total= %.2f, Perimetro total= %.2f", shape.getArea(), shape.getPerimeter());
        }
        Console.writeLine("Area total= %.2f, Perimetro total= %.2f", areaTotal, perimTotal);
    }
}
