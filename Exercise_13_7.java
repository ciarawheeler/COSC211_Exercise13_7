package Ch_13;

public class Exercise_13_7 {

  public static void main(String[] args) {
   GeometricObject[] squares = {new Square(2), new Square(3), new Square(4), new Square(5), new Square(6)};

   for(int i = 0; i < squares.length; i++) { 
     System.out.println("Area: " + squares[i].getArea());
     System.out.println("How to color: " + ((Square)squares[i]).howToColor());
   }
  }

}
