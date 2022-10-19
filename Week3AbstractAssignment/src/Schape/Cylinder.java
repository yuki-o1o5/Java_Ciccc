package Schape;

public class Cylinder extends Schape {

  private double r;
  private double h;


  public Cylinder(double r, double h) {
    this.r = r;
    this.h = h;
  }
  
  public Cylinder() {
  }
  
  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
  }

  public double getH() {
    return h;
  }

  public void setH(double h) {
    this.h = h;
  }


  @Override
  public double getVolume(){
    return Math.PI * Math.pow(r, 2) * h;
  }

}
