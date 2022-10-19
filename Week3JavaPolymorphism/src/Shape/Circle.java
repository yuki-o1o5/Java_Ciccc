package Shape;

public class Circle extends Shape {
  private double radius;

  public Circle(double r) {
      this.radius = r;
  }

  @Override
  public double getArea() {
      return Math.PI * this.radius * this.radius;
  }

  @Override
  public double Perimeter() {
      return 2 * Math.PI * this.radius ;
  }

}
