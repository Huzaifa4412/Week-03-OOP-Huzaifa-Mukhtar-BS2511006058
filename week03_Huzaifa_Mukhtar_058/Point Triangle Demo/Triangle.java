public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
    }

    public Triangle(Triangle other) {
        this.p1 = new Point(other.p1);
        this.p2 = new Point(other.p2);
        this.p3 = new Point(other.p3);
    }

    public Point getP1() {
        return new Point(p1);
    }

    public Point getP2() {
        return new Point(p2);
    }

    public Point getP3() {
        return new Point(p3);
    }

    public void setP1(Point p) {
        this.p1 = new Point(p);
    }

    public void setP2(Point p) {
        this.p2 = new Point(p);
    }

    public void setP3(Point p) {
        this.p3 = new Point(p);
    }

    public double perimeter() {
        double a = p1.distanceFrom(p2);
        double b = p2.distanceFrom(p3);
        double c = p3.distanceFrom(p1);
        return a + b + c;
    }

    public double area() {
        double a = p1.distanceFrom(p2);
        double b = p2.distanceFrom(p3);
        double c = p3.distanceFrom(p1);

        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public String type() {
        double a = p1.distanceFrom(p2);
        double b = p2.distanceFrom(p3);
        double c = p3.distanceFrom(p1);

        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    @Override
    public String toString() {
        return "Triangle{" + p1 + ", " + p2 + ", " + p3 + "}";
    }
}

