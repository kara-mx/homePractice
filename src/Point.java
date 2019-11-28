class Point {
    private ComplexNumber x;
    private ComplexNumber y;
    private ComplexNumber z;

    Point (ComplexNumber x, ComplexNumber y, ComplexNumber z) {
        this.x = new ComplexNumber(x);
        this.y = new ComplexNumber(y);
        this.z = new ComplexNumber(z);

    }

    static ComplexNumber distance (Point m1,Point m2) {
        ComplexNumber tmp1,tmp2,tmp3;
        tmp1 = ComplexNumber.diff(m1.x,m2.x);
        tmp2 = ComplexNumber.diff(m1.y,m2.y);
        tmp3 = ComplexNumber.diff(m1.z,m2.z);

        tmp1 = ComplexNumber.squaring(tmp1);
        tmp2 = ComplexNumber.squaring(tmp2);
        tmp3 = ComplexNumber.squaring(tmp3);

        return ComplexNumber.sqrt(ComplexNumber.sum(ComplexNumber.sum(tmp1,tmp2),tmp3));

    }

    static ComplexNumber distanceToNullCoordinates(Point point) {
        return Point.distance(point,new Point(new ComplexNumber(0,0),new ComplexNumber(0,0),new ComplexNumber(0,0)));

    }


}
