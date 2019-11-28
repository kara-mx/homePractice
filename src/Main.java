public class Main {
    public static void main(String[] args) {

        Point first = new Point(new ComplexNumber(200,23),new ComplexNumber(300,1.7),new ComplexNumber(400,23));
        Point second = new Point(new ComplexNumber(-199,2.6),new ComplexNumber(4,5),new ComplexNumber(23,6));

        System.out.println(Point.distance(first, second));
        System.out.println(Point.distanceToNullCoordinates(first));
        System.out.println(Point.distanceToNullCoordinates(second));

    }
}

