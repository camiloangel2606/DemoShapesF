public class Square extends Shape {
    private int width = 0, height = 0;

    public Square(int newWidth) {
        setWidth(newWidth);
        setHeight(newWidth); // También necesitas asignar la altura para un cuadrado
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public double getArea() {
        return (width * height); // Aquí se necesita multiplicar el ancho por la altura
    }

    public double getPerimeter() {
        return (4 * width); // Para un cuadrado, el perímetro es 4 veces el ancho
    }

    public void setHeight(int newHeight) {
        if (newHeight > 0)
            height = newHeight;
    }

    public void setWidth(int newWidth) {
        if (newWidth > 0)
            width = newWidth;
    }
}
