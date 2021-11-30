package com.tw;

public class Rectangle {
    private final int width;
    private final int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int Area() {
        return width * length;
    }

    public int Perimeter() {
        return 2 * ( width + length);
    }
}
