public class Sphere extends Circle {

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double area() {
        double r = getRadius();
        return 4 * Math.PI * r * r;
    }
    //volume = (4/3)pi*r^3
    public double volume() {
        double r = getRadius();
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }
}