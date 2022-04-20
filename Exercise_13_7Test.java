package Ch_13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Exercise_13_7Test {

  @Test
  void testMain() {
    GeometricObject[] squares = {new Square(2), new Square(3), new Square(4), new Square(5), new Square(6)};
  
    assertEquals(4.0, squares[0].getArea());
    assertEquals("Color all four sides", ((Square)squares[0]).howToColor());
    assertEquals(9.0, squares[1].getArea());
    assertEquals("Color all four sides", ((Square)squares[1]).howToColor());
    assertEquals(16.0, squares[2].getArea());
    assertEquals("Color all four sides", ((Square)squares[2]).howToColor());
    assertEquals(25.0, squares[3].getArea());
    assertEquals("Color all four sides", ((Square)squares[3]).howToColor());
    assertEquals(36.0, squares[4].getArea());
    assertEquals("Color all four sides", ((Square)squares[4]).howToColor());
  }

}
