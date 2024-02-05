package models;

public class Circle {
    int radius ;
    double PI=3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getArea(){
        double a =this.getPI()*this.getRadius();
        System.out.println(a);
        return a;
    }
}