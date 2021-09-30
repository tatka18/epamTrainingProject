package by.epamtc.task01.model;

import java.util.Objects;

public class Round {
    private double radius;
    private double square;
    private double circumference;

    public Round() {
    }

    public Round(double radius) {
        this.radius = radius;
    }

    public Round(double radius, double square, double circumference) {
        this.radius = radius;
        this.square = square;
        this.circumference = circumference;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Round round = (Round) o;
        return Double.compare(round.radius, radius) == 0 &&
                Double.compare(round.square, square) == 0 &&
                Double.compare(round.circumference, circumference) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, square, circumference);
    }

    @Override
    public String toString() {
        return "radius=" + radius +
                ", square=" + square +
                ", reference=" + circumference;
    }
}
