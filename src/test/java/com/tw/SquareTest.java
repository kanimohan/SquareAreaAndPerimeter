package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/* public class Rectangle{
    public static void createSquare(int side)
    {
        Rectangle rectangle = new Rectangle(side, side);
    }
}*/

public class SquareTest {

    @Test
    void shouldReturnAreaAs25IfSideOfSquareIs5() {
        Square square = new Square(5);
        // Rectangle square = Rectangle.createSquare(5);

        int area = square.Area();

        assertEquals(25, area);
    }

    @Test
    void shouldReturnAreaAs144IfSideOfSquareIs12() {
        Square square = new Square(12);

        int area = square.Area();

        assertEquals(144, area);
    }

    @Test
    void shouldReturnPerimeterAs8IfSideOfSquareIs2() {
        Square square = new Square(2);

        int perimeter = square.Perimeter();

        assertEquals(8,perimeter);
    }

    @Test
    void shouldReturnPerimeterAs40IfSideOfSquareIs10() {
        Square square = new Square(10);

        int perimeter = square.Perimeter();

        assertEquals(40,perimeter);
    }
}
