
public class Rectangle extends Square {
    private int height = 0, width = 0;

    public Rectangle(int newWidth, int newHeight) {
        super(newWidth);
        setHeight(newHeight);
        setWidth(newWidth); // También necesitas asignar el ancho para un rectángulo
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setHeight(int newHeight) {
        if (newHeight > 0)
            height = newHeight;
    }

    @Override
    public void setWidth(int newWidth) {
        if (newWidth > 0)
            width = newWidth;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

}
