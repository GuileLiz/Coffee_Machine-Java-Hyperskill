class Circle {

    double radius;

    // write methods here
    public double getLength() {
        double length = radius*2*Math.PI;
        return length;
    }

    public double getArea() {
        double area = Math.PI*Math.pow(radius,2);
        return area;
    }
}