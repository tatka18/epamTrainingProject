package by.epamtc.task01.model;

import java.util.Objects;

public class TangentFunction {
    private double a;
    private double b;
    private double h;

    public TangentFunction() {
    }

    public TangentFunction(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
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
        return Objects.hash(a, b, h);
    }

    @Override
    public String toString() {
        return "Point{" +
                "a=" + a +
                ", b=" + b +
                ", h=" + h +
                '}';
    }
}
