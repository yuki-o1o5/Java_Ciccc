import Schape.Cylinder;
import Schape.Sphere;

public class App {
    public static void main(String[] args) throws Exception {
        Cylinder cyn = new Cylinder(10,5);
        Sphere sph = new Sphere(5);
        double Cylinder10 = cyn.getVolume();
        double Sphere10 = sph.getVolume();
        System.out.printf("%6.2f%n", Cylinder10);
        System.out.printf("%6.2f%n", Sphere10);
    }
}
