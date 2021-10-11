package by.epamtc.task01.model;

public class PointCoordinate {
    private double x;
    private double y;

    public PointCoordinate() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointCoordinate pointCoordinate = (PointCoordinate) o;
        return Double.compare(pointCoordinate.x, x) == 0 &&
                Double.compare(pointCoordinate.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = prime * result + (int)(temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " x=" + x +
                ", y=" + y;
    }
}
