package Ch_13;

public class Square extends GeometricObject implements Colorable {
  private double side;
  
  public Square() { 
    side = 0;
  }
  
  public Square(double side) { 
    this.side = side;
  }
  
  public void setSide(double side) { 
    this.side = side;
  }
  
  public double getSide() { 
    return side;
  }
  
  public String howToColor() { 
    return "Color all four sides";
  }
  
  @Override 
  public double getArea() { 
    return side * side;
  }
  
  @Override
  public double getPerimeter() { 
    return side * 4;
  }

}
