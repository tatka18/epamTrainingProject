package by.epamtc.task01.model;

public class TangentFunction {
    private double a;
    private double b;
    private double h;

    public TangentFunction() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TangentFunction point = (TangentFunction) o;
        return Double.compare(point.a, a) == 0 &&
                Double.compare(point.b, b) == 0 &&
                Double.compare(point.h, h) == 0;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = prime * result + (int)(temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = prime * result + (int)(temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " a=" + a +
                ", b=" + b +
                ", h=" + h;
    }
}
