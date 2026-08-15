public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
        this(new Point(), new Point(), new Point());
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
    }

    public Triangle(Triangle other) {
        this(other.p1, other.p2, other.p3);
    }

    public Point getP1() { return new Point(p1); }
    public Point getP2() { return new Point(p2); }
    public Point getP3() { return new Point(p3); }

    public void setP1(Point p) { p1 = new Point(p); }
    public void setP2(Point p) { p2 = new Point(p); }
    public void setP3(Point p) { p3 = new Point(p); }

    public double perimeter() {
        return p1.distanceFrom(p2) + p2.distanceFrom(p3) + p3.distanceFrom(p1);
    }

    public double area() {
        double value = Math.abs(
            p1.getX() * (p2.getY() - p3.getY()) +
            p2.getX() * (p3.getY() - p1.getY()) +
            p3.getX() * (p1.getY() - p2.getY())
        ) / 2.0;
        return value;
    }

    public String type() {
        double a = p1.distanceFrom(p2);
        double b = p2.distanceFrom(p3);
        double c = p3.distanceFrom(p1);

        double eps = 1e-9;
        if (Math.abs(a - b) < eps && Math.abs(b - c) < eps) return "Equilateral";
        if (Math.abs(a - b) < eps || Math.abs(b - c) < eps || Math.abs(a - c) < eps) return "Isosceles";
        return "Scalene";
    }

    @Override
    public String toString() {
        return "Triangle{" + p1 + ", " + p2 + ", " + p3 + "}";
    }
}
