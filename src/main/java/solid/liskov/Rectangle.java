package solid.liskov;


import java.util.HashMap;

public class Rectangle  implements Shape {

    private int length;
    private int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int computeArea() {
        return length * width;
    }
}


