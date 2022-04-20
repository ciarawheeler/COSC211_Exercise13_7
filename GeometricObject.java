package Ch_13;

public abstract class GeometricObject {
  private String color = "white";
  private boolean filled;
  
  protected GeometricObject() {
    
  }
  
  protected GeometricObject(String c, boolean f) {
    color = c;
    filled = f;
  }
  public void setColor(String c) { 
    color = c;
  }
  
  public String getColor() { 
    return color;
  }
  
  public void setFilled(boolean f) { 
    f = filled;
  }
  
  public boolean isFilled() { 
    return filled;
  }
  
  public abstract double getArea();
  
  public abstract double getPerimeter();
  

}
