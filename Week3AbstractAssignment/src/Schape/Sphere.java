package Schape;

public class Sphere extends Schape{

  private double r;


  public Sphere(double r) {
    this.r = r;
  }

  public Sphere(){

  }

  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
  }

  @Override
  public double getVolume(){
    return (double) 4/3 * Math.PI * Math.pow(r, 3);
  }

}
