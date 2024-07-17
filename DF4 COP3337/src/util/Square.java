package util;

public class Square extends Rectangle implements Comparable<Square> {

    private double side = 1;

    public Square(String name, double side) {
        super(name, side, side);
    }

    @Override
    public int compareTo(Square o) {
        return (int)(this.getArea() - o.getArea());
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
