public class MainDemo {
    public static void main(String[] args) {
        System.out.println("Huzaifa Mukhtar - BS2511006058");
        System.out.println("Point and Triangle Demo\n");

        Point first = new Point(7, 2);
        Point second = new Point(1, 5);

        Point sum = first.add(second);
        Point difference = first.subtract(second);
        Point copied = new Point(first);

        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("addition = " + sum);
        System.out.println("subtraction = " + difference);
        System.out.println("copy = " + copied);

        copied.setX(50);
        System.out.println("original after changing copy = " + first);
        System.out.println("changed copy = " + copied);

        Triangle triangle = new Triangle(
            new Point(0, 0),
            new Point(4, 0),
            new Point(0, 3)
        );

        System.out.println("triangle = " + triangle);
        System.out.println("perimeter = " + triangle.perimeter());
        System.out.println("area = " + triangle.area());
        System.out.println("type = " + triangle.type());
    }
}
